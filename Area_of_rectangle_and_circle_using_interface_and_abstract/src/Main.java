//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape rect=new Rectangle(10,5);
        Shape circle= new Circle(5);
        Shape_abstract rectangle=new Rectangle_abs(10,5, "Rectangle");
        Shape_abstract cirl=new Circle_abs(10, "Circle");
        rect.draw();
        System.out.println("Area of Rectangle : " + rect.area());
        circle.draw();
        System.out.println("Area of Circle : " + circle.area());
        rectangle.draw_abs();
        System.out.println("Area of Rectangle : " + rectangle.area_abs());
        cirl.draw_abs();
        System.out.println("Area of Circle : " + cirl.area_abs());
    }
}