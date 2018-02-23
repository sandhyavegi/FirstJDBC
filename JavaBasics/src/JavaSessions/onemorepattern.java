package JavaSessions;

import java.util.Scanner;

public class onemorepattern {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.println("enter a number:");
		int a = ip.nextInt();
		for (int i = 1; i <= a; i++) {
			for (int j = 0; j <i ; j++){
				System.out.print("*");

		}
		System.out.println();
	}
	}
}