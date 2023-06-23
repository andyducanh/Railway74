package TestingSystem_Assignment_2_Data;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Exercise2_SystemOutPrintf {
public static void main(String[] args) {
	//TODO 

/**
 * Question 1:Khai báo 1 số nguyên = 5 
 * và sử dụng lệnh System out printf để in ra số nguyên đó	
 */

	System.out.printf("--- Question 2.1: In ra số nguyên ---%n "); 
	int a1=5;
	System.out.printf("%d%n", a1); 

/**
 * Question 2: Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf 
 * để in ra số nguyên đó thành định dạng như sau: 100,000,000			
 */
	
	System.out.printf("--- Question 2.2: Đổi định dạng số nguyên ---%n"); 
	int a2=100000000;
	System.out.printf(Locale.US, "%,d%n", a2);

/**
 * Question 3: Khai báo 1 số thực = 5,567098 
 * và sử dụng lệnh System out printf để in ra số thực đó chỉ bao gồm 4 số đằng sau			
 */
	System.out.printf("--- Question 2.3: ---%n"); 
	float a3=5.567098f;
	System.out.printf("%5.4f%n", a3);
	
/**
	*  Question 4: Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó 
 *  theo định dạng như sau: 
	Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau: 
	Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.
 */
	System.out.printf("--- Question 2.4: ---%n"); 
	String a4 = "Nguyễn Văn A"; 
	System.out.printf("Tên tôi là \"" + a4 + "\" và tôi đang độc thân \n");

/**
 * Question 5: Lấy thời gian bây giờ và in ra theo định dạng sau: 24/04/2020 11h:16p:20s
 */
	System.out.printf("--- Question 2.5: ---%n"); 
	String pattern = "dd/MM/yyyy HH:mm:ss";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern); 
	String date = simpleDateFormat.format(new Date()); 
	System.out.println(date);	

/**
 * Question 6:
In ra thông tin account (như Question 8 phần FOREACH) theo định dạng table 
	(giống trong Database)
 */
	
	
	
	
	
}	
}
