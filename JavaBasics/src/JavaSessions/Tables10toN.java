package JavaSessions;
import java.util.Scanner;


public class Tables10toN {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=ip.nextInt();
		
		
		for (int i=10;i>=a;i--){
			for(int j=1;j<=10;j++){
			System.out.println(i + "X" +j+ "=" +(i*j));
		}
		System.out.println("*****************");		
		}
	
	
	}
	
		

}
