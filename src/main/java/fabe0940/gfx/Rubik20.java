package fabe0940.gfx;

import fabe0940.gfx.core.Viewport;
import fabe0940.gfx.core.Window;
import fabe0940.gfx.core.World;
import fabe0940.gfx.math.Point3;
import java.awt.Color;
import java.awt.Graphics;

public class Rubik20 extends World {
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

		for (i = 0; i < 20; i++) {
			for (j = 0; j < 20; j++) {
				for (k = 0; k < 20; k++) {
					x = i * OFFSET;
					y = j * OFFSET;
					z = k * OFFSET;
					p = new Point3(x, y, z);
					drawRubik(g, p, 1.0, 0.1);
				}
			}
		}
	}

	private void drawBackground(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 700, 700);

		return;
	}

	private void drawAxis(Graphics g) {
		g.setColor(Color.RED);
		moveTo3D(g, -1,  0,  0);
		drawTo3D(g,  1,  0,  0);
		g.setColor(Color.BLUE);
		moveTo3D(g,  0, -1,  0);
		drawTo3D(g,  0,  1,  0);
		g.setColor(Color.GREEN);
		moveTo3D(g,  0,  0, -1);
		drawTo3D(g,  0,  0,  1);

		g.setColor(Color.WHITE);
		moveTo3D(g, -1, 0, 0);
		writeTo3D(g, "-x");
		moveTo3D(g, 1, 0, 0);
		writeTo3D(g, "+x");
		moveTo3D(g, 0, -1, 0);
		writeTo3D(g, "-y");
		moveTo3D(g, 0, 1, 0);
		writeTo3D(g, "+y");
		moveTo3D(g, 0, 0, -1);
		writeTo3D(g, "-z");
		moveTo3D(g, 0, 0, 1);
		writeTo3D(g, "+z");

		return;
	}

	private void drawRubik(Graphics g, Point3 loc, double dim, double offset) {
		int i;
		int j;
		double x;
		double y;
		double z;
		Point3 p;

		/* front */
		g.setColor(Color.BLUE);
		for (i = -1; i <= 1; i++) {
			for (j = -1; j <= 1; j++) {
				x = loc.getX() + (i * dim) + (i * offset);
				y = loc.getY() + (j * dim) + (j * offset);
				z = loc.getZ() + (1.5 * dim) + (2.0 * offset);
				p = new Point3(x, y, z);
				drawSquareXY(g, p, dim);
			}
		}

		/* back */
		g.setColor(Color.GREEN);
		for (i = -1; i <= 1; i++) {
			for (j = -1; j <= 1; j++) {
				x = loc.getX() + (i * dim) + (i * offset);
				y = loc.getY() + (j * dim) + (j * offset);
				z = loc.getZ() - (1.5 * dim) - (2.0 * offset);
				p = new Point3(x, y, z);
				drawSquareXY(g, p, dim);
			}
		}

		/* left */
		g.setColor(Color.RED);
		for (i = -1; i <= 1; i++) {
			for (j = -1; j <= 1; j++) {
				x = loc.getX() + (1.5 * dim) + (2.0 * offset);
				y = loc.getY() + (i * dim) + (i * offset);
				z = loc.getZ() + (j * dim) + (j * offset);
				p = new Point3(x, y, z);
				drawSquareYZ(g, p, dim);
			}
		}

		/* right */
		g.setColor(Color.ORANGE);
		for (i = -1; i <= 1; i++) {
			for (j = -1; j <= 1; j++) {
				x = loc.getX() - (1.5 * dim) - (2.0 * offset);
				y = loc.getY() + (i * dim) + (i * offset);
				z = loc.getZ() + (j * dim) + (j * offset);
				p = new Point3(x, y, z);
				drawSquareYZ(g, p, dim);
			}
		}

		/* top */
		g.setColor(Color.WHITE);
		for (i = -1; i <= 1; i++) {
			for (j = -1; j <= 1; j++) {
				x = loc.getX() + (i * dim) + (i * offset);
				y = loc.getY() + (1.5 * dim) + (2.0 * offset);
				z = loc.getZ() + (j * dim) + (j * offset);
				p = new Point3(x, y, z);
				drawSquareXZ(g, p, dim);
			}
		}

		/* bottom */
		g.setColor(Color.YELLOW);
		for (i = -1; i <= 1; i++) {
			for (j = -1; j <= 1; j++) {
				x = loc.getX() + (i * dim) + (i * offset);
				y = loc.getY() - (1.5 * dim) - (2.0 * offset);
				z = loc.getZ() + (j * dim) + (j * offset);
				p = new Point3(x, y, z);
				drawSquareXZ(g, p, dim);
			}
		}

		return;
	}

	private void drawSquareXY(Graphics g, Point3 loc, double dim) {
		double offset;

		offset = dim / 2;

		moveTo3D(g, loc.getX() - offset, loc.getY() - offset, loc.getZ());
		drawTo3D(g, loc.getX() + offset, loc.getY() - offset, loc.getZ());
		drawTo3D(g, loc.getX() + offset, loc.getY() + offset, loc.getZ());
		drawTo3D(g, loc.getX() - offset, loc.getY() + offset, loc.getZ());
		drawTo3D(g, loc.getX() - offset, loc.getY() - offset, loc.getZ());

		return;
	}

	private void drawSquareXZ(Graphics g, Point3 loc, double dim) {
		double offset;

		offset = dim / 2;

		moveTo3D(g, loc.getX() - offset, loc.getY(), loc.getZ() - offset);
		drawTo3D(g, loc.getX() + offset, loc.getY(), loc.getZ() - offset);
		drawTo3D(g, loc.getX() + offset, loc.getY(), loc.getZ() + offset);
		drawTo3D(g, loc.getX() - offset, loc.getY(), loc.getZ() + offset);
		drawTo3D(g, loc.getX() - offset, loc.getY(), loc.getZ() - offset);

		return;
	}

	private void drawSquareYZ(Graphics g, Point3 loc, double dim) {
		double offset;

		offset = dim / 2;

		moveTo3D(g, loc.getX(), loc.getY() - offset, loc.getZ() - offset);
		drawTo3D(g, loc.getX(), loc.getY() + offset, loc.getZ() - offset);
		drawTo3D(g, loc.getX(), loc.getY() + offset, loc.getZ() + offset);
		drawTo3D(g, loc.getX(), loc.getY() - offset, loc.getZ() + offset);
		drawTo3D(g, loc.getX(), loc.getY() - offset, loc.getZ() - offset);

		return;
	}
}
