package reports5;

import java.util.Scanner;
//4장 12번
class Concert{
   private String S[];
   private String A[];
   private String B[];
   private Scanner scanner;
   Concert() {
      scanner = new Scanner(System.in);
      S = new String[10];
      A = new String[10];
      B = new String[10];
      for(int i=0; i<S.length; i++) {
         S[i] = "___";
         A[i] = "___";
         B[i] = "___";
      }
   }
   public static void printSeat(String seat[]) {
      for(int i=0; i<seat.length; i++) {
         System.out.print(" "+seat[i]+" " );
      }
      System.out.println();
   }
   public void allPrint() { //모든 좌석 출력 메소드
      System.out.print("S>>");
      Concert.printSeat(S);
      System.out.print("A>>");
      Concert.printSeat(A);
      System.out.print("B>>");
      Concert.printSeat(B);
      System.out.println("<<<조회를 완료하였습니다.>>>");
   }
   public void choiceSeat() { //좌석 선택(S, A, B) 메소드
      while(true) {
         System.out.print("좌석구분 S(1), A(2), B(3)>>");
         int select = scanner.nextInt();
         switch(select) {
         case 1: 
            System.out.print("S>>");
            printSeat(S);
            inputSeat(S);
            return;
         case 2:
            System.out.print("A>>");
            printSeat(A);
            inputSeat(A);
            return;
         case 3: 
            System.out.print("B>>");
            printSeat(B);
            inputSeat(B);
            return;
         default:
            System.out.println("다시 입력해 주세요.");
         }
      }
   }
   public void inputSeat(String seat[]) {
      System.out.print("이름>>");
      String name = scanner.next();
      while(true) {
         System.out.print("번호>>");
         int num = scanner.nextInt();
         num--;
         if(seat[num].equals("___")) {
            seat[num] = name;
            break;
         }
         else {
            System.out.println("다른 좌석을 선택해 주세요.");
         }
      }
   }  
   public void d_choiceSeat() {
      while(true) {
         System.out.print("좌석 S:1, A:2, B:3>>");
         int select = scanner.nextInt();
         switch(select) {
         case 1: 
            System.out.print("S>>");
            printSeat(S);
            delete(S);
            return;
         case 2:
            System.out.print("A>>");
            printSeat(A);
            delete(A);
            return;
         case 3: 
            System.out.print("B>>");
            printSeat(B);
            delete(B);
            return;
         default:
            System.out.println("다시 입력해 주세요.");
         }
      }
   }
   public void delete(String seat[]) {
      System.out.print("이름>>");
      String name = scanner.next();
      for(int i=0; i<seat.length; i++) {
         if(name.equals(seat[i])) {
            seat[i] = "___";
            break;
         }
      }
   }
}
public class Book {
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner scanner = new Scanner(System.in);
      System.out.println("명품콘서트홀 예약 시스템입니다.");
      Concert concert = new Concert();
      while(true) {
         System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
         int select = scanner.nextInt();
         switch(select) {
         case 1:
            concert.choiceSeat();
            break;
         case 2:
            concert.allPrint();
            break;
         case 3:
            concert.d_choiceSeat();
            break;
         case 4:
            scanner.close();
            return;
         default :
            System.out.println("다시 입력해 주세요.");
         }
      }
   }
}
