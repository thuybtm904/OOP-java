/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopjava;

/**
 *
 * @author HP One
 */
import java.util.Scanner;
public class mainNhanVien {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Nhap so nhan vien:");
        int n = sn.nextInt();
        NhanVien[] a = new NhanVien[n];
        for (int i=0;i<n;i++) {
            a[i] = new NhanVien();
            a[i].nhap();
        }
        
        System.out.printf("%20s %20s %20s %20s %n", "Ho dem","Ten","Ngay sinh","Ngay vao lam");
        for (int i=0;i<n;i++) {
            a[i].inds();
        }
            
    }
}
