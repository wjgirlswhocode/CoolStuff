# November 17th meeting

Here are the materials for today! We'll explain what you need to do with the stuff below, so don't worry if some of it looks confusing

## Online Processing Editor
[https://hello.processing.org/editor/#editor](https://hello.processing.org/editor/#editor)

![image](https://imgur.com/uggxDeW.png)


## Demo code
```Java
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
![gif](https://imgur.com/wCr45de.gif)

<details>
	<summary>x</summary> 
	hi
</details>