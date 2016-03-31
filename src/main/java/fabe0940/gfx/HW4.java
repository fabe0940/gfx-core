package fabe0940.gfx;

import java.util.*;
import fabe0940.gfx.*;
import fabe0940.gfx.core.*;
import fabe0940.gfx.math.*;

public class HW4 {
	public static void main(String[] args) {
		Viewport view;
		Window win;
		World world;
		Frame frame;

		view = new Viewport(new Point2(0, 1000), new Point2(1000, 1000));
		win = new Window(new Point3(0, 0, 0), new Point3(-10, -30, 0), 5);
		world = new Graph(view, win);
		frame = new Frame(new Point2(200, 20), new Point2(1000, 1000), world);

		while (true);
	}
}
