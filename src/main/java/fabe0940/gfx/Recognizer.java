package fabe0940.gfx;

import fabe0940.gfx.core.Viewport;
import fabe0940.gfx.core.Window;
import fabe0940.gfx.core.World;
import fabe0940.gfx.math.Point3;
import java.awt.Color;
import java.awt.Graphics;

public class Recognizer extends World {
	/* Constructor */
	public Recognizer(Viewport v, Window w) {
		super(v, w);
	}

	/* Render */
	public void draw(Graphics g) {

		/* Set up window for drawing */
		drawBackground(g);
		drawTitle(g);

		g.setColor(Color.RED);

		/* Render recognizer */

		/* lower left leg */
		moveTo3D(g,  0,  0,  3);
		drawTo3D(g,  8,  0,  3);
		drawTo3D(g,  3,  3,  3);
		drawTo3D(g,  3, 15,  3);
		drawTo3D(g,  0, 15,  3);
		drawTo3D(g,  0,  0,  3);
		moveTo3D(g,  0,  0,  0);
		drawTo3D(g,  8,  0,  0);
		drawTo3D(g,  3,  3,  0);
		drawTo3D(g,  3, 15,  0);
		drawTo3D(g,  0, 15,  0);
		drawTo3D(g,  0,  0,  0);
		moveTo3D(g,  0,  0,  3);
		drawTo3D(g,  0,  0,  0);
		moveTo3D(g,  8,  0,  3);
		drawTo3D(g,  8,  0,  0);
		moveTo3D(g,  3,  3,  3);
		drawTo3D(g,  3,  3,  0);
		moveTo3D(g,  3, 15,  3);
		drawTo3D(g,  3, 15,  0);
		moveTo3D(g,  0, 15,  3);
		drawTo3D(g,  0, 15,  0);

		/* middle left leg */
		moveTo3D(g,  0, 18,  3);
		drawTo3D(g,  3, 18,  3);
		drawTo3D(g,  3, 22,  3);
		drawTo3D(g,  0, 22,  3);
		drawTo3D(g,  0, 18,  3);
		moveTo3D(g,  0, 18,  0);
		drawTo3D(g,  3, 18,  0);
		drawTo3D(g,  3, 22,  0);
		drawTo3D(g,  0, 22,  0);
		drawTo3D(g,  0, 18,  0);
		moveTo3D(g,  0, 18,  3);
		drawTo3D(g,  0, 18,  0);
		moveTo3D(g,  3, 18,  3);
		drawTo3D(g,  3, 18,  0);
		moveTo3D(g,  3, 22,  3);
		drawTo3D(g,  3, 22,  0);
		moveTo3D(g,  0, 22,  3);
		drawTo3D(g,  0, 22,  0);

		/* middle left rectangle */
		moveTo3D(g,  4, 19,  3);
		drawTo3D(g,  6, 19,  3);
		drawTo3D(g,  6, 20,  3);
		drawTo3D(g,  4, 20,  3);
		drawTo3D(g,  4, 19,  3);
		moveTo3D(g,  4, 19,  0);
		drawTo3D(g,  6, 19,  0);
		drawTo3D(g,  6, 20,  0);
		drawTo3D(g,  4, 20,  0);
		drawTo3D(g,  4, 19,  0);
		moveTo3D(g,  4, 19,  3);
		drawTo3D(g,  4, 19,  0);
		moveTo3D(g,  4, 20,  3);
		drawTo3D(g,  4, 20,  0);
		moveTo3D(g,  6, 20,  3);
		drawTo3D(g,  6, 20,  0);
		moveTo3D(g,  6, 19,  3);
		drawTo3D(g,  6, 19,  0);

		/* upper left */
		moveTo3D(g, -1, 23, 3);
		drawTo3D(g,  4.5, 23, 3);
		drawTo3D(g,  8, 19, 3);
		drawTo3D(g, 14.5, 19, 3);
		drawTo3D(g, 14.5, 20, 3);
		drawTo3D(g, 11, 20, 3);
		drawTo3D(g,  9, 23, 3);
		drawTo3D(g, 14.5, 23, 3);
		drawTo3D(g, 14.5, 24, 3);
		drawTo3D(g, -1, 24, 3);
		drawTo3D(g, -1, 23, 3);
		moveTo3D(g, -1, 23, 0);
		drawTo3D(g,  4.5, 23, 0);
		drawTo3D(g,  8, 19, 0);
		drawTo3D(g, 14.5, 19, 0);
		drawTo3D(g, 14.5, 20, 0);
		drawTo3D(g, 11, 20, 0);
		drawTo3D(g,  9, 23, 0);
		drawTo3D(g, 14.5, 23, 0);
		drawTo3D(g, 14.5, 24, 0);
		drawTo3D(g, -1, 24, 0);
		drawTo3D(g, -1, 23, 0);
		moveTo3D(g, -1, 23,  3);
		drawTo3D(g, -1, 23,  0);
		moveTo3D(g, 4.5, 23,  3);
		drawTo3D(g, 4.5, 23,  0);
		moveTo3D(g,  8, 19,  3);
		drawTo3D(g,  8, 19,  0);
		moveTo3D(g, 14.5, 19,  3);
		drawTo3D(g, 14.5, 19,  0);
		moveTo3D(g, 14.5, 20,  3);
		drawTo3D(g, 14.5, 20,  0);
		moveTo3D(g, 11, 20,  3);
		drawTo3D(g, 11, 20,  0);
		moveTo3D(g,  9, 23,  3);
		drawTo3D(g,  9, 23,  0);
		moveTo3D(g, 14.5, 23,  3);
		drawTo3D(g, 14.5, 23,  0);
		moveTo3D(g, 14.5, 24,  3);
		drawTo3D(g, 14.5, 24,  0);
		moveTo3D(g, -1, 24,  3);
		drawTo3D(g, -1, 24,  0);

		/* lower right leg */
		moveTo3D(g, 30,  0,  3);
		drawTo3D(g, 22,  0,  3);
		drawTo3D(g, 27,  3,  3);
		drawTo3D(g, 27, 15,  3);
		drawTo3D(g, 30, 15,  3);
		drawTo3D(g, 30,  0,  3);
		moveTo3D(g, 30,  0,  0);
		drawTo3D(g, 22,  0,  0);
		drawTo3D(g, 27,  3,  0);
		drawTo3D(g, 27, 15,  0);
		drawTo3D(g, 30, 15,  0);
		drawTo3D(g, 30,  0,  0);
		moveTo3D(g, 30,  0,  3);
		drawTo3D(g, 30,  0,  0);
		moveTo3D(g, 22,  0,  3);
		drawTo3D(g, 22,  0,  0);
		moveTo3D(g, 27,  3,  3);
		drawTo3D(g, 27,  3,  0);
		moveTo3D(g, 27, 15,  3);
		drawTo3D(g, 27, 15,  0);
		moveTo3D(g, 30, 15,  3);
		drawTo3D(g, 30, 15,  0);

		/* middle right leg */
		moveTo3D(g, 30, 18,  3);
		drawTo3D(g, 27, 18,  3);
		drawTo3D(g, 27, 22,  3);
		drawTo3D(g, 30, 22,  3);
		drawTo3D(g, 30, 18,  3);
		moveTo3D(g, 30, 18,  0);
		drawTo3D(g, 27, 18,  0);
		drawTo3D(g, 27, 22,  0);
		drawTo3D(g, 30, 22,  0);
		drawTo3D(g, 30, 18,  0);
		moveTo3D(g, 30, 18,  3);
		drawTo3D(g, 30, 18,  0);
		moveTo3D(g, 27, 18,  3);
		drawTo3D(g, 27, 18,  0);
		moveTo3D(g, 27, 22,  3);
		drawTo3D(g, 27, 22,  0);
		moveTo3D(g, 30, 22,  3);
		drawTo3D(g, 30, 22,  0);

		/* upper right */
		moveTo3D(g, 31, 23, 3);
		drawTo3D(g,  25.5, 23, 3);
		drawTo3D(g, 22, 19, 3);
		drawTo3D(g, 15.5, 19, 3);
		drawTo3D(g, 15.5, 20, 3);
		drawTo3D(g, 19, 20, 3);
		drawTo3D(g, 21, 23, 3);
		drawTo3D(g, 15.5, 23, 3);
		drawTo3D(g, 15.5, 24, 3);
		drawTo3D(g, 31, 24, 3);
		drawTo3D(g, 31, 23, 3);
		moveTo3D(g, 31, 23, 0);
		drawTo3D(g,  25.5, 23, 0);
		drawTo3D(g, 22, 19, 0);
		drawTo3D(g, 15.5, 19, 0);
		drawTo3D(g, 15.5, 20, 0);
		drawTo3D(g, 19, 20, 0);
		drawTo3D(g, 21, 23, 0);
		drawTo3D(g, 15.5, 23, 0);
		drawTo3D(g, 15.5, 24, 0);
		drawTo3D(g, 31, 24, 0);
		drawTo3D(g, 31, 23, 0);
		moveTo3D(g, 31, 23,  3);
		drawTo3D(g, 31, 23,  0);
		moveTo3D(g, 25.5, 23,  3);
		drawTo3D(g, 25.5, 23,  0);
		moveTo3D(g, 22, 19,  3);
		drawTo3D(g, 22, 19,  0);
		moveTo3D(g, 15.5, 19,  3);
		drawTo3D(g, 15.5, 19,  0);
		moveTo3D(g, 15.5, 20,  3);
		drawTo3D(g, 15.5, 20,  0);
		moveTo3D(g, 19, 20,  3);
		drawTo3D(g, 19, 20,  0);
		moveTo3D(g, 21, 23,  3);
		drawTo3D(g, 21, 23,  0);
		moveTo3D(g, 15.5, 23,  3);
		drawTo3D(g, 15.5, 23,  0);
		moveTo3D(g, 15.5, 24,  3);
		drawTo3D(g, 15.5, 24,  0);
		moveTo3D(g, 31, 24,  3);
		drawTo3D(g, 31, 24,  0);

		/* middle right rectangle */
		moveTo3D(g, 26, 19,  3);
		drawTo3D(g, 24, 19,  3);
		drawTo3D(g, 24, 20,  3);
		drawTo3D(g, 26, 20,  3);
		drawTo3D(g, 26, 19,  3);
		moveTo3D(g, 26, 19,  0);
		drawTo3D(g, 24, 19,  0);
		drawTo3D(g, 24, 20,  0);
		drawTo3D(g, 26, 20,  0);
		drawTo3D(g, 26, 19,  0);
		moveTo3D(g, 26, 19,  3);
		drawTo3D(g, 26, 19,  0);
		moveTo3D(g, 26, 20,  3);
		drawTo3D(g, 26, 20,  0);
		moveTo3D(g, 24, 20,  3);
		drawTo3D(g, 24, 20,  0);
		moveTo3D(g, 24, 19,  3);
		drawTo3D(g, 24, 19,  0);

		/* lower middle bar */
		moveTo3D(g,  0, 16,  3);
		drawTo3D(g, 30, 16,  3);
		drawTo3D(g, 30, 17,  3);
		drawTo3D(g,  0, 17,  3);
		drawTo3D(g,  0, 16,  3);
		moveTo3D(g,  0, 16,  0);
		drawTo3D(g, 30, 16,  0);
		drawTo3D(g, 30, 17,  0);
		drawTo3D(g,  0, 17,  0);
		drawTo3D(g,  0, 16,  0);
		moveTo3D(g,  0, 16,  3);
		drawTo3D(g,  0, 16,  0);
		moveTo3D(g, 30, 16,  3);
		drawTo3D(g, 30, 16,  0);
		moveTo3D(g, 30, 17,  3);
		drawTo3D(g, 30, 17,  0);
		moveTo3D(g,  0, 17,  3);
		drawTo3D(g,  0, 17,  0);

		/* lower middle trapezoid */
		moveTo3D(g, 12, 15.5,  3);
		drawTo3D(g, 18, 15.5,  3);
		drawTo3D(g, 17, 14.5,  3);
		drawTo3D(g, 13, 14.5,  3);
		drawTo3D(g, 12, 15.5,  3);
		moveTo3D(g, 12, 15.5,  0);
		drawTo3D(g, 18, 15.5,  0);
		drawTo3D(g, 17, 14.5,  0);
		drawTo3D(g, 13, 14.5,  0);
		drawTo3D(g, 12, 15.5,  0);
		moveTo3D(g, 12, 15.5,  3);
		drawTo3D(g, 12, 15.5,  0);
		moveTo3D(g, 18, 15.5,  3);
		drawTo3D(g, 18, 15.5,  0);
		moveTo3D(g, 17, 14.5,  3);
		drawTo3D(g, 17, 14.5,  0);
		moveTo3D(g, 13, 14.5,  3);
		drawTo3D(g, 13, 14.5,  0);

		/* center middle bar */
		moveTo3D(g, 12, 17.5,  3);
		drawTo3D(g, 18, 17.5,  3);
		drawTo3D(g, 18, 18.5,  3);
		drawTo3D(g, 12, 18.5,  3);
		drawTo3D(g, 12, 17.5,  3);
		moveTo3D(g, 12, 17.5,  0);
		drawTo3D(g, 18, 17.5,  0);
		drawTo3D(g, 18, 18.5,  0);
		drawTo3D(g, 12, 18.5,  0);
		drawTo3D(g, 12, 17.5,  0);
		moveTo3D(g, 12, 17.5,  3);
		drawTo3D(g, 12, 17.5,  0);
		moveTo3D(g, 18, 17.5,  3);
		drawTo3D(g, 18, 17.5,  0);
		moveTo3D(g, 18, 18.5,  3);
		drawTo3D(g, 18, 18.5,  0);
		moveTo3D(g, 12, 18.5,  3);
		drawTo3D(g, 12, 18.5,  0);

		/* center middle trapezoid */
		moveTo3D(g, 12, 21,  3);
		drawTo3D(g, 18, 21,  3);
		drawTo3D(g, 19, 22,  3);
		drawTo3D(g, 11, 22,  3);
		drawTo3D(g, 12, 21,  3);
		moveTo3D(g, 12, 21,  0);
		drawTo3D(g, 18, 21,  0);
		drawTo3D(g, 19, 22,  0);
		drawTo3D(g, 11, 22,  0);
		drawTo3D(g, 12, 21,  0);
		moveTo3D(g, 12, 21,  3);
		drawTo3D(g, 12, 21,  0);
		moveTo3D(g, 18, 21,  3);
		drawTo3D(g, 18, 21,  0);
		moveTo3D(g, 19, 22,  3);
		drawTo3D(g, 19, 22,  0);
		moveTo3D(g, 11, 22,  3);
		drawTo3D(g, 11, 22,  0);

		/* center top */
		moveTo3D(g,  8, 25, 3);
		drawTo3D(g, 22, 25, 3);
		drawTo3D(g, 16, 28, 2);
		drawTo3D(g, 14, 28, 2);
		drawTo3D(g,  8, 25, 3);
		moveTo3D(g,  8, 25, 0);
		drawTo3D(g, 22, 25, 0);
		drawTo3D(g, 16, 28, 1);
		drawTo3D(g, 14, 28, 1);
		drawTo3D(g,  8, 25, 0);
		moveTo3D(g,  8, 25,  3);
		drawTo3D(g,  8, 25,  0);
		moveTo3D(g, 22, 25,  3);
		drawTo3D(g, 22, 25,  0);
		moveTo3D(g, 16, 28,  2);
		drawTo3D(g, 16, 28,  1);
		moveTo3D(g, 14, 28,  2);
		drawTo3D(g, 14, 28,  1);
	}
}
