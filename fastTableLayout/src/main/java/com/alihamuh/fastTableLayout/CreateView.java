package com.alihamuh.fastTableLayout;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

class CreateView {

    private SetRowColumn rowColSquare;
    private FastLayout fastLayout;
    private Resources r;
    private String PackageName;

    CreateView() {

    }

    CreateView(SetRowColumn rowColSquare) {
        this.rowColSquare = rowColSquare;
    }

    void create(FastLayout fastLayout) {

        this.fastLayout = fastLayout;

        if (rowColSquare.getRowColumn()) {

            setLayout(rowColSquare.getRow(),rowColSquare.getCol());
        }

        if (rowColSquare.getSquare()) {
           setLayout(rowColSquare.getSquareCount(),rowColSquare.getSquareCount());
        }
    }


    private void setLayout(int rowCount, int colCount) {

        r= fastLayout.getResources();
        PackageName= fastLayout.getContext().getPackageName();
        int index=0;
        for (int i = 0; i < rowCount; i++) {

            LinearLayout rowLayout=new LinearLayout(fastLayout.context);
            rowLayout.setLayoutParams(getRowParameters());
            rowLayout.setOrientation(LinearLayout.HORIZONTAL);
            for (int j = 0; j < colCount; j++) {

                LayoutInflater inflater = (LayoutInflater) fastLayout.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View cellViewInstance=inflater.inflate(fastLayout.getCellId(), null);

                int cellId= r.getIdentifier("cell_"+i+""+j,"id",PackageName);
                rowLayout.addView(cellViewInstance);
                cellViewInstance.setId(cellId);

                cellViewInstance.setLayoutParams(getCellParameters());

                if(fastLayout.getFastAttributesList().size()!=0)
                {
                    FastAttributes fastAttributes = fastLayout.getFastAttributesList().get(index);

                    ApplyfastAttributes applyfastAttributes=new ApplyfastAttributes();
                    applyfastAttributes.applyAttributesToView(cellViewInstance, fastAttributes);

                }

                index++;
            }

            fastLayout.addView(rowLayout);
        }


    }

    private LinearLayout.LayoutParams getRowParameters(){
        LinearLayout.LayoutParams rowParameters=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,0,1f);
        return rowParameters;
    }

    private LinearLayout.LayoutParams getCellParameters(){
        LinearLayout.LayoutParams rowParameters=new LinearLayout.LayoutParams(0,ViewGroup.LayoutParams.MATCH_PARENT,1f);
        return rowParameters;
    }

}
