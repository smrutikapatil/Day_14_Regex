package com.registrationproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String password ;
		System.out.println("\nEnter password at least 1 upper case");
		password = sc.nextLine();
		checkUpperCase(password);
	}

	public static void checkUpperCase(String password) {
		String regex = "^(?=.*[A-Z])[A-Za-z]{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		if (matcher.matches()) {
			System.out.println("\nYour password " + password + " is in correct format.");
		} else {
			System.out.println("\nYour password is not in format");
		}
	}
}