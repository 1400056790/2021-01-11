package jisuan_area;

public class Square extends Shape {
    private float a;

    public Square(float a) {
        this.a = a;
    }

    public float calcArea(){
        float b= a*a;
        System.out.println("计算正方形的面积"+b);
        return 0;
    }
}
