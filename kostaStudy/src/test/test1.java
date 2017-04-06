package test;

import java.util.Scanner;

public class test1 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
		System.out.println("이름을 입력하세요: ");
		String name = input.next();
		naming(name);
		if(name.equals("exit")) {
			flag = false;
		}
		}
	}

	private static void naming(String name) {
		System.out.println("name: " + name);
		System.out.println("다시 입력중");
	}
}
