package fabe0940.gfx;

import fabe0940.gfx.core.Viewport;
import fabe0940.gfx.core.Window;
import fabe0940.gfx.core.World;
import fabe0940.gfx.math.Point3;
import java.awt.Graphics;

public class Square extends World {
	public Square(Viewport v, Window w) {
		super(v, w);
	}

	public void draw(Graphics g) {
		/* front */
		moveTo3D(g, new Point3( 1,  1,  1));
		drawTo3D(g, new Point3( 1, -1,  1));
		drawTo3D(g, new Point3(-1, -1,  1));
		drawTo3D(g, new Point3(-1,  1,  1));
		drawTo3D(g, new Point3( 1,  1,  1));

		/* back */
		moveTo3D(g, new Point3( 1,  1, -1));
		drawTo3D(g, new Point3( 1, -1, -1));
		drawTo3D(g, new Point3(-1, -1, -1));
		drawTo3D(g, new Point3(-1,  1, -1));
		drawTo3D(g, new Point3( 1,  1, -1));

		/* left */
		moveTo3D(g, new Point3(-1,  1,  1));
		drawTo3D(g, new Point3(-1,  1, -1));
		drawTo3D(g, new Point3(-1, -1, -1));
		drawTo3D(g, new Point3(-1, -1,  1));
		drawTo3D(g, new Point3(-1,  1,  1));

		/* right */
		moveTo3D(g, new Point3( 1,  1,  1));
		drawTo3D(g, new Point3( 1,  1, -1));
		drawTo3D(g, new Point3( 1, -1, -1));
		drawTo3D(g, new Point3( 1, -1,  1));
		drawTo3D(g, new Point3( 1,  1,  1));

		/* top */
		moveTo3D(g, new Point3( 1,  1,  1));
		drawTo3D(g, new Point3( 1,  1, -1));
		drawTo3D(g, new Point3(-1,  1, -1));
		drawTo3D(g, new Point3(-1,  1,  1));
		drawTo3D(g, new Point3( 1,  1,  1));

		/* bottom */
		moveTo3D(g, new Point3( 1, -1,  1));
		drawTo3D(g, new Point3( 1, -1, -1));
		drawTo3D(g, new Point3(-1, -1, -1));
		drawTo3D(g, new Point3(-1, -1,  1));
		drawTo3D(g, new Point3( 1, -1,  1));
	}
}
