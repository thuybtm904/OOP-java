package gradleproject2;
import java.util.*;
public class bai18 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Nhap a: ");
        String a = sn.nextLine();
        System.out.println("Nhap b: ");
        String b = sn.nextLine();
        if (a.equals(b)==true) System.out.print("Hai chuoi giong nhau.");
        else System.out.println("Hai chuoi khac nhau.");
    }
}
