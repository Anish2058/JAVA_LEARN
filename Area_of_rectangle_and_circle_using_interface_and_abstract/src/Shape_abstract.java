public abstract class Shape_abstract {
    String objectname = "" ;
    Shape_abstract(String name){
        this.objectname=name;
    }

    abstract public double area_abs();
    abstract public void draw_abs();
}
