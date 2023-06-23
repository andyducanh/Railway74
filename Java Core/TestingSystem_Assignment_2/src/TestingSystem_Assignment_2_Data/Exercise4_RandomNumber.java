package TestingSystem_Assignment_2_Data;

import java.time.LocalDate;
import java.util.Random;

public class Exercise4_RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/**
 * Question 1:In ngẫu nhiên ra 1 số nguyên		
 */
		
	System.out.printf("--- Question 4.1: In ngẫu nhiên ra 1 số nguyên---%n"); 
	Random random = new Random(); 
	int n = random.nextInt(); 
	System.out.println("Số ngẫu nhiên: " + n);		

/**
 * Question 2:In ngẫu nhiên ra 1 số thực		
 */		
	
	System.out.printf("--- Question 4.2: In ngẫu nhiên ra 1 số thực---%n"); 
	float f = random.nextFloat(); 
	System.out.println("Số ngẫu nhiên: " + f);	
		
		
/**
 * Question 3:Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên
ra tên của 1 bạn
 */			

	System.out.printf("--- Question 4.3: In ngẫu nhiên ra tên bạn trong lớp---%n"); 
	String[] nameArr = { "NamAnh", "DucAnh", "Trang", "Lam", "DuyAn" }; 
	int i = random.nextInt(nameArr.length);
	System.out.println("Tên ngẫu nhiên 1 bạn trong lớp: " +nameArr[i]);	
		
		
/**
 * Question 4:Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12- 1995
 */			

	
/**
 * Question 5:Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây
 */		
	System.out.printf("--- Question 4.5: ấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây---%n"); 
	int now = (int) LocalDate.now().toEpochDay(); 
	int randomDate = now - random.nextInt(365); 
	LocalDate reusultDate = LocalDate.ofEpochDay(randomDate);
	System.out.println("Ngày ngẫu nhiên là: " + reusultDate);
		
	
/**
 * Question 6:Lấy ngẫu nhiên 1 ngày trong quá khứ
 */			

	System.out.printf("--- Question 4.6: Lấy ngẫu nhiên 1 ngày trong quá khứ---%n"); 
	int maxDay1 = (int) LocalDate.now().toEpochDay();
	long randomDay1 = random.nextInt(maxDay1);
	LocalDate resultDate1 = LocalDate.ofEpochDay(randomDay1);
	System.out.println("1 Ngày ngẫu nhiên trong quá khứ: " + resultDate1);	
	
	
/**
 * Question 7:Lấy ngẫu nhiên 1 số có 3 chữ số
 */	
	System.out.printf("--- Question 4.7: Lấy ngẫu nhiên 1 số có 3 chữ số---%n"); 
	int z = random.nextInt(999 - 100 + 1) + 100;  // Công thức: (số max - số min + 1) + số min
	System.out.println(z);
	
	
	}
}
