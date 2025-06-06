import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static void convertDateFormat(String inputDate){
        try{
            SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
            Date date =sdf.parse(inputDate);
            SimpleDateFormat outputsdf= new SimpleDateFormat("yyyy-MM-dd");
            String outputDate= outputsdf.format(date);
            System.out.println("After changing date format to yyyy/mm/dd : " +outputDate);
        }catch(java.text.ParseException e){
            System.out.println("Some error occured while converting date");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter date in dd/mm/yyyy format : ");
        String inputDate=scanner.nextLine();
        convertDateFormat(inputDate);
    }
}