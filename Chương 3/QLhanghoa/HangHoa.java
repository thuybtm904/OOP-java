package QLhanghoa;
import java.util.*;
public abstract class HangHoa {
    protected String maHang, tenHang;
    protected int slton;
    protected double gia;
    protected double VAT;
    
    public abstract String danhgia();
    
    public void nhap() {
        Scanner sn= new Scanner(System.in);
        System.out.print("Nhap ma hang, ten hang: ");
        maHang = sn.nextLine();
        tenHang = sn.nextLine();
        System.out.print("Nhap so luong ton: ");
        slton = sn.nextInt();
        System.out.print("Nhap don gia: ");
        gia = sn.nextDouble();   
    }
    
    public static void inTD() {
        System.out.printf("%15s %15s %15s %15s %10s", "Ma hang", "Ten hang", "So luong ton", "Don gia", "VAT");
    }
    
    public void inDL() {
        System.out.printf("%15s %15s %15d %15.1f %10.2f", maHang, tenHang, slton, gia, VAT);
    }
}
