package models;

import java.sql.Date;

public class Tugas1IF1APSBF {
    public int no;
    public String nama_tugas;
    public String nama_mahasiswa;
    public Date deadline;
    public String prioritas;
    public String status;

    public Tugas1IF1APSBF(int no, String nama_tugas, String nama_mahasiswa, Date deadline, String prioritas, String status) {
        this.no = no;
        this.nama_tugas = nama_tugas;
        this.nama_mahasiswa = nama_mahasiswa;
        this.deadline = deadline;
        this.prioritas = prioritas;
        this.status = status;
    }
}
