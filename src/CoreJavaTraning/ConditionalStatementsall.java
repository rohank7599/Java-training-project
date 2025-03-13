package CoreJavaTraning;

import java.util.Scanner;

public class ConditionalStatementsall {

	public static void main(String[] args) {
//		int age = 19;
//		int weight = 55;
//
//		// if (age >= 20 && weight >= 50) {
//		if (age >= 20) {
//			if (weight >= 50) {
//				System.out.println("eligible");
//
//			} else {
//
//				System.out.println("not eligible for blood donetion beacue of less weight");
//			}
//
//		} else {
//			System.out.println("not eligible due to age");
//		}
//	}
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter marks");
		int marks = sc.nextInt();

		if (marks >= 90) {
			System.out.println("A+");
		} else if (marks < 90 && marks >= 70) {

			System.out.println("A");
		} else if (marks < 70 && marks >= 50) {
			System.out.println("B");

		} else {
			System.out.println("C");
		}

	}
}
