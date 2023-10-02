class Test {
    public static void main(String[] arg) {
        Shape s;
        int ret;
        s = new Circle();
        ret = s.foo();
        System.out.println(ret);
    }
}

class Shape {
    public int foo() {
        Shape s;
        Circle c;
        Square sq;
        int val;
        int ret;
        int circle_diameter;
        int circle_radius;
        int circle_area;
        int circle_t1;
        int circle_t2;
        int circle_t3;
        s = new Circle();
        val = 10;
        circle_diameter = val;
        circle_t2 = 2;
        circle_t3 = 3;
        circle_radius = circle_diameter / circle_t2;
        circle_t1 = circle_radius * circle_radius;
        circle_area = circle_t1 * circle_t3;
        ret = circle_area;
        return ret;
    }

    public int computeArea(int val) {
        return val;
    }
}

class Circle extends Shape {
    public int computeArea(int diameter) {
        int radius;
        int area;
        int t1;
        int t2;
        int t3;
        t2 = 2;
        t3 = 3;
        radius = diameter / t2;
        t1 = radius * radius;
        area = t1 * t3;
        return area;
    }
}

class Square extends Shape {
    public int computeArea(int side) {
        int area;
        area = side * side;
        return area;
    }
}