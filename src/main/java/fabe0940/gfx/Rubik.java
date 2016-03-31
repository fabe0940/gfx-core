package fabe0940.gfx;

import fabe0940.gfx.core.Viewport;
import fabe0940.gfx.core.Window;
import fabe0940.gfx.core.World;
import fabe0940.gfx.math.Point3;
import java.awt.Color;
import java.awt.Graphics;

public class Rubik extends World {
	private static double OFFSET = 0.1;

	public Rubik(Viewport v, Window w) {
		super(v, w);

		return;
	}

	public void draw(Graphics g) {
		drawRubik(g, 0.0, 0.0, 1.0);

		return;
	}

	public void drawRubik(Graphics g, double x, double y, double z) {
		return;
	}
}
