public abstract class Person {
    private String name;
    private String gender;

    public Person(String newName,String newGender){
        this.name = newName;
        this.gender= newGender;
    }
    public abstract void Studying();


    @Override
    public String toString() {
        return "Name = " + this.name + ":: Gender = " + this.gender;
    }
}
