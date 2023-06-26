package TestingSystem_Assignment_3_Data;

public class Exercise3_BoxingUnboxing {
public static void main(String[] args) {

/**
 * Question 1:
Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
Sau đó convert lương ra float và hiển thị lương lên màn hình 
(với số float có 2 số sau dấu thập phân)	
 */
System.out.println("---Question 3.1---");
Integer salary = 5000; 
System.out.printf("%2.2f%n", (float) salary); 	
	
	
/**
 * Question 2:
Khai báo 1 String có value = "1234567"
Hãy convert String đó ra số int	
 */

System.out.println("---Question 3.2---");
String a2 = "1234567"; 
int b2 = Integer.parseInt(a2); 
System.out.println(b2);


/**
 * Question 3:
Khởi tạo 1 số Integer có value là chữ "1234567"
Sau đó convert số trên thành datatype int	
 */
System.out.println("---Question 3.3---");	
Integer a3 = 123456; 
int b3 = a3.intValue(); 
System.out.println(b3); 	
		
	
	
	
}
}
