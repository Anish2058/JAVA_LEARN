import java.util.*;

public class Constructor {
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<String>();
        int counter=0;
        for (String s:a){
            counter++;
        }
        System.out.println("No Arguments:  " + counter +("counts"));

        ArrayList<String> b=new ArrayList<String>(30);
        counter=0;
        for (String s:b){
            counter++;
        }
        System.out.println("No Arguments  : " + counter );
        System.out.println();

        String sArray[]={"Cat","Dog","Man"};
        List<String> list = Arrays.asList(sArray);
        ArrayList<String> c = new ArrayList<String>(list);
        c.add("Hen");

        for (String s:c){
            System.out.println("ArrayList c element : " +s);

        }

        System.out.println(c);
    }
}

