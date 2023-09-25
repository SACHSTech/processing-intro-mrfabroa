import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	  // put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	  // sample code, delete this stuff
    stroke(237, 47, 228);
    line(150, 25, 270, 350);  

    stroke(255);
    line(50, 125, 70, 50);  

    if (mousePressed) {
      stroke(0);
      fill(0);
    } else {
      stroke(255);
      fill(255);
    }
    ellipse(mouseX, mouseY, 80, 80);
  }
  
  // define other methods down here.
}