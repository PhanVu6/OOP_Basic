package hus.oop.lab4.mytriangle;

import hus.oop.lab4.point.MyPoint;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("MyTriangle[v1 = %s, v2 = %s, v3 = %s]", v1, v2, v3);
    }

    public double getPerimeter() {
        double perimeter = 0.0;
        perimeter = v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
        return perimeter;
    }

    public String getType() {
        if (v1.distance(v2) == v2.distance(v3) && v2.distance(v3) == v3.distance(v1)) {
            return "Equilateral";
        } else if (v1.distance(v2) == v2.distance(v3) || v2.distance(v3) == v3.distance(v1)
                || v3.distance(v1) == v1.distance(v2)) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}
