//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //coding in terms of abstract class
        Person student = new Student("Anish", "Male", 1);
        Person student1 = new Student("Manish", "Male", 1);
        Person student2 = new Student("Nisha", "Female", 0);
        System.out.println(student);
        student.Studying();
        System.out.println(student1);
        student1.Studying();
        System.out.println(student2);
        student2.Studying();
    }
}