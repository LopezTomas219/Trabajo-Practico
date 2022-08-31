package model;

public class dado {
  
  private int value;

  public dado() {

  }
  public int getValue() {
    return value;
  }
  
  public void setValue(int value) {
    this.value = value;
  }
  public int rolldado(){
    return (int)(Math.random()*6)*1;
  }
}
