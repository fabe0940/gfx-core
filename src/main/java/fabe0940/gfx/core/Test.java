package fabe0940.gfx.core;

import fabe0940.gfx.math.Matrix4;
import fabe0940.gfx.math.Matrix4Factory;

public class Test {
	public static void main(String[] args) {
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
		Matrix4Factory f;
		Matrix4 m1, m2, m3;

		f = new Matrix4Factory();

		m1 = new Matrix4(a);
		m2 = new Matrix4(b);
		m3 = Matrix4.multiply(f, m1, m2);
		m3 = Matrix4.multiply(f, f.identity(), m3);
		m3 = Matrix4.multiply(f, m3, f.identity());

		Matrix4.print(m3);

		return;
	}
}
