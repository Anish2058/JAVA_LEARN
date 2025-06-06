public class Student extends Person {
    private int StudentID;

    public Student(String newName,String newGender, int newID){
        super(newName,newGender);
        this.StudentID=newID;
    }

    @Override
    public void Studying() {
        if(StudentID==0){
            System.out.println("NOt Studying");
        }else{
            System.out.println("Pursuing a Degree in Bachelor of Electronics, Communication and Information Engineering");
        }
    }
}
