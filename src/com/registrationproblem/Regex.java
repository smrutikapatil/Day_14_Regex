package com.registrationproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String password ;
		System.out.println("\nEnter password at least 1 numeric number ");
		password = sc.nextLine();
		checkOneNumeric(password);
	}

	public static void checkOneNumeric(String numeric) {
		String regex = "^(?=.*[A-Z])(?=.*[0-9])[A-Za-z\\d]{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(numeric);
		if (matcher.matches()) {
			System.out.println("\nYour password " + numeric + " is in correct format.");
		} else {
			System.out.println("\nYour password is not in format");
		}
	}
}