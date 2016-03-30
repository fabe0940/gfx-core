package fabe0940.gfx.math;

import fabe0940.gfx.math.Matrix4Factory;
import fabe0940.gfx.math.Point4;

public class Matrix4 {
	public static final int dim = 4;
	private double[][] M;

	public static void print(Matrix4 m) {
		int col;
		int row;

		for (row = 0; row < dim; row++) {
			for (col = 0; col < dim; col++) {
				System.out.print(m.getEntry(row, col));
				if (col != (dim - 1)) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}

		return;
	}

	public static Point4 multiply(Point4 x, Matrix4 a) {
		int i;
		double val;
		Point4 res;

		res = new Point4();

		for (i = 0; i < Matrix4.dim; i++) {
			val = Matrix4.coeff(x.get(), a.getCol(i));
			res.setEntry(i, val);
		}

		return res;
	}

	public static Matrix4 multiply(Matrix4 a, Matrix4 b) {
		int col;
		int row;
		double val;
		double[][] identity = {
			{ 1, 0, 0, 0 },
			{ 0, 1, 0, 0 },
			{ 0, 0, 1, 0 },
			{ 0, 0, 0, 1 },
		};
		Matrix4 res;

		res = new Matrix4(identity);

		for (row = 0; row < dim; row++) {
			for (col = 0; col < dim; col++) {
				val = Matrix4.coeff(a.getRow(row), b.getCol(col));
				res.setEntry(row, col, val);
			}
		}

		return res;
	}

	private static double coeff(double[] a, double[] b) {
		int i;
		double res;

		res = 0;
		for (i = 0; i < dim; i++) {
			res += a[i] * b[i];
		}

		return res;
	}

	public Matrix4() {
		int col;
		int row;

		M = new double[dim][dim];

		for (row = 0; row < dim; row++) {
			for (col = 0; col < dim; col++) {
				setEntry(row, col, 0.0);
			}
		}

		return;
	}

	public Matrix4(double[][] vals) {
		int col;
		int row;

		M = new double[dim][dim];

		for (row = 0; row < dim; row++) {
			for (col = 0; col < dim; col++) {
				setEntry(row, col, vals[row][col]);
			}
		}

		return;
	}

	public double[] getCol(int col) {
		int row;
		double[] res = new double[dim];

		for (row = 0; row < dim; row++) {
			res[row] = M[row][col];
		}

		return res;
	}

	public double getEntry(int row, int col) {
		return M[row][col];
	}

	public double[] getRow(int row) {
		return M[row];
	}

	public void setEntry(int row, int col, double val) {
		M[row][col] = val;

		return;
	}
}
