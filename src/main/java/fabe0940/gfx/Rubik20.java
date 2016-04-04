package fabe0940.gfx;

import fabe0940.gfx.core.Viewport;
import fabe0940.gfx.core.Window;
import fabe0940.gfx.core.World;
import fabe0940.gfx.math.Point3;
import java.awt.Color;
import java.awt.Graphics;

public class Rubik20 extends Rubik {
	private static final int DIMENSION = 20;

	public Rubik20(Viewport v, Window w) {
		super(v, w);
	}

	public void draw(Graphics g) {
		final double OFFSET = 10.0;
		double i;
		double j;
		double k;
		double x;
		double y;
		double z;
		Point3 p;

		drawBackground(g);

		for (i = 0; i < DIMENSION; i++) {
			for (j = 0; j < DIMENSION; j++) {
				for (k = 0; k < DIMENSION; k++) {
					x = i * OFFSET;
					y = j * OFFSET;
					z = k * OFFSET;
					p = new Point3(x, y, z);
					drawRubik(g, p, 1.0, 0.1);
				}
			}
		}
	}
}
