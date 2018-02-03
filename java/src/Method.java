import java.io.UnsupportedEncodingException;

import com.twmacinta.util.MD5;


public abstract class Method {
	
	static MD5 md5 = new MD5();
	
	//--------------------------------------------------------------------------
	public static String f(String text) {
		return md5String(md5Bytes(text));
	}
	
	public static String f2(String text) {
		return cut(md5String(md5Bytes(text)));
	}
	
	//--------------------------------------------------------------------------
	public static String cut(String hash) {
		return hash.substring(0, 7);	
	}
	
	//--------------------------------------------------------------------------
	public static boolean equals(String t, String h) {
		return cut(t).equals(cut(h));
	}
	
	//--------------------------------------------------------------------------
	public static byte[] md5Bytes(String text) {
	    try {
			md5.Update(text, null);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	    return hexToByte(md5.asHex());
	}
	
	//--------------------------------------------------------------------------
	public static String md5String(byte[] text) {
	    md5.Update(text);
	    return md5.asHex();
	}
	
	//--------------------------------------------------------------------------
	public static byte[] hexToByte(String s) {
	    int len = s.length();
	    byte[] data = new byte[len / 2];
	    for (int i = 0; i < len; i += 2) {
	        data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i+1), 16));
	    }
	    return data;
	}

}
