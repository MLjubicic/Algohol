package krypto.gui.action.panel;

public class DecryptResult {

	private String bruteForceResult;

	private long bruteForceDuration;

	public DecryptResult(String bruteForceResult, long bruteForceDuration) {
		this.bruteForceResult = bruteForceResult;
		this.bruteForceDuration = bruteForceDuration;
	}

	public String getBruteForceResult() {
		return bruteForceResult;
	}

	public long getBruteForceDuration() {
		return bruteForceDuration;
	}

}
