import java.util.*;
import java.lang.*;
public class MyClass{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int area = a*a;
        int per = 4*a;
        System.out.println(area+" "+per);
    }
}