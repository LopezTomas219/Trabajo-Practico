package model;

import java.util.ArrayList;



public class board {
  private int contPlayer;
  private int rows,columns;
  private ArrayList<player> players =new ArrayList<player>();
  private ArrayList<box> boxes = new ArrayList<box>();

  public board(int contPlayer, int rows, int columns) {
    this.contPlayer = contPlayer;
    this.rows = rows;
    this.columns = columns;
  }

  public int getContPlayer() {
    return contPlayer;
  }

  public void setContPlayer(int contPlayer) {
    this.contPlayer = contPlayer;
  }

  public int getRows() {
    return rows;
  }

  public void setRows(int rows) {
    this.rows = rows;
  }

  public int getColumns() {
    return columns;
  }

  public void setColumns(int columns) {
    this.columns = columns;
  }

  public ArrayList<player> getPlayers() {
    return players;
  }

  public void addPlayers(player e){

      players.add(e);
  }

  public ArrayList<box> getBoxes() {
    return boxes;
  }

  public void addBox(box e){
    boxes.add(e);
  }
  
  


}
