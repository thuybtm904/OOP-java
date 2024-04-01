/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4cham6;

/**
 *
 * @author HP One
 */
import java.util.Scanner;
public class NhanVien {
    private String maNV;
    private int soSP;
    
    public NhanVien() {
    }
    
    public NhanVien(String ma, int sp) {
        this.maNV = ma;
        this.soSP = sp;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String ma) {
        this.maNV = ma;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int sp) {
        if (sp>0) this.soSP = sp;
    }
    
    public boolean coVuotChuan() {
        if (soSP>500) return true;
        else return false;
    }
    
    public String getTongKet() {
        if (coVuotChuan()) return "Vuot";
        else return "";
    }
    
    public double getLuong() {
        if (coVuotChuan()) return (soSP-500)*30000+500*20000;
        else return soSP*20000;
    }
    
    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", soSP=" + soSP + '}';
    }
    
    public void nhap() {
        Scanner sn =new Scanner(System.in);
        System.out.print("Nhap ma nhan vien: ");
        maNV = sn.nextLine();
        System.out.print("Nhap so san pham: ");
        soSP = sn.nextInt();
    }
    
    public static void xuatTieuDe() {
        System.out.printf("%15s %15s %15s %10s %n", "Ma nhan vien", "So san pham", "Luong", "Tong ket");
    }
    
    public void inDL() {
        System.out.printf("%15s %15d %15.2f %10s %n", maNV, soSP, getLuong(), getTongKet());
    }
    
}
