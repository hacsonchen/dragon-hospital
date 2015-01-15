package com.stpass.dragon.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Encodes a string using MD5 hashing 
 * @author chenqs@stpass.com
 * @version MD5.java, v0.1 2015/01/01
 */
public class MD5 {
	
	public static String crypt(String str)
	{
		if (str == null || str.length() == 0) {
			throw new IllegalArgumentException("String to encript cannot be null or zero length");
		}
		
		StringBuffer hexString = new StringBuffer();
		
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes());
			byte[] hash = md.digest();
			
			for (int i = 0; i < hash.length; i++) {
				if ((0xff & hash[i]) < 0x10) {
					hexString.append("0" + Integer.toHexString((0xFF & hash[i])));
				}				
				else {
					hexString.append(Integer.toHexString(0xFF & hash[i]));
				}				
			}
		}
		catch (NoSuchAlgorithmException e) {
		}
		
		return hexString.toString();
	}

}
