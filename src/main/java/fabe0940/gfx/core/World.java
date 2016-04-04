package fabe0940.gfx.core;

import fabe0940.gfx.core.Viewport;
import fabe0940.gfx.core.Window;
import fabe0940.gfx.math.Point2;
import fabe0940.gfx.math.Point3;
import java.awt.Color;
import java.awt.Graphics;

public abstract class World {
	private Point3 cursor;
	private Viewport viewport;
	private Window window;

	/* Constructor */
	public World(Viewport v, Window w) {
		cursor = new Point3();
		viewport = v;
		window = w;

		return;
	}

	/* Render - to be implemented by child classes */
	public abstract void draw(Graphics g);

	/* Fill in the viewport with black */
	protected void drawBackground(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 700, 700);

		return;
	}

	/* Draw a colored and labed set of axis */
	protected void drawAxis(Graphics g) {
		/* Draw axis */
		g.setColor(Color.RED);
		moveTo3D(g, -1,  0,  0);
		drawTo3D(g,  1,  0,  0);
		g.setColor(Color.BLUE);
		moveTo3D(g,  0, -1,  0);
		drawTo3D(g,  0,  1,  0);
		g.setColor(Color.GREEN);
		moveTo3D(g,  0,  0, -1);
		drawTo3D(g,  0,  0,  1);

		/* Draw labels */
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

	/* Draw name/class/assignment in the upper left corner */
	public void drawTitle(Graphics g) {
		g.setColor(Color.WHITE);
		g.drawString("Mason Fabel", 5, 20);
		g.drawString("CS324", 5, 35);
		g.drawString("Assignment 4", 5, 50);

		return;
	}

	/* Move the cursor in world coordinates */
	public void moveTo3D(Graphics g, double x, double y, double z) {
		/* Construct a new Point3 and moveTo3D as usual */
		moveTo3D(g, new Point3(x, y, z));

		return;
	}

	/* Move the cursor in world coordinates */
	public void moveTo3D(Graphics g, Point3 p) {
		cursor = p;

		return;
	}

	/* Draw to a position in world coordinates */
	public void drawTo3D(Graphics g, double x, double y, double z) {
		/* Construct a new Point3 and drawTo3D as usual */
		drawTo3D(g, new Point3(x, y, z));

		return;
	}

	/* Draw to a position in world coordinates */
	public void drawTo3D(Graphics g, Point3 p) {
		Point2 from;
		Point2 to;

		/* Find start/end points in frame pixels */
		from = viewport.viewportToFrame(window.windowToViewport(cursor));
		to = viewport.viewportToFrame(window.windowToViewport(p));

		/* Draw */
		g.drawLine((int) from.getX(), (int) from.getY(),
			(int) to.getX(), (int) to.getY());

		/* Move cursor to the end of the line */
		cursor = p;

		return;
	}

	/* Write text at a position in world coordinates */
	public void writeTo3D(Graphics g, String txt) {
		Point2 pos;

		/* Find position in frame pixels */
		pos = viewport.viewportToFrame(window.windowToViewport(cursor));

		/* Render text */
		g.drawString(txt, (int) pos.getX(), (int) pos.getY());

		return;
	}
}
