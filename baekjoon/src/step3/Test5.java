package step3;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력하시오");
		int num = sc.nextInt();

		for (int i = num; i > 0; i--) {
			System.out.println(i);

		}

	}
}