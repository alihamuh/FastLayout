package com.example.linearbuttons;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CreateView {

    SetRowColSquare rowColSquare;
    ButtonRows buttonRows;
    Resources r;
    String PackageName;

    public CreateView() {

    }

    public CreateView(SetRowColSquare rowColSquare) {
        this.rowColSquare = rowColSquare;
    }

    public void create(ButtonRows buttonRows) {

        this.buttonRows=buttonRows;

        if (rowColSquare.getRowColumn()) {

            setLayout(rowColSquare.getRow(),rowColSquare.getCol());
        }

        if (rowColSquare.getSquare()) {
           setLayout(rowColSquare.getSquareCount(),rowColSquare.getSquareCount());
        }
    }


    void setLayout(int rowCount, int colCount) {

        r=buttonRows.getResources();
        PackageName=buttonRows.getContext().getPackageName();
        int index=0;
        for (int i = 0; i < rowCount; i++) {

            LinearLayout rowLayout=new LinearLayout(buttonRows.context);
            rowLayout.setLayoutParams(getRowParameters());
            rowLayout.setOrientation(LinearLayout.HORIZONTAL);
            for (int j = 0; j < colCount; j++) {

                LayoutInflater inflater = (LayoutInflater)buttonRows.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View cellViewInstance=inflater.inflate(buttonRows.getCellId(), null);

                int cellId= r.getIdentifier("cell_"+i+""+j,"id",PackageName);
                rowLayout.addView(cellViewInstance);
                cellViewInstance.setId(cellId);

                cellViewInstance.setLayoutParams(getCellParameters());

                Log.d("test","attr list is  "+buttonRows.getAttributesList());
                if(buttonRows.getAttributesList().size()!=0)
                {
                    Attributes attributes = buttonRows.getAttributesList().get(index);

                    setAttributesToView(cellViewInstance, attributes);

                    Log.d("test","I am in attr");

                }
                //rowLayout.addView(cellViewInstance);
                index++;
            }

            buttonRows.addView(rowLayout);
        }


    }

    LinearLayout.LayoutParams getRowParameters(){
        LinearLayout.LayoutParams rowParameters=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,0,1f);
        return rowParameters;
    }

    LinearLayout.LayoutParams getCellParameters(){
        LinearLayout.LayoutParams rowParameters=new LinearLayout.LayoutParams(0,ViewGroup.LayoutParams.MATCH_PARENT,1f);
        return rowParameters;
    }


    void setAttributesToView(View view,Attributes attributes){

        if(attributes.getCustomView()!=null){
            view=attributes.getCustomView();
        }

        if(attributes.getBackgroudResource()!=0){

            view.setBackgroundResource(attributes.getBackgroudResource());
        }

        if(attributes.getBackgroundDrawable()!=null){
            view.setBackground(attributes.getBackgroundDrawable());
        }

        if(attributes.getBackgroundColor()!=0){
            view.setBackgroundColor(attributes.getBackgroundColor());
        }

        if(attributes.getOnClickListener()!=null){
            view.setOnClickListener(attributes.getOnClickListener());
        }

        if(attributes.getButtonText()!=null){
            Button button=(Button)view;
            button.setText(attributes.getButtonText());
            Log.d("test","I am in btn text");
        }

        if(attributes.getTextColor()!=0){
            TextView textView=(TextView)view;
            textView.setTextColor(attributes.getTextColor());
        }

        if(attributes.getTextViewText()!=null){
            TextView button=(TextView)view;
            button.setText(attributes.getTextViewText());
        }

    }
}
