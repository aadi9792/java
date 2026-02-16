abstract class Shape {
    abstract void area();
    public Shape(){
        // System.out.println("Shape created");
    }
}


class circle extends Shape{
    int rad;
    public circle(int r){ 
        rad = r;
    }
    @Override
    public void area(){
        System.out.println("Area of circle :"+ (3.14f*(rad*rad)));
    }
}
class Rectangle extends Shape{
    int len ,bed;
    public Rectangle(int x,int y){
        len = x;
        bed = y;
    }
    @Override
    public void area(){
        System.out.println("Area of Rectangle :"+ (len*bed));
    }
}
class Triangle extends Shape{
    int base;
    int height;
    public Triangle(int x,int y){
        base = x;
        height = y;
    }
    @Override
    public void area(){
        System.out.println("Area of Trinagle :"+ (0.5f*(base*height)));
    }
}
public class AbstractTester{
    public static void main(String[] args) {
        Shape []shapes = {
            new circle(4),
            new Rectangle(4, 5),
            new Triangle(4, 8),
            new circle(5),
            new Rectangle(10, 20),
            new Triangle(5, 10)
        };

        for (Shape s: shapes){
            s.area();
        }
    }
}
