package utils;
import java.util.Scanner;

public class ScannerUtils {
  private static void printErrString(String errString){
    System.out.println(errString);
  }
  public static int inputInt(Scanner scanner, String errString){
    while (true){
      try {
        return Integer.parseInt(scanner.nextLine());
      }catch (Exception e){
        printErrString(errString);
      }
    }
  }
  public static String inputPassword(){
    while (true) {
      String password = ScannerUtils.inputString();
      if (password.length() < 6 || password.length() > 12) {
        System.out.print("Nhập lai: ");
        continue;
      }
      boolean hasAtLeastlCharacter = false;

      for (int i = 0; i < password.length(); i++) {
        if (Character.isUpperCase(password.charAt(i)) == true) {
          hasAtLeastlCharacter = true;

          break;
        }
      }
      if (hasAtLeastlCharacter == true) {
        return password;
      } else {
        System.out.print("Mời bạn nhập lai password: ");
      }
    }
  }



  public static float inputFloat(Scanner scanner, String errString){
    while (true){
      try {
        return Float.parseFloat(scanner.nextLine());
      }catch (Exception e){
        printErrString(errString);
      }
    }
  }
  public static double inputDouble(Scanner scanner, String errString){
    while (true){
      try {
        return Double.parseDouble(scanner.nextLine());
      }catch (Exception e){
        printErrString(errString);
      }
    }
  }
  public static String inputString(Scanner scanner, String errString){
    while (true){
      try {
        String input = scanner.nextLine().trim();
        if (input != null && !input.isEmpty()){
          return input;
        }
      }catch (Exception e){
        printErrString(errString);
      }
    }
  }
//	    public static int inputAge(Scanner scanner) throws InvalidAgeException {
//	        while (true){
//	            try {
//	                return inputInt(scanner,"Please input int !");
//	            }catch (Exception e){
//	                throw new InvalidAgeException("The age must be greater than 0");
//	            }
//	        }
//	    }
//	    public static int inputAgeMore18(Scanner scanner) throws InvalidAgeException {
//	        while (true){
//	            try {
//
//	                return inputInt(scanner,"Please input int !");
//	            }catch (Exception e){
//	                throw new InvalidAgeException("The age must be greater than 0");
//	            }
//	        }
//	    }

}


