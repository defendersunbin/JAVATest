interface Phoneinterface {
    public static final int TIMEOUT = 10000;
    public abstract void sendCall();
    public abstract void receiveCall();
    public default void printLogo() {
        System.out.println("**Phone**");
    }
}

class SamsungPhone implements Phoneinterface {
    public void sendCall() {
        System.out.println("디디디");
    };
    public void receiveCall() {
        System.out.println("전화가 왔슨비다.");
    };
    public void flash() {

        System.out.println("전화기에 불이 켜졌습니다.");
    }

    public static void main(String[] args) {
        SamsungPhone S = new SamsungPhone();
        S.printLogo();
        S.sendCall();
        S.receiveCall();
        S.flash();
    }
}