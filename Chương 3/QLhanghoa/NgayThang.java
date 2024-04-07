package QLhanghoa;
import java.util.*;
public class NgayThang {
    private int ngay, thang, nam;

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
        
    public void nhap() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap ngay thang nm");
        ngay = sn.nextInt();
        thang = sn.nextInt();
        nam = sn.nextInt();
    }

    @Override
    public String toString() {
        return ngay + "/" + thang + "/" + nam;
    }

    int compareTo(NgayThang time) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
