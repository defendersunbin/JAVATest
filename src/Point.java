public class Point {
    private int x, y;
    public void set(int x, int y) {
        this.x = x; this.y = y;
    }
    public void showpoint() {
        System.out.println("(" + x + "," + y + ")");
    }
    class Colorpoint extends Point {
        private String color;
        public void setColor(String color) {
            this.color = color;
        }
        public void showColorpoint() {
            System.out.print(color);
            showpoint();
        }
        public class ColorPointEx {
            public void main(String[] args) {
                Point p = new Point();
                p.set(1,2);
                p.showpoint();

                Colorpoint cp = new Colorpoint();
                cp.set(3,4);
                cp.setColor("red");
                cp.showColorpoint();
            }
        }
    }
}
