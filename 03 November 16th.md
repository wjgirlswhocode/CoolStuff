# November 16th meeting

Here are the materials for today! We'll explain what you need to do with the stuff below, so don't worry if some of it looks confusing

## Online Processing Editor
[https://hello.processing.org/editor/#editor](https://hello.processing.org/editor/#editor)

[![Processing Editor](https://imgur.com/uggxDeW.png)](https://hello.processing.org/editor/#editor)


## Demo code
```java
//setup is called once when the program begins
void setup() {
  size(640, 360); //sets the width and height of the application window in pixels
  noStroke(); //(subsequent) shapes will not have strokes (outlines/borders)
  rectMode(CENTER); //(subsequent) rectangle arguments will be interpreted as (centerX, centerY, width, height)
}

//draw is called once per frame, after setup is called
void draw() {
  background(51); //draws a background with an rgb color of (51, 51, 51)
  fill(255, 204); //(subsequent) shapes will have an rgb color of (255, 255, 255) and an alpha (opacity) value of 204
  rect(mouseX, height/2, mouseY/2 + 10, mouseY/2 + 10); //draws a rectangle. mouseX, mouseY, width, and height are system variables
  int inverseX = width - mouseX;
  int inverseY = height - mouseY;
  rect(inverseX, height/2, inverseY/2 + 10, inverseY/2 + 10);
}
```

<a id="spinning squares" href="#spinning squares"><img alt="spinning squares" src="https://imgur.com/wCr45de.gif" /></a>

## More code to try :)
<details>
	<summary>1</summary>
	Processing will treat code not inside any method as if it were in the setup() method!

  ```java
size(480, 270);
background(0);
noStroke();
	
// No fourth argument means 100% opacity.
fill(0, 0, 255);
rect(0, 0, 240, 200);
	
// 255 means 100% opacity.
fill(255, 0, 0, 255);
rect(0, 0, 480, 40);
	
// 75% opacity.
fill(255, 0, 0, 191);
rect(0, 50, 480, 40);
	
// 55% opacity.
fill(255, 0, 0, 127);
rect(0, 100, 480, 40);
	
// 25% opacity.
fill(255, 0, 0, 63);
rect(0, 150, 480, 40);
  ```
</details>
<details>
	<summary>2</summary>

  ```java
void setup() {
  size(480, 270);
  background(50);
  stroke(255);
}

void draw() {
  background(50);
  stroke(255);
  // frameCount is the number of frames that have passed since the program began
  fill(frameCount / 2);
  rectMode(CENTER);
  rect(width/2, height/2, width/2, height/2);
}

  ```
</details>
<details>
	<summary>3</summary>

  ```java
void setup() {
  size(480, 270);
  background(255);
}

void draw() {
  stroke(0);

  // Draw a line from previous mouse location to current mouse location.
  line(pmouseX, pmouseY, mouseX, mouseY);
}
  ```
</details>
<details>
	<summary>4</summary>

  ```java
void setup() {
  size(480, 270);
  background(255);
  stroke(0);
}

// Whenever a user clicks the mouse the code written inside mousePressed() is executed
void mousePressed() {
  fill(175);
  rectMode(CENTER);
  rect(mouseX, mouseY, 16, 16);
}

// Whenever a user presses a key the code written inside keyPressed() is executed
void keyPressed() {
  background(255);
}
  ```
</details>
<details>
	<summary>5</summary>

   ```java	
	float x = 240;   // x location of square
	float y = 0;     // y location of square
	
	float speed = 0;   // speed of square
	
	// A new variable, for gravity (i.e. acceleration).   
	// We use a relatively small number (0.1) because 
	// this accelerations accumulates over time, increasing the speed.   
	// Try changing this number to 2.0 and see what happens.
	float gravity = 0.1;  
	
	void setup() {
	  size(480, 270);
	}
	
	void draw() {
	  background(255);
	
	  // Display the square
	  fill(175);
	  stroke(0);
	  rectMode(CENTER);
	  rect(x, y, 10, 10);
	
	  // Add speed to location.
	  y = y + speed;
	
	  // Add gravity to speed.
	  speed = speed + gravity;
	
	  // If square reaches the bottom
	  // Reverse speed
	  if (y > height) {
	    // Multiplying by -0.95 instead of -1 slows the square 
	    // down each time it bounces (by decreasing speed).  
	    // This is known as a "dampening" effect and is a more 
	    // realistic simulation of the real world (without it, 
	    // a ball would bounce forever).
	    speed = speed * -0.95;
	    y = height;
	  }
	}
   ```
</details>
<details>
	<summary>6</summary>
	psst.. all of the code above was taken from [here](http://learningprocessing.com/examples/). We selected cool ones that you can understand from what you've learned so far, but there's some even cooler but really complicated stuff!
</details>