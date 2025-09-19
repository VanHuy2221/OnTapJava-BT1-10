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
public class QuanLySach {
    private ArrayList<TaiLieu> dstl;
    
    public QuanLySach(){
        dstl = new ArrayList<TaiLieu>(10);
    }
    
    public void ThemTaiLieu(TaiLieu tl){
        dstl.add(tl);
    }
    
    public void NhapDSTL(Scanner sc){
        int chon;
        String stop;
        TaiLieu tl;
        
        do{
            System.out.print("Chon loai tai lieu (1-Sach, 2-TapChi, 3-Bao): ");
            chon = sc.nextInt(); sc.nextLine();
            
            switch(chon){
                case 1:
                    tl = new Sach();
                    break;
                case 2:
                    tl = new TapChi();
                    break;
                case 3:
                    tl = new Bao();
                    break;
                default:
                    tl = new Sach();
                    break;
            }
            
            tl.NhapThongTin(sc);
            ThemTaiLieu(tl);
            
            System.out.print("\nBan co muon nhap nua khong(c/k): ");
            stop = sc.nextLine();
        }while(stop.equals("c"));
    }
    
    public void TimMaTL(String maTL){
        for(TaiLieu tl : dstl){
            if(maTL.equals(tl.getMaTaiLieu())){
                tl.HienThiThongTin();
            }
        }
    }
    
    public void TimLoaiTL(String loai){
        for(TaiLieu tl : dstl){
            if(loai.equals("Sach")&&(tl instanceof Sach)){
                tl.HienThiThongTin();
            }else if(loai.equals("TapChi")&&(tl instanceof TapChi)){
                tl.HienThiThongTin();
            }else if (loai.equals("Bao")&&(tl instanceof Bao)){
                tl.HienThiThongTin();
            }
        }
    }
}
