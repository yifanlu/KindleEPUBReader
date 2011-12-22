package com.yifanlu.kindle.epub;

import com.amazon.ebook.booklet.reader.sdk.content.Book;
import com.amazon.ebook.booklet.reader.sdk.content.Position;
import com.amazon.ebook.booklet.reader.sdk.content.PositionFactory;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InvalidObjectException;

/**
 * Created by IntelliJ IDEA.
 * User: yifanlu
 * Date: 12/22/11
 * Time: 5:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class EPUBPositionFactory implements PositionFactory {
    public Position createInstance(String s, Book book) throws IOException, InvalidObjectException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Position createFromIndexDataInputStream(DataInputStream dataInputStream, int i, int i1, Book book) throws IOException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public int entitiesPerPosition() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
