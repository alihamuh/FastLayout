package com.alihamuh.fastTableLayout;

class CheckRowColumn {

    CheckRowColumn(){

    }

    Boolean isRowColumns(int row, int col){

        if(row>1&&col>1){
            return true;
        }

        return false;
    }


    Boolean isSquare(int Square){

        if(Square>0){
            return true;
        }

        return true;
    }
}
