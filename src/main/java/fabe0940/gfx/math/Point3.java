package fabe0940.gfx.math;

import fabe0940.gfx.math.Point2;

public class Point3 {
	public static final int dim = 3;
	private double[] P;

	public static void print(Point3 p) {
		int i;

		for (i = 0; i < dim; i++) {
			System.out.print(p.getEntry(i));
			if (i != (dim - 1)) {
				System.out.print(", ");
			}
		}
		System.out.println();

		return;
	}

	public Point3() {
		int i;

		P = new double[dim];

		for (i = 0; i < dim; i++) {
			setEntry(i, 0.0);
		}

		return;
	}

	public Point3(double[] vals) {
		int i;

		P = new double[dim];

		for (i = 0; i < dim; i++) {
			setEntry(i, vals[i]);
		}

		return;
	}

	public double[] get() {
		return P;
	}

	public double getEntry(int i) {
		return P[i];
	}

	public void setEntry(int i, double val) {
		P[i] = val;

		return;
	}

	public Point2 flatten2() {
		int i;
		double[] vals;

		vals = new double[dim - 1];
		for (i = 0; i < dim - 1; i++) {
			vals[i] = P[i];
		}

		return new Point2(vals);
	}
}
