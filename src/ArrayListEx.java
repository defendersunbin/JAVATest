import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();

        //키보드로 부터 4개의 이름 입력받아 ArrayList에 삽입
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 4; i++) {
            System.out.println("이름을 입력하시오. >> ");
            String s = scanner.next();
            a.add(s);
        }
        //ArrayList에 들어있는 모든 이름 출력
        for(int i = 0; i < a.size(); i++) {
            String name = a.get(i);
            System.out.print(name + " ");
        }
        //가장 긴 이름 출력
        int longestIndex = 0;
        for(int i = 1; i < a.size(); i++) {
            if(a.get(longestIndex).length() < a.get(i).length())
                longestIndex = i;
        }
        System.out.println("\n가장 긴 이름은: " + a.get(longestIndex));
            a.get(longestIndex);
    }
}