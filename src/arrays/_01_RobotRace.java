package arrays;

import java.awt.AWTException;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	
	//2. create an array of 5 robots.
	Robot[] robs = new Robot[5];
	//3. use a for loop to initialize the robots.
	for (int i = 0; i < robs.length; i++) {
			robs[i] = new Robot();
			robs[i].setX(100 * i + 100);
			robs[i].setY(500);
			robs[i].setSpeed(10);
	}
		//4. make each robot start at the bottom of the screen, side by side, facing up
		
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	for (int i = 0; i < robs.length; i++) {
		Random rnd = new Random();
		robs[i].move(rnd.nextInt(50)+1);
	}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	boolean notwon = true;
	int winner = -250;
	while(notwon) {
		for (int i = 0; i < robs.length; i++) {
			Random rnd = new Random();
			robs[i].move(rnd.nextInt(50)+1);
		}
		for (int i = 0; i < robs.length; i++) {
			if (notwon && winner == -250 && robs[i].getY() <= 72) {
				winner = i;
				notwon = false;
			}
		}
	}
	
	robs[winner].sparkle();
	//7. declare that robot the winner and throw it a party!
	
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}