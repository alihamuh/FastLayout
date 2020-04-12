package com.example.linearbuttons;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class ButtonRows extends LinearLayout {

    Context context;
    Integer noOFRows;
    Integer noOfColumns;

    public ButtonRows(Context context) {
        super(context);
        this.context=context;
        //createView(context);
    }

    public ButtonRows(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context=context;
        //createView(context);
    }

    public ButtonRows(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context=context;

        //createView(context);
    }

    public ButtonRows(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.context=context;
        //createView(context);
    }

    void createView(Context context){

        setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams params= new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        setLayoutParams(params);

        Button sampleButton=new Button(context);
        sampleButton.setBackgroundColor(Color.RED);
        sampleButton.setText("Muhammad Ali");
        sampleButton.setTextColor(Color.WHITE);

        Button sampleButton2=new Button(context);
        sampleButton2.setBackgroundColor(Color.RED);
        sampleButton2.setText("Sobia");
        sampleButton2.setTextColor(Color.WHITE);


        addView(sampleButton);
        addView(sampleButton2);
    }


    private void init(AttributeSet attrs){
        TypedArray a=getContext().obtainStyledAttributes(attrs,R.styleable.ButtonRows);
        //Use a
        Log.i("test",""+a.getInteger(R.styleable.ButtonRows_no_of_columns,1));
        Log.i("test",""+a.getInteger(R.styleable.ButtonRows_no_of_rows,1));

        noOFRows=a.getInteger(R.styleable.ButtonRows_no_of_columns,1);
        noOfColumns=a.getInteger(R.styleable.ButtonRows_no_of_columns,1);
        //Don't forget this
        a.recycle();
    }


    public void setNoOfColumns(Integer noOfColumns) {
        this.noOfColumns = noOfColumns;
    }

    public Integer getNoOfColumns() {
        return noOfColumns;
    }

    public void setNoOFRows(Integer noOFRows) {
        this.noOFRows = noOFRows;
    }

    public Integer getNoOFRows() {
        return noOFRows;
    }
}
