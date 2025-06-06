public class Circle implements Shape{
    double pi=3.14;
    int radius;
    Circle(int radius){
        this.radius=radius;
    }

    @Override
    public void draw(){
        System.out.println("Circle has been drawn");

    }

    public double area(){
        return (double) (pi*Math.pow(radius,2));
    }
}
