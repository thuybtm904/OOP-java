package QLNhanVien;
import java.time.LocalDate;
import java.util.*;
public abstract class NhanVien {
    private  String hoten;
    private int namLam;
    
    public void nhap() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoten = sn.nextLine();
        System.out.print("Nhap nam vao lam: ");
        namLam = sn.nextInt();
    }
    
    public abstract double tLuong();
    public double phuCap() {
        Date now = new Date();
        int d=LocalDate.now().getYear();
        return 100_000 + (d - namLam) * 20_000;
    }
    
    public double tongLuong() {
        return tLuong() + phuCap();
    }
    public static void inTD() {
        System.out.printf("%15s %15s", "Ho ten", "Nam vao lam");
    }
    
    public void inDL() {
        System.out.printf("%15s %15d", hoten, namLam);
    }
}
