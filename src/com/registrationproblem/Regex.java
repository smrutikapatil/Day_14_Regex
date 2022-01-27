package com.registrationproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String first_name;
		System.out.println("\nEnter the first name with first letter capital and should be minimum 3 letters:");
		first_name = sc.nextLine();
		checkFirstName(first_name);
	}

	public static void checkFirstName(String name) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(name);
		if (matcher.matches()) {
			System.out.println("\nYour name " + name + " is in correct format.");
		} else {
			System.out.println("\nYour name is not in format.");
		}
	}
}