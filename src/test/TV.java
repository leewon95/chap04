package test;

public class TV {
	String company;
	int year;
	int size;
	
	public TV(String company, int year, int size) {
		this.company = company;
		this.year = year;
		this.size = size;
	}
	
	public void ShowTV() {
		System.out.println(company+"���� ���� "+year+"���� "+size+"��ġ TV");
	}
}
