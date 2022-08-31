package model;

import java.util.ArrayList;

public class question {
  
  private int id;
  private String question;
  private int difficulty;
  private int idCorrectOption;
  private ArrayList<option> options = new ArrayList<option>();
  private category category;
  public question(int id, String question, int difficulty,category category) {
    this.id = id;
    this.question = question;
    this.difficulty = difficulty;
    this.category=category;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getQuestion() {
    return question;
  }
  public void setQuestion(String question) {
    this.question = question;
  }
  public int getDifficulty() {
    return difficulty;
  }
  public void setDifficulty(int difficulty) {
    this.difficulty = difficulty;
  }
  public int getIdCorrectOption() {
    return idCorrectOption;
  }
  public void setIdCorrectOption(int idCorrectOption) {
    this.idCorrectOption = idCorrectOption;
  }
  public ArrayList<option> getOptions() {
    return options;
  }
  public void addOption(option e){
    options.add(e);
  }
  public category getCategory() {
    return category;
  }
  public void setCategory(category category) {
    this.category = category;
  }
  
}
