package TestingSystem_Assignment_2_Data;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercise5_InputFromConsole {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 * Question 1: Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
 */
		
	System.out.printf("--- Question 5.1: Nhập 3 số nguyên vào chương trình---%n"); 		

	Scanner sc1 = new Scanner(System.in);
	System.out.println("Bạn nhập vào 3 số nguyên");
	System.out.println("Nhập vào số 1: "); 
	int a1 = sc1.nextInt();
	
	System.out.println("Nhập vào số 2: "); 
	int b1 = sc1.nextInt(); 
	
	System.out.println("Nhập vào số 3: "); 
	int c1 = sc1.nextInt();
	
	System.out.println("Bạn vừa nhập vào các số nguyên: " + a1 + " - " + b1 + " - " + c1);
		
/**
 * Question 2: Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
 */		
	System.out.printf("--- Question 5.2: Nhập 2 số thực vào chương trình---%n"); 		

	Scanner sc2 = new Scanner(System.in);
	System.out.println("Bạn nhập vào 2 số thực");
	System.out.println("Nhập vào số 1: "); 
	float a2 = sc2.nextFloat();
	
	System.out.println("Nhập vào số 2: "); 
	float b2 = sc2.nextFloat();
	
	System.out.println("Bạn vừa nhập vào các số thực: " + a2 + " - " + b2);	
		
/**
 * Question 3: Viết lệnh cho phép người dùng nhập họ và tên	
 */
		
	System.out.printf("--- Question 5.3: Nhập vào họ và tên---%n"); 		
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Bạn nhập vào Họ: ");
	String a3 = sc.next();
	
	System.out.println("Bạn nhập vào Tên: ");
	String b3 = sc.next(); System.out.println("Họ và tên của bạn là:" + a3 + " - " + b3);	
		
/**
 * Question 4: Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ		
 */
	System.out.printf("--- Question 5.4: Nhập vào ngày sinh nhật---%n");
	
	System.out.println("Mời bạn nhập vào năm sinh: ");
	int year = sc.nextInt();
	System.out.println("Mời bạn nhập vào tháng sinh: ");
	
	int month = sc.nextInt();
	System.out.println("Mời bạn nhập vào ngày sinh: ");
	
	int day = sc.nextInt(); LocalDate dateBirth = LocalDate.of(year, month, day);
	System.out.println("Ngày sinh của bạn là: " + dateBirth);	
		
		
		
	}

}
