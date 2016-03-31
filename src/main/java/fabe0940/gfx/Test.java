package fabe0940.gfx;

import java.util.*;
import fabe0940.gfx.*;
import fabe0940.gfx.core.*;
import fabe0940.gfx.math.*;

public class Test {
	public static void main(String[] args) {
		Viewport view = new Viewport(
			new Point2(0, 1000),
			new Point2(1000, 1000)
		);
		Window win = new Window(
			new Point3(0, 0, 0),
			new Point3(-15, -30, 0),
			5
		);
		World w = new Square(view, win);
		Frame frame = new Frame(
			new Point2(200, 20),
			new Point2(1000, 1000),
			w
		);

		while (true);
	}
}
