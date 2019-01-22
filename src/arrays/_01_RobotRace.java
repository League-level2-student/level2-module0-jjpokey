package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	

	//2. create an array of 5 robots.
Robot [] r = new Robot[5];
	//3. use a for loop to initialize the robots.
for(int a = 0; a < 5; a++) {
	r[a] = new Robot();
}
		//4. make each robot start at the bottom of the screen, side by side, facing up
for(int B = 0; B < 5; B++) {
r[B].setX(100);
r[B].setY(500);
r[B].setAngle(0);
r[B].setSpeed(10);

}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
boolean finished = false;
while(!finished) {
for(int Z = 0; Z < 5; Z++) {
	
	if(r[Z].getX() < 0) {
		System.out.println("The Winner is Robot " + (Z + 1));
		finished = true;
	}
	
	if(r[Z].getY() < 50) {
		r[Z].setAngle(90);
	}
	
	if(r[Z].getX() > 750) {
		r[Z].setAngle(180);
	}
	
	if(r[Z].getY() > 510) {
		r[Z].setAngle(270);
	}
	
	Random rand = new Random();
	int J = rand.nextInt(50);
	r[Z].move(J);
	
	
	
}
}

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	
}
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
