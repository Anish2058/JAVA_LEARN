public class person {
    //private field ... cannot be accessed directly from outside
    private String name ;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newname) {
        name = newname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newage) {
        if(newage>0) {
            age = newage;
        }
    }
}
