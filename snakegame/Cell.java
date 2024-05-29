package com.mycompany.snakegame;

public class Cell
{
    private final int row, col;
    CellType( int row, int col)
    {
        this.row=row;
        this.col=col;
    
   }
    public cellType getCellType()
    {
        return cellType;
    }
    public void setCellType(CellType cellType)
    {
        this.cellType=cellType;
    }
    public int getRow()
    {
        return row;
    }
    public int getCol()
    {
        return col;
    }
}