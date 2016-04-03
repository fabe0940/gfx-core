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

		/* == GRAPH ==
		view = new ScalingViewport(new Point2(0, 700), new Point2(700, 700),
			new Point2(-3.0 * Math.PI, 3.0 * Math.PI),
			new Point2(-3.0 * Math.PI, 3.0 * Math.PI));
		win = new Window(new Point3(0, 0, 0), new Point3(20, 40, 0), 20);
		world = new Graph(view, win);
		*/

		/* == RUBIK x1 ==
		view = new ScalingViewport(new Point2(0, 700), new Point2(700, 700),
			new Point2(-4.0, 4.0), new Point2(-4.0, 4.0));
		win = new Window(new Point3(0, 0, 0), new Point3(30, 30, 0), 5);
		world = new Rubik(view, win);
		*/

		/* == RUBIK x20 ==
		*/
		view = new ScalingViewport(new Point2(0, 700), new Point2(700, 700),
			new Point2(-300.0, 300.0), new Point2(-300.0, 300.0));
		win = new Window(new Point3(100, 100, 100), new Point3(30, 30, 0), 250);
		world = new Rubik20(view, win);

		/* == RECOGNIZER ==
		*/

		/* == NAME ==
		*/

		frame = new Frame(new Point2(200, 100), new Point2(700, 700), world);

		while (true);
	}
}
