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
public class QLHS {
    private ArrayList<HocSinh> dshs;
    
    public QLHS(){
        dshs = new ArrayList<HocSinh>(10);
    }
    
    public void ThemHocSinh(HocSinh hs){
        dshs.add(hs);
    }
    
    public void NhapDSHS(Scanner sc){
        HocSinh hs;
        System.out.print("Nhap vao so luong hoc sinh: ");
        int n = sc.nextInt(); sc.nextLine();
        
        System.out.println("Nhap thong tin cho hoc sinh trong danh sach:");
        for(int i = 0; i<n; i++){
            System.out.println("\tHoc sinh thu "+(i+1)+" la:");
            hs = new HocSinh();
            hs.NhapThongTin(sc);
            ThemHocSinh(hs);
        }
    }
    
    public void HienThiDS(){
        int n = dshs.size();
        for(int i = 0; i<n; i++){
            System.out.println("\tHoc sinh thu "+(i+1)+" la:");
            dshs.get(i).HienThiThongTin();
        }
    }
    
    public void TimKiemThongTin(int nam, String que){
        for(HocSinh hs : dshs){
            if (hs.getNgaySinh() != null && hs.getQueQuan() != null) {
                int namSinh = hs.getNgaySinh().toInstant()
                    .atZone(java.time.ZoneId.systemDefault())
                    .toLocalDate()
                    .getYear();

                if (namSinh == nam && que.equals(hs.getQueQuan())) {
                    hs.HienThiThongTin();
                }
            }
        }
    }
    
    public void TimKiemThongTin(String lop){
        for(HocSinh hs : dshs){
            if(lop.equals(hs.getLop())){
                hs.HienThiThongTin();
            }
        }
    }
}
