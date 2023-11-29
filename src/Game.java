//import java.util.Scanner;
//
//class Dice {
//    private final int MAX = 6;
//    private int faceValue;
//
//    public Dice() {
//        faceValue = 1;
//    }
//
//    public int roll() {
//        faceValue = (int)(Math.random() * MAX) + 1;
//        return faceValue;
//    }
//}
//
//public class Game {
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        System.out.print("참가자 수(2~6): ");
//        int playerCount = scanner.nextInt();
//
//        if(playerCount < 2 || playerCount > 6) {
//            System.out.println("참가자 수는 2명에서 6명 사이여야 합니다.");
//            return;
//        }
//
//        String[] players = new String[playerCount];
//
//        for(int i=0; i<playerCount; i++) {
//            System.out.printf("%d번째 참가자 이름 입력: ", i+1);
//            players[i] = scanner.next();
//        }
//
//        int[] wins = new int[playerCount];
//
//        System.out.println("** 지금부터 게임을 시작합니다. **");
//
//        for(int game=0; game<6; game++){
//            System.out.printf("Game #%d ",game+1);
//                playRound(players,wins);
//            System.out.print("게임을 계속하시겠습니까? (y/n): ");
//            String continueGame = scanner.next().toLowerCase();
//
//            if(!continueGame.equals("y")) break;
//
//            System.out.println();
//        }
//
//        printResults(players,wins);
//
//        scanner.close();
//
//    }
//
//    private static void playRound(String[] players,int[] wins){
//
//        Dice dice=new Dice();
//
//        int maxScore=0,winner=0;
//
//        for(int i=0;i<players.length;i++){
//
//            System.out.printf("%s님 차례입니다. 주사위를 던지려면 1을 입력하세요: ",players[i]);
//            int input=scanner.nextInt();
//
//            if(input==1){
//                int score=dice.roll()+dice.roll();
//                System.out.printf("주사위의 합은 %d입니다. ",score);
//
//                if(score>maxScore){
//                    maxScore=score;
//                    winner=i;
//                }
//            }
//
//        }
//
//        System.out.printf("이번 게임의 승자는 %s입니다. ",players[winner]);
//
//                wins[winner]++;
//
//    }
//
//    private static void printResults(String[] players,int[] wins){
//
//        int totalRounds=0;
//
//        for(int win:wins)
//            totalRounds+=win;
//
//        System.out.println("전체 게임 수: "+totalRounds);
//
//        for(int i=0;i<wins.length;i++)
//            System.out.printf("%s %d승 ",players[i],wins[i]);
//
//    }
//}
