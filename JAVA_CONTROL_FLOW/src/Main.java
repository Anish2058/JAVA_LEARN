import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,y,z,w;

        System.out.print("Insert First Number =");
        x=scanner.nextInt();
        System.out.print("Insert Second Number =");
        y= scanner.nextInt();

        System.out.print("Insert Third Number =");
        z=scanner.nextInt();

        System.out.print("Insert Fourth Number =");
        w=scanner.nextInt();

        //checking two given numbers are greater than or equals to or less than each other
        //comparision operator example
        //if ,else if, else loop control
        if (x==y){
            System.out.println( x + " Equal to " + y);
        } else if (x<y) {
            System.out.println(x + " is Less than " + y);
        } else{
            System.out.println(x + " is Greater than " + y);
        }

        if (z==w){
            System.out.println( z + " Equal to " + w);
        } else if (x<y) {
            System.out.println(z + " is Less than " + w);
        } else{
            System.out.println(z + " is Greater than " + w);
        }

        //Logical Operator

        if ((x==y) && (z==y)){
            System.out.println( x +" is equal to " + y +" and "+ z +" is equal to " + w );

        } else if((x!=y) && (z==w)){
            System.out.println( x +" is  not equal to " + y +" and "+ z +" is equal to " + w );
        } else if ((x==y) && (z!=w)) {
            System.out.println(x +" is equal to " + y +" but "+ z +" is not equal to " + w );
        }else{
            System.out.println("All are unequal");
        }

        //ternary operation
        int income;
        System.out.println("Enter your salary : ");
        income=scanner.nextInt();

        String ClassName = income>100_100 ? "First Class": "Economy Class";
        System.out.println(ClassName);
//Switch loop
        switch (x) {
            case 1:
                System.out.println("The first number is 1");
                break;
            case 2:
                System.out.println("The first number is 2");
                break;
            default:
                System.out.println("The first number is greater than 2");
        }

        //for loop
        for(int i=0;i<5;i++){
            System.out.println("Hello World" + (i+1));
        }

        //while loop
        int i=4;
        while(i>1){
            System.out.println("Hello world" + i);
            i--;
        }

        //program that will run until user enters quit
        String input="";
        while (!input.equals("quit")){
            System.out.println("input");
            input=scanner.next();
            System.out.println(input);
        }
        //using do while
        do {
            System.out.println("input");
            input=scanner.next();
            if(input.equals("pass")){//inserting break in the program
                continue;
            }
            if(input.equals("quit")){//inserting break in the program
                break;
            }
            System.out.println(input);
        }while (!input.equals("quit"));

        //same program can be done as

        while(true) {
            System.out.println("input");
            input=scanner.next();
            if(input.equals("pass")){//inserting break in the program
                continue;
            }
            if(input.equals("quit")){//inserting break in the program
                break;
            }
            System.out.println(input);
        }

        String[] Animals = {"Dog","Cat","Lion","Monkey"};
        //for loop
        for(int j= Animals.length; j > 0; j--){
            System.out.println(Animals[j]);
        }

        for(String Animal:Animals){
            System.out.println(Animal);
        }






    }
}