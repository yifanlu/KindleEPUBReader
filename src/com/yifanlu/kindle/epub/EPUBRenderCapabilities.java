package com.yifanlu.kindle.epub;

import com.amazon.ebook.booklet.reader.sdk.internal.RendererCapabilities;

/**
 * Created by IntelliJ IDEA.
 * User: yifanlu
 * Date: 12/22/11
 * Time: 5:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class EPUBRenderCapabilities extends RendererCapabilities {
    private EPUBBookController mBookController;

    public EPUBRenderCapabilities(EPUBBookController bookController){
        this.mBookController = bookController;
    }

    public int supportedAnnotationTypes() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public boolean useClipBounds() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String[] getSupportedFileExtensions() {
        return new String[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String getAnnotationExtension() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    // optional methods

    public boolean isJustificationSettingsEnabled(){
        return false;
    }

    public boolean canNavigatePageContent(){
        return false;
    }

    public boolean isSearchViewAvailable(){
        return false;
    }

    public boolean isNoteAndHighLightingAvailable(){
        return false;
    }

    public boolean isAnnotationLiveRenderingAvailable(){
        return false;
    }

    public boolean isWordIterationAvailable(){
        return false;
    }

    public boolean isGuideItemTOCAvailable(){
        return false;
    }

    public boolean isPanZoomable(){
        return false;
    }

    public boolean isLocationsAvailable(){
        return false;
    }

    public boolean isPageNumbersAvailable(){
        return false;
    }

    public boolean hasLargeCover(){
        return false;
    }

    public boolean isSectionListAvailable(){
        return false;
    }

    public boolean isSupportingExtensionlessFile(){
        return false;
    }

    public boolean acceptsFile(String a){
        return false;
    }

    public boolean isContrastChangable(){
        return false;
    }

    public boolean isFontFamilyChangeable(){
        return false;
    }

    public boolean isFontSizeChangeable(){
        return false;
    }

    public boolean isLineSpacingChangeable(){
        return false;
    }

    public boolean isContentMarginChangeable(){
        return false;
    }

    public boolean isBookReflowImmediatelyAfterOpen(){
        return false;
    }
}
