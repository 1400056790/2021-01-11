package jisuan_area;

public class Triangle extends Shape {
    private float bottom;
    private float height;

    public Triangle(float bottom, float height) {
        this.bottom = bottom;
        this.height = height;
    }

    @Override
    public float calcArea() {
        float c=bottom*height/2;
        System.out.print("计算三角形的面积");
        return c;
    }
}
