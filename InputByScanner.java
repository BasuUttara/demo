import java.util.Scanner;

public class InputByScanner{
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter any number : ");
		int i = Integer.parseInt(kb.nextLine());
		
		System.out.println("Your input is  : "+i);
	}
}