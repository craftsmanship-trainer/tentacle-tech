import java.util.Scanner;

public class OnlyDigit4 {
	//Checking whether a string contains only digits
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.next();
		char[] arr = str.toCharArray();
		int k = 0;
		int size = str.length();
		sc.close();
		for(char result: arr){
			if(Character.isDigit(result)){
				k=k+1;
			}
		}
		if(k==0){
			System.out.println("The Entered String does not contains any digits");
		}
		else if(k==size){
			System.out.println("The Entered String Contains Only Digits");
		}
		else{
			System.out.println("The Entered String Contains Some digits with Character");
		}
	}
}

