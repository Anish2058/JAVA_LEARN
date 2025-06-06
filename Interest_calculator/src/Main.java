import java.text.NumberFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double Principle;
        float rate;
        float time;
        double Amount;
        final int No_of_months =12;
        final int Total_percent = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\n Welcome to Interest Calculator\n\n");

        System.out.print("What is the Principle amount?\n");
        Principle= scanner.nextDouble();

        System.out.println("What is the annual interest rate in percentage?");
        rate = scanner.nextFloat();
        rate= rate/Total_percent/No_of_months;

        System.out.println("What is the time period in years?");
        time= scanner.nextFloat();
        time=time*No_of_months;

        Amount= Principle * rate * (Math.pow((rate+1),time)/(Math.pow((1+rate),time)-1));

        System.out.println("The Total Amount You will get after " + time/No_of_months + " at " + rate * Total_percent * No_of_months +" Percent per year for " + NumberFormat.getCurrencyInstance().format(Principle) + " is :\n"  + NumberFormat.getCurrencyInstance().format(Amount));
    }
}
