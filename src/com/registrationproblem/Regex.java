package com.registrationproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String password ;
		System.out.println("\nEnter password ");
		password = sc.nextLine();
		checkPassword(password);
	}

	public static void checkPassword(String password) {
		String regex = "[0-9]{8,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		if (matcher.matches()) {
			System.out.println("\nYour password " + password + " is in correct format.");
		} else {
			System.out.println("\nYour password is not in format");
		}
	}
}