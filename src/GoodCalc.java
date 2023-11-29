////추상 메서드를 포함하는 추상 클래스
//abstract class Shape {
//    public Shape() {};
//    public void paint() {
//        draw();
//    }
//    abstract public void draw();
//}

//추상 메서드 없는 추상 클래스
//abstract class myComponent {
//    String name;
//    public void load(String name) {
//        this.name = name;
//    }
//}

//abstract class Shape {
//    public Shape() {};
//    public void paint() {
//        draw();
//    }
//    abstract public void draw();
//}
//abstract class Line extends Shape {
//    public String toString() {
//        return "Line";
//    }
//}

abstract class Calculator {
    public abstract int add(int a, int b);
    public abstract int subtract(int a, int b);
    public abstract double average(int[] a);
}

public class GoodCalc extends Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public double average(int[] a) {
        int sum = 0;
        for(int i = 0; i < a.length; i++)
            sum += a[i];
        return sum / a.length;
    }
    public static void main(String[] args) {
        GoodCalc G = new GoodCalc();
        System.out.println(G.add(2,3));
        System.out.println(G.subtract(2,3));
        System.out.println(G.average(new int[] {2,3,4}));
    }
}