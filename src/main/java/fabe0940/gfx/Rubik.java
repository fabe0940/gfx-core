package fabe0940.gfx;

import fabe0940.gfx.core.Viewport;
import fabe0940.gfx.core.Window;
import fabe0940.gfx.core.World;
import fabe0940.gfx.math.Point3;
import java.awt.Color;
import java.awt.Graphics;

public class Rubik extends World {
	/* Constructor */
	public Rubik(Viewport v, Window w) {
		super(v, w);
	}

	/* Render */
	public void draw(Graphics g) {
		/* Set up window for drawing */
		drawBackground(g);
		drawTitle(g);

		/* Draw Rubik's cube */
		drawRubik(g, new Point3(0, 0, 0), 1.0, 0.1);
	}

	/* Draw a Rubik's cube with a given centerpoint, square size, and gap */
	protected void drawRubik(Graphics g, Point3 loc, double dim, double off) {
		int i;
		int j;
		double x;
		double y;
		double z;
		Point3 p;

		/* +Z face */
		g.setColor(Color.BLUE);
		for (i = -1; i <= 1; i++) {
			for (j = -1; j <= 1; j++) {
				x = loc.getX() + (i * dim) + (i * off);
				y = loc.getY() + (j * dim) + (j * off);
				z = loc.getZ() + (1.5 * dim) + (2.0 * off);
				p = new Point3(x, y, z);
				drawSquareXY(g, p, dim);
			}
		}

		/* -Z face */
		g.setColor(Color.GREEN);
		for (i = -1; i <= 1; i++) {
			for (j = -1; j <= 1; j++) {
				x = loc.getX() + (i * dim) + (i * off);
				y = loc.getY() + (j * dim) + (j * off);
				z = loc.getZ() - (1.5 * dim) - (2.0 * off);
				p = new Point3(x, y, z);
				drawSquareXY(g, p, dim);
			}
		}

		/* -X face */
		g.setColor(Color.RED);
		for (i = -1; i <= 1; i++) {
			for (j = -1; j <= 1; j++) {
				x = loc.getX() + (1.5 * dim) + (2.0 * off);
				y = loc.getY() + (i * dim) + (i * off);
				z = loc.getZ() + (j * dim) + (j * off);
				p = new Point3(x, y, z);
				drawSquareYZ(g, p, dim);
			}
		}

		/* +X face */
		g.setColor(Color.ORANGE);
		for (i = -1; i <= 1; i++) {
			for (j = -1; j <= 1; j++) {
				x = loc.getX() - (1.5 * dim) - (2.0 * off);
				y = loc.getY() + (i * dim) + (i * off);
				z = loc.getZ() + (j * dim) + (j * off);
				p = new Point3(x, y, z);
				drawSquareYZ(g, p, dim);
			}
		}

		/* +Y face */
		g.setColor(Color.WHITE);
		for (i = -1; i <= 1; i++) {
			for (j = -1; j <= 1; j++) {
				x = loc.getX() + (i * dim) + (i * off);
				y = loc.getY() + (1.5 * dim) + (2.0 * off);
				z = loc.getZ() + (j * dim) + (j * off);
				p = new Point3(x, y, z);
				drawSquareXZ(g, p, dim);
			}
		}

		/* -Y face */
		g.setColor(Color.YELLOW);
		for (i = -1; i <= 1; i++) {
			for (j = -1; j <= 1; j++) {
				x = loc.getX() + (i * dim) + (i * off);
				y = loc.getY() - (1.5 * dim) - (2.0 * off);
				z = loc.getZ() + (j * dim) + (j * off);
				p = new Point3(x, y, z);
				drawSquareXZ(g, p, dim);
			}
		}

		return;
	}

	/* Draw a dim x dim square in the XY plane */
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

	/* Draw a dim x dim square in the XZ plane */
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

	/* Draw a dim x dim square in the YZ plane */
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
