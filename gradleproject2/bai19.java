package gradleproject2;
import java.util.*;
public class bai19 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Nhap chuoi s: ");
        String s = sn.nextLine();
        char[] ch = new char[50];
        s.getChars(0, 5, ch, 0);
        System.out.println(ch);
        System.out.println(s.substring(0, 5));
    }
}
