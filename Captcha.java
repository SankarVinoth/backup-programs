package in.sankarvinoth.service;

public class Captcha {
	private static final String alphaString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	public static String randomAlphaNumeric() {
		int count=6;
	StringBuilder builder = new StringBuilder();
	while (count--!= 0) {
	int character = (int)(Math.random()*alphaString.length());
	builder.append(alphaString.charAt(character));
	}
	return builder.toString();
	}

}
