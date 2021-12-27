import java.util.Scanner;
public class wageandpensionsystem {



    public static double shifta=17.50, shiftb=20.00, shiftc=22.1;

    public static void main (String [] args)
    {
        double hours;
        int userrate;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your hours and shift \n  1 for morning, 2 afternnon and 3 for night");

        hours=input.nextDouble();
        userrate=input.nextInt();

        system(userrate,hours,input);

    }
    public static double get_rate(int shift){
        if (shift==1){
            return shifta;
        } else if (shift==2){
            return shiftb;
        } else if (shift==3){
            return shiftc;
        } else {
            return 0.0;
        }
    }

    public static void system(int shift, double hours, Scanner input)
    {
        double overtime=1.5;

        double pensionscheme= 0.025;

        String userinput;

        if (shift==2 || shift==3)
        {
            System.out.println("would you like to take a part in pension scheme press Y for yes and N for no");

            userinput=input.next();
            double overtimepay = 0;
            if (hours>40){
                overtimepay = (hours-40)*overtime*get_rate(shift);
                hours=40;
            }

            if (userinput.equalsIgnoreCase("y"))
            {
                double totalwage=hours*get_rate(shift)+overtimepay;
                double pensionContribution = (totalwage*pensionscheme);
                totalwage = totalwage - pensionContribution;
                System.out.println("your wage is " + totalwage + "\n and your pention contribution is "+pensionContribution);
            } else {

            }

        }





    }
}
