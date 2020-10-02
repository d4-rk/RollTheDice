/**
 * Muhammad Ibrahim
 * 8 September 2020
 * Block 2B
 * Roll the Dice
 * EXTRA: Allow the simulation to be run again
**/

import java.util.Scanner;

public class DiceRoller {
    public static Scanner s = new Scanner(System.in);
    public static void main(String args[]){
        boolean b = true;
        //Create a nested while loop to continue the rolling until the user doesn't want to anymore
        while(b){
            int die1 = 0, die2 = 0, rollTotal = 0, numOfRolls;
            numOfRolls = 0; //reset the number of rolls at the beginning of a set of rolls
            while(rollTotal != 7) {
                //Roll both dice:
                die1 = (int) (6 * Math.random()) + 1;
                die2 = (int) (6 * Math.random()) + 1;

                rollTotal = die1 + die2; //add the die rolls together

                //print the result of the roll
                System.out.println("The dice rolled came up a " + die1 + " and a " + die2 + " for a total of " + rollTotal);
                numOfRolls++;
            }
            System.out.println("It took " + numOfRolls + " rolls to get a 7"); //print the total results

            System.out.println("Do you want to do the rolls again? y/n"); //Ask the user to go again
            String str = s.next();
            //if the answer is yes, loop the program again, otherwise continue with the program
            if(str.equalsIgnoreCase("n"))
                b = false;
        }
    }
}
