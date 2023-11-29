class Personss {};
class Studentss extends Personss {};
class Researcher extends Personss {};
class Professor extends Researcher {};

public class InstanceofEx {
    static void print(Personss p) {
        if(p instanceof Personss)
            System.out.print("Person ");
        if(p instanceof Studentss)
            System.out.print("Student ");
        if(p instanceof Researcher)
            System.out.print("Researcher ");
        if(p instanceof Professor)
            System.out.print("Professor ");
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.print("new Student() -> \t");
        print(new Studentss());
        System.out.print("new Researcher() -> \t");
        print(new Researcher());
        System.out.print("new Professor() -> \t");
        print(new Professor());
    }
}
