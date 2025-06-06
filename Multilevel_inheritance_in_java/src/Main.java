import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        area calc= new area();
        float a,b;

        System.out.print("Enter two Numbers to add:");
        a=scanner.nextFloat();
        b=scanner.nextFloat();
        System.out.println("Sum of given two number is = " + calc.add(a,b));


        System.out.print("Enter two Numbers to Subtract:");
        a=scanner.nextFloat();
        b=scanner.nextFloat();
        System.out.println("Difference of given two number is = " + calc.sub(a,b));


        System.out.print("Enter two Numbers to Multiply : ");
        a=scanner.nextFloat();
        b=scanner.nextFloat();
        System.out.println("Product of given two number is = " + calc.mul(a,b));


        System.out.print("Enter two Numbers to divide a/b :");
        a=scanner.nextFloat();
        b=scanner.nextFloat();
        System.out.println(" The value when first number is divided by second number  = " + calc.div(a,b));


        System.out.print("Enter two Numbers for modulus:");
        a=scanner.nextFloat();
        b=scanner.nextFloat();
        System.out.println("Remainder when first number is divided by second number  = " + calc.mod(a,b));

        System.out.print("Enter a Number for Square:");
        a=scanner.nextFloat();
        System.out.println("Square of Given number  = " + calc.sqr(a));

        System.out.print("Enter Number for Square root :");
        a=scanner.nextFloat();
        System.out.println("Remainder when first number is divided by second number  = " + calc.sqrt(a));

        System.out.print("Enter Length and Breadth of Rectangle:");
        a=scanner.nextFloat();
        b=scanner.nextFloat();
        System.out.println("Area of Rectangle is  = " + calc.area_of_rect(a,b));

        System.out.print("Enter Length of Square : ");
        a=scanner.nextFloat();
        System.out.println("Area of Square  = " + calc.area_of_Square(a));

        System.out.print("Enter Radius of Circle : ");
        a=scanner.nextFloat();
        System.out.println("Area of Circle is  = " + calc.area_of_circle(a));
    }
}