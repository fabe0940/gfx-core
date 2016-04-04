package fabe0940.gfx.math;

public class Point2 {
	public static final int dim = 2;
	private double[] P;

	/* Print a point to stdout */
	public static void print(Point2 p) {
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
	public Point2() {
		int i;

		P = new double[dim];

		for (i = 0; i < dim; i++) {
			setEntry(i, 0.0);
		}

		return;
	}

	/* Construct from double[] */
	public Point2(double[] vals) {
		int i;

		P = new double[dim];

		for (i = 0; i < dim; i++) {
			setEntry(i, vals[i]);
		}

		return;
	}

	/* Construct from individual doubles */
	public Point2(double x, double y) {
		P = new double[dim];

		P[0] = x;
		P[1] = y;

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

	/* Set specific array entry */
	public void setEntry(int i, double val) {
		P[i] = val;

		return;
	}
}
