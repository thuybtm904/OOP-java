package gradleproject2;
import java.util.*;
public class bai17 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap chuoi ky tu: ");
        String s = sn.nextLine();
        s = " " + s;
        StringBuilder s1 = new StringBuilder(s);

        for (int i=1;i<s1.length();i++) {
            if (s1.charAt(i-1) == ' ' && s.charAt(i) != ' ') {
                s1.setCharAt(i, (char)(s1.charAt(i) - 32));
            }
        }

        System.out.print(s1.toString().trim());
    }
}
