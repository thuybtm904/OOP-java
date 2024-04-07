package QLhanghoa;
import java.time.LocalDate;
import java.util.*;
public class DienMay extends HangHoa{
    private int bh;
    private double cs;
    
    public void nhap() {
        super.nhap();
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap thoi gian bao hanh: ");
        bh = sn.nextInt();
        System.out.print("Nhap cong suat: ");
        cs = sn.nextDouble();
        VAT = 0.1;
    }
    
    public String danhgia() {
        if (slton<3) return "Ban duoc";
        else return "Binh thuong";
    }
    
    public static void inTD() {
        HangHoa.inTD();
        System.out.printf("%15s %15s %n", "Tg bao hanh", "Cong suat");
    }
    
    public void inDL() {
        super.inDL();
        System.out.printf("%15d %15.1f %n", bh, cs);
    }
}


