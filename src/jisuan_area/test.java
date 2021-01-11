package jisuan_area;

public class test {
    public static void main(String[] args) {
       /*未面向抽象版 Square square=new Square(5);
        System.out.println(square.calcArea());

        Triangle triangle=new Triangle(5,6);
        System.out.println(triangle.calcArea());
        */

       Shape shape=new Square(6);
       shape.calcArea();
       Shape p=new Triangle(5,6);
       System.out.println(p.calcArea());
    }
}
