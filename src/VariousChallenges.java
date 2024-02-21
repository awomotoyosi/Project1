import java.util.Scanner;

public class VariousChallenges {

    public static void main(String[] args) {


        // System.out.println("The new height is "+ convertToCentimeters(200));

        //   System.out.println("The new height is "+ convertToCentimeters(400,28));
        // System.out.println (getDurationString(-56))  ;
        //  System.out.println (getDurationString(65,45))  ;

        //switchStatement();

        //  printDayOfWeek(2);

        // int printNoOfDays = getDaysInMonth(5,2023);
        // System.out.println("The result is "+ printNoOfDays +" number of days");


        //for (double i = 7.5; i <= 10; i += 0.25) {
        //   double interestAmount = calculateInterest(100, i);
        //   System.out.println("$100.00 at " + i + "% = " + interestAmount + "$");
        // }


        // COUNT THE NUMBER OF PRIMENO THAT EXISTS WITHIN A RANGE
//int counter= 0;
        //for (int i= 30; i<=100; i++){
        //if(isPrime(i) )   {
        // counter = counter + 1;

        // System.out.println(i+ " is a primeNumber");
        // if(counter==3){
        //   System.out.println("Found 3- Exiting for loop");
        //break;
        // }

        //  }

        // }


        //SUM 3 AND 5 CHALLENGE
        //int counter =0;
        //int sumOfTheNumbers=0;
        //for (int i =1; i<=1000 ;i++){

        //if ((i%3==0)&& (i%5==0)){

        //  System.out.println("number "+ i + " meets the condition");
        // counter++;

        // sumOfTheNumbers = sumOfTheNumbers + i;
        // if (counter==5){
        //   System.out.println ("The sum of all the numbers is "+sumOfTheNumbers );
        //   break;

        //   }
        //   }


        // }
//        int rangeOfNumbers =4;
//        int evenCounter=0;
//        int oddCounter=0;
//
//        while (rangeOfNumbers <=20) {
//            rangeOfNumbers++;
//            if (!isEvenNumber(rangeOfNumbers)) {
//                oddCounter++;
//                continue;
//            }
//            evenCounter++;
//
//            System.out.println(rangeOfNumbers+"_");
//            if(evenCounter >= 5){
//                break;
//            }
//
//            //System.out.print("The total number of even number is "+evenCounter);
//
//
//        }
//        System.out.println("The total number of odd number is "+oddCounter);
//        System.out.println("The total number of even number is "+evenCounter);
//
//        int num = 11, reverse = 0, rem;
//

        //loop to find reverse number
//        while (num != 0)
//        {
//            rem = num % 10;
//            reverse = reverse * 10 + rem;
//            num /= 10;
//        };
//
//        //output
//        System.out.println ("Reversed Number: " + reverse);


        //  System.out.println("Sum is + "+ getEvenDigitSum(123456789));

        // printFactors(10);

        //System.out.println("The primeNumbers are : "+ getLargestPrime(100));

   // readIntegersFromConsole();

        storeMiNAndMaxNumber();
    }
    //  System.out.println(isPrime(31));





    //Overloaded Method challenge

    public static double convertToCentimeters(int heightInInch) {
        return heightInInch * 2.54;


    }

    public static double convertToCentimeters(int heightInFeet, int heightInInch) {
        double feetToInches = heightInFeet * 30.48;
        double InchToCm = heightInInch * 2.54;
        double result = feetToInches + InchToCm;
        return result;


    }

    //Seconds and Minute challenge
//Seconds to XXh YYm ZZs
    public static String getDurationString(int seconds) {

        if (seconds >= 0) {


            int secondsToHour = seconds / 3600;
            int secondsToMinutes = (seconds % 3600) / 60;
            int remainder = (seconds % 3600) % 60;
            String result = (secondsToHour + "h " + secondsToMinutes + "m " + remainder + "s");
            return result;
            //int minutes=0;
            //return getDurationString(minutes, seconds);

        }
        return "Invalid data for seconds (" + seconds + ") ,must be a positive Integer value";
    }

    //// Minutes & Seconds to XXh YYm ZZs
    public static String getDurationString(int minutes, int seconds) {

        if (seconds >= 0 && seconds <= 59 && minutes >= 0) {

            int minutesToSeconds = minutes * 60;
            int totalSeconds = minutesToSeconds + seconds;
            int secondsToHour = totalSeconds / 3600;
            int secondsToMinutes = (totalSeconds % 3600) / 60;
            int remainder = (totalSeconds % 3600) % 60;
            String result = (secondsToHour + "h " + secondsToMinutes + "m " + remainder + "s");
            return result;
        }
        return "Invalid data for seconds (" + seconds + ") ,must be a positive";
    }

    // Area of circle && rectangle
    public static double area(double radius) {

        if (radius >= 0) {

            double areaOfACircle = Math.PI * (Math.pow(radius, 2));
            return areaOfACircle;
        }
        return -1.0;

    }

    public static double area(double x, double y) {

        if (x >= 0 && y >= 0) {
            double areaOfARectangle = x * y;
            return areaOfARectangle;
        }
        return -1.0;
    }

