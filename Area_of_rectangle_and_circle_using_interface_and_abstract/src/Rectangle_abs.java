
class Rectangle_abs extends Shape_abstract{
    int length,breadth;
    Rectangle_abs(int length,int breadth, String name){
        super(name);
        this.length= length;
        this.breadth=breadth;
    }

    @Override
    public void draw_abs(){
        System.out.println("Rectangle has been drawn");
    }

    @Override
    public double area_abs(){
        return (double)(length*breadth);
    }
}

class Circle_abs extends Shape_abstract{
    double pi=3.14;
    int radius;
    Circle_abs(int radius, String name){
        super(name);
        this.radius=radius;
    }

    @Override
    public void draw_abs(){
        System.out.println("Circle has been drawn");

    }

    public double area_abs(){
        return (double) (pi*Math.pow(radius,2));
    }
}
