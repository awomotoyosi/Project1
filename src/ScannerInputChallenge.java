import java.util.Calendar;
import java.util.Scanner;

public class ScannerInputChallenge {
   static int  minimumDob;
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        int currentYear = calendar.get(Calendar.YEAR);

         minimumDob =   currentYear - 125 ;


        int age  = calculateAge(currentYear);
        System.out.println("So you are " + age + " years old");



    }


    public static int calculateAge (int currentYear) {
        int getDob=0;
        boolean isDobValid = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, What's your name");
        String getName = scanner.nextLine();
        System.out.println("Hi "+getName+" , Thank you for taking the course");

        System.out.println("what year were you born");
        do {
        System.out.println("Enter a year between "+ minimumDob+" and "+ currentYear);
try {
    getDob = checkData(scanner.nextLine());
    isDobValid = getDob < 0 ? false : true;
}

catch(NumberFormatException badUserData){
    System.out.println("Characters are not allowed !!! Try again");

}
        }      while (!isDobValid) ;



        return currentYear - getDob;
    }

    public static int checkData(String dob){

       int getDob = Integer.parseInt(dob);
            if (getDob<minimumDob){

            return -1;
        }

            return getDob;

    }


}
