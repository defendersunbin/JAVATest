import java.util.Vector;

class Points {
    private int x, y;
    public Points(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

public class PointVectorEx {
    public static void main(String[] args) {
        Vector<Points> v = new Vector<Points>();

        //3개의 Point 객체 삽입
        v.add(new Points(2, 3));
        v.add(new Points(-5, 20));
        v.add(new Points(30, -8));

        v.remove(1);

        for(int i = 0; i < v.size(); i++) {
            Points p = v.get(i);
            System.out.println(p);
        }
    }
}