package QLhanghoa;
import java.time.LocalDate;
import java.util.*;
public class SanhSu extends HangHoa{
    private NgayThang nkho = new NgayThang();
    private String nsx;
    
    public void nhap() {
        super.nhap();
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap ngay nhap kho: ");
        nkho.nhap();
        System.out.print("Nhap nha san xuat: ");
        nsx = sn.nextLine();
        VAT = 0.1;
    }
    
    public String danhgia() {
        Date d=new Date();
        Calendar c = Calendar.getInstance();
        d=c.getTime();
        c.set(nkho.getNam(),nkho.getThang(),nkho.getNgay());
        c.roll(Calendar.DAY_OF_MONTH,10);
        if ( (slton>50 ) &&(d.compareTo(c.getTime()))>0) return "Ban cham";
            else return "Binh thuong";   
    }
    
    public static void inTD() {
        HangHoa.inTD();
        System.out.printf("%15s %15s %n", "Ngay nhap kho", "Nha san xuat");
    }
    
    public void inDL() {
        super.inDL();
        System.out.printf("%15s %15s %n", nkho, nsx);
    }
}

