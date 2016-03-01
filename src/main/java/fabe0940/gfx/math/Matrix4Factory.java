package fabe0940.gfx.math;

import fabe0940.gfx.math.Matrix4;

public class Matrix4Factory {
	public Matrix4Factory() {
		return;
	}

	public Matrix4 identity() {
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
}
