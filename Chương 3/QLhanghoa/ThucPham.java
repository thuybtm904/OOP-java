package QLhanghoa;
import java.time.LocalDate;
import java.util.*;
public class ThucPham extends HangHoa{
    private NgayThang nsx = new NgayThang();
    private NgayThang hsd = new NgayThang();
    private String ncc;
    
    public void nhap() {
        super.nhap();
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap ngay san xuat: ");
        nsx.nhap();
        System.out.print("Nhap han su dung: ");
        hsd.nhap();
        System.out.print("Nhap nha cung cap: ");
        ncc = sn.nextLine();
        VAT = 0.05;
    }
    
    public String danhgia() {
        Date now = new Date();
        int d = LocalDate.now().getDayOfMonth();
        int m = LocalDate.now().getMonthValue();
        int y = LocalDate.now().getYear();
        if ((hsd.getNam()>y || (hsd.getNam()==y && hsd.getThang()>m) || (hsd.getNam()==y && hsd.getThang()==m && hsd.getNgay()>d))&& slton!=0) 
                return "Kho ban";
        else return "Binh thuong";   
    }
    
    public static void inTD() {
        HangHoa.inTD();
        System.out.printf("%15s %15s %15s %n", "Ngay san xuat", "Han su dung", "Nha cung cap");
    }
    
    public void inDL() {
        super.inDL();
        System.out.printf("%15s %15s %15s %n", nsx, hsd, ncc);
    }
}
