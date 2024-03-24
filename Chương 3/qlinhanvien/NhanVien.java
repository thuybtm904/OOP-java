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
public class NhanVien {
    private String hodem;
    private String ten;
    private NgayThang ngaysinh = new NgayThang();
    private NgayThang ngayvaolam = new NgayThang();
    
    public void nhap() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Nhap ho dem, ten:");
        hodem = sn.nextLine();
        ten = sn.nextLine();
        System.out.println("Nhap ngay sinh");
        ngaysinh.nhap();
        System.out.println("Nhap ngay vao lam:");
        ngayvaolam.nhap();
    }
    
    public void inds() {
        System.out.printf("%20s %20s %20s %20s %n", hodem, ten, ngaysinh, ngayvaolam);
    }
        
    
}
