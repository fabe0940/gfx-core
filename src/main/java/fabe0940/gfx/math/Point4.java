package fabe0940.gfx.math;

public class Point4 {
	public static final int dim = 4;
	private double[] P;

	public static void print(Point4 p) {
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
}
