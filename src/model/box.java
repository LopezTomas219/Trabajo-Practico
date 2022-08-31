package model;

public class box {
  private int id;
  private String label;
  private String color;
  private player currentPlayer;
  public box(int id, String label, String color, player currentPlayer) {
    this.id = id;
    this.label = label;
    this.color = color;
    this.currentPlayer = currentPlayer;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public player getCurrentPlayer() {
    return currentPlayer;
  }
  public void setCurrentPlayer(player currentPlayer) {
    this.currentPlayer = currentPlayer;
  }
  @Override
  public String toString() {
    return "box [color=" + color + ", currentPlayer=" + currentPlayer + ", id=" + id + ", label=" + label + "]";
  }
  
  
}
