package model;

public class action {
  private String description;
  private String color;
  public action(String description, String color) {
    this.description = description;
    this.color = color;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  @Override
  public String toString() {
    return "color= " + color + " descripcion=" + description;
  }
  

}
