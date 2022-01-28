package com.registrationproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String password ;
		System.out.println("\nEnter password at least 1 special character ");
		password = sc.nextLine();
		checkSpecialCharacter(password);
	}

	public static void checkSpecialCharacter(String SpecialCharacter) {
		String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z\\d[@$!%*#?&]]{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(SpecialCharacter);
		if (matcher.matches()) {
			System.out.println("\nYour password " + SpecialCharacter + " is in correct format.");
		} else {
			System.out.println("\nYour password is not in format");
		}
	}
}