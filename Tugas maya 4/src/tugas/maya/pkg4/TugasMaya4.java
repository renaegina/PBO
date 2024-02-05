/*
 * AUTHOR          : RENA EGINA BR PANDIA
 * NIM             : 212406015
 * TANGGAL         : 24 MARET 
 * TUJUAN  PROGRAM : MENJELASKAN CARA PEMBUATAN CLASS, OBJECT, DAN METHOD 
 */

package tugas.maya.pkg4;

public class TugasMaya4 {

    public static void main(String[] args) {
        tanaman bunga  = new tanaman ();
        tanaman bunga1 = new tanaman();
        tanaman bunga2 = new tanaman();
        tanaman bunga3 = new tanaman();
        tanaman bunga4 = new tanaman ();
        
        System.out.println("\t\t\t\t\t\t\tJENIS BUNGA BESERTA NAMA ILMIAH");
        System.out.println("\t\t\t\t\t\t\t===============================");
        bunga.nama      = "Matahari";
        bunga.namalatin = "Helianthus annus L";
        bunga.ordo      = "Asterales";
        bunga.famili    = "Asteraceae";
        bunga.genus     = "Helianthus";
        bunga.spesies   = "Helianthus annus";
        
        System.out.println("Nama       : " + bunga.nama);
        System.out.println("Nama latin : " + bunga.namalatin);
        System.out.println("Ordo       : " + bunga.ordo);
        System.out.println("Famili     : " + bunga.famili);
        System.out.println("Genus      : " + bunga.genus);
        System.out.println("Spesies    : " + bunga.spesies);
        bunga.keterangan();
        System.out.println();
        
        bunga1.nama      = "Lavender";
        bunga1.namalatin = "Lavandula";
        bunga1.ordo      = "Lamiales";
        bunga1.famili    = "Lamiaceae";
        bunga1.genus     = "Lavandula";       
        
        System.out.println("Nama       : " + bunga1.nama);
        System.out.println("Nama latin : " + bunga1.namalatin);
        System.out.println("Ordo       : " + bunga1.ordo);
        System.out.println("Famili     : " + bunga1.famili);
        System.out.println("Genus      : " + bunga1.genus);
        bunga1.keterangan1();
        System.out.println();
        
        bunga2.nama      = "Edelweiss";
        bunga2.namalatin = "Anaphalis javanica";
        bunga2.ordo      = "Asterales";
        bunga2.famili    = "Asteraceae";
        bunga2.genus     = "Anaphalis";
        bunga2.spesies   = "A.javanica";
        
        System.out.println("Nama       : " + bunga2.nama);
        System.out.println("Nama latin : " + bunga2.namalatin);
        System.out.println("Ordo       : " + bunga2.ordo);
        System.out.println("Famili     : " + bunga2.famili);
        System.out.println("Genus      : " + bunga2.genus);
        System.out.println("Spesies    : " + bunga2.spesies);
        bunga2.keterangan2();
        System.out.println();
        
        bunga3.nama      = "Tulip";
        bunga3.namalatin = "Tulipa";
        bunga3.ordo      = "Liliales";
        bunga3.famili    = "Liliaceae";
        bunga3.genus     = "Tulipa";      
        
        System.out.println("Nama       : " + bunga3.nama);
        System.out.println("Nama latin : " + bunga3.namalatin);
        System.out.println("Ordo       : " + bunga3.ordo);
        System.out.println("Famili     : " + bunga3.famili);
        System.out.println("Genus      : " + bunga3.genus);
        bunga3.keterangan3();
        System.out.println();
        
        bunga4.nama      = "Lily";
        bunga4.namalatin = "Lilium";
        bunga4.ordo      = "Liliales";
        bunga4.famili    = "Liliaceae";
        bunga4.genus     = "Lilium";
        bunga4.spesies   = "Lilium regale";
        
        System.out.println("Nama       : " + bunga4.nama);
        System.out.println("Nama latin : " + bunga4.namalatin);
        System.out.println("Ordo       : " + bunga4.ordo);
        System.out.println("Famili     : " + bunga4.famili);
        System.out.println("Genus      : " + bunga4.genus);
        System.out.println("Spesies    : " + bunga4.spesies);
        bunga4.keterangan4();
        System.out.println();
       
        
        
        
 
    }
    
}
