package pswd;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class ps {
	
	
	public static String encode(String txt) {
		Encoder encoder = Base64.getEncoder();
		return encoder.encodeToString(txt.getBytes());
		
	}
	
	public static String decode(String encodetxt) {
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodetxt);
		return new String(decode);
	}
	
	
	
	public static void main(String[] args) {
		
		String encode = ps.encode("Ajay kumar bondla");
		System.out.println(encode);
		
		String decode = ps.decode(encode);
		System.out.println(decode);
		
		
		
		
	}


}
