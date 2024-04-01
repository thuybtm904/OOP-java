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
public class mainNhanVien {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap so nhan vien: ");
        int n = sn.nextInt();
        NhanVien a[] = new NhanVien[n];
        for (int i=0;i<n;i++) {
            a[i] = new NhanVien();
            a[i].nhap();
        }
        
        NhanVien.xuatTieuDe();
        for (int i=0;i<n;i++)
            a[i].inDL();
        
        System.out.println("Danh sach nhan vien dat chuan la: ");
        for (int i=0;i<n;i++)
            if (a[i].coVuotChuan()) a[i].inDL();
    }
}
