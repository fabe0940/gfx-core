package fabe0940.gfx.math;

import fabe0940.gfx.math.Point2;
import fabe0940.gfx.math.Point3;

public class Point4 {
	public static final int dim = 4;
	private double[] P;

	public static void print(Point4 p) {
		int i;

		for (i = 0; i < dim; i++) {
			System.out.format("%.3f", p.getEntry(i));
			if (i != (dim - 1)) {
				System.out.print(", ");
			}
		}
		System.out.println();

		return;
	}

	public Point4() {
		int i;

		P = new double[dim];

		for (i = 0; i < dim; i++) {
			setEntry(i, 0.0);
		}

		return;
	}

	public Point4(double[] vals) {
		int i;

		P = new double[dim];

		for (i = 0; i < dim; i++) {
			setEntry(i, vals[i]);
		}

		return;
	}

	public Point4(double x, double y, double z, double alpha) {
		P = new double[dim];

		P[0] = x;
		P[1] = y;
		P[2] = z;
		P[3] = alpha;

		return;
	}

	public double[] get() {
		return P;
	}

	public double getEntry(int i) {
		return P[i];
	}

	public double getX() {
		return getEntry(0);
	}

	public double getY() {
		return getEntry(1);
	}

	public double getZ() {
		return getEntry(2);
	}

	public double getAlpha() {
		return getEntry(3);
	}

	public void setEntry(int i, double val) {
		P[i] = val;

		return;
	}

	public Point2 flatten2() {
		int i;
		double[] vals;

		vals = new double[dim - 2];
		for (i = 0; i < dim - 2; i++) {
			vals[i] = P[i];
		}

		return new Point2(vals);
	}

	public Point3 flatten3() {
		int i;
		double[] vals;

		vals = new double[dim - 1];
		for (i = 0; i < dim - 1; i++) {
			vals[i] = P[i];
		}

		return new Point3(vals);
	}
}
