package TestingSystem_Assignment_3_Data;

import java.util.Scanner;

public class Exercise1_DatatypeCasting {
public static void main(String[] args) {
	
	/**
	 * Question 1:
		Khai báo 2 số lương có kiểu dữ liệu là float.
		Khởi tạo Lương của Account 1 là 5240.5 $ 
		Khởi tạo Lương của Account 2 là 10970.055$ 	
		Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra 
		Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra
	 */
	System.out.println("---Question 1.1---");
	float salary1 = 5240.5f; // khai báo số thực phải có f ở cuối
	float salary2 = 10970.055f;
		
	int salary1casting = (int) salary1; // đổi từ số thực(float) sang số nguyên(int)
	int salary2casting = (int) salary2;	
	System.out.println("Lương làm tròn của Account 1: "+salary1casting+
					   " Lương làm tròn của Account 2: "+salary2casting);

	/**Question 2:
	 * Lấy ngẫu nhiên 1 số có 5 chữ số 
	 * (những số dưới 5 chữ số thì sẽ thêm có số 0 ở đầu cho đủ 5 chữ số)
	 */
	System.out.println("---Question 2.2---");
	int min = 0; 
	int max = 99999;
	
	int a2 = (int) (Math.random() * max) + min;
	while (a2 < 10000) { a2 = a2 * 10; }
	
	System.out.println("Số ngẫu nhiên có 5 chữ số là: " + a2);	
		
		
		
	/**Question 3:
	 * Lấy 2 số cuối của số ở Question 2 và in ra.
	Gợi ý: Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối 
		   Cách 2: chia lấy dư số đó cho 100
	 */
			
		
		
		

		
		
	/**Question 4:
	 * Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
	 */
//question4();
//	
//public static void question4() { 
	System.out.println("---Question 2.4---");
	Scanner sc4 = new Scanner(System.in); // Cú pháp nhập dữ liệu từ bàn phím
	
	System.out.println("Nhập vào số nguyên a:");
	int a4 = sc4.nextInt();
	
	System.out.println("Nhập vào số nguyên b:");
	int b4 = sc4.nextInt();
	
	sc4.close(); // Lệnh kết thúc scaner
	
	System.out.println("Thương của 2 số nguyên là: "+ (float)a4 / (float)b4 );
	
//}
}
}
