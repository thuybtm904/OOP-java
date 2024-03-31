/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLtiendien;

import java.util.Scanner;

/**
 *
 * @author HP One
 */
public class NuocNgoai extends KhachHang{
    private String quocTich;
    private double soDien;
    private double donGia;

    public double getSoDien() {
        return soDien;
    }
    
    public void nhap() {
        Scanner sn = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap quoc tich: ");
        quocTich = sn.nextLine();
        System.out.print("Nhap so dien: ");
        soDien = sn.nextFloat();
        System.out.print("Nhap don gia: ");
        donGia = sn.nextFloat();
    }
    
    public double tTien() {
        return soDien*donGia;
    }
    
    public static void inTieuDe(){
        KhachHang.inTieuDe();
        System.out.printf("%15s %15s %15s %15s %n", "Quoc tich", "So dien", "Don gia", "Thanh tien");
    }
    
    @Override
    public void inDL() {
        super.inDL();
        System.out.printf("%15s %15.2f %15.2fs %15.2f %n", quocTich, soDien, donGia, tTien());
    }

    @Override
    public String toString() {
        return super.toString() + "NuocNgoai{" + "quocTich=" + quocTich + ", soDien=" + soDien + ", donGia=" + donGia + ", thanh tien=" + tTien() + '}';
    }

    
}
