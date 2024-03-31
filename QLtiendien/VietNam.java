/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLtiendien;

/**
 *
 * @author HP One
 */
import java.util.*;
public class VietNam extends KhachHang {
    private String doiTuong;
    private double soDien;
    private double donGia;
    private double dinhMuc;

    public double getSoDien() {
        return soDien;
    }

    public void nhap() {
        Scanner sn = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap doi tuong: ");
        doiTuong = sn.nextLine();
        System.out.print("Nhap so dien: ");
        soDien = sn.nextFloat();
        System.out.print("Nhap don gia: ");
        donGia = sn.nextFloat();
        System.out.print("Nhap dinh mua: ");
        dinhMuc = sn.nextFloat();
    }
    
    public double tTien() {
        if (soDien<=dinhMuc) return soDien*donGia;
        else return soDien*dinhMuc*donGia + (soDien-dinhMuc)*donGia*2.5;
    }
    
    public static void inTieuDe(){
        KhachHang.inTieuDe();
        System.out.printf("%15s %15s %15s %15s %15s %n", "Doi tuong", "So dien", "Don gia", "Dinh muc", "Thanh tien");
    }
    
    @Override
    public void inDL() {
        super.inDL();
        System.out.printf("%15s %15.2f %15.2f %15.2f %15.2f %n", doiTuong, soDien, donGia, dinhMuc, tTien());
    }
    
    @Override
    public String toString() {
        
        return super.toString() + "VietNam{" + "doiTuong=" + doiTuong + ", soDien=" + soDien + ", donGia=" + donGia + ", dinhMuc=" + dinhMuc + ", thanh tien=" + tTien() + '}';
    }
    
    
    
}
