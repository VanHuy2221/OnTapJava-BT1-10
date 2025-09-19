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

public class KySu extends CanBo{
    private String nganhDaoTao;
    
    public KySu(){
    }
    
    public KySu(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String nganhDaoTao){
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }
    
    public void NhapThongTin(Scanner sc){
        super.NhapThongTin(sc);
        System.out.print("\tNhap nganh dao tao: "); nganhDaoTao = sc.nextLine();
    }
    
    public void HienThiThongTin(){
        super.HienThiThongTin();
        System.out.println("\tNganh dao tao: "+nganhDaoTao);
    }
}
