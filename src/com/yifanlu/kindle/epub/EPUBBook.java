package com.yifanlu.kindle.epub;

import com.amazon.ebook.booklet.reader.sdk.content.*;
import com.amazon.ebook.booklet.reader.sdk.internal.AbstractBook;
import com.amazon.ebook.booklet.reader.sdk.internal.BookController;
import com.amazon.ebook.booklet.reader.sdk.internal.BookStateManager;

import java.awt.*;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: yifanlu
 * Date: 12/22/11
 * Time: 4:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class EPUBBook extends AbstractBook {
    private String mPath;
    private EPUBSearchHandler mSearchHandler;
    
    public EPUBBook(BookStateManager stateManager, BookController controller, String path){
        super(stateManager, controller, ".ebp1", ".ebs");
        this.mPath = path;
        this.mSearchHandler = new EPUBSearchHandler();
    }

    protected void doClose() throws IOException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public String getPath() {
        return this.mPath;
    }

    public String getIdentifier() {
        return this.mPath;
    }

    public Position getStartPosition() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Position getEndPosition() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Position getTOCPosition() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Position getStartReadingPosition() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public WordIterator getWordIterator(Position position) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String getWords(Position position, Position position1) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String getWords(Position position, int i) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public BookMetadata getMetadata() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public int getBookLength() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public TableOfContents getTOC() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Index getIndexManager() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public java.awt.Image getImageCover(Dimension dimension) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public int getTotalPages() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    // optional methods

    public int getType(){
        return 0; // Don't know what 0 type is yet, but it's better than default -1
    }

    public SearchHandler getSearchWithinBookHandler(){
        return this.mSearchHandler;
    }

    private class EPUBSearchHandler implements SearchHandler {

        public Position startSearch(String s) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        public Position nextPreviousSearch(boolean b) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        public void stopSearch() {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        public void showUI(String s) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        public boolean dismissUI() {
            return false;  //To change body of implemented methods use File | Settings | File Templates.
        }
    }
}
