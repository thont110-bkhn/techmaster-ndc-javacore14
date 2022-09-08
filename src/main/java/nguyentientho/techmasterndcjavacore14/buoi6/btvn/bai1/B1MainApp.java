package nguyentientho.techmasterndcjavacore14.buoi6.btvn.bai1;

import nguyentientho.techmasterndcjavacore14.buoi6.btvn.bai0.Book;
import nguyentientho.techmasterndcjavacore14.buoi6.btvn.bai0.Document;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class B1MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TheMuon theMuon = new TheMuon();
        while (true) {
            // Hien thi man hinh nhap dau vao cho user chon
            // 1 them the moi
            // 2 xoa the => dau vao = id, dau ra = boolean
            // 3 hien thi => dau vao = id, dau ra = danh sach List
            // 4 Thoat => return

            System.out.println("Ung dung quan ly the muon sach");
            System.out.println("Enter 1: Them the moi: ");
            System.out.println("Enter 2: Xoa the: ");
            System.out.println("Enter 3: Hien thi danh sach the: ");
//            System.out.println("Enter 4: To remove document by id");
            System.out.println("Enter 5: Thoat: ");
            System.out.println("``````````````````````````````````");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.print("Enter ten sinh vien: ");
                    String ten = scanner.nextLine();
                    System.out.print("Enter tuoi: ");
                    int tuoi = scanner.nextInt();
                    System.out.print("Enter lop hoc: ");
                    String lopHoc = scanner.next();
                    SinhVien sinhVien = new SinhVien(ten, tuoi, lopHoc);

                    System.out.print("Enter ma the: ");
                    scanner.nextLine();
                    String mathe = scanner.nextLine();
                    System.out.print("Enter ngay muon sach: ");
                    int ngayMuon = scanner.nextInt();
                    System.out.print("Enter ngay tra sach: ");
                    int ngayTra = scanner.nextInt();
                    System.out.print("Enter so hieu sach: ");
                    int soHieuSach = scanner.nextInt();

                    The the = new The(sinhVien, mathe, ngayMuon, ngayTra, soHieuSach);
                    theMuon.themThe(the);
                    System.out.println(the.toString());
                    scanner.nextLine();
                    break;
                }
                case "2": {
                    System.out.println("Enter ma the can xoa: ");
                    String maThe = scanner.nextLine();
                    theMuon.xoaThe(maThe);
                    break;
                }
                case "3": {
                    theMuon.hienThi();
                    break;
                }
//                case "4": {
//                    System.out.print("Enter id to remove: ");
//                    String id = scanner.nextLine();
//                    System.out.println(managerDocument.deleteDocument(id) ? "Success" : "Fail");
//                }
//                break;
                case "5": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}
