package krypto.data;

public enum Alphabet {

	A(3.3),
	B(5.4),
	C(3.0);
	
	private double frequency;

	private Alphabet(double frequency) {
		this.frequency = frequency;
	}

	public double getFrequency() {
		return frequency;
	}

}
