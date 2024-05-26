import java.util.*;
import java.lang.*;
public class Number_Guessing_Game {
    public static void main(String[] args) {
        Random obj= new Random();
        int number=obj.nextInt(101); //GENERATING RANDOM NUMBER
        Scanner sc=new Scanner(System.in);
        int userinput,score;
        int attempts=0;
        int rounds=1;
        for(int i=0;i<=6;i++)
        {
            attempts+=1;

            //WELCOME MESSAGES
            if(i==0)
            {
                System.out.println("WELCOME TO NUMBER GUESSING GAME");
                System.out.println("HOW TO PLAY: A RANDOM NUMBER WILL BE GENERATED. ENTER A GUESS AS TO WHAT IT IS. IF NUMBER ENTERED IS WRONG, IT WILL BE DISPLAYED IF IT IS GREATER OR LESSER THAN THE CORRECT NUMBER.");
                System.out.println("NUMBER OF ATTEMPTS ALLOWED: 5");
                System.out.println("GOOD LUCK!");
                System.out.println("......................");
                System.out.println("NUMBER IS GENERATED, ENTER A GUESS!");

            }
            //WELCOME MESSAGES END

            userinput = sc.nextInt(); //TAKING USER'S GUESS

            //CHECKING NUMBER

            //WIN
            if(userinput==number)
            {
                System.out.println("You Win!");
                score=attempts*rounds*100;
                System.out.println("Score = "+score);
                System.out.println("Enter 1 to start another round, 2 to end game.");
                int choice=sc.nextInt();
                switch(choice)
                {
                    case 1: i=-1;
                        number=obj.nextInt(101);
                        rounds+=1;
                        break;
                    case 2: System.out.println("TT Game Over! Thanks for playing!");
                        System.exit(0);
                        break;
                    default: System.out.println("Wrong input! Game Over.");
                        break;
                }
            }
            //WIN END

            //LOSE
            if(userinput>number)
            {
                System.out.println("Oops! Guess is greater than number.");
            }
            if(userinput<number)
            {
                System.out.println("Oops! Guess is lower than number.");
            }
            //LOSE END

            // END OF ATTEMPTS
            if(i==5)
            {
                System.out.println("Oops! End of Attempts. The number was " + number + " Enter 1 to start another round, 2 to end game.");
                int c=sc.nextInt();
                switch(c)
                {
                    case 1: i=-1;
                        number=obj.nextInt(101);
                        rounds+=1;
                        break;
                    case 2: System.out.println("TT Game Over! Thanks for playing!");
                        System.exit(0);
                        break;
                    default: System.out.println("Wrong input! Game Over.");
                        break;
                }}
            //END OF ATTEMPTS END

        }
    }

}

