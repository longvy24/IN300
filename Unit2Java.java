// Long Vy
// Unit 1 Java

import java.util.Scanner; // Import the Scanner class

/* Items 1-3
public  class Unit2Java {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your Score: ");
        int grade = scanner.nextInt();

        if(grade >=90 && grade<=100){

            System.out.println("Your letter grade is: A");

        }
        else if(grade >= 80 && grade <= 89){
            
            System.out.println("Your letter grade is: B");

        }
        else if(grade >= 70 && grade <= 79){
            
            System.out.println("Your letter grade is: C");

        }
        else if(grade >= 60 && grade <= 69){
            
            System.out.println("Your letter grade is: D");

        }
        else if(grade < 60){
            
            System.out.println("Your letter grade is: F");

        }

        scanner.close();
        }

}
*/



/* Items 4-6 
public  class Unit2Java {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("******************************\n");
    System.out.print("* 1. Science Fiction          *\n");
    System.out.print("* 2. Computers and Technology *\n");
    System.out.print("* 3. Cooking                  *\n");
    System.out.print("* 4. Business                 *\n");
    System.out.print("* 5. Comics                   *\n");
    System.out.print("* 6. Exit                     *\n");
    System.out.print("******************************\n");

    System.out.println("");

int choice = 0;

while (choice != 6){
    System.out.print("Please enter a choice (1-6): ");
    choice = scanner.nextInt();

    if(choice == 1 ){

        System.out.println("You have selected Science Fiction. Watch out for the Aliens");

    }
    else if(choice == 2){
        
        System.out.println("You have selected Computers and Technology. Don't listen to the Matrix");

    }
    else if(choice == 3){
        
        System.out.println("You have selected Cooking. Cook me something first.");

    }
    else if(choice == 4){
        
        System.out.println("You have selected Business. Business is business");

    }
    else if(choice == 5){
        
        System.out.println("You have selected Comics. DC or Marvel?");

    }
    else if(choice == 6){
        
        System.out.println("Exit Program");

    }else {
        System.out.println("ERROR! Please enter a valid choice. (1-6)");
    }

}
    scanner.close();
}

}

*/

/*Item 7 */

public  class Unit2Java {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter a number value: ");
    int num = scanner.nextInt();

    for(int i = 1; i<=num; i++){
        System.out.print("Outer Loop Value: " + i + "\n");
        System.out.print("Inner Loop Value: ");

        for(int j = 1; j<= num / 2; j++){
            System.out.print (j + " ");
        }
        System.out.println();
    }

    scanner.close();
}
}