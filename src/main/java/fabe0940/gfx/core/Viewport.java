package fabe0940.gfx.core;

import fabe0940.gfx.math.Point2;
import fabe0940.gfx.math.Point3;
import java.awt.Graphics;

public class Viewport {
	protected Point3 cursor;
	protected Point2 position;
	protected Point2 size;

	public Viewport(Point2 p, Point2 s) {
		cursor = new Point3();
		position = p;
		size = s;

		return;
	}

	public Point2 viewportToFrame(Point2 p) {
		double x;
		double y;
		Point2 res;

		x = position.getX() + (((p.getX() + 1) / 2) * size.getX());
		y = position.getY() - (((p.getY() + 1) / 2) * size.getY());

		res = new Point2(x, y);

		return res;
	}
}
