package fabe0940.gfx;

import java.util.*;
import fabe0940.gfx.*;
import fabe0940.gfx.core.*;
import fabe0940.gfx.math.*;

public class Test {
	public static void main(String[] args) {
		Viewport view = new Viewport(
			new Point2(0, 500),
			new Point2(500, 500)
		);
		Window win = new Window(
			new Point3(-0.5, -0.5, 0),
			new Point3(-30, -30, 0),
			25
		);
		World w = new Square(view, win);
		Frame frame = new Frame(
			new Point2(400, 400),
			new Point2(500, 500),
			w
		);

		while (true);
	}
}
