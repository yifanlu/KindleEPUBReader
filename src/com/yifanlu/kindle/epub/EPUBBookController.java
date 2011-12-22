package com.yifanlu.kindle.epub;

import com.amazon.ebook.booklet.reader.sdk.BookException;
import com.amazon.ebook.booklet.reader.sdk.BookNavigator;
import com.amazon.ebook.booklet.reader.sdk.ReaderSDK;
import com.amazon.ebook.booklet.reader.sdk.content.Book;
import com.amazon.ebook.booklet.reader.sdk.content.Position;
import com.amazon.ebook.booklet.reader.sdk.content.PositionFactory;
import com.amazon.ebook.booklet.reader.sdk.content.Viewport;
import com.amazon.ebook.booklet.reader.sdk.content.annotation.AnnotationProvider;
import com.amazon.ebook.booklet.reader.sdk.internal.*;
import com.amazon.ebook.booklet.reader.sdk.util.InvalidSideCarFileException;
import com.amazon.ebook.util.log.Log;
import com.amazon.system.util.Utilities;
import edu.emory.mathcs.backport.java.util.concurrent.locks.ReentrantLock;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: yifanlu
 * Date: 12/10/11
 * Time: 10:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class EPUBBookController extends BookController {
    public final ReentrantLock LOCK = new ReentrantLock(); // Amazon locks many thread unsafe methods, so we'll do the same
    private Log LOG = Log.getInstance("EPUBBookController");
    private EPUBBookNavigator mBookNavigator;
    private ReaderSDK mSdk;
    private EPUBBookView mBookView;
    private EPUBBook mBook;
    private EPUBPositionFactory mPositionFactory;
    private EPUBRenderCapabilities mRenderCapabilities;
    private Utilities mUtilities;

    public EPUBBookController() {
        mBookNavigator = new EPUBBookNavigator();
        mBookView = new EPUBBookView();
        mPositionFactory = new EPUBPositionFactory();
        mRenderCapabilities = new EPUBRenderCapabilities(this);
    }

    public ScreenImage getImage(Viewport viewport) {
        return null; // Unused by all Amazon readers, so we'll do the same
    }

    public BookNavigator getBookNavigator() {
        return this.mBookNavigator;
    }

    public void initialize(ReaderSDK readerSDK) {
        LOCK.lock();
        try {
            this.mSdk = readerSDK;
        }finally{
            LOCK.unlock();
        }
    }

    public ReaderSDK getSDK() {
        return this.mSdk;
    }

    public BookView getBookView() {
        return this.mBookView;
    }

    public void closeBook() {
        LOCK.lock();
        try{
            // reset book stuff
            mBook.doClose();
            mBook = null;
            // reset navigator stuff
            mBookNavigator = null;
            // reset view stuff
            mBookView = null;
        } catch (IOException e) {
            LOG.error("Error in closing the book", e);
        } finally{
            LOCK.unlock();
        }
    }

    public boolean openBook(Book book, String s, Position position) throws BookException, InvalidSideCarFileException {
        LOCK.lock();
        try {
            LOG.info("What is string? " + s);
            this.mBook = (EPUBBook)book;
            if(position == null)
                mBookNavigator.goTo(0);
            else
                mBookNavigator.goTo(position);
        }finally {
            LOCK.unlock();
        }
        return true;
    }

    public Book loadBook(String path, BookStateManager bookStateManager) throws BookException {
        LOCK.lock();
        try {
            Book book = new EPUBBook(bookStateManager, this, path);
            return book;
        }finally{
            LOCK.unlock();
        }
    }

    public Book getCurrentBook() {
        return this.mBook;
    }

    public PositionFactory getPositionFactory() {
        return this.mPositionFactory;
    }

    public AnnotationProvider getLegacyProvider() {
        return null; // We don't have any legacy annotations to convert.
    }

    public void onProcessTooLarge() {
        return; // Amazon does nothing, so we do nothing
    }

    public RendererCapabilities getCapabilities() {
        return this.mRenderCapabilities;
    }

    public void setPrelayout(boolean b) {
        return; // Don't know what this does yet, but safe to do nothing
    }

    public void resumePrelayout() {
        return; // Don't know what this does yet, but safe to do nothing
    }

    public void pausePrelayout() {
        return; // Don't know what this does yet, but safe to do nothing
    }
}
