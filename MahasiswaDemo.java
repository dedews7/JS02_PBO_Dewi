public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayunintyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "023433";
        m2.nama = "Yuar Nanta";
        m2.alamat = "Kendung, Sumatera Utara";
        m2.kelas = "2D";

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "023434";
        m3.nama = "Sitta Ivana";
        m3.alamat = "Mawar, Sumatera Utara";
        m3.kelas = "2F";

        m1.displayBiodata();
        m2.displayBiodata();
        m3.displayBiodata();
    }
}

