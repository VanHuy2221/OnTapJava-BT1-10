/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author PVHuy
 */
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.ZoneId;
public class KhuPho {
    private ArrayList<HoDan> dshd;
    
    public KhuPho(){
        dshd = new ArrayList<HoDan>(10);
    }
    
    public void ThemHoDan(HoDan hoDan){
        dshd.add(hoDan);
    }
    
    public void NhapDS(Scanner sc){
        HoDan hoDan;
        
        System.out.print("Nhap vao so ho dan: ");
        int soHoDan = sc.nextInt(); sc.nextLine();
        
        System.out.println("Nhap vao thong tin cho tung ho dan: ");
        for(int i = 0; i < soHoDan ; i++){
            System.out.println("Ho dan thu "+(i+1)+" la: ");
            hoDan = new HoDan();
            hoDan.NhapThongTin(sc);
            ThemHoDan(hoDan);
        }
    }
    
    public void HienThiDS(){
        int n = dshd.size();
        for(int i = 0; i<n ; i++){
            System.out.println("Ho dan thu "+(i+1)+" la: ");
            dshd.get(i).HienThiThongTin();
        }
    }
    
    public void TimKiemThongTin() {
        int namHienTai = LocalDate.now().getYear();

        for (HoDan hoDan : dshd) {
            Nguoi[] dstv = hoDan.getList();
            if (dstv == null) continue; // bỏ qua hộ dân chưa có dữ liệu

            for (Nguoi nguoi : dstv) {
                if (nguoi == null) continue; // bỏ qua phần tử null

                int namSinh = nguoi.getNgaySinh().toInstant()
                        .atZone(ZoneId.systemDefault())
                        .toLocalDate()
                        .getYear();

                if (namHienTai - namSinh == 80) {
                    nguoi.HienThiThongTin();
                }
            }
        }
    }
}
