/** ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 *  +      Zuercher Hochschule angewandter Wissenschaften      +
 *  +                    Software Projekt 2                    +
 *  +                                                          +
 *  +        Gruppe 10: Miro Ljubicic & Mathias Weigert        +
 *  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */
package krypto.data;

/**
 * @author Mathias Weigert & Miro Ljubicic
 * @version 1.0
 */
public class Cipher {

	private String cstr;
	private String pstr;
	private String key;
	
	public String getCipherString() {
		return cstr;
	}
	
	public String getPlainString() {
		return pstr;
	}
	
	public String getKey() {
		return key;
	}
	
	public void setCipherString (String str) {
		this.cstr = str;
	}
	
	public void setPlainString (String str) {
		this.pstr = str;
	}
	public void setKey (String str) {
		this.key = str;
	}
}
