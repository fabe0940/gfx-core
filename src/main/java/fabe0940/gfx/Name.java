package fabe0940.gfx;

import fabe0940.gfx.core.Viewport;
import fabe0940.gfx.core.Window;
import fabe0940.gfx.core.World;
import fabe0940.gfx.math.Point3;
import java.awt.Color;
import java.awt.Graphics;

public class Name extends World {
	private static final double WIDTH = 5.0;
	private static final double OFFSET = 1.0;
	private static final double DEPTH = 30.0;

	/* Constructor */
	public Name(Viewport v, Window w) {
		super(v, w);
	}

	/* Render */
	public void draw(Graphics g) {
		int i;
		int textLen = 11;
		int colorLen = 6;
		char[] text = { 'M', 'A', 'S', 'O', 'N', ' ', 'F', 'A', 'B', 'E', 'L' };
		Color[] colors = {
			Color.RED,
			Color.ORANGE,
			Color.YELLOW,
			Color.GREEN,
			Color.BLUE,
			Color.WHITE
		};

		/* Set up window for drawing */
		drawBackground(g);
		drawTitle(g);

		/* Draw each letter in a new color */
		for (i = 0; i < textLen; i++) {
			g.setColor(colors[i % colorLen]);
			drawChar(g, text[i], new Point3(i * (WIDTH + OFFSET), 0, 0), DEPTH);
		}

		return;
	}

