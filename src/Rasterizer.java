/*
 * Rasterizer.java
 * 
 * Version: $Id: Rasterizer.java, v 1.1 2015/22/02 15:14:43
 * 
 * Revisions: 
 * 		
 * Initial Revision
 * 
 */

/**
 * 
 * A simple class for performing rasterization algorithms.
 *
 * @author Sanika Kulkarni
 *
 */

public class Rasterizer {

	/**
	 * number of scanlines
	 */
	int n_scanlines;

	/**
	 * Constructor
	 *
	 * @param n
	 *            number of scanlines
	 *
	 */
	Rasterizer(int n) {
		n_scanlines = n;
	}

	/**
	 * Draw a line from (x0,y0) to (x1, y1) on the simpleCanvas C.
	 *
	 * Implementation should be using the Midpoint Method
	 *
	 * You are to add the implementation here using only calls to C.setPixel()
	 *
	 * @param x0
	 *            x coord of first endpoint
	 * @param y0
	 *            y coord of first endpoint
	 * @param x1
	 *            x coord of second endpoint
	 * @param y1
	 *            y coord of second endpoint
	 * @param C
	 *            The canvas on which to apply the draw command.
	 */
	public void drawLine(int x0, int y0, int x1, int y1, simpleCanvas C) {
		// YOUR IMPLEMENTATION GOES HERE
		int x, y, dx, dy, increaseX, increaseY, decisionParameter; // initializing
																	// variables
		// calculating the difference between the starting point and the end
		// point
		dx = Math.abs(x1 - x0);
		dy = Math.abs(y1 - y0);
		// increase in x and y depending on the start and end points
		increaseX = x1 == x0 ? 0 : x1 > x0 ? 1 : -1;
		increaseY = y1 == y0 ? 0 : y1 > y0 ? 1 : -1;
		// to print the last pixel
		x1 = x1 + increaseX;
		y1 = y1 + increaseY;
		// to find out the line belonging in which quadrant
		if (dy > dx) {
			decisionParameter = 2 * dx - dy; // decides which point to select as
												// next pixel
			x = x0;
			y = y0;
			do {
				C.setPixel(x, y);
				if (decisionParameter <= 0)
					// if decision parameter less than 0 then select dlower
					decisionParameter = decisionParameter + 2 * dx;
				else {
					// if decision parameter greater than 0 then select dupper
					decisionParameter = decisionParameter + 2 * dx - 2 * dy;
					x = x + increaseX;
				}
				y = y + increaseY;
			} while (y != y1);
		} else {
			decisionParameter = 2 * dy - dx;// decides which point to select as
											// next pixel
			x = x0;
			y = y0;
			do {
				C.setPixel(x, y);
				// if decision parameter less than 0 then select dlower
				if (decisionParameter <= 0)
					decisionParameter = decisionParameter + 2 * dy;
				else {
					// if decision parameter greater than 0 then select dupper
					decisionParameter = decisionParameter + 2 * dy - 2 * dx;
					y = y + increaseY;
				}
				x = x + increaseX;
			} while (x != x1);
		}
	}
}
