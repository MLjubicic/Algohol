package krypto.data;

public enum Alphabet {

	A(6.51),
	B(1.89),
	C(3.06),
	D(5.08),
	E(17.4),
	F(1.66),
	G(3.01),
	H(4.76),
	I(7.55),
	J(0.27),
	K(1.21),
	L(3.44),
	M(2.53),
	N(9.78),
	O(2.51),
	P(0.79),
	Q(0.02),
	R(7.0),
	S(7.27),
	T(6.15),
	U(4.35),
	V(0.67),
	W(1.89),
	X(0.03),
	Y(0.04),
	Z(1.13);
	
	private double frequency;

	private Alphabet(double frequency) {
		this.frequency = frequency;
	}

	public double getFrequency() {
		return frequency;
	}

}
