public class Calculator {

    public float add(float a,float b){
        return  a+b;
    }

    public float sub(float a, float b){
        return a-b;
    }

    public float mul(float a, float b){
        return a*b;
    }

    public float div(float a, float b){
        return a/b;
    }
}

class advance extends Calculator{
    public float mod(float a,float b){
        return  a%b;
    }

    public float sqr(float a){
        return a*a;
    }

    public double sqrt(float a){
        return Math.sqrt(a);
    }
}

class area extends advance{
    public float area_of_rect(float a, float b){
        return a*b;
    }

    public float area_of_Square(float a){
        return a*a;
    }

    public double area_of_circle(float a){
        return Math.PI*a*a;
    }
}

