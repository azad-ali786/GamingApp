package com.azadali.learnjava.game;

public class MarioGame implements GamingConsole {
	
   public void up() {
	   System.out.println("Mario Jump");
   }
   
   public void down() {
	   System.out.println("Mario Go inside");
   }
   
   public void left() {
	   System.out.println("Mario Slow Down");
   }
   
   public void right() {
	   System.out.println("Mario Accelerate");
   }
   
}
