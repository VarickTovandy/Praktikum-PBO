
import java.util.*;  

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author inter
 */
public class main {
    public static void main(String[] args) {
        int pilih, ulang=1;
        double proto=0, creativity=0, programming=0, coding=0, debugging=0, innovation=0, decision=0, communication=0, design=0;
        
        Scanner s = new Scanner(System.in).useDelimiter("\n");
        System.out.print("+----------------------------+\n");
        System.out.print("|Pelamaran Lowongan Pekerjaan|\n");
        System.out.print("+----------------------------+\n");
        System.out.print("Terdapat 3 posisi yang kosong\n");
        System.out.print("\t1. Programmer\n");
        System.out.print("\t2. Designer\n");
        System.out.print("\t3. Manager\n");
        System.out.print("Pilih pekerjaan yang dilamar: ");
        pilih = s.nextInt();
        
        System.out.print("=== Formulir Pelamar ===\n");
        System.out.print("Nama Lengkap: ");
        String nama = s.next();
        System.out.print("\n\n");
        
        System.out.print("--- Penilaian ---\n");
        System.out.print("Keterangan: Nilai yang valid berada di antara 0 - 100\n");
        System.out.print("\n\n");
        
        switch (pilih) {
            case 1:            
                System.out.print("Nilai Programming Knowledge: ");
                programming = s.nextDouble();
                while(programming<0 || programming>100){
                    System.out.print("Nilai Programming Knowledge: ");
                    programming = s.nextDouble();
                }
                System.out.print("\n\n");
                System.out.print("Nilai Clean Coding: ");
                coding = s.nextDouble();
                if(coding<0 || coding>100){
                    System.out.print("Nilai Clean Coding: ");
                    coding = s.nextDouble();
                }
                System.out.print("\n\n");
                System.out.print("Nilai Debugging: ");
                debugging = s.nextDouble();
                if(debugging<0 || debugging>100){
                    System.out.print("Nilai Debugging: ");
                    debugging = s.nextDouble();
                }
                System.out.print("\n\n");
                break;
            case 2:
                System.out.print("Nilai Design Portfolio: ");
                design = s.nextDouble();
                if(design<0 || design>100){
                    System.out.print("Nilai Design Portfolio: ");
                    design = s.nextDouble();
                }
                System.out.print("\n\n");
                System.out.print("Nilai Prototyping: ");
                proto = s.nextDouble();
                if(proto<0 || proto>100){
                    System.out.print("Nilai Prototyping: ");
                    proto = s.nextDouble();
                }
                System.out.print("\n\n");
                System.out.print("Nilai Creativity: ");
                creativity = s.nextDouble();
                if(creativity<0 || creativity>100){
                    System.out.print("Nilai Creativity: ");
                    creativity = s.nextDouble();
                }
                System.out.print("\n\n");
                break;
            case 3:
                System.out.print("Nilai Innovation: ");
                innovation = s.nextDouble();
                if(innovation<0 || innovation>100){
                    System.out.print("Nilai Innovation: ");
                    innovation = s.nextDouble();
                }
                System.out.print("\n\n");
                System.out.print("Nilai Decision Making: ");
                decision = s.nextDouble();
                if(decision<0 || decision>100){
                    System.out.print("Nilai Decision Making: ");
                    decision = s.nextDouble();
                }
                System.out.print("\n\n");
                System.out.print("Nilai Communication: ");
                communication = s.nextDouble();
                if(communication<0 || communication>100){
                    System.out.print("Nilai Communication: ");
                    communication = s.nextDouble();
                }
                System.out.print("\n\n");
                break;
            default:
                System.out.print("Input Error!\n");
                break;
        }
        while (ulang!=3){
            System.out.print("\n");
            System.out.print("+++ MENU +++\n");
            System.out.print("\t1. Tampilkan Hasil\n");
            System.out.print("\t2. Ubah Nilai Pelamar\n");
            System.out.print("\t3. Keluar\n");
            System.out.print("Pilih: ");
            ulang = s.nextInt();
            switch(ulang){
                case 1:
                    switch(pilih){
                        case 1:
                            Programmer pro = new Programmer();
                            pro.HitungProgrammer(programming, coding, debugging, nama);
                            break;
                        case 2:
                            Designer des = new Designer();
                            des.HitungDesigner(design, proto, creativity, nama);
                            break;
                        case 3:
                            Manager man = new Manager();
                            man.HitungManager(innovation, decision, communication, nama);
                            break;
                        default:
                            System.out.print("Input Error!\n");
                            break;
                    }
                    break;
                case 2:  
                    System.out.print("*** Edit Nilai***\n");
                    switch(pilih){
                        case 1:
                            System.out.print("Nilai Programming Knowledge: ");
                            programming = s.nextDouble();
                            if(programming<0 || programming>100){
                                System.out.print("Nilai Programming Knowledge: ");
                                programming = s.nextDouble();
                            }
                            System.out.print("\n\n");
                            System.out.print("Nilai Clean Coding: ");
                            coding = s.nextDouble();
                            if(coding<0 || coding>100){
                                System.out.print("Nilai Clean Coding: ");
                                coding = s.nextDouble();
                            }
                            System.out.print("\n\n");
                            System.out.print("Nilai Debugging: ");
                            debugging = s.nextDouble();
                            if(debugging<0 || debugging>100){
                                System.out.print("Nilai Debugging: ");
                                debugging = s.nextDouble();
                            }
                            System.out.print("\n");
                            Programmer pro = new Programmer();
                            pro.HitungProgrammer(programming, coding, debugging, nama);
                            break;
                        case 2:
                            System.out.print("Nilai Design Portfolio: ");
                            design = s.nextDouble();
                            if(design<0 || design>100){
                                System.out.print("Nilai Design Portfolio: ");
                                design = s.nextDouble();
                            }
                            System.out.print("\n\n");
                            System.out.print("Nilai Prototyping: ");
                            proto = s.nextDouble();
                            if(proto<0 || proto>100){
                                System.out.print("Nilai Prototyping: ");
                                proto = s.nextDouble();
                            }
                            System.out.print("\n\n");
                            System.out.print("Nilai Creativity: ");
                            creativity = s.nextDouble();
                            if(creativity<0 || creativity>100){
                                System.out.print("Nilai Creativity: ");
                                creativity = s.nextDouble();
                            }
                            System.out.print("\n");       
                            Designer des = new Designer();
                            des.HitungDesigner(design, proto, creativity, nama);
                            break;
                        case 3:
                            System.out.print("Nilai Innovation: ");
                            innovation = s.nextDouble();
                            if(innovation<0 || innovation>100){
                                System.out.print("Nilai Innovation: ");
                                innovation = s.nextDouble();
                            }
                            System.out.print("\n\n");
                            System.out.print("Nilai Decision Making: ");
                            decision = s.nextDouble();
                            if(decision<0 || decision>100){
                                System.out.print("Nilai Decision Making: ");
                                decision = s.nextDouble();
                            }
                            System.out.print("\n\n");
                            System.out.print("Nilai Communication: ");
                            communication = s.nextDouble();
                            if(communication<0 || communication>100){
                                System.out.print("Nilai Communication: ");
                                communication = s.nextDouble();
                            }
                            System.out.print("\n");
                            Manager man = new Manager();
                            man.HitungManager(innovation, decision, communication, nama);
                            break;
                        default:
                            System.out.print("Input Error!\n");
                            break;
                    }
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.print("Input Error!\n");
                    break;
            }
        }
    }
}
    
