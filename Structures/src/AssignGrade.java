import java.util.Scanner;

//if-else

public class AssignGrade {
	
	public static void main(String[] args) {
		
		System.out.println("Enter yuor marks;");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.println("You have entered: " + x);
		
		if(x==50)
		{
			System.out.println("4");
		}
		
		if(x==80){
			System.out.println("1,7");
		}
		
		if(x==90){
			System.out.println("1,3");
		}
		
		if(x==100){
			System.out.println("1");
		}
		else{
			System.out.println("0");
		}
		
			
		//todo: when executing the program you will be ask to write a score.
		//The program converts the score then into a grade and prints that grade (1.0, 1.3, 1.7, ...)
		//Note that the student passed when the student gets a score of 50.0 points (4.0)
		
	}
}
