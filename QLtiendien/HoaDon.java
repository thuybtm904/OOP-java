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
public class HoaDon {
    static int n, loai;
    static KhachHang a[] = new KhachHang[n];
    
    public static void nhapDS() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap so khach hang: ");
        n = sn.nextInt();
        a = new KhachHang[n];
        for (int i=0;i<n;i++) {
            System.out.println("1. Khach hang Viet Nam  ;  2. Khach hang nuoc ngoai");
            System.out.print("Loai khach hang: ");
            loai = sn.nextInt();
            if (loai==1) a[i] = new VietNam();
            else a[i] = new NuocNgoai();
            a[i].nhap();
            
        }
    }
    
    public static void xuat() {
        int d1=0,d2=0;
        double slVN=0,slNN=0, sum=0;
        for (int i=0;i<n;i++)
            if (a[i] instanceof VietNam) d1++;
            else d2++;
        
        if (d1!=0) {
            System.out.println("Danh sach khach hang Viet Nam la: ");
            VietNam.inTieuDe();
            for (int i=0;i<n;i++) {
                if (a[i] instanceof VietNam) {
                    slVN += a[i].getSoDien();
                    a[i].inDL();
                }
            }
        }
        
        if (d2!=0) {
            System.out.println("Danh sach khach hang nuoc ngoai la: ");
            NuocNgoai.inTieuDe();
            for (int i=0;i<n;i++) {
                if (a[i] instanceof NuocNgoai) {
                    sum += a[i].tTien();
                    slNN += a[i].getSoDien();
                    a[i].inDL();
                }
            }
        }
        
        System.out.println("Tong so dien cua khach hang Viet Nam la: " + slVN);
        System.out.println("Tong so dien cua khach hang nuoc ngoai la: " + slNN);
        System.out.println("Trung binh thanh tien cua khach hang nuoc ngoai la: " + sum/d2);
        
        d1 = 0;
        d2 = 0;
        
        for (int i=0;i<n;i++) {
            if (a[i] instanceof VietNam && a[i].getNgaytao().getThang()== 9 && a[i].getNgaytao().getNam() == 2013)
                d1++;
            else if (a[i] instanceof NuocNgoai && a[i].getNgaytao().getThang()== 9 && a[i].getNgaytao().getNam() == 2013) 
                d2++;
        }
        
        if (d1+d1!=0) {
            System.out.println("Danh sach hoa don trong thang 9 nam 2013 la: ");
            if (d1!=0) {
                VietNam.inTieuDe();
                for (int i=0;i<n;i++) 
                    if (a[i] instanceof VietNam && a[i].getNgaytao().getThang()== 9 && a[i].getNgaytao().getNam() == 2013)
                        a[i].inDL();            
            }
            if (d2!=0) {
                NuocNgoai.inTieuDe();
                for (int i=0;i<n;i++) 
                    if (a[i] instanceof NuocNgoai && a[i].getNgaytao().getThang()== 9 && a[i].getNgaytao().getNam() == 2013)
                        a[i].inDL();
            }
        }
        
        
    }
    
    
    public static void main(String[] args) {
        nhapDS();
        xuat();
        
        
    }
}
