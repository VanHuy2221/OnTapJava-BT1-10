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

public class NhanVien extends CanBo{
    private String congViec;
    
    public NhanVien(){
    }
    
    public NhanVien(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String congViec){
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }
    
    public void NhapThongTin(Scanner sc){
        super.NhapThongTin(sc);
        System.out.print("\tNhap cong viec: "); congViec = sc.nextLine();
    }
    
    public void HienThiThongTin(){
        super.HienThiThongTin();
        System.out.println("\tCong viec: "+congViec);
    }
}
