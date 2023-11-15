package reports6;
import java.util.Scanner;

interface Stack {
   int length(); 
   int capacity(); 
   String pop(); 
   boolean push(String val); 
}
class StringStack implements Stack {
    int num; 
    int length; 
    String[] stack;
    StringStack(int num){
        this.num = num;
        this.length = 0;
        stack = new String[num];
    }
    
@Override
public int length() {
    // TODO Auto-generated method stub
    return length;
}
 
@Override
public int capacity() {
    // TODO Auto-generated method stub
    return num;
}
 
@Override
public String pop() {
    // TODO Auto-generated method stub
    if(num<-1)
    return null;
    length--;
    return stack[length];
    
}
 
@Override
public boolean push(String val) {
    // TODO Auto-generated method stub
    if(length<num) {
        stack[length] = val;
        length++;
        return true;
    }
    return false;
}
}
public class StackApp {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("총 스택의 저장 공간의 크기 입력>>");
        int num = scanner.nextInt();
        StringStack sst = new StringStack(num);
        while(true) {
            System.out.print("문자열 입력>>");
            String val = scanner.next();
            if(val.equals("그만"))
                break;
            if(!sst.push(val)) {
                System.out.println("스택이 꽉 차서 푸시 불가!");
            }
        }
         System.out.print("스택에 저장된 모든 문자열 팝 : ");
        for(int i = 0; i<num; i++) {
            String s = sst.pop();
            System.out.print(s+" ");
        }
        scanner.close();
    }
}