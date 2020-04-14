package com.example.linearbuttons;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class ButtonRows extends LinearLayout {

    Context context;
    Integer noOfRows=1;
    Integer noOfColumns=1;
    Integer squareSize=0;
    int cellId=0;
    ArrayList<Attributes> attributesList=new ArrayList<>();

    public ButtonRows(Context context) {
        super(context);
        this.context=context;

        //createView(context);
    }

    public ButtonRows(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context=context;
        init(attrs);
        //createView(context);
    }

    public ButtonRows(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context=context;
        init(attrs);

        //createView(context);
    }

    public ButtonRows(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.context=context;
        init(attrs);

        //createView(context);
    }

    private void init(AttributeSet attrs){

        TypedArray a=getContext().obtainStyledAttributes(attrs,R.styleable.ButtonRows,0,0);


        noOfRows =a.getInteger(R.styleable.ButtonRows_no_of_rows,1);


        noOfColumns=a.getInteger(R.styleable.ButtonRows_no_of_columns,1);


        squareSize=a.getInteger(R.styleable.ButtonRows_square_size,0);


        cellId=a.getResourceId(R.styleable.ButtonRows_cell_view,R.layout.default_view);
        a.recycle();

    }


    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        CheckAttributes check=new CheckAttributes();

        if(check.isRowColumns(noOfRows,noOfColumns)){
            SetRowColSquare rowColSquare=new SetRowColSquare();
            rowColSquare.set(noOfRows,noOfColumns);
            CreateView createView=new CreateView(rowColSquare);
            createView.create(this);
            return;
        }

        if(check.isSquare(squareSize)){
            SetRowColSquare rowColSquare=new SetRowColSquare();
            rowColSquare.set(squareSize);
            CreateView createView=new CreateView(rowColSquare);
            createView.create(this);
            return;
        }
    }

    public void setNoOfColumns(Integer noOfColumns) {
        this.noOfColumns = noOfColumns;
        invalidate();
        requestLayout();
    }

    public Integer getNoOfColumns() {
        return noOfColumns;
    }

    public void setNoOfRows(Integer noOfRows) {
        this.noOfRows = noOfRows;
        invalidate();
        requestLayout();


    }

    public Integer getNoOfRows() {
        return noOfRows;
    }

    public void setSquareSize(Integer squareSize) {
        this.squareSize = squareSize;
        invalidate();
        requestLayout();
    }

    public Integer getSquareSize() {
        return squareSize;
    }

    public void setCellId(int cellId) {
        this.cellId = cellId;
    }

    public int getCellId() {

        return cellId;
    }

    public void setAttributesList(ArrayList<Attributes> attributesList) {
        this.attributesList = attributesList;
        Log.d("test","attrs list is  "+attributesList);

    }

    public ArrayList<Attributes> getAttributesList() {
        return attributesList;
    }

}
