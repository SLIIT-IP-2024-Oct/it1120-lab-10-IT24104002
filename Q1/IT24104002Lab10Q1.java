import java.util.Scanner;

public class IT24104002Lab10Q1 
{
    public static void main(String[] args) 
	{
        Scanner n = new Scanner(System.in);
        
        System.out.print("Enter the mark (0 - 100): ");
        int mark = n.nextInt();
        
        assert mark >= 0 && mark <= 100 : "Invalid Mark";
    System.out.print("\n");
        System.out.println("Mark is Validated");
        
        char grade = assignGrade(mark);
        System.out.println("The Grade for the Entered Mark is: " + grade);
    }
    
    public static char assignGrade(int mark) 
	{
        char grade;
        if (mark >= 75) 
		{
            grade = 'A';
        } else if (mark >= 60) 
		{
            grade = 'B';
        } else if (mark >= 50) 
		{
            grade = 'C';
        } else if (mark >= 40) 
		{
            grade = 'D';
        } else 
		{
            grade = 'F';
        }
        
        assert (mark >= 75 && grade == 'A') ||
               (mark >= 60 && mark < 75 && grade == 'B') ||
               (mark >= 50 && mark < 60 && grade == 'C') ||
               (mark >= 40 && mark < 50 && grade == 'D') ||
               (mark < 40 && grade == 'F') : "Incorrect Grade Assigned";
        
        return grade;
    }
}
