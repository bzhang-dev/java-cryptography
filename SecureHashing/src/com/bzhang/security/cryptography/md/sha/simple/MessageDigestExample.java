package com.bzhang.security.cryptography.md.sha.simple;

import java.security.MessageDigest;
import java.util.Scanner;

/**
 * @author Boyuan Zhang
 *
 */
/**
 * source https://www.tutorialspoint.com/java_cryptography/java_cryptography_message_digest.htm 
 *
 */
public class MessageDigestExample {
	public static void main(String args[]) throws Exception {
		// Reading data from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the message");
		String message = sc.nextLine();

		// Creating the MessageDigest object
		MessageDigest md = MessageDigest.getInstance("SHA-256");

		// Passing data to the created MessageDigest Object
		md.update(message.getBytes());

		// Compute the message digest
		byte[] digest = md.digest();
		System.out.println("digest: " + digest);

		// Converting the byte array in to HexString format
		StringBuffer hexString = new StringBuffer();

		for (int i = 0; i < digest.length; i++) {
			hexString.append(Integer.toHexString(0xFF & digest[i]));
		}
		System.out.println("Hex format : " + hexString.toString());
		sc.close();
	}
}
