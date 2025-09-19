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
public class TapChi extends TaiLieu{
    private int soPhatHanh;
    private int thangPhatHanh;
    
    public TapChi(){
    }
    
    public TapChi(String maTaiLieu, String tenNXB, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh){
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }
    
    public void NhapThongTin(Scanner sc){
        super.NhapThongTin(sc);
        System.out.print("\tNhap so phat hanh: "); soPhatHanh = sc.nextInt();
        System.out.print("\tNhap thang phat hanh: "); thangPhatHanh = sc.nextInt(); sc.nextLine();
    }
    
    public void HienThiThongTin(){
        super.HienThiThongTin();
        System.out.println("\tSo phat hanh: "+soPhatHanh);
        System.out.println("\tThang phat hanh: "+thangPhatHanh);
    }
}
