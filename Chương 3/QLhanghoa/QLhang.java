package QLhanghoa;
import java.util.*;
public class QLhang {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap so luong hang: ");
        int n = sn.nextInt();
        int loai;
        HangHoa a[] = new HangHoa[n];
        
        for (int i=0;i<n;i++) {
            System.out.println("1. Hang thuc pham  ;  2. Hang sanh su  ;  3. Hang dien may");
            System.out.print("Nhap loai hang: ");
            loai = sn.nextInt();
            if (loai == 1) a[i] = new ThucPham();
            else if (loai == 2) a[i] = new SanhSu();
            else a[i] = new DienMay();
            a[i].nhap();
        }
        
        a = Arrays.copyOf(a, n+1);
        
        ThucPham d = new ThucPham();
        d.nhap();
        System.out.print("Nhap vi tri can chen: ");
        int k = sn.nextInt();
        for (int i = n;i>=k;i--)
            a[i] = a[i-1];
        a[k-1] = d;
        n++;
        
        for (int i=0;i<n;i++) a[i].inDL();
    }
}
