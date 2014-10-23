/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample3;

/**
 *
 * @author Ashley
 */
public class Computer {
    
  public int keyboard;
  public int monitor;
  public int motherboard;
  
  private Computer(int startKeyboard, int startMonitor, int startMotherboard){
      this.keyboard = startKeyboard;
      this.monitor = startMonitor;
      this.motherboard = startMotherboard;
  }
  public int getKeyboard(){
      return keyboard;
  }
  public void setKeyboard(int keyboard){
      this.keyboard = keyboard;
  }
  public int getMonitor(){
     return monitor;
 }
  public void setMonitor(int monitor){
      this.monitor = monitor;
  }
  public int getMotherboard(){
      return motherboard;
  }
  public void setMotherboard(int motherboard){
      this.motherboard = motherboard;
  }
  public void printDescription(){
      System.out.println("\nComputer" + " keyboard is " + this.keyboard + "with a " + this.monitor + "monitor and the motherboard is a " + this.motherboard + ".");
    
  }
}
public class HP extends Computer {
    private String mousepad;
    
    public HP(int startKeyboard, int startMonitor, int startMotherboard, String startMousepad){
        super(startKeyboard, startMonitor, startMotherboard);
        this.setMousepad(mousepad);
    }
    public String getMousepad(){
        return this.mousepad;
    }
    public void setMousepad(String mousepad){
        this.mousepad = mousepad;
    }
    public void printDescription(){
        super.printDescription();
        System.out.println("The " + "HP has a " + getMousepad() + "mouspad.");
    }
}
public class Dell extends Computer {
    private int speakers;
    
    public Dell(int startKeyboard, int startMonitor, int startMotherboard, int startSpeakers){
        super(startKeyboard, startMonitor, startMotherboard);
        this.setSpeakers(speakers);
    }
    public int getSpeakers(){
        return this.speakers;
    }
    public void setSpeakers(int speakers){
        this.speakers = speakers;
    }
    public void printDescription(){
        super.printDescription();
        System.out.println("The " + "Dell has a " + getSpeakers() + "speakers.");
    }
}
public class TestComputer {
    public static void main(String[] args){
        Computer computer01,computer02,computer03;
        
        computer01 = new Computer(1,1,1);
        computer02 = new HP(1,1,1,"laptop");
        computer03 = new Dell(1,1,1,3);
        
        computer01.printDescription();
        computer02.printDescription();
        computer03.printDescription();
    }
}
