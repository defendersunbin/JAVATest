class Persons {
    String name;
    String id;
    public Persons(String name) {
        this.name = name;
    }
}

class Students extends Persons {
    String grade;
    String department;
    public Students(String name) {
        super(name);
    }
}

public class DowncastingEx {
    public static void main(String[] args) {
        Persons p = new Students("신선빈");
        Students s;

        s = (Students)p;

        System.out.println(s.name);
        s.grade = "A";
    }
}