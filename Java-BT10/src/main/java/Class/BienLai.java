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
public class BienLai extends KhachHang {
    private int chiSoMoi;
    private int chiSoCu;
    private double tien;
    
    public BienLai(){
        
    }
    
    public BienLai(int chiSoMoi, int chiSoCu, double tien){
        this.chiSoMoi = chiSoMoi;
        this.chiSoCu = chiSoCu;
        this.tien = tien;
    }
    
    public BienLai(String tenChuHo, int chiSoMoi, int chiSoCu, double tien){
        this.tenChuHo = tenChuHo;
        this.chiSoMoi = chiSoMoi;
        this.chiSoCu = chiSoCu;
        this.tien = tien;
    }
    
    public void NhapThongTin(Scanner sc){
        super.NhapThongTin(sc);
        System.out.print("\tNhap chi so moi: "); chiSoMoi = sc.nextInt(); sc.nextLine();
        System.out.print("\tNhap chi so cu: "); chiSoCu = sc.nextInt(); sc.nextLine();
        tien = (chiSoMoi-chiSoCu)*750;
    }
    
    public void HienThiThongTin(){
        super.HienThiThongTin();
        System.out.println("\tChi so moi: "+chiSoMoi);
        System.out.println("\tChi so cu: "+chiSoCu);
        System.out.println("\tSo tien: "+tien);
    }
}
