
package gradleproject2;
import java.util.Scanner;
public class bai4 {
    public static int C(int m, int n){
        if (m==0 || m==n) return 1;
        else if (m==1) return n;
        else return C(m-1,n-1) + C(m,n-1);
    }
    
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap gia tri cua m: ");
        int m = sn.nextInt();
        System.out.print("Nhap gia tri cua n: ");
        int n = sn.nextInt();
        System.out.print("C(m,n) = " + C(m,n));
    }
    
}
