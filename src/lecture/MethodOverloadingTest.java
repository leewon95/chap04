package lecture;


//접근 제한자  class, field(속성), method에도 붙일 수 있다.
public class MethodOverloadingTest {
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		int sum01 = mo.getSum(10, 10);
		System.out.println(sum01);
		int sum02 = mo.getSum(100, 200, 300);
		System.out.println(sum02);
		double sum03 = mo.getSum(10.5, 11.4);
		System.out.println(sum03);
		Circle aa = new Circle();
		Circle bb = new Circle();
		bb = aa; //객체의 할당이나 null은 가비지가 된다.
		//bb는 없어도 되는 가비지 컬렉션의 수거 대상이 된다.
		// !! 수거 대상이 되는 거지 즉시 사라지지는 않는다.
		System.gc();//쓰레기차 호출
	}

}