	/* Draw a block letter at a location with some depth */
	public void drawChar(Graphics g, char ch, Point3 loc, double depth) {
		/* Render the requested letter */
		switch (ch) {
			case 'A':
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 3, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 3, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 4, loc.getY() + 0, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 4, loc.getY() + 3, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 1, loc.getY() + 3, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 1, loc.getY() + 0, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 4, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 6, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 6, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 4, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 4, loc.getZ());
				moveTo3D(g, loc.getX() + 1, loc.getY() + 4, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 1, loc.getY() + 6, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 4, loc.getY() + 6, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 4, loc.getY() + 4, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 1, loc.getY() + 4, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 4, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 4, loc.getY() + 3, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 3, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 3, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 3, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 4, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 4, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 4, loc.getY() + 4, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 4, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 4, loc.getY() + 6, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 6, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 6, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 6, loc.getZ() - depth);
				break;
			case 'B':
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 6, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 5, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 4, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 3, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 1, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 4, loc.getY() + 7, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 5, loc.getY() + 6, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 5, loc.getY() + 5, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 4, loc.getY() + 4, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 5, loc.getY() + 3, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 5, loc.getY() + 1, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 4, loc.getY() + 0, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 5, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 6, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 6, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 5, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 5, loc.getZ());
				moveTo3D(g, loc.getX() + 1, loc.getY() + 5, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 1, loc.getY() + 6, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 4, loc.getY() + 6, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 4, loc.getY() + 5, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 1, loc.getY() + 5, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 1, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 3, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 3, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 1, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 1, loc.getZ());
				moveTo3D(g, loc.getX() + 1, loc.getY() + 1, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 1, loc.getY() + 3, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 4, loc.getY() + 3, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 4, loc.getY() + 1, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 1, loc.getY() + 1, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 4, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 7, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 5, loc.getY() + 6, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 6, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 5, loc.getY() + 5, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 5, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 4, loc.getY() + 4, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 4, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 5, loc.getY() + 3, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 3, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 5, loc.getY() + 1, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 1, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 4, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 5, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 5, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 6, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 6, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 4, loc.getY() + 6, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 6, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 4, loc.getY() + 5, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 5, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 1, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 1, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 3, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 3, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 4, loc.getY() + 3, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 3, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 4, loc.getY() + 1, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 1, loc.getZ() - depth);
				break;
			case 'E':
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 6, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 6, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 4, loc.getZ());
				drawTo3D(g, loc.getX() + 3, loc.getY() + 4, loc.getZ());
				drawTo3D(g, loc.getX() + 3, loc.getY() + 3, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 3, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 1, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 1, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 5, loc.getY() + 6, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 1, loc.getY() + 6, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 1, loc.getY() + 4, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 3, loc.getY() + 4, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 3, loc.getY() + 3, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 1, loc.getY() + 3, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 1, loc.getY() + 1, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 5, loc.getY() + 1, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 5, loc.getY() + 6, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 6, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 6, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 6, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 4, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 4, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 3, loc.getY() + 4, loc.getZ());
				drawTo3D(g, loc.getX() + 3, loc.getY() + 4, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 3, loc.getY() + 3, loc.getZ());
				drawTo3D(g, loc.getX() + 3, loc.getY() + 3, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 3, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 3, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 1, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 1, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 5, loc.getY() + 1, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 1, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ() - depth);
				break;
			case 'F':
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 6, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 6, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 4, loc.getZ());
				drawTo3D(g, loc.getX() + 3, loc.getY() + 4, loc.getZ());
				drawTo3D(g, loc.getX() + 3, loc.getY() + 3, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 3, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 5, loc.getY() + 6, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 1, loc.getY() + 6, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 1, loc.getY() + 4, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 3, loc.getY() + 4, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 3, loc.getY() + 3, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 1, loc.getY() + 3, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 1, loc.getY() + 0, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 5, loc.getY() + 6, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 6, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 6, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 6, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 4, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 4, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 3, loc.getY() + 4, loc.getZ());
				drawTo3D(g, loc.getX() + 3, loc.getY() + 4, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 3, loc.getY() + 3, loc.getZ());
				drawTo3D(g, loc.getX() + 3, loc.getY() + 3, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 3, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 3, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 0, loc.getZ() - depth);
				break;
			case 'L':
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 1, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 1, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 1, loc.getY() + 7, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 1, loc.getY() + 1, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 5, loc.getY() + 1, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 7, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 1, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 1, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 5, loc.getY() + 1, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 1, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ() - depth);
				break;
			case 'M':
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 2, loc.getY() + 2, loc.getZ());
				drawTo3D(g, loc.getX() + 3, loc.getY() + 2, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 5, loc.getZ());
				drawTo3D(g, loc.getX() + 3, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 2, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 5, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 1, loc.getY() + 7, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 2, loc.getY() + 2, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 3, loc.getY() + 2, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 4, loc.getY() + 7, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 4, loc.getY() + 0, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 4, loc.getY() + 5, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 3, loc.getY() + 0, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 2, loc.getY() + 0, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 1, loc.getY() + 5, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 1, loc.getY() + 0, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 7, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 2, loc.getY() + 2, loc.getZ());
				drawTo3D(g, loc.getX() + 2, loc.getY() + 2, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 3, loc.getY() + 2, loc.getZ());
				drawTo3D(g, loc.getX() + 3, loc.getY() + 2, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 4, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 7, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 4, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 4, loc.getY() + 5, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 5, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 3, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 3, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 2, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 2, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 5, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 5, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 0, loc.getZ() - depth);

				break;
			case 'N':
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 1, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 6, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 1, loc.getY() + 7, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 4, loc.getY() + 1, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 4, loc.getY() + 7, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 4, loc.getY() + 0, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 1, loc.getY() + 6, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 1, loc.getY() + 0, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 7, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 4, loc.getY() + 1, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 1, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 4, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 7, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 4, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 6, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 6, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 0, loc.getZ() - depth);
				break;
			case 'O':
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 1, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 6, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 6, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 1, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 1, loc.getZ());
				moveTo3D(g, loc.getX() + 1, loc.getY() + 1, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 1, loc.getY() + 6, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 4, loc.getY() + 6, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 4, loc.getY() + 1, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 1, loc.getY() + 1, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 1, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 1, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 6, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 6, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 4, loc.getY() + 6, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 6, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 4, loc.getY() + 1, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 1, loc.getZ() - depth);
				break;
			case 'S':
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 4, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 4, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 6, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 6, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 3, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 3, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 1, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 1, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 5, loc.getY() + 4, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 1, loc.getY() + 4, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 1, loc.getY() + 6, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 5, loc.getY() + 6, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 0, loc.getY() + 3, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 4, loc.getY() + 3, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 4, loc.getY() + 1, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 0, loc.getY() + 1, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 5, loc.getY() + 4, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 4, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 4, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 4, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 1, loc.getY() + 6, loc.getZ());
				drawTo3D(g, loc.getX() + 1, loc.getY() + 6, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 5, loc.getY() + 6, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 6, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 0, loc.getY() + 3, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 3, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 4, loc.getY() + 3, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 3, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 4, loc.getY() + 1, loc.getZ());
				drawTo3D(g, loc.getX() + 4, loc.getY() + 1, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 0, loc.getY() + 1, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 1, loc.getZ() - depth);
				break;
			case ' ':
				break;
			/* Draw a placeholder rectangle if the letter is not implemented */
			default:
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ() - depth);
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 0, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 0, loc.getY() + 7, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 7, loc.getZ() - depth);
				moveTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ());
				drawTo3D(g, loc.getX() + 5, loc.getY() + 0, loc.getZ() - depth);
		}

		return;
	}
}
