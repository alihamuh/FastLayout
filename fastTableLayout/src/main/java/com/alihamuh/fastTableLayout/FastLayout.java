package com.alihamuh.fastTableLayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class FastLayout extends LinearLayout {

    Context context;
    Integer noOfRows=1;
    Integer noOfColumns=1;
    Integer squareSize=0;
    int cellId=0;
    ArrayList<FastAttributes> fastAttributesList =new ArrayList<>();

    public FastLayout(Context context) {
        super(context);
        this.context=context;

        //createView(context);
    }

    public FastLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context=context;
        init(attrs);
        //createView(context);
    }

    public FastLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context=context;
        init(attrs);

        //createView(context);
    }

    private void init(AttributeSet attrs){

        TypedArray a=getContext().obtainStyledAttributes(attrs,R.styleable.FastLayout,0,0);


        noOfRows =a.getInteger(R.styleable.FastLayout_no_of_rows,1);


        noOfColumns=a.getInteger(R.styleable.FastLayout_no_of_columns,1);


        squareSize=a.getInteger(R.styleable.FastLayout_square_size,0);


        cellId=a.getResourceId(R.styleable.FastLayout_cell_view,R.layout.default_view);
        a.recycle();

    }


    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        CheckRowColumn check=new CheckRowColumn();

        if(check.isRowColumns(noOfRows,noOfColumns)){
            SetRowColumn rowColSquare=new SetRowColumn();
            rowColSquare.set(noOfRows,noOfColumns);
            CreateView createView=new CreateView(rowColSquare);
            createView.create(this);
            return;
        }

        if(check.isSquare(squareSize)){
            SetRowColumn rowColSquare=new SetRowColumn();
            rowColSquare.set(squareSize);
            CreateView createView=new CreateView(rowColSquare);
            createView.create(this);
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

    public void setFastAttributesList(ArrayList<FastAttributes> fastAttributesList) {
        this.fastAttributesList = fastAttributesList;
    }

    public ArrayList<FastAttributes> getFastAttributesList() {
        return fastAttributesList;
    }

}
