/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLtiendien;

/**
 *
 * @author HP One
 */
import java.util.Scanner;
public abstract class KhachHang {
    private String maKH;
    private String hoTen;
    private Date ngaytao = new Date();
    
    public abstract double tTien();
    public abstract double getSoDien();

    public Date getNgaytao() {
        return ngaytao;
    }
    
    public void nhap() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap ma khach hang: ");
        maKH = sn.nextLine();
        System.out.print("Nhap ten khach hang: ");
        hoTen = sn.nextLine();
        System.out.print("Nhap ngay, thang, nam: ");
        ngaytao.nhap();
    }
    
    public static void inTieuDe() {
        System.out.printf("%15s %15s %15s ", "Ma khach hang", "Ten khach hang", "Ngay tao");
    }
    
    public void inDL() {
        System.out.printf("%15s %15s %15s ", maKH, hoTen, ngaytao);
    }
    
    @Override
    public String toString() {
        return "KhachHang{" + "maKH=" + maKH + ", hoTen=" + hoTen + ", ngaytao=" + ngaytao + '}';
    }

    
}