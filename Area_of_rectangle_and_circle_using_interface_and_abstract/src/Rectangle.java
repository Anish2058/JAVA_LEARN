public class Rectangle implements Shape{
    int length, breadth;
    Rectangle(int length,int breadth){
        this.length= length;
        this.breadth=breadth;
    }

    @Override
    public void draw(){
        System.out.println("Rectangle has been drawn");
    }

    @Override
    public double area(){
        return (double)(length*breadth);
    }
}


