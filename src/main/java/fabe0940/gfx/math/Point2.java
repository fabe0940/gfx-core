package fabe0940.gfx.math;

public class Point2 {
	public static final int dim = 2;
	private double[] P;

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

	public Point2() {
		int i;

		P = new double[dim];

		for (i = 0; i < dim; i++) {
			setEntry(i, 0.0);
		}

		return;
	}

	public Point2(double[] vals) {
		int i;

		P = new double[dim];

		for (i = 0; i < dim; i++) {
			setEntry(i, vals[i]);
		}

		return;
	}

	public Point2(double x, double y) {
		P = new double[dim];

		P[0] = x;
		P[1] = y;

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

	public void setEntry(int i, double val) {
		P[i] = val;

		return;
	}
}
