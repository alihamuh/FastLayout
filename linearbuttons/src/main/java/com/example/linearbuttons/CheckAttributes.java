package com.example.linearbuttons;

public class CheckAttributes {

    public CheckAttributes(){

    }

    public Boolean isRowColumns(int row,int col){

        if(row>1&&col>1){
            return true;
        }

        return false;
    }

    public Boolean isSquare(int Square){

        if(Square>0){
            return true;
        }

        return true;
    }
}
