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
public class Xe implements maymoc{
    private String TenXe;
    private String TenKH;
    private String NL;
    private doanh_nghiep DN= new doanh_nghiep();
    private float TrongTai;
    private float TienDatCoc;
    private int namSX;

    public void setNhienLieu(String NL) {
        this.NL = NL;
    }
    
    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public float getTrongTai() {
        return TrongTai;
    }
       
    public void nhap() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap ten xe: ");
        TenXe = sn.nextLine();
        System.out.print("Nhap nhien lieu: ");
        setNhienLieu(sn.nextLine());
        System.out.print("Nhap ten khach hang: ");
        TenKH = sn.nextLine();  
        System.out.print("Nhap doanh nghiep: ");
        DN.nhap();
        System.out.print("Nhap trong tai: ");
        TrongTai = sn.nextFloat();
        System.out.print("Nhap tien dat coc: ");
        TienDatCoc = sn.nextFloat();
        System.out.print("Nhap nam san xuat: ");
        setNamSX(sn.nextInt());
        }
    
    public static void inTD() {
        System.out.printf("%15s %50s %15s %15s %15s %15s %15s %n", "Ten xe", "Doanh nghiep", "Trong tai", "Nhien lieu", "Nam san xuat", "Tien dat coc", "Ten khach hang");
    }
    
    public void inDL() {
        System.out.printf("%15s %50s %15.1f %15s %15d %15.1f %15s %n", TenXe, DN, TrongTai, NL,namSX, TienDatCoc,TenKH);
    }
}
