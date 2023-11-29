import java.util.Scanner;

class CoffeePrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("무슨 커피로 드릴까요?: ");
        String order = scanner.next();
        int price = 0;
        switch(order) {
            case "에스프레소":
            case "아메리카노":
            case "카페라떼":
                price = 3500;
                break;
            case "모카라떼":
                price = 4000;
                break;
            default:
                System.out.println("메뉴에 없는 음료입니다.");
        }
        if(price != 0)
            System.out.print(order + "는 " + price + "원입니다.");
        scanner.close();
    }
}