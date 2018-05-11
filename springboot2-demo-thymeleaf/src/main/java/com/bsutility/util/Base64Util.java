/**
 * 
 */
package com.bsutility.util;

import java.io.UnsupportedEncodingException;

import org.springframework.util.Base64Utils;

public class Base64Util {

	public static String encode(String data) {
		try {
			return new String(Base64Utils.encode(data.getBytes("utf-8")), "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return data;
	}

	public static String decode(String data) {
		try {
			return new String(Base64Utils.decode(data.getBytes("utf-8")), "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return data;
	}
}