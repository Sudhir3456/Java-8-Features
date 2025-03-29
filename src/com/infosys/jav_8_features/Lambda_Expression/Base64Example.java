package com.infosys.jav_8_features.Lambda_Expression;

import java.util.Base64;

public class Base64Example {

	public static void main(String[] args) {

		String msg = "Jspiders";

		System.out.println("Without encode" +   msg);

		String encodemsg = Base64.getEncoder().encode(msg.getBytes()).toString();

		System.out.println(encodemsg);

		String decodeMsg = Base64.getDecoder().decode(encodemsg.getBytes()).toString();

		System.out.println(decodeMsg);

	}

}
