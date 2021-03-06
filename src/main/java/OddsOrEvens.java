import java.util.*;


/*
Part 1 - Pick odds or evens
Create a new java file called "OddsAndEvens".
Add a println that produces the following output:
Let’s play a game called “Odds and Evens”
Ask the user for their name and then use a scanner to let them type their name into the consol.
What is your name?
Now greet the user and ask them to choose either odds or evens. Use a scanner to let them type in either "O" or "E".
Hi name, which do you choose? (O)dds or (E)vens?
NOTE: To compare Strings you can’t use ==, you must use .equals(). For example, your code might look like:

string1.equals(string2)
Using an if/else statement print out whether the user chose "odds" or "evens".
name has picked odds! The computer will be evens.
Or

name has picked evens! The computer will be odds.
Finally add a println that produces a bunch of "-" characters to separate this stage from the others in your output.
*/

/*Part 2 - Play the Game
Now you are going to be adding the actual game play to your game.

Ask the user how many "fingers" they are going to play, and let them enter in a number.
How many “fingers” do you put out?
Add the following code to your program to let the computer choose a random number to represent their fingers:
Random rand = new Random();
int computer = rand.nextInt(6);
NOTE: you must make 1 more change to your code to make this work. Random must be imported, but it is part of the same "package" as Scanner so just change your import statement at the top from

import java.util.Scanner to import java.util.*;
Add a println that tells the user how many fingers the computer played.
The computer plays number "fingers".
Add another line of "-" characters to separate this part of your output from the results.
Now you need to determine what the results are.
Add the user’s number and the computer’s numbers together to get the sum.
Add a println that will print out the math to show the user.
userNumber + computerNumber = sum
Now you need to figure out if the sum is odd or even. You can use the % or "mod" operator to do so. The mod operator returns the reminder, any number % 2 with a remainder of 0 (meaning it is perfectly divisible by 2) is even, any number % 2 with a remainder of 1 is odd. Here is the code you can use:
boolean oddOrEven = sum % 2 == 0;
oddOrEven will be true if sum us even, it will be false if sum is odd.

Now use an if/else statement to print out whether sum was odd or even.
Add another line of “-“ characters to end your program.
Here is an example of the output your stage two should produce:
*/

/*Part 3 - Who won?
Now that we know the results, it’s time to decide who the winner is!

Inside your if/else statement that prints out odd or even you are going to add another set of if/else statements to tell who the winner is, based on what the player chose back in stage 1. Here is some "pseudo code" (notation resembling simplified code, not real code) that you can use to write the real code.

if (the sum was even) {
   print out even
   if (the user chose evens) {
      the user wins
   } else {
      the computer wins
} else {
   // inverse of above if statement
}
 */
public class OddsOrEvens {

    // variável de classe para que posse ser acedida por qlqr método static
    public static String name = "";
    public static String resp = "";

    public static void main(String[] args) {
        part1();
        part2();
    }


        //PART1
        public static void part1(){

        System.out.println("Let’s play a game called 'Odds and Evens'");
        System.out.println("What is your name?");

        //Ask the user for their name and then use a scanner to let them type their name into the consol.
        Scanner input1 = new Scanner(System.in);
        name = input1.nextLine();

        //Now greet the user and ask them to choose either odds or evens. Use a scanner to let them type in either "O" or "E".
        System.out.println("Hi " + name +", which do you choose? (O)dds or (E)vens?");


        Scanner input2 = new Scanner(System.in);
        resp = input2.nextLine();

        //accepts "o", "O", "e" or "E"while
        while (!resp.equals("o") && !resp.equals("e") && !resp.equals("O") && !resp.equals("E")){
            System.out.println(name +", please choose: (O)dds or (E)vens?");
            resp = input2.nextLine();
        }

        if( resp.equals("O") || resp.equals("o")){
            System.out.println(name + " has picked odds! The computer will be evens.");
        } else {
            System.out.println(name + " has picked evens! The computer will be odds.");
        }

        System.out.println("--------------------------------------------");

    }

        //PART2
        public static void part2() {

            //System.out.println(name + ", how many \"fingers\" are you going to play?");
            System.out.println(name + ", how many \"fingers\" are you going to play?");

            Scanner input3 = new Scanner(System.in);
            int fingers = input3.nextInt();

            //Random value for the computer
            Random rand = new Random();
            int computer = rand.nextInt(6);

            System.out.println("The computer plays " + computer + " \"fingers\".");

            System.out.println("--------------------------------------------");

            int sum = computer + fingers;

            if (sum % 2 == 0) {
                System.out.println("The result is " + sum + ", so it is Even.");

                //PART3
                if ( resp.equals("e") || resp.equals("E")) {
                    System.out.println(name + " wins!");
                } else {
                    System.out.println("Computer wins!");
                }
            } else {
                System.out.println("The result is " + sum + ", so it is Odd.");
                if ( resp.equals("o") || resp.equals("O")) {
                    System.out.println(name + " wins!");
                } else {
                    System.out.println("Computer wins!");
                }
            }

            System.out.println("--------------------------------------------");

        }



}
