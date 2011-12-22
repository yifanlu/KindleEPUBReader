package com.yifanlu.kindle.epub;

import com.amazon.ebook.booklet.reader.sdk.BookNavigator;
import com.amazon.ebook.booklet.reader.sdk.content.*;

import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: yifanlu
 * Date: 12/22/11
 * Time: 4:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class EPUBBookNavigator extends BookNavigator {
    public Book getBook() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void goTo(Position position) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void goToUserLocation(int i) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public boolean goTo(Link link) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    protected Viewport getViewportInternal() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void goTo(TableOfContentsEntry tableOfContentsEntry) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void goTo(String s) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void firstPage() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    protected void previousPageInternal() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    protected void nextPageInternal() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void goToPercentage(int i) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void goToLastPage() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public boolean goToStartReading() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public boolean goToStartReading(boolean b) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void goToCover() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void goToTableOfContents() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void goToGuideItem(int i) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void goToGuideItem(GuideItem guideItem) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public String[] getGuideItems() {
        return new String[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    public boolean isGuideItemTOCAvailable() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public boolean isPrevPageAvailable() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public boolean isNextPageAvailable() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Position getCurrentPosition() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    // optional methods

    public void goToPositionAndHighlightString(Position a, String b){

    }

    public boolean isBackAvailable(){
        return false;
    }

    public void goTo(int a){

    }

    public boolean goToIndexItem(IndexItem a){
        return false;
    }

    public boolean isIndexViewAvailable(){
        return false;
    }

    public boolean canTableMoveDown(Rectangle a){
        return false;
    }

    public boolean canTableMoveUp(Rectangle a){
        return false;
    }

    public boolean canTableMoveHorizontally(int a){
        return false;
    }

    public boolean moveTableHorizontally(int a){
        return false;
    }

    public void panPage(int a, int b){

    }

    public void zoomPage(double a, int b, int c){

    }
}
