package fabe0940.gfx.math;

import java.lang.Math;
import fabe0940.gfx.math.Matrix4;

public class Matrix4Factory {
	/* Construct an identity matrix */
	public static Matrix4 identity() {
		int col;
		int row;
		Matrix4 res;

		res = new Matrix4();

		for (row = 0; row < Matrix4.dim; row++) {
			for (col = 0; col < Matrix4.dim; col++) {
				res.setEntry(row, col, row == col ? 1.0 : 0.0);
			}
		}

		return res;
	}

	/* Construct a scaling transform matrix */
	public static Matrix4 scaling(double x, double y, double z) {
		Matrix4 res;

		res = identity();
		res = Matrix4.multiply(res, scalingX(x));
		res = Matrix4.multiply(res, scalingY(y));
		res = Matrix4.multiply(res, scalingZ(z));

		return res;
	}

	/* Construct a translating transform matrix */
	public static Matrix4 translation(double x, double y, double z) {
		Matrix4 res;

		res = identity();
		res = Matrix4.multiply(res, translationX(x));
		res = Matrix4.multiply(res, translationY(y));
		res = Matrix4.multiply(res, translationZ(z));

		return res;
	}

	/* Construct a perspective transform matrix */
	public static Matrix4 perspective(double r) {
		Matrix4 res;

		res = identity();
		res.setEntry(2, 3, -1.0 / r);

		return res;
	}

	/* Construct a X scaling transform matrix */
	public static Matrix4 scalingX(double x) {
		Matrix4 res;

		res = identity();
		res.setEntry(0, 0, x);

		return res;
	}

	/* Construct a Y scaling transform matrix */
	public static Matrix4 scalingY(double y) {
		Matrix4 res;

		res = identity();
		res.setEntry(1, 1, y);

		return res;
	}

	/* Construct a Z scaling transform matrix */
	public static Matrix4 scalingZ(double z) {
		Matrix4 res;

		res = identity();
		res.setEntry(2, 2, z);

		return res;
	}

	/* Construct a X translating transform matrix */
	public static Matrix4 translationX(double x) {
		Matrix4 res;

		res = identity();
		res.setEntry(3, 0, x);

		return res;
	}

	/* Construct a Y translating transform matrix */
	public static Matrix4 translationY(double y) {
		Matrix4 res;

		res = identity();
		res.setEntry(3, 1, y);

		return res;
	}

	/* Construct a Z translating transform matrix */
	public static Matrix4 translationZ(double z) {
		Matrix4 res;

		res = identity();
		res.setEntry(3, 2, z);

		return res;
	}

	/* Construct a X rotating transform matrix */
	public static Matrix4 rotationX(double deg) {
		Matrix4 res;

		res = identity();
		res.setEntry(1, 1, Math.cos(Math.toRadians(deg)));
		res.setEntry(1, 2, Math.sin(Math.toRadians(deg)));
		res.setEntry(2, 1, -1 * Math.sin(Math.toRadians(deg)));
		res.setEntry(2, 2, Math.cos(Math.toRadians(deg)));

		return res;
	}

	/* Construct a Y rotating transform matrix */
	public static Matrix4 rotationY(double deg) {
		Matrix4 res;

		res = identity();
		res.setEntry(0, 0, Math.cos(Math.toRadians(deg)));
		res.setEntry(0, 2, -1 * Math.sin(Math.toRadians(deg)));
		res.setEntry(2, 0, Math.sin(Math.toRadians(deg)));
		res.setEntry(2, 2, Math.cos(Math.toRadians(deg)));

		return res;
	}

	/* Construct a Z rotating transform matrix */
	public static Matrix4 rotationZ(double deg) {
		Matrix4 res;

		res = identity();
		res.setEntry(0, 0, Math.cos(Math.toRadians(deg)));
		res.setEntry(0, 1, Math.sin(Math.toRadians(deg)));
		res.setEntry(1, 0, -1 * Math.sin(Math.toRadians(deg)));
		res.setEntry(1, 1, Math.cos(Math.toRadians(deg)));

		return res;
	}
}
