public class FirstClass {
    public static void main(String[] args) {
        boolean isAlien = false;
        double myFirstValue = 20.00;
        double mySecondValue = 80.00;
        double myTotalValue = myFirstValue + mySecondValue * 100;
        double theRemainder = myTotalValue % 40 ;
        boolean isNoRemainder= (theRemainder==0)?true:false;
        System.out.println("isNoRemainder is ="+isNoRemainder);
         if (!isNoRemainder)
             System.out.println("got some remainder");


    }
}
