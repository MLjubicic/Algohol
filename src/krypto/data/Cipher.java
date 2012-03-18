/**
 * 
 */
package krypto.data;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class Cipher {

	private String cstr;
	private String key;
	
	public String getCipherString() {
		return cstr;
	}
	
	public String getKey() {
		return key;
	}
	
	public void setCipherString (String str) {
		cstr = str;
	}
	
	public void setKey (String str) {
		key = str;
	}
}
