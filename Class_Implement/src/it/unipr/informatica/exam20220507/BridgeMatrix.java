package it.unipr.informatica.exam20220507;

abstract class BridgeMatrix {
	protected Matrix m;
	protected BridgeMatrix(Matrix m, boolean sparse) {
		this.m = m;
		sparse = false;
	}
}
