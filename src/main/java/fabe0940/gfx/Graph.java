package fabe0940.gfx;

import fabe0940.gfx.core.Viewport;
import fabe0940.gfx.core.Window;
import fabe0940.gfx.core.World;
import fabe0940.gfx.math.Point3;
import java.awt.Color;
import java.awt.Graphics;
import java.lang.Math;

public class Graph extends World {
	private static double SECTIONS = 100.0;
	private static double INTERVAL = (Math.PI * 4.0) / SECTIONS;
	private static double TWO_PI = 2.0  * Math.PI;

	public Graph(Viewport v, Window w) {
		super(v, w);

		return;
	}

	public void draw(Graphics g) {
		double x;
		double y;
		double z;

		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 1000, 1000);

		g.setColor(Color.BLACK);
		moveTo3D(g, -1,  0,  0);
		drawTo3D(g,  1,  0,  0);
		moveTo3D(g,  0, -1,  0);
		drawTo3D(g,  0,  1,  0);
		moveTo3D(g,  0,  0, -1);
		drawTo3D(g,  0,  0,  1);

		x = -2.0 * Math.PI;
		y = -2.0 * Math.PI;
		z = z(x, y);
		moveTo3D(g, x / TWO_PI, z / TWO_PI, y / TWO_PI);
		for (x = -1 * TWO_PI; x <= TWO_PI; x += INTERVAL) {
			for (y = -1 * TWO_PI; y <= TWO_PI; y += INTERVAL) {
				z = z(x, y);
				g.setColor(color(x, y, z));
				drawTo3D(g, x / TWO_PI, z / TWO_PI, y / TWO_PI);
			}
			y = -1 * TWO_PI;
			z = z(x, y);
			moveTo3D(g, x / TWO_PI, z / TWO_PI, y / TWO_PI);
		}

		x = -2.0 * Math.PI;
		y = -2.0 * Math.PI;
		z = z(x, y);
		moveTo3D(g, x / TWO_PI, z / TWO_PI, y / TWO_PI);
		for (y = -1 * TWO_PI; y <= TWO_PI; y += INTERVAL) {
			for (x = -1 * TWO_PI; x <= TWO_PI; x += INTERVAL) {
				z = z(x, y);
				g.setColor(color(x, y, z));
				drawTo3D(g, x / TWO_PI, z / TWO_PI, y / TWO_PI);
			}
			x = -1 * TWO_PI;
			z = z(x, y);
			moveTo3D(g, x / TWO_PI, z / TWO_PI, y / TWO_PI);
		}

		return;
	}

	public double z(double x, double y) {
		double r;
		double res;

		r = (x * x) + (y * y);
		res = (Math.sin(r) / r) / (9 * Math.cos(x / (y + 0.02)));

		return res;
	}

	public Color color(double x, double y, double z) {
		Color res;

		res = new Color(
			(float) ((x + TWO_PI) / (2.0 * TWO_PI)),
			(float) 0.0,
			(float) ((y + TWO_PI) / (2.0 * TWO_PI))
		);

		return res;
	}
}
