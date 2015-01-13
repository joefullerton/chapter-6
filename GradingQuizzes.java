import java.util.Scanner;

public class GradingQuizzes
{
  public static void main(String[] args)
  {
    int questions = 0;
    int answers = 0;
    int right = 0;
    int incorrect = 0;
    double percent;
    Scanner scan = new Scanner(System.in);
    String choice = "y";
    
    
    System.out.println("How many questions are on the quiz?");
    questions = scan.nextInt();

    int[] key = new int[questions];
    for (int i = 0; i < key.length; i++)
    {
      System.out.print("Please enter the answer key: ");
      key[i] = scan.nextInt();
    }
    int[] answerSelected = new int[questions];
   
   while(choice.equalsIgnoreCase("y"))
   {
    for (int i = 0; i < answerSelected.length; i++)
    {
      System.out.print("Enter the answers chosen: ");
      answerSelected[i] = scan.nextInt();

    }

    for (int i = 0; i < key.length; i++)
    {
      if (key[i] == answerSelected[i])
      {
        right++;
      }
      else
      {
        incorrect++;
      }

    }
    System.out.println("The answers correct are " + right);
    System.out.println("The incorrect answers are " + incorrect);
    
    percent = (((double)right / questions) * 100);
    System.out.println("The percent correct is " + percent + "%");
    
    System.out.println("Would you like to grade another quiz?");
    choice = scan.next();
  }
}
}  