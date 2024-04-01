package QLNhanVien;
import java.util.*;
public class NVSX extends NhanVien{
    private int sp;
    
    public void nhap() {
        super.nhap();
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap so san pham: ");
        sp = sn.nextInt();
    }
    
    public double tLuong() {
        return sp * 10_000;
    }
    
    public static void inTD() {
        NhanVien.inTD();
        System.out.printf("%15s %n", "So san pham");
    }
    
    public void inDL() {
        super.inDL();
        System.out.printf("%15d %15.2f %n", sp, tLuong());
    }
    
}
