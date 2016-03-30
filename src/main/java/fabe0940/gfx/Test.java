package fabe0940.gfx;

import fabe0940.gfx.math.Matrix4;
import fabe0940.gfx.math.Matrix4Factory;
import fabe0940.gfx.math.Point2;
import fabe0940.gfx.math.Point3;
import fabe0940.gfx.math.Point4;

public class Test {
	public static void main(String[] args) {
		double[] vals = {3, 4, 5, 1};
		Point4 p = new Point4(vals);

		Point4.print(p);

		p = Matrix4.multiply(p, Matrix4Factory.perspective(5));

		Point4.print(p);

		return;
	}
}
