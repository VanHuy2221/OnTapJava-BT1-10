/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author PVHuy
 */
 import java.util.ArrayList;
 import java.util.Scanner;

public class QLCB {
    private ArrayList<CanBo> dscb;
    
    public QLCB(){
        dscb = new ArrayList<CanBo>(10);
    }
    
    public void ThemCanBo(CanBo cb){
        dscb.add(cb);
    }
    
    public void NhapDS(Scanner sc){
        CanBo cb;
        System.out.print("Nhap so luong can bo: ");
        int n = sc.nextInt(); sc.nextLine();
        
        System.out.println("\tNhap thong tin chi tiet: ");
        for(int i = 0; i<n; i++){
            System.out.println("\tLan nhap thu "+(i+1)+": ");
            System.out.print("\tChon can bo (1-Ky su, 2-Nhan vien, 3-Cong nhan): ");
            int chon = sc.nextInt(); sc.nextLine();
            cb = new CanBo();
            switch(chon){
                case 1: cb = new KySu();
                        break;
                case 2: cb = new NhanVien();
                        break;
                case 3: cb = new CongNhan();
                        break;
                default: cb = new KySu(); 
                         break;
            }
            cb.NhapThongTin(sc);
            ThemCanBo(cb);
        }
    }
    
    public void TimKiemCanBo(String hoTen){
        for (CanBo cb : dscb){
            if(hoTen.equals(cb.getHoTen())){
                cb.HienThiThongTin();
            }
        }
    }
}
