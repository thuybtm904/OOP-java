package gradleproject2;
import java.util.Scanner;

public class bai7 {
    public static void sxnb(int n, float a[]) {
        for (int i=0;i<n-1;i++)
            for (int j=n-1;j>i;j--)
                if (a[j]<a[j-1])
                {
                    float tg=a[j];
                    a[j]=a[j-1];
                    a[j-1]=tg;                       
                }
    }
    
    public static int tknp(int l, int r, float k, float a[]) {
        if (l>r) return -1;
        else {
            int m = (l+r)/2;
            if (a[m]==k) return m;
            else if(a[m]>k) return tknp(l,m-1,k,a);
            else return tknp(m+1,r,k,a);
        }
    }
    
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
    
        System.out.print("Nhap gia tri n = ");
        int n = sn.nextInt();
        float a[] = new float [n];
        
        for (int i=0;i<n;i++) {
            System.out.print("a[" + (i+1) + "] = ");
            a[i] = sn.nextFloat();
        }
            
        
        System.out.print("Nhap gia tri can tim:");
        float k = sn.nextFloat();
        
        sxnb(n,a);
        
        if (tknp(0,n-1,k,a)==-1) System.out.print("Khong co gia tri " + k + " trong mang.");
        else System.out.print(k + " o vi tri " + tknp(0,n-1,k,a));
    }
    
    
}
