import java.sql.Time;
import java.util.Date;
import java.util.Scanner;

public class ReactionGameTask3 {
    /* Simple reaction game using input, output and variables
     *
     *    
     * Use the main method to create a game which does the following:
     *
     * 1. Print out "Be ready!"
     * 2. sleep for 5 seconds.
     * 3. Print out "Quick, hit the enter key!"
     * 4. Wait for the key press and count the seconds.
     * 5. Prints out the seconds the user needed to press the enter button. "You took 0.8179998397827148 seconds."
     *
     */
    public static final void main(String args[]) {

        // ***** Fill in your solution here! *****

        // Scanner object
        Scanner scanner = new Scanner(System.in); 

         // Rounds variable
        int n = 1; 

        double counter = 0; 

        double timeTotal = 0;
        // it repets the loop
        while(counter < 5){    
       System.out.println("Round:" + n); 
       //increment the Rounds
       n++; 
      // Start the program
        System.out.println("Be ready!");
        sleepFor(5);
        double start = getNowSeconds();
        System.out.println("Quick, hit the Enter key!");
        scanner.nextLine();
        double End = getNowSeconds();
        System.out.println(start);
        System.out.println(End);
        double time = End - start;
         //calculate the total time and it used to calculate the avarage of the five rounds
         timeTotal = time + timeTotal;
        //print the time
        System.out.println(time);
        
        if( time <= 0.5) {
            System.out.println("Wow, you are super fast!");
        }
        else if(time >= 0.5 && time <= 0.8) {
            System.out.println("You are fast, but you should practice more!");
        }
        else if(time >= 0.8) {
            System.out.println("Are you sleeping? You are slower than a turtle!");
        }

      //increment the Rounds based on the condition
        counter++;
        // print the loop can be how many time exsicuted 
        System.out.println(counter);

    }
    //create avarage variable it can be used to calculate your avarage time reaction
    double avarage;

   //calculate the avarage
    avarage = timeTotal/counter;
    System.out.println("You played 5 rounds and your avarage time reaction is: " + avarage +  " Seconds");
    System.out.println("End");

    
    }

    // Use the methods below to create the game

    /**
     * This method pauses the program for an specific amount of seconds.
     *
     * @param seconds The duration of seconds as an Integer to pause the program.
     */
    private static void sleepFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns the number of seconds since January 1, 1970
     *
     * @return The seconds as a Double since January 1, 1970
     */
    private static double getNowSeconds() {
        return new Date().getTime() / 1000.0;
    }
}
