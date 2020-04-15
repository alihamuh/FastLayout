package com.alihamuh.fastTableLayout;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ApplyfastAttributes {

    public ApplyfastAttributes(){

    }


    void applyAttributesToView(View view, fastAttributes fastAttributes){

        if(fastAttributes.getCustomView()!=null){
            view= fastAttributes.getCustomView();
        }

        if(fastAttributes.getBackgroudResource()!=0){

            view.setBackgroundResource(fastAttributes.getBackgroudResource());
        }

        if(fastAttributes.getBackgroundDrawable()!=null){
            view.setBackground(fastAttributes.getBackgroundDrawable());
        }

        if(fastAttributes.getBackgroundColor()!=0){
            view.setBackgroundColor(fastAttributes.getBackgroundColor());
        }

        if(fastAttributes.getOnClickListener()!=null){
            view.setOnClickListener(fastAttributes.getOnClickListener());
        }

        if(fastAttributes.getButtonText()!=null){
            Button button=(Button)view;
            button.setText(fastAttributes.getButtonText());
            Log.d("test","I am in btn text");
        }

        if(fastAttributes.getTextColor()!=0){
            TextView textView=(TextView)view;
            textView.setTextColor(fastAttributes.getTextColor());
        }

        if(fastAttributes.getTextViewText()!=null){
            TextView button=(TextView)view;
            button.setText(fastAttributes.getTextViewText());
        }

    }
}
