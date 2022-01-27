package com.registrationproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String last_name;
		System.out.println("\nEnter the last name with first letter capital and should be minimum 3 letters:");
		last_name = sc.nextLine();
		checkLastName(last_name);
	}

	public static void checkLastName(String lastname) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastname);
		if (matcher.matches()) {
			System.out.println("\nYour lastname " + lastname + " is in correct format.");
		} else {
			System.out.println("\nYour lastname is not in format.");
		}
	}
}