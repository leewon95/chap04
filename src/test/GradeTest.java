package test;

import java.util.Scanner;

public class GradeTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� ���� ���� ������ 3���� ���� �Է�");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade();
		System.out.println("����� "+me.average);
	}
}