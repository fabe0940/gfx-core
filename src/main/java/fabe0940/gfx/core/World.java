package fabe0940.gfx.core;

import fabe0940.gfx.core.Viewport;
import fabe0940.gfx.core.Window;
import fabe0940.gfx.math.Point2;
import fabe0940.gfx.math.Point3;
import java.awt.Graphics;

public abstract class World {
	private Point3 cursor;
	private Viewport viewport;
	private Window window;

	public World(Viewport v, Window w) {
		cursor = new Point3();
		viewport = v;
		window = w;

		return;
	}

	public abstract void draw(Graphics g);

	public void moveTo3D(Graphics g, double x, double y, double z) {
		moveTo3D(g, new Point3(x, y, z));

		return;
	}

	public void moveTo3D(Graphics g, Point3 p) {
		cursor = p;

		return;
	}

	public void drawTo3D(Graphics g, double x, double y, double z) {
		drawTo3D(g, new Point3(x, y, z));

		return;
	}

	public void drawTo3D(Graphics g, Point3 p) {
		Point2 from;
		Point2 to;

		from = viewport.viewportToFrame(window.windowToViewport(cursor));
		to = viewport.viewportToFrame(window.windowToViewport(p));

		g.drawLine((int) from.getX(), (int) from.getY(),
			(int) to.getX(), (int) to.getY());

		cursor = p;

		return;
	}
}
