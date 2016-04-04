package fabe0940.gfx;

import java.util.*;
import fabe0940.gfx.*;
import fabe0940.gfx.core.*;
import fabe0940.gfx.math.*;

public class HW4 {
	private static final int MODE = 0;

	public static void main(String[] args) {
		Viewport view;
		Window win;
		World world;
		Frame frame;

		view = null;
		win = null;
		world = null;

		switch (MODE) {
			case 1:
				view = new ScalingViewport(
					new Point2(0, 700), new Point2(700, 700),
					new Point2(-3.0 * Math.PI, 3.0 * Math.PI),
					new Point2(-3.0 * Math.PI, 3.0 * Math.PI));
				win = new Window(
					new Point3(0, 0, 0), new Point3(-15, 30, 0), 20);
				world = new Graph(view, win);
				break;
			case 2:
				view = new ScalingViewport(
					new Point2(0, 700), new Point2(700, 700),
					new Point2(-4.0, 4.0), new Point2(-4.0, 4.0));
				win = new Window(
					new Point3(0, 0, 0), new Point3(-30, 30, 0), 5);
				world = new Rubik(view, win);
				break;
			case 3:
				view = new ScalingViewport(
					new Point2(0, 700), new Point2(700, 700),
					new Point2(-300.0, 300.0), new Point2(-300.0, 300.0));
				win = new Window(
					new Point3(100, 100, 100), new Point3(-30, 30, 0), 250);
				world = new Rubik20(view, win);
				break;
			case 4:
				view = new ScalingViewport(
					new Point2(0, 700), new Point2(700, 700),
					new Point2(-40.0, 40.0), new Point2(-40.0, 40.0));
				win = new Window(
					new Point3(33, 3.5, -15), new Point3(-30, 30, 0), 100);
				world = new Name(view, win);
				break;
			case 5:
				view = new ScalingViewport(
					new Point2(0, 700), new Point2(700, 700),
					new Point2(-25.0, 25.0), new Point2(-25.0, 25.0));
				win = new Window(
					new Point3(15, 15, 1.5), new Point3(15, -30, 0), 30);
				world = new Recognizer(view, win);
				break;
			default:
				view = new Viewport(new Point2(0, 700), new Point2(700, 700));
				win = new Window(
					new Point3(0, 0, 0), new Point3(-30, 30, 0), 2);
				world = new Cube(view, win);
		}

		frame = new Frame(new Point2(200, 100), new Point2(700, 700), world);

		while (true);
	}
}
