package com.yifanlu.kindle.epub;

import com.amazon.ebook.booklet.reader.sdk.content.Position;

import java.io.DataOutputStream;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: yifanlu
 * Date: 12/22/11
 * Time: 4:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class EPUBPosition extends Position {
    public String getBookID() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public int createSortableIndexKey() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String store() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public double getPercentage() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public boolean equals(Object o) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public int hashCode() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String toString() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String getUIString() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Position convertToSerializablePosition() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public boolean canBeJournaled() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public int getMinIndexValue() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public int getMaxIndexValue() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void toIndexDataOutputStream(DataOutputStream dataOutputStream, int i, int i1) throws IOException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public int compareTo(Object o) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    // optional methods

    public int getIntegerOffset(){
        return 0;
    }
}
