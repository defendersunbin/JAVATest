class People {
    String name;
    String id;
    public People(String name) {
        this.name = name;
    }
}

class sdent extends People {
    String grade;
    String deparment;
    public sdent(String name) {
        super(name);
    }
}

public class UpcastingEx {
    public static void main(String[] args) {
        People p;
        sdent s = new sdent("신선빈");
        p = s;

        s = (sdent)p;

        System.out.println(p.name);
    }
}