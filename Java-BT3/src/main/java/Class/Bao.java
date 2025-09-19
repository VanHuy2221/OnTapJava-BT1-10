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
public class Bao extends TaiLieu{
    private String ngayPhatHanh;
    
    public Bao(){
    }
    
    public Bao(String maTaiLieu, String tenNXB, int soBanPhatHanh, String ngayPhatHanh){
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }
    
    public void NhapThongTin(Scanner sc){
        super.NhapThongTin(sc);
        System.out.print("\tNhap ngay phat hanh: "); ngayPhatHanh = sc.nextLine();
    }
    
    public void HienThiThongTin(){
        super.HienThiThongTin();
        System.out.println("\tNgay phat hanh: "+ngayPhatHanh);
    }
}
