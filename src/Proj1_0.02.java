import java.util.Scanner;

class Proj002 {
    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);

        System.out.print("What is the targer number?");
        double targNum = input.nextDouble();

        System.out.println(targNum);
        double i = 0.01;
        while (i < targNum){
            double difNum = targNum - i;
            System.out.println("Difference: " + difNum);
            ++i;
        }

        Scanner secInput = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        double num = secInput.nextDouble();

        do{
            System.out.print("Here are the three numbers: " + targNum + ", " + i + ", " + num);
            num = ++num + i/targNum;
        }while(num <= targNum);
    }
}