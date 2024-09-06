/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package readfiletext;
import java.io.*;
/**
 *
 * @author ADMIN
 */
public class WriteFileText {
    public static void main(String[] args) {
        String str="Em la co gai hay nang tien\nEm co tuoi hay khong co tuoi.";
        try{
            FileWriter fw=new FileWriter("baitho.txt");
            fw.write(str);
            fw.close();
        }catch(Exception ex){
            System.out.println("Loi xay ra:"+ex.toString());
            System.out.println("Thao tac doc du lieu that bai");
        }
    }
}
