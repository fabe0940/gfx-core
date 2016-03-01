package fabe0940.gfx.core;

import fabe0940.gfx.math.Matrix4;
import fabe0940.gfx.math.Matrix4Factory;
import fabe0940.gfx.math.Point4;

public class Test {
	public static void main(String[] args) {
		Matrix4Factory f;
		double[][] a = {
			{ 1, 0, 0, 0 },
			{ 0, 1, 0, 0 },
			{ 0, 0, 1, 0 },
			{ -1, 0, 0, 1 },
		};
		double[][] b = {
			{ 1, 0, 0, 0 },
			{ 0, 1, 0, 0 },
			{ 0, 0, 1, 0 },
			{ 0, -1, 0, 1 },
		};
		double[] c = { 1, 0, 0, 1 };
		Matrix4 m1, m2, m3;
		Point4 x = new Point4(c);

		f = new Matrix4Factory();
		m1 = new Matrix4(a);
		m2 = new Matrix4(b);

		System.out.println("Matrix multiplication");

		m3 = Matrix4.multiply(m1, m2);
		m3 = Matrix4.multiply(f, f.identity(), m3);
		m3 = Matrix4.multiply(f, m3, f.identity());
		Matrix4.print(m3);

		System.out.println("Point multiplication");

		Point4.print(x);
		Point4.print(Matrix4.multiply(x, m3));

		return;
	}
}
