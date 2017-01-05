import java.util.Scanner;

public class GregoryApproxRunner {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How much accuracy do you want to use?");
		int accuracy = keyboard.nextInt();
		System.out.println(GregoryApproximation.calculate(accuracy) + " is pi");
	}
}
