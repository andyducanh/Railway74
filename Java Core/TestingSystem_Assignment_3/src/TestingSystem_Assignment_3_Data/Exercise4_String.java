package TestingSystem_Assignment_3_Data;

import java.util.Scanner;

public class Exercise4_String {
public static void main(String[] args) {

	
/**
 * Question 1:
Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó 
(các từ có thể cách nhau bằng nhiều khoảng trắng ); 	
 */
	System.out.println("---Question 4.1---");	
	
	String e1; // Khai báo xâu kí tự dạng string là e1
	Scanner sc = new Scanner(System.in); // cú pháp để nhập vào dữ liệu từ bàn phím
	System.out.println("Nhập vào xâu kí tự: ");	 
	e1 = sc.nextLine(); 
	String[] words = e1.split(" "); 
	System.out.println("Số lượng các từ trong xâu kí tự là: " + words.length);
	sc.close();
	
/**
 * Question 2:
Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;	
// */
//	System.out.println("---Question 4.2---");		
//
//	
//	Scanner sc2 = new Scanner(System.in);
//	
//	System.out.println("Nhập vào xâu kí tự 1: ");
//	String s1 = sc2.next();
//	System.out.println("Nhập vào xâu kí tự 2: ");
//	String s2 = sc2.next();
//	System.out.println("Kết quả sau khi nối chuỗi: " + s1 + " " + s2);
//	sc2.close();
	
/**
 * Question 3:
Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chưa viết hoa chữ cái đầu thì viết hoa lên	
 */
	System.out.println("---Question 4.3---");		

	
/**
 * Question 4:
Viết chương trình để người dùng nhập vào tên và in từng ký tự trong tên
của người dùng ra VD:
Người dùng nhập vào "Nam", hệ thống sẽ in ra
	"Ký tự thứ 1 là: N" 
	"Ký tự thứ 1 là: A" 
	"Ký tự thứ 1 là: M"	
 */
	System.out.println("---Question 4.4---");		
	
	
}
}
