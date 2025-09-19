/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author PVHuy
 */
import java.util.Scanner;
public class CBGV extends Nguoi{
    private double luongCung;
    private double thuong;
    private double phat;
    private double luongThucLinh;
    
    public CBGV(){
        
    }
    
    public void NhapThongTin(Scanner sc){
        super.NhapThongTin(sc);
        System.out.print("\tNhap luong cung: "); luongCung = sc.nextDouble(); sc.nextLine();
        System.out.print("\tNhap thuong: "); thuong = sc.nextDouble(); sc.nextLine();
        System.out.print("\tNhap phat: "); phat = sc.nextDouble(); sc.nextLine();
        luongThucLinh = luongCung + thuong - phat;
    }
    
    public void HienThiThongTin(){
        super.HienThiThongTin();
        System.out.println("\tLuong cung: "+luongCung);
        System.out.println("\tThuong: "+thuong);
        System.out.println("\tPhat: "+phat);
        System.out.println("\tLuong thuc linh: "+luongThucLinh);
    }
    
    public double getLuongThucLinh(){
        return luongThucLinh;
    }
}
