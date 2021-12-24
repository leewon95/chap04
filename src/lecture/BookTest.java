package lecture;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		
//		Book slamdunk = new Book();
		//생성자 오버로딩
		Book noTitleBook = new Book();
				
		System.out.println(noTitleBook.title);
		Book littlePrince = new Book("어린왕자","생텍쥐베리");
//		littlePrince.author = "Sang DDaggi";
		System.out.println(littlePrince.title+"==="+littlePrince.author);
		Book chunhyangjun = new Book("춘향전");
		System.out.println(chunhyangjun.title+"==="+chunhyangjun.author);
		
		
		Book bookList[] = new Book[3];
		Scanner scanner = new Scanner(System.in);
		for (int i=0;i<bookList.length;i++) {
			System.out.println("제목을 쓰세요.");
			String title = scanner.nextLine();
			System.out.println("저자를 입력하세요.");
			String author = scanner.nextLine();
			bookList[i] = new Book(title,author);
		}
		for (int i=0;i<bookList.length;i++) {
			bookList[i].showBookInfo();
		}
		int n = 10;
		bookList[2].methodTest(n);
		System.out.println("n값은 11로 바뀌었을까요?==="+n);
		scanner.close();
	}

}
