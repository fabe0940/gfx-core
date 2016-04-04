package fabe0940.gfx;

import fabe0940.gfx.core.Viewport;
import fabe0940.gfx.core.Window;
import fabe0940.gfx.core.World;
import fabe0940.gfx.math.Point3;
import java.awt.Color;
import java.awt.Graphics;

public class Rubik extends World {
	public Rubik(Viewport v, Window w) {
		super(v, w);
	}

	public void draw(Graphics g) {
		drawBackground(g);
		drawAxis(g);

		drawRubik(g, new Point3(0, 0, 0), 1.0, 0.1);
	}

	protected void drawRubik(Graphics g, Point3 loc, double dim, double off) {
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
				x = loc.getX() + (i * dim) + (i * off);
				y = loc.getY() + (j * dim) + (j * off);
				z = loc.getZ() + (1.5 * dim) + (2.0 * off);
				p = new Point3(x, y, z);
				drawSquareXY(g, p, dim);
			}
		}

		/* back */
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

		/* left */
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

		/* right */
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

		/* top */
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

		/* bottom */
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
