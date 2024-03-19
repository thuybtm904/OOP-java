package gradleproject2;
import java.util.*;
public class bai1415 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap chuoi s: ");
        String s = sn.nextLine();
        int[] a = new int[300];
        for (int i=0; i<s.length();i++)
        {
            a[s.charAt(i)]++;
        }
        int d=0;
        int maxx = 0;
        for (int i=0;i<=255;i++)
            if (a[i]!=0){
                d++;
                if (maxx<a[i]) maxx=a[i];
            }
        
        System.out.println("So ky tu cua xau s la: " + d);
        
        for (int i=0;i<=255;i++)
            if (a[i]==maxx)
                System.out.print((char)i+" ");
    }
}
