
package gradleproject2;
import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap a = ");
        int a = sn.nextInt();
        System.out.print("Nhap b = ");
        int b = sn.nextInt();
        
        if (a<b) {
            int tg=a; a=b; b=tg;
        }
        
        int t=a%b;
        while (t>0) {
            a=b;
            b=t;
            t=a%b;
        }
        System.out.print("UCLN cua a va b = " + b);
    }
}
