package protections;


/**
 * @(#)ProtectorV2.java
 *
 *
 * @Author      :Amila  Karunathilka
 * @version     :2.0
 * @Date        :2011/2/12
 * @Copyright Reserved....
 */


import java.security.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.*;

public class Protector {

    private static final String ALGORITHM = "AES";
    
    //need 17 bytes arry
    private static final byte[] keyValue =new byte[] {'A','m','i','l','a','K','a','r','u','n','a','t','1','9','9','1'};

    //salt may be a various value
    //value of ITERATIONS must be less than 30
    public static String encrypt(String value, String salt, int ITERATIONS) throws Exception {
        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGORITHM);  
        c.init(Cipher.ENCRYPT_MODE, key);
  
        String valueToEnc = null;
        String eValue = value;
        for (int i = 0; i < ITERATIONS; i++) {
            valueToEnc = salt + eValue;
            byte[] encValue = c.doFinal(valueToEnc.getBytes());
            eValue = new BASE64Encoder().encode(encValue);
        }
        return eValue;
    }

    public static String decrypt(String value, String salt,int ITERATIONS) throws Exception {
        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGORITHM);
        c.init(Cipher.DECRYPT_MODE, key);
  
        String dValue = null;
        String valueToDecrypt = value;
        for (int i = 0; i < ITERATIONS; i++) {
            byte[] decordedValue = new BASE64Decoder().decodeBuffer(valueToDecrypt);
            byte[] decValue = c.doFinal(decordedValue);
            dValue = new String(decValue).substring(salt.length());
            valueToDecrypt = dValue;
        }
        return dValue;
    }

    private static Key generateKey() throws Exception {
        Key key = new SecretKeySpec(keyValue, ALGORITHM);
        return key;
    }
    
    
    public static void main(String args[]){
    	try{
    		String encrypted=encrypt("ijts","ijts",5);
    		System.out.println(encrypted);
    		String decrypted=decrypt(encrypted,"ijts",5);

   		System.out.println(decrypted);


    	}catch(Exception e){
    		Logger.getLogger(Protector.class.getName()).log(Level.SEVERE, null, e);
    	}
    	
    	
    }
    
}

	
	