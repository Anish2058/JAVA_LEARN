public class Baseclass {
    protected void display(){
        System.out.println("Parent Class Method");
    }
}

class childclass extends Baseclass{
    public void display(){
        System.out.println("Child Class Method");
    }
}
