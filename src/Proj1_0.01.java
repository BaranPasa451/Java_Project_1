import java.util.Scanner;
class Proj1001 {
    /*
    * Below is a colletction of practice code blocks, expressions, etc.
    */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // NOTE you only need one of these to have multiple inputs.

        System.out.print("Please enter your age: "); // notice how it is not println
        int number = input.nextInt();

        System.out.print("What is your name? Please enter here: ");
        String userName = input.next();

        System.out.println("Hello World!");
        boolean Running = true;
        System.out.println(Running);
        byte Old_Age = 101;
        System.out.println(Old_Age);
        String thisString = "Hello There!";
        System.out.println(thisString);

        if (number > 100){
            System.out.println("Hello " + userName + "." + " Wow that is old! " + number + " years old!");
            }
        else if (number < 6){
            System.out.println("Wow " + userName + ", you are young! Only " + number + " years old!");
        }
        else{
            System.out.println("Hello " + userName + "." + " Ok so you are still young! Only " + number + " years old!");
        }
        input.close();

        // This method works for one liner commands
        switch (number) {
            case 50 -> System.out.println("You have lived for 50 decades!");
            case 100 -> System.out.println("Woah, you lived for a century!");
            case 18 -> System.out.println("You're now an adult!");
            default -> System.out.println("Wow, you look good for your age ha ha ha!");
        }
        int week = 4;
        String day;

        // Less concise method
        switch (week) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            // match the value of week
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid day";
                break;
        }
        System.out.println("The day is " + day);

        // here is the long awaited FOR LOOP

        for (int carSpeed = 12; carSpeed < 60;++ carSpeed){
            // Instead of: carSpeed = carSpeed + 1 (as in python) it is the last part of the loop
            System.out.println("You are still going under the speed limit at " + carSpeed + " per hour");
        }

        // Below is a for-each loop
        char [] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vowels.length; ++i){
            System.out.println(vowels[i]);
        }
    }
}