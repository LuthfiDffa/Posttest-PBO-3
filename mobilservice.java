/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.mobilsport;

public class mobilservice {
    private ArrayList<mobilsport> data = new ArrayList<>();
    
    public void tambah(mobilsport m) {
        data.add(m);
        System.out.println("Data berhasil ditambahkan.");
    }
    
public void tampil() {
        if (data.isEmpty()) {
            System.out.println("(Belum ada data)");
        } else {
            for (int i = 0; i < data.size(); i++) {
                System.out.println((i + 1) + ". " + data.get(i).info());
            }
        }
    }
public void ubah(int index, mobilsport mBaru) {
        data.set(index, mBaru);
        System.out.println("Data berhasil diubah.");
    }

public void hapus(int index) {
        data.remove(index);
        System.out.println("Data berhasil dihapus.");
    }
}
    
