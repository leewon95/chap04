package lecture;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		
//		Book slamdunk = new Book();
		//������ �����ε�
		Book noTitleBook = new Book();
				
		System.out.println(noTitleBook.title);
		Book littlePrince = new Book("�����","�����㺣��");
//		littlePrince.author = "Sang DDaggi";
		System.out.println(littlePrince.title+"==="+littlePrince.author);
		Book chunhyangjun = new Book("������");
		System.out.println(chunhyangjun.title+"==="+chunhyangjun.author);
		
		
		Book bookList[] = new Book[3];
		Scanner scanner = new Scanner(System.in);
		for (int i=0;i<bookList.length;i++) {
			System.out.println("������ ������.");
			String title = scanner.nextLine();
			System.out.println("���ڸ� �Է��ϼ���.");
			String author = scanner.nextLine();
			bookList[i] = new Book(title,author);
		}
		for (int i=0;i<bookList.length;i++) {
			bookList[i].showBookInfo();
		}
		int n = 10;
		bookList[2].methodTest(n);
		System.out.println("n���� 11�� �ٲ�������?==="+n);
		scanner.close();
	}

}
