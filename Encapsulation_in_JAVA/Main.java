//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        person p =new person();
        p.setName("Anish");
        p.setAge(23);

        System.out.println("Name :  " + p.getName());
        System.out.println("Age : " + p.getAge());
    }
}