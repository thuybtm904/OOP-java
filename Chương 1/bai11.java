package gradleproject2;

import java.util.*;
public class bai11 {
    
    public static boolean kt(int n){
        if (n<2) return false;
        else if (n<4) return true;
        else {
            int d=0;
            for (int i = 2; i <= Math.sqrt(n); i++)
                if (n%i==0) d++;
            if (d!=0) return false;
            else if (d==0) return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        
        int[][] a = new int[100][100];
        System.out.print("Nhap gia tri n = ");
        int n = sn.nextInt();
        System.out.print("Nhap gia tri m = ");
        int m = sn.nextInt();
        
        for (int i=0;i<n;i++) 
            for (int j=0;j<m;j++) {
            System.out.print("a[" + i + "][" + j + "] = ");
            a[i][j] = sn.nextInt();
        }
        int maxx=0;
        for (int i=0;i<n;i++) 
            for (int j=0;j<m;j++) {
            if (kt(a[i][j])==true && a[i][j]>maxx) maxx=a[i][j];
        }
        System.out.print(maxx);
        
        }
}
