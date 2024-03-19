package gradleproject2;
import java.util.Scanner;
public class bai3 {
    public static int gt(int n) {
        if (n==0) return 1;
        else return gt(n-1)*n;
    }
    
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Nhap gia tri n: ");
        int n = sn.nextInt();
        System.out.print("Giai thua cua n = " + gt(n));
    }
}

