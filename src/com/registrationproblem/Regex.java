package com.registrationproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String email_id;
		System.out.println("\nEnter the Email Address");
		email_id = sc.nextLine();
		email_Id(email_id);
	}

	public static void email_Id(String email_address) {
		String regex = "[a-z]+[.][a-z]*[@][a-z]+[.][a-z]+[.][a-z]*";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email_address);
		if (matcher.matches()) {
			System.out.println("\nYour email_address " + email_address + " is in correct format.");
		} else {
			System.out.println("\nYour email_address is not in format");
		}
	}
}