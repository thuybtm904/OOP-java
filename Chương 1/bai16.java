
package gradleproject2;
import java.util.*;
public class bai16 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap chuoi ky tu: ");
        String s = sn.nextLine();
        s = s.trim();
        StringTokenizer s1 = new StringTokenizer(s);
        System.out.print(s1.countTokens());
        
        
    }
}
