package model;

public class playerRacer extends player{

  private int missedshifts;
  private int timebyoption;
  public playerRacer(int id, String name, String color, int missedshifts, int timebyoption) {
    super(id, name, color);
    this.missedshifts = missedshifts;
    this.timebyoption = timebyoption;
  }
  public int getMissedshifts() {
    return missedshifts;
  }
  public void setMissedshifts(int missedshifts) {
    this.missedshifts = missedshifts;
  }
  public int getTimebyoption() {
    return timebyoption;
  }
  public void setTimebyoption(int timebyoption) {
    this.timebyoption = timebyoption;
  }
  @Override
  public String toString() {
    return super.toString()+" turnos perdidos: "+getMissedshifts()+" tiempo por turno: "+getTimebyoption();
  }
}
