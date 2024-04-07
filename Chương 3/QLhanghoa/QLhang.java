package QLhanghoa;
import java.util.*;
public class QLhang {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap so luong hang: ");
        int n = sn.nextInt();
        int loai;
        HangHoa a[] = new HangHoa[n+1];
        
        for (int i=0;i<n;i++) {
            System.out.println("1. Hang thuc pham  ;  2. Hang sanh su  ;  3. Hang dien may");
            System.out.print("Nhap loai hang: ");
            loai = sn.nextInt();
            if (loai == 1) a[i] = new ThucPham();
            else if (loai == 2) a[i] = new SanhSu();
            else a[i] = new DienMay();
            a[i].nhap();
        }
        
        ThucPham d = new ThucPham();
        d.nhap();
        for (int i = n;i>=2;i--)
            a[i] = a[i-1];
        a[1] = d;
        
        for (int i=0;i<n+1;i++) a[i].inDL();
    }
}
