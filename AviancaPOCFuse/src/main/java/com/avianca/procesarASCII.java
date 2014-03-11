package com.avianca;

public class procesarASCII {	
	public String doSomething(String body)
	{		
		body = body.replaceAll("[^\\p{L}\\p{Nd}]", ",").concat("77777\r\n");		
		return body;
	}
}
