package fabe0940.gfx;

import fabe0940.gfx.core.Viewport;
import fabe0940.gfx.core.Window;
import fabe0940.gfx.core.World;
import fabe0940.gfx.math.Point3;
import java.awt.Color;
import java.awt.Graphics;

public class Square extends World {
	public Square(Viewport v, Window w) {
		super(v, w);
	}

	public void draw(Graphics g) {

		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 1000, 1000);

		g.setColor(Color.BLACK);
		moveTo3D(g, -1,  0,  0);
		drawTo3D(g,  1,  0,  0);
		moveTo3D(g,  0, -1,  0);
		drawTo3D(g,  0,  1,  0);
		moveTo3D(g,  0,  0, -1);
		drawTo3D(g,  0,  0,  1);

		/* front */
		g.setColor(Color.RED);
		moveTo3D(g, new Point3( 0.5,  0.5,  0.5));
		drawTo3D(g, new Point3( 0.5, -0.5,  0.5));
		drawTo3D(g, new Point3(-0.5, -0.5,  0.5));
		drawTo3D(g, new Point3(-0.5,  0.5,  0.5));
		drawTo3D(g, new Point3( 0.5,  0.5,  0.5));

		/* back */
		g.setColor(Color.BLUE);
		moveTo3D(g, new Point3( 0.5,  0.5, -0.5));
		drawTo3D(g, new Point3( 0.5, -0.5, -0.5));
		drawTo3D(g, new Point3(-0.5, -0.5, -0.5));
		drawTo3D(g, new Point3(-0.5,  0.5, -0.5));
		drawTo3D(g, new Point3( 0.5,  0.5, -0.5));

		/* left */
		g.setColor(Color.GREEN);
		moveTo3D(g, new Point3(-0.5,  0.5,  0.5));
		drawTo3D(g, new Point3(-0.5,  0.5, -0.5));
		drawTo3D(g, new Point3(-0.5, -0.5, -0.5));
		drawTo3D(g, new Point3(-0.5, -0.5,  0.5));
		drawTo3D(g, new Point3(-0.5,  0.5,  0.5));

		/* right */
		g.setColor(Color.RED);
		moveTo3D(g, new Point3( 0.5,  0.5,  0.5));
		drawTo3D(g, new Point3( 0.5,  0.5, -0.5));
		drawTo3D(g, new Point3( 0.5, -0.5, -0.5));
		drawTo3D(g, new Point3( 0.5, -0.5,  0.5));
		drawTo3D(g, new Point3( 0.5,  0.5,  0.5));

		/* top */
		g.setColor(Color.BLUE);
		moveTo3D(g, new Point3( 0.5,  0.5,  0.5));
		drawTo3D(g, new Point3( 0.5,  0.5, -0.5));
		drawTo3D(g, new Point3(-0.5,  0.5, -0.5));
		drawTo3D(g, new Point3(-0.5,  0.5,  0.5));
		drawTo3D(g, new Point3( 0.5,  0.5,  0.5));

		/* bottom */
		g.setColor(Color.GREEN);
		moveTo3D(g, new Point3( 0.5, -0.5,  0.5));
		drawTo3D(g, new Point3( 0.5, -0.5, -0.5));
		drawTo3D(g, new Point3(-0.5, -0.5, -0.5));
		drawTo3D(g, new Point3(-0.5, -0.5,  0.5));
		drawTo3D(g, new Point3( 0.5, -0.5,  0.5));
	}
}
