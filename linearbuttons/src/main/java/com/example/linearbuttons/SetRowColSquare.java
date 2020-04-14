package com.example.linearbuttons;

public class SetRowColSquare {

    Boolean isRowColumn=false;
    Boolean isSquare=false;
    int row;
    int col;
    int squareCount;

    public SetRowColSquare(){

    }

    public void set(int row,int col){
        setRowColumn();
        this.row=row;
        this.col=col;
    }

    public void set(int square){
        setSquare();
        this.squareCount=square;
    }


    void setRowColumn() {
        isRowColumn=true;
        isSquare=false;
    }

    void setSquare() {
        isSquare=true;
        isRowColumn=false;
    }

    public Boolean getRowColumn() {
        return isRowColumn;
    }

    public Boolean getSquare() {
        return isSquare;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getSquareCount() {
        return squareCount;
    }
}
