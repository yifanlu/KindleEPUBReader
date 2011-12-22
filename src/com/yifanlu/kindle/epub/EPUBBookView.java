package com.yifanlu.kindle.epub;

import com.amazon.ebook.booklet.reader.sdk.content.ScreenInfo;
import com.amazon.ebook.booklet.reader.sdk.internal.BookView;

import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: yifanlu
 * Date: 12/22/11
 * Time: 4:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class EPUBBookView extends BookView {
    public ScreenInfo getScreenInfo() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void setBounds(Rectangle rectangle) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    // optional methods

    public void changeOrientation(int a) {

    }

    public Rectangle getBounds(){
        return null;
    }

    public void drawPage(Graphics2D a){

    }

    public void drawPage(Graphics2D a, Container b){

    }

    public void drawLargeCover(Graphics2D a, Dimension b){

    }

    public void contrastChanged(int a){

    }

    public int getContrast(){
        return 0;
    }

    public void fontSizeChanged(int a, boolean b){

    }

    public void justificationChanged(int a, boolean b){

    }

    public void fontFamilyChanged(String a, boolean b){

    }

    public void lineSpacingChanged(int a, boolean b){

    }

    public void contentMarginChanged(int a, int b, int c, int d, boolean e){

    }

    public boolean doFlash(){
        return false;
    }
}
