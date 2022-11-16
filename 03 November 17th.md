# November 17th meeting

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
	hi
</details>

<details>
  <summary>Click me</summary>

  ```js
  function logSomething(something) {
  	console.log('Something', something);
  }
  ```
</details>