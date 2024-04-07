/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuinterface;

/**
 *
 * @author HP One
 */
import java.util.*;
public class doanh_nghiep {
    private String TenDN, sdt, DiaChi;

    public String getTenDN() {
        return TenDN;
    }

    public void setTenDN(String TenDN) {
        this.TenDN = TenDN;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
    
    public void nhap() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap ten doanh nghiep: ");
        TenDN = sn.nextLine();
        System.out.print("Nhap so dien thoai: ");
        sdt = sn.nextLine();
        System.out.print("Nhap dia chi: ");
        DiaChi = sn.nextLine();
    }
    
    public String toString() {
        return TenDN + "(" + DiaChi + ", " + sdt + ")";
    }
}
