package Abstraction;
abstract  class ObjectMovement1
{
int speed;
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
static String direction="Forword";
abstract void move(int newspeed);
}