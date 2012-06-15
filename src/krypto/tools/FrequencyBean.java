package krypto.tools;

public class FrequencyBean implements Comparable<FrequencyBean> {

	private Character letter;
	private double frequency;
	private boolean isFrequencySorted = true;

	public FrequencyBean(Character key, double percentage) {
		letter = key;
		frequency = percentage;
	}

	/**
	 * @return the letter
	 */
	public Character getLetter() {
		return letter;
	}

	/**
	 * @param letter
	 *            the letter to set
	 */
	public void setLetter(Character letter) {
		this.letter = letter;
	}

	/**
	 * @return the frequency
	 */
	public double getFrequency() {
		return frequency;
	}

	/**
	 * @param frequency
	 *            the frequency to set
	 */
	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}

	/**
	 * @return the isFrequencySorted
	 */
	public boolean isFrequencySorted() {
		return isFrequencySorted;
	}

	/**
	 * @param isFrequencySorted
	 *            the isFrequencySorted to set
	 */
	public void setFrequencySorted(boolean isFrequencySorted) {
		this.isFrequencySorted = isFrequencySorted;
	}

	@Override
	public int compareTo(FrequencyBean arg0) {

		if (frequency > arg0.getFrequency()) {
			return -1;
		} else {
			return 0;
		}
	}

}
