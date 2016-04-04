package fabe0940.gfx;

import fabe0940.gfx.core.Viewport;
import fabe0940.gfx.core.Window;
import fabe0940.gfx.core.World;
import fabe0940.gfx.math.Point3;
import java.awt.Color;
import java.awt.Graphics;

public class Rubik20 extends Rubik {
	private static final int SIZE = 20;
	private static final double DIMENSION = 1.0;
	private static final double OFFSET = 0.1;

	/* Constructor */
	public Rubik20(Viewport v, Window w) {
		super(v, w);
	}

	/* Render */
	public void draw(Graphics g) {
		final double OFFSET = 10.0;
		double i;
		double j;
		double k;
		double x;
		double y;
		double z;
		Point3 p;

		/* Set up window for drawing */
		drawBackground(g);
		drawTitle(g);

		/* Draw a 20x20x20 grid of Rubik's cubes */
		for (i = 0; i < SIZE; i++) {
			for (j = 0; j < SIZE; j++) {
				for (k = 0; k < SIZE; k++) {
					x = i * OFFSET;
					y = j * OFFSET;
					z = k * OFFSET;
					p = new Point3(x, y, z);
					drawRubik(g, p, DIMENSION, OFFSET);
				}
			}
		}
	}
}
