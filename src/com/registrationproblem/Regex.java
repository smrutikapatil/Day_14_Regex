package com.registrationproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String mobile_no;
		System.out.println("\nEnter the mobile number ");
		mobile_no = sc.nextLine();
		checkMobileNo(mobile_no);
	}

	public static void checkMobileNo(String mobile_number) {
		String regex = "^(91)\\s[6-9][0-9]{9}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mobile_number);
		if (matcher.matches()) {
			System.out.println("\nYour mobile_number " + mobile_number + " is in correct format.");
		} else {
			System.out.println("\nYour mobile_number is not in format");
		}
	}
}