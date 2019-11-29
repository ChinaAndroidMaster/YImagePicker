package com.ypx.imagepicker.views;

import android.graphics.Color;

import com.ypx.imagepicker.R;
import com.ypx.imagepicker.views.PickerUiProvider;

import java.lang.ref.WeakReference;

/**
 * Time: 2019/11/13 15:54
 * Author:ypx
 * Description:
 */
public class PickerUiConfig {
    public static final int DIRECTION_TOP = 1;

    public static final int DIRECTION_BOTTOM = 2;

    /**
     * 选择器的背景色
     */
    private int pickerBackgroundColor = Color.BLACK;
    private int previewBackgroundColor = Color.BLACK;
    private int folderListOpenDirection = DIRECTION_TOP;
    private int folderListOpenMaxMargin = 0;
    private boolean isShowStatusBar;
    private int statusBarColor;


    private int cropViewBackgroundColor = Color.BLACK;
    private int fullIconID;
    private int fitIconID;
    private int gapIconID;
    private int FillIconID;
    private int videoPauseIconID;

    private PickerUiProvider pickerUiProvider;

    public PickerUiProvider getPickerUiProvider() {
        if (pickerUiProvider == null) {
            return new PickerUiProvider();
        }
        return pickerUiProvider;
    }

    public void setPickerUiProvider(PickerUiProvider pickerUiProvider) {
        this.pickerUiProvider = pickerUiProvider;
    }

    public int getPickerBackgroundColor() {
        if (pickerBackgroundColor == 0) {
            return Color.WHITE;
        }
        return pickerBackgroundColor;
    }

    public void setPickerBackgroundColor(int pickerBackgroundColor) {
        this.pickerBackgroundColor = pickerBackgroundColor;
    }

    public int getPreviewBackgroundColor() {
        return previewBackgroundColor;
    }

    public void setPreviewBackgroundColor(int previewBackgroundColor) {
        this.previewBackgroundColor = previewBackgroundColor;
    }

    public int getFolderListOpenDirection() {
        return folderListOpenDirection;
    }

    public void setFolderListOpenDirection(int folderListOpenDirection) {
        this.folderListOpenDirection = folderListOpenDirection;
    }

    public boolean isShowFromBottom() {
        return folderListOpenDirection == DIRECTION_BOTTOM;
    }

    public boolean isShowStatusBar() {
        return isShowStatusBar;
    }

    public void setShowStatusBar(boolean showStatusBar) {
        isShowStatusBar = showStatusBar;
    }

    public int getStatusBarColor() {
        return statusBarColor;
    }

    public void setStatusBarColor(int statusBarColor) {
        this.statusBarColor = statusBarColor;
    }

    public int getFolderListOpenMaxMargin() {
        return folderListOpenMaxMargin;
    }

    public void setFolderListOpenMaxMargin(int folderListOpenMaxHeight) {
        this.folderListOpenMaxMargin = folderListOpenMaxHeight;
    }

    public int getCropViewBackgroundColor() {
        if (cropViewBackgroundColor == 0) {
            return Color.BLACK;
        }
        return cropViewBackgroundColor;
    }

    public void setCropViewBackgroundColor(int cropViewBackgroundColor) {
        this.cropViewBackgroundColor = cropViewBackgroundColor;
    }

    public int getFullIconID() {
        if (fullIconID == 0) {
            fullIconID = R.mipmap.picker_icon_full;
        }
        return fullIconID;
    }

    public void setFullIconID(int fullIconID) {
        this.fullIconID = fullIconID;
    }

    public int getFitIconID() {
        if (fitIconID == 0) {
            fitIconID = R.mipmap.picker_icon_fit;
        }
        return fitIconID;
    }

    public void setFitIconID(int fitIconID) {
        this.fitIconID = fitIconID;
    }

    public int getGapIconID() {
        if (gapIconID == 0) {
            gapIconID = R.mipmap.picker_icon_haswhite;
        }
        return gapIconID;
    }

    public void setGapIconID(int gapIconID) {
        this.gapIconID = gapIconID;
    }

    public int getFillIconID() {
        if (FillIconID == 0) {
            FillIconID = R.mipmap.picker_icon_fill;
        }
        return FillIconID;
    }

    public void setFillIconID(int fillIconID) {
        FillIconID = fillIconID;
    }

    public int getVideoPauseIconID() {
        if (videoPauseIconID == 0) {
            videoPauseIconID = R.mipmap.picker_icon_video;
        }
        return videoPauseIconID;
    }

    public void setVideoPauseIconID(int videoPauseIconID) {
        this.videoPauseIconID = videoPauseIconID;
    }
}