package com.alihamuh.fastTableLayout;

import android.graphics.drawable.Drawable;
import android.view.View;

public class FastAttributes {

    private String buttonText =null;
    private String textViewText=null;
    private int backgroundColor =0;
    private int backgroudResource =0;
    private Drawable backgroundDrawable=null;
    private int textColor=0;
    private View.OnClickListener onClickListener=null;
    private View customView=null;

    public FastAttributes(){

    }

    public void setBackgroudResource(int backgroudResource) {
        this.backgroudResource = backgroudResource;
    }

    public int getBackgroudResource() {
        return backgroudResource;
    }

    public void setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
    }

    public int getTextColor() {
        return textColor;
    }

    public void setCustomView(View customView) {
        this.customView = customView;
    }

    public View getCustomView() {
        return customView;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public View.OnClickListener getOnClickListener() {
        return onClickListener;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    public String getButtonText() {
        return buttonText;
    }

    public void setBackgroundDrawable(Drawable backgroundDrawable) {
        this.backgroundDrawable = backgroundDrawable;
    }

    public Drawable getBackgroundDrawable() {
        return backgroundDrawable;
    }

    public void setTextViewText(String textViewText) {
        this.textViewText = textViewText;
    }

    public String getTextViewText() {
        return textViewText;
    }
}
