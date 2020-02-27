//1. Make a variable to hold the X co-ordinate of the dot and set it to 50.
int xCo = 10;
int x2Co = 10;
int x3Co = 10;
void setup() {
    size(1000, 400);
}

void draw() {
    background(#DB8282);
  //3. make the ellipse a nice color
 fill(100, 10, 10);
  ellipse(xCo, 200, 10, 10);
    ellipse(x2Co, 100, 10, 10);
    ellipse(x3Co, 300, 10, 10);
    //4. If the mouse is pressed change the X co-ordinate so that the dot moves to the right
if (mousePressed) {
  xCo +=(int) random(5, 20);
x2Co +=(int) random(5, 20);
x3Co +=(int) random(5, 20);
}
    //5. Make your dot move faster
    //  (you have to figure out what part of your code to change)

    //2. Draw an ellipse of height and width 10. Make sure to use your variable for the X position.
 if(xCo == 1000){
 playSound();
 }
  if(x2Co == 1000){
 playSound();
 }   if(x3Co == 1000){
 playSound();
 }
 //6. Use the playSound() method to play a ding when your dot crosses the finish line. 
}

import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("ding.wav");
        sound.trigger();
        soundPlayed = true;
    }
}
