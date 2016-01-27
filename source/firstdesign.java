import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class firstdesign extends PApplet {

/* Turtle that blinks
when you click the mouse button
character also follows the mouse
due to the mouseX and mouseY attributes*/

//SETUP
public void setup() {
size(600,600);
frameRate(10);
}
//BACKGROUND & OTHER ATTRIBUTES
public void draw() {
  background(144,195,212);
  smooth();
  noStroke();
  ellipseMode(CENTER);

//SAND
  fill(212,161,144);
  rect(0,250,1200,500);
  
//SUN
  fill(252,236,144);
  ellipse(100,100,150,150);
  
//SHELL
  fill(105,145,73);
  ellipse(mouseX,mouseY+200,325,350);
  
//BODY
  fill(161,212,144);
  ellipse(mouseX,mouseY+200,290,310);

//HEAD 
  fill(161,212,144);
  ellipse(mouseX,mouseY,150,150);  
  
//EYES
  fill(255,255,255);
  ellipse(mouseX-50,mouseY-50,50,50);
  ellipse(mouseX+50,mouseY-50,50,50);
  fill(0,0,0);
  ellipse(mouseX-50,mouseY-50,15,15);
  ellipse(mouseX+50,mouseY-50,15,15);
  
//FEET
  fill(105,145,73);
  ellipse(mouseX-150,mouseY+300,125,125);
  ellipse(mouseX+150,mouseY+300,125,125);
  
//HANDS
  ellipse(mouseX-150,mouseY+100,80,80);
  ellipse(mouseX+150,mouseY+100,80,80);
}

//BLINKS WHEN MOUSE IS PRESSED
public void mousePressed() {
  fill(105,145,73);
  ellipse(mouseX-50,mouseY-50,50,50);
  ellipse(mouseX+50,mouseY-50,50,50);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "firstdesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
