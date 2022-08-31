package model;

import java.util.ArrayList;

public class dadoAccion extends dado{
   private ArrayList<action> actions=new ArrayList<action>();

  public dadoAccion() {
  }
  public void addAction(action e){
    actions.add(e);
  }
  public action getAction(int x){
      return actions.get(x);
  }

}
