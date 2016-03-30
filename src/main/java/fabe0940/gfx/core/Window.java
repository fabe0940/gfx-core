package fabe0940.gfx.core;

import fabe0940.gfx.math.Matrix4;
import fabe0940.gfx.math.Matrix4Factory;
import fabe0940.gfx.math.Point2;
import fabe0940.gfx.math.Point3;
import fabe0940.gfx.math.Point4;

public class Window {
	private Matrix4 camera;

	public Window(Point3 f, Point3 rot, double r) {
		camera = Matrix4Factory.identity();
		camera = Matrix4.multiply(camera, Matrix4Factory.scaling(
			0.1, 0.1, 0.1));
		camera = Matrix4.multiply(camera, Matrix4Factory.translation(
			-1 * f.getX(), -1 * f.getY(), -1 * f.getZ()));
		camera = Matrix4.multiply(camera,
			Matrix4Factory.rotationY(-1 * rot.getY()));
		camera = Matrix4.multiply(camera,
			Matrix4Factory.rotationX(-1 * rot.getX()));
		camera = Matrix4.multiply(camera,
			Matrix4Factory.rotationZ(-1 * rot.getZ()));
		camera = Matrix4.multiply(camera, Matrix4Factory.perspective(r));

		return;
	}

	public Point2 windowToViewport(Point3 p) {
		Point4 point;
		Point4 res;

		point = new Point4(p.getX(), p.getY(), p.getZ(), 1);
		res = Matrix4.multiply(point, camera);

		return res.flatten2();
	}
}
