/*
 * lineTest.java
 * 
 * Version: $Id: lineTest.java, v 1.1 2015/22/02 15:14:43
 * 
 * Revisions: 
 * 		
 * Initial Revision
 * 
 */

import java.awt.*;
import java.awt.event.*;

/**
 * This program prints words using bresenhem algorithm
 * 
 * @author Sanika Kulkarni
 */

public class lineTest {

	public lineTest() {
	}

	static public void main(String[] args) {

		simpleCanvas T = new simpleCanvas(600, 600);
		Rasterizer R = new Rasterizer(600);

		T.setColor(0.0f, 0.0f, 0.0f);
		T.clear();
		T.setColor(1.0f, 1.0f, 1.0f);

		// Idea for lettering style from:
		// http://patorjk.com/software/taag/#p=display&f=Star%20Wars&t=Type%20Something
		// _______ ______
		// / _____| / __ \
		// | | __ | | | |
		// | | |_ | | | | |
		// | |__| | | `--' |
		// \______| \______/

		// ######## The letter 'G' in green ########
		T.setColor(0.0f, 1.0f, 0.0f);
		R.drawLine(80, 340, 220, 340, T); // Horizontal left to right
		R.drawLine(40, 380, 80, 340, T); // 315 degree slope
		R.drawLine(220, 340, 260, 380, T); // 45 degree slope
		R.drawLine(260, 380, 260, 440, T); // Vertical bottom to top
		R.drawLine(260, 440, 180, 440, T); // Horizontal right to left
		R.drawLine(180, 440, 180, 400, T);
		R.drawLine(180, 400, 220, 400, T);
		R.drawLine(220, 400, 200, 380, T);
		R.drawLine(200, 380, 100, 380, T);
		R.drawLine(100, 380, 80, 400, T);
		R.drawLine(80, 400, 80, 500, T);
		R.drawLine(80, 500, 100, 520, T);
		R.drawLine(100, 520, 200, 520, T);
		R.drawLine(200, 520, 220, 500, T);
		R.drawLine(220, 500, 220, 480, T);
		R.drawLine(220, 480, 260, 480, T);
		R.drawLine(260, 480, 260, 520, T);
		R.drawLine(260, 520, 220, 560, T); // 135 degree slope
		R.drawLine(220, 560, 80, 560, T);
		R.drawLine(80, 560, 40, 520, T); // 225 degree slope
		R.drawLine(40, 520, 40, 380, T); // Vertical top to bottom

		// ######## The letter 'O' in red ########
		T.setColor(1.0f, 0.0f, 0.0f);
		R.drawLine(450, 320, 520, 340, T); // 16.6 degree slope
		R.drawLine(520, 340, 540, 360, T); // 45 degree slope
		R.drawLine(540, 360, 560, 450, T); // 77.47 degree slope
		R.drawLine(560, 450, 540, 540, T); // 102.83 degree slope
		R.drawLine(540, 540, 520, 560, T); // 135 degree slope
		R.drawLine(520, 560, 450, 580, T); // 163.3 degree slope
		R.drawLine(450, 580, 380, 560, T); // 196.71 degree slope
		R.drawLine(380, 560, 360, 540, T); // 225 degree slope
		R.drawLine(360, 540, 340, 450, T);
		R.drawLine(340, 450, 360, 360, T);
		R.drawLine(360, 360, 380, 340, T);
		R.drawLine(380, 340, 450, 320, T);
		R.drawLine(420, 380, 480, 380, T);
		R.drawLine(480, 380, 520, 420, T);
		R.drawLine(520, 420, 520, 480, T);
		R.drawLine(520, 480, 480, 520, T);
		R.drawLine(480, 520, 420, 520, T);
		R.drawLine(420, 520, 380, 480, T);
		R.drawLine(380, 480, 380, 420, T);
		R.drawLine(380, 420, 420, 380, T);

		// ############# Use blue color (0,0.5,1) to write your initials
		// #############

		T.setColor(0.0f, 0.5f, 1.0f);

		//
		// YOUR CODE HERE
		// "S"

		R.drawLine(80, 300, 220, 300, T);
		R.drawLine(40, 260, 80, 300, T);
		R.drawLine(220, 300, 220, 260, T);
		R.drawLine(220, 260, 100, 260, T);
		R.drawLine(100, 260, 80, 240, T);
		R.drawLine(40, 260, 40, 180, T);
		R.drawLine(80, 240, 80, 200, T);
		R.drawLine(80, 200, 100, 180, T);
		R.drawLine(100, 180, 180, 180, T);
		R.drawLine(180, 180, 220, 140, T);
		R.drawLine(220, 140, 220, 60, T);
		R.drawLine(220, 60, 180, 20, T);
		R.drawLine(180, 20, 40, 20, T);
		R.drawLine(40, 20, 40, 60, T);
		R.drawLine(40, 60, 160, 60, T);
		R.drawLine(160, 60, 180, 80, T);
		R.drawLine(180, 80, 180, 120, T);
		R.drawLine(180, 120, 160, 140, T);
		R.drawLine(80, 140, 160, 140, T);
		R.drawLine(40, 180, 80, 140, T);

		//
		// "K"

		R.drawLine(350, 20, 350, 300, T);
		R.drawLine(350, 300, 380, 300, T);
		R.drawLine(380, 300, 380, 200, T);
		R.drawLine(380, 200, 480, 300, T);
		R.drawLine(480, 300, 520, 300, T);
		R.drawLine(520, 300, 380, 160, T);
		R.drawLine(380, 160, 520, 20, T);
		R.drawLine(520, 20, 480, 20, T);
		R.drawLine(480, 20, 380, 120, T);
		R.drawLine(380, 120, 380, 20, T);
		R.drawLine(380, 20, 350, 20, T);

		//

		Frame f = new Frame("Line Test");
		f.add("Center", T);
		f.pack();
		f.setResizable(false);
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

}
