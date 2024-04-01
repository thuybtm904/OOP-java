package QLNhanVien;
import java.util.Scanner;
public class NVVP extends NhanVien{
    private int nghi;
    private float mucLuong;
    
    public void nhap() {
        super.nhap();
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap so ngay nghi: ");
        nghi = sn.nextInt();
        System.out.print("Nhap muc luong: ");
        mucLuong = sn.nextFloat();
    }
    
    public double tLuong() {
        return mucLuong - nghi * 10_000;
    }
    
    public static void inTD() {
        NhanVien.inTD();
        System.out.printf("%15s %15s %n", "So ngay nghi", "Muc luong");
    }
    
    public void inDL() {
        super.inDL();
        System.out.printf("%15d %15.2f %15.2f %n", nghi, mucLuong, tLuong());
    }
}
