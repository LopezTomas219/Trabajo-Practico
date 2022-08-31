package model;

import java.util.ArrayList;

public class boardRacer extends board {

  private ArrayList<category> categorys=new ArrayList<category>();
  private ArrayList<question> questions=new ArrayList<question>();



  public boardRacer(int contPlayer, int rows, int columns) {
    super(contPlayer, rows, columns);

  }
  
  public void addCategory(category e){
    categorys.add(e);
    
  }
  public void addQuestion(question e){
    questions.add(e);
  }
  
}
