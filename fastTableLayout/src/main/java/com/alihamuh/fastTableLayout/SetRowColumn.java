package com.alihamuh.fastTableLayout;

class SetRowColumn {

    private Boolean isRowColumn=false;
    private Boolean isSquare=false;
    private int row;
    private int col;
    private int squareCount;

    SetRowColumn(){

    }

    void set(int row,int col){
        setRowColumn();
        this.row=row;
        this.col=col;
    }

    void set(int square){
        setSquare();
        this.squareCount=square;
    }


    private void setRowColumn() {
        isRowColumn=true;
        isSquare=false;
    }

    private void setSquare() {
        isSquare=true;
        isRowColumn=false;
    }

    Boolean getRowColumn() {
        return isRowColumn;
    }

    Boolean getSquare() {
        return isSquare;
    }

    int getRow() {
        return row;
    }

    int getCol() {
        return col;
    }

    int getSquareCount() {
        return squareCount;
    }
}
