package reports5;

import java.util.Scanner;
//4장 10번
class Dictionary {
   private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
   private static String[] eng = {"love", "baby", "money", "future","hope"};
   public static String kor2Eng(String word) {
      for(int i=0; i<kor.length;i++) {
         if(word.equals(kor[i])) {
            if(i%2==0) 
               System.out.print(word+"은 ");
            else
               System.out.print(word+"는 ");
            return eng[i];
         }
      }
      return "오류";
   }
}

public class DicApp {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner scanner = new Scanner(System.in);
      System.out.println("한영 단어 검색 프로그램입니다.");
      while(true) {
         System.out.print("한글 단어?");
         String search = scanner.next();
         if(search.equals("그만")) break;
         String eng = Dictionary.kor2Eng(search);
         if(eng.equals("오류"))
            System.out.println(search+"는 저의 사전에 없습니다.");
         else 
            System.out.println(eng);
      }
      scanner.close();
   }
}