    //Traditional switch statement condition
    public static void switchStatement() {

        char alphabets = (char) 'k';
        switch (alphabets) {
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;

            default:
                System.out.println("not found");
                break;
        }
    }

    public static void printDayOfWeek(int day) {

        String dayOfWeek = switch (day) {

            case 0 -> ("Sunday");
            case 1 -> ("Monday");
            case 2 -> ("Tuesday");
            case 3 -> ("Wednesday");
            case 4 -> ("Thursday");
            case 5 -> ("Friday");
            case 6 -> ("Saturday");
            default -> ("Invalid day");

        };

        System.out.println(day + " stands for " + dayOfWeek);
    }
// Days in every month challenge

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {

            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
        return false;

    }

    public static int getDaysInMonth(int month, int year) {
        boolean leapYear = isLeapYear(year);
        if (leapYear && month == 2) {
            return 29;
        } else if (!leapYear && month == 2) {
            return 28;
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) && (year >= 1 && year <= 9999)) {
            return 30;
        } else if ((month == 1 || month == 2 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (year >= 1 && year <= 9999)) {
            return 31;
        }
        return -1;

    }

    public static double calculateInterest(int amount, double interestRate) {
        double rate;


        return amount * (interestRate / 100);


    }

    // check for prime numbers
    public static boolean isPrime(int wholenumber) {
        int divisor = 0;
        if (wholenumber<=1){
            return false;
        }

        for (divisor = 2; divisor < wholenumber; divisor++) {
            if (wholenumber % divisor == 0) {


             return false;
            }

}

        return true;

    }


    public static boolean isEvenNumber(int number) {

        if (number % 2 == 0) {

            return true;
        }
        return false;
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        int lastDigit = 0;
        int i = number;
        if (number < 0) {

            return -1;
        }
        while (i != 0) {
            lastDigit = i % 10;
            i = i / 10;


            if (lastDigit % 2 == 0) {
                sum = sum + lastDigit;
            }

        }
        return sum;
    }


    public static boolean hasSharedDigit(int number1, int number2) {
        int number1FirstDigit = 0, number1LastDigit = 0, number2FirstDigit = 0, number2LastDigit = 0;
        if ((number1 >= 10 && number1 <= 99) && (number2 >= 10 && number2 <= 99)) {

            number1FirstDigit = number1 / 10;
            number1LastDigit = number1 % 10;
            number2FirstDigit = number2 / 10;
            number2LastDigit = number2 % 10;
            if (number1FirstDigit == number2FirstDigit || number1LastDigit == number2LastDigit) {

                return true;
            } else if (number1FirstDigit == number2LastDigit || number1LastDigit == number2FirstDigit) {

                return true;
            }

        }
        return false;
    }

    // PRINT FACTORS OF A NUMBER
    public static void printFactors(int number) {

        if (number < 1) {

            System.out.println("Invalid value");

        }

        for (int i = 0; i <= number; i++) {
            try {
                if (number % i == 0) {

                    System.out.println(i);
                }
            } catch (ArithmeticException e) {
                System.out.println(e);

            }
        }
    }

    public static int getLargestPrime(int number) {

        if (number < 2) {
            return -1;
        }

        int factor = -1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i != 0) {
                continue;
            }
            factor = i;
            while (number % i == 0) {
                number /= i;
            }
        }
        return number == 1 ? factor : number;
    }


//Reading User Input Challenge;

    public static void readIntegersFromConsole(){
int sum=0;
        String number;
        System.out.println("Enter 5 valid integer");
        Scanner scanner = new Scanner(System.in);
        for (int i=1; i<=5;i++){
            do {
                System.out.println("Enter number " + i);
                 number = scanner.nextLine();
            }
            while (checkInput(number) == -1) ;
            sum = sum + checkInput(number);






        }
        System.out.println("The sum is "+sum);

    }





    public static int checkInput (String number ){
try {
    Integer integernumber1 = Integer.parseInt(number);
    return integernumber1;
}
catch (NumberFormatException badUserData){
            System.out.println("Invalid number");
        }

      return -1;
    }

public static void storeMiNAndMaxNumber () {
    boolean isConvertedInput = false;

    Double max = 0.0;
    Double min = 0.0;
    int loopCount = 0;
    Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.println("Enter a number ,or any character to exit");
        String validInput = scanner.nextLine();
        try {
            Double convertedInput = Double.parseDouble(validInput);
            if (loopCount == 0 || convertedInput < min) {
                min = convertedInput;
            }
            if (loopCount == 0 || convertedInput > max) {
                max = convertedInput;
            }
        } catch (NumberFormatException badUserData) {
            break;
        }
loopCount++;
    }
    if (loopCount>0){

        System.out.println("min ="+ min + " , max ="+ max);
    }
    else{
        System.out.println("no valid data entered");
    }
}

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long avg = 0;

        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (!hasNextInt) {
                // break the loop on invalid input
                break;
            }
            sum += scanner.nextInt();
            count++;
            // clear buffer e.g. remove line separator
            scanner.nextLine();
        }

        if (count > 0) {
            avg = Math.round((double) sum / count);
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }

}


