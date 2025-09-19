/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author PVHuy
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class TheMuon extends SinhVien{
    private int soMuon;
    private Date ngayMuon;
    private Date hanTra;
    private String soHieu;
    
    public TheMuon(){
        
    }
    
    public TheMuon(int soMuon, Date ngayMuon, String soHieu){
        this.soMuon = soMuon;
        this.ngayMuon = ngayMuon;
        this.soHieu = soHieu;
    }
    
    public void NhapThongTin(Scanner sc){
        super.NhapThongTin(sc);
        System.out.print("\tNhap so muon: ");
        soMuon = sc.nextInt(); sc.nextLine();
        System.out.print("\tNhap ngay muon: ");
        String strDate = sc.nextLine();
        ngayMuon = strToDate(strDate);
        
        String strHanTra = "31-12-2025";
        hanTra = strToDate(strHanTra);
        
        System.out.print("\tNhap so hieu: ");
        soHieu = sc.nextLine();
    }

    private Date strToDate(String strDate) {
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
        try{
            date = sdf.parse(strDate);
        }catch(ParseException e){
            System.out.println("Loi dinh dang ngay thang");
        }
        return date;
    }
    
    public void HienThiThongTin(){
        System.out.println("\tSo muon: "+soMuon);
        System.out.println("\tNgay muon: "+ngayMuon);
        System.out.println("\tHan tra: "+hanTra);
        System.out.println("\tSo hieu: "+soHieu);
    }
    
    public Date getHanTra(){
        return hanTra;
    }
}
