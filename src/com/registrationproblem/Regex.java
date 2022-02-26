package com.registrationproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String emailId ;
		System.out.println("\nEnter your email id: ");
		emailId= sc.nextLine();
		emailIdValidator(emailId);
	}

	public static void emailIdValidator(String EmailId) {
		String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(EmailId);
		if (matcher.matches()) {
			System.out.println("\nYour emailid " + EmailId + " is in correct format.");
		} else {
			System.out.println("\nYour emailid is not in format");
		}
	}
}