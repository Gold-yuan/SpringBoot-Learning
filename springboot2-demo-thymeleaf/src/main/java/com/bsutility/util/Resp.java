package com.bsutility.util;

import net.sf.json.JSONObject;

/**
 * @author adminytf
 *
 */
public class Resp {
	public static String toJson(String status, String msg, Object obj) {
		JSONObject json = new JSONObject();
		Object data = obj;
		if (obj == null) {
			data = "";
		}
		json.put("msg", msg);
		json.put("data", data);
		json.put("status", status);
		return json.toString();
	}

	public static String toSuccessJson(Object obj) {
		return toJson("success", "success", obj);
	}

	public static String toErrorJson(String msg) {
		return toJson(msg, "error", "");
	}
}
