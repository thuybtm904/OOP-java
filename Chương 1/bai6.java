
package gradleproject2;
import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        
        System.out.print("Nhap gia tri n = ");
        int n = sn.nextInt();
        
        if (n<2) System.out.print("Khong la so nguyen to.");
        else if (n<4) System.out.print("La so nguyen to.");
        else {
            int d=0;
            for (int i = 2; i <= Math.sqrt(n); i++)
                if (n%i==0) d++;
            if (d!=0) System.out.print("Khong la so nguyen to.");
            else if (d==0) System.out.print("La so nguyen to.");
        }
    }
}
