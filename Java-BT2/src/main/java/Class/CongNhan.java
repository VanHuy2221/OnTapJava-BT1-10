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

public class CongNhan extends CanBo{
    private String bac;
    
    public CongNhan(){
    }
    
    public CongNhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String bac){
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.bac = bac;
    }
    
    public void NhapThongTin(Scanner sc){
        super.NhapThongTin(sc);
        System.out.print("\tNhap bac: "); bac = sc.nextLine();
    }
    
    public void HienThiThongTin(){
        super.HienThiThongTin();
        System.out.println("\tBac: "+bac);
    }
}
