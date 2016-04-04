package fabe0940.gfx;

import fabe0940.gfx.core.Viewport;
import fabe0940.gfx.core.Window;
import fabe0940.gfx.core.World;
import fabe0940.gfx.math.Point3;
import java.awt.Color;
import java.awt.Graphics;

public class Cube extends World {
	public Cube(Viewport v, Window w) {
		super(v, w);
	}

	public void draw(Graphics g) {

		drawBackground(g);
		drawAxis(g);

		g.setColor(Color.WHITE);

		/* front */
		moveTo3D(g, new Point3( 0.5,  0.5,  0.5));
		drawTo3D(g, new Point3( 0.5, -0.5,  0.5));
		drawTo3D(g, new Point3(-0.5, -0.5,  0.5));
		drawTo3D(g, new Point3(-0.5,  0.5,  0.5));
		drawTo3D(g, new Point3( 0.5,  0.5,  0.5));

		/* back */
		moveTo3D(g, new Point3( 0.5,  0.5, -0.5));
		drawTo3D(g, new Point3( 0.5, -0.5, -0.5));
		drawTo3D(g, new Point3(-0.5, -0.5, -0.5));
		drawTo3D(g, new Point3(-0.5,  0.5, -0.5));
		drawTo3D(g, new Point3( 0.5,  0.5, -0.5));

		/* left */
		moveTo3D(g, new Point3(-0.5,  0.5,  0.5));
		drawTo3D(g, new Point3(-0.5,  0.5, -0.5));
		drawTo3D(g, new Point3(-0.5, -0.5, -0.5));
		drawTo3D(g, new Point3(-0.5, -0.5,  0.5));
		drawTo3D(g, new Point3(-0.5,  0.5,  0.5));

		/* right */
		moveTo3D(g, new Point3( 0.5,  0.5,  0.5));
		drawTo3D(g, new Point3( 0.5,  0.5, -0.5));
		drawTo3D(g, new Point3( 0.5, -0.5, -0.5));
		drawTo3D(g, new Point3( 0.5, -0.5,  0.5));
		drawTo3D(g, new Point3( 0.5,  0.5,  0.5));

		/* top */
		moveTo3D(g, new Point3( 0.5,  0.5,  0.5));
		drawTo3D(g, new Point3( 0.5,  0.5, -0.5));
		drawTo3D(g, new Point3(-0.5,  0.5, -0.5));
		drawTo3D(g, new Point3(-0.5,  0.5,  0.5));
		drawTo3D(g, new Point3( 0.5,  0.5,  0.5));

		/* bottom */
		moveTo3D(g, new Point3( 0.5, -0.5,  0.5));
		drawTo3D(g, new Point3( 0.5, -0.5, -0.5));
		drawTo3D(g, new Point3(-0.5, -0.5, -0.5));
		drawTo3D(g, new Point3(-0.5, -0.5,  0.5));
		drawTo3D(g, new Point3( 0.5, -0.5,  0.5));
	}
}
