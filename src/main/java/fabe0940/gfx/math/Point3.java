package fabe0940.gfx.math;

import fabe0940.gfx.math.Point2;

public class Point3 {
	public static final int dim = 3;
	private double[] P;

	/* Print a point to stdout */
	public static void print(Point3 p) {
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

	/* Default constructor */
	public Point3() {
		int i;

		P = new double[dim];

		for (i = 0; i < dim; i++) {
			setEntry(i, 0.0);
		}

		return;
	}

	/* Construct from double[] */
	public Point3(double[] vals) {
		int i;

		P = new double[dim];

		for (i = 0; i < dim; i++) {
			setEntry(i, vals[i]);
		}

		return;
	}

	/* Construct from individual doubles */
	public Point3(double x, double y, double z) {
		P = new double[dim];

		P[0] = x;
		P[1] = y;
		P[2] = z;

		return;
	}

	/* Get internal array */
	public double[] get() {
		return P;
	}

	/* Get specific array entry */
	public double getEntry(int i) {
		return P[i];
	}

	/* Get X value */
	public double getX() {
		return getEntry(0);
	}

	/* Get Y value */
	public double getY() {
		return getEntry(1);
	}

	/* Get Z value */
	public double getZ() {
		return getEntry(2);
	}

	/* Set specific array entry */
	public void setEntry(int i, double val) {
		P[i] = val;

		return;
	}

	/* Convert to Point2 */
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
