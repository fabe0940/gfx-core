package fabe0940.gfx.core;

import fabe0940.gfx.core.Viewport;
import fabe0940.gfx.math.Point2;

public class ScalingViewport extends Viewport {
	private Point2 domain;
	private Point2 range;

	public ScalingViewport(Point2 p, Point2 s) {
		super(p, s);

		domain = new Point2(-1.0, 1.0);
		range = new Point2(-1.0, 1.0);

		return;
	}

	public ScalingViewport(Point2 p, Point2 s, Point2 d, Point2 r) {
		super(p, s);

		domain = d;
		range = r;

		return;
	}

	public Point2 viewportToFrame(Point2 p) {
		double x;
		double y;
		Point2 res;

		x = position.getX() + (((p.getX() - domain.getX())
			/ (domain.getY() - domain.getX())) * size.getX());
		y = position.getY() - (((p.getY() - range.getX())
			/ (range.getY() - range.getX())) * size.getY());

		res = new Point2(x, y);

		return res;
	}
}
