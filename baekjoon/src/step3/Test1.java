package step3;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 원하는 숫자 1~9");
		int num = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * "+ i + " = " +num * i);
			
		}
		
		
	}

}
