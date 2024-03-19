package gradleproject2;
import java.util.Scanner;
public class bai8 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap gia tri n = ");
        int n = sn.nextInt();
        float a[] = new float[100];
        
        for (int i=0;i<n;i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sn.nextFloat();
        }
        
        System.out.print("Nhap gia tri can chen: ");
        float k = sn.nextFloat();
        
        int i=0, vt=-1;
        while (i<n) {
            if (a[i]<=k) i++;
            else {vt = i; break;}
        }
        
        if (vt==-1) {
            a[n]=k; n++;
            for (int j=0;j<n;j++) System.out.print(a[j] + " ");
        }
        else {
            for (int j=n;j>vt;j--) a[j]=a[j-1];
            a[vt] = k;
            n++;
            for (int j=0;j<n;j++) System.out.print(a[j] + " ");
        }

    }
}
