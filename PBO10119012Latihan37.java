
package pbo10119012latihan37;

/**
 *
 * @author damai
 * NAMA   : DAMAI SAPUTRA LAOLI 
 * KELAS  : IF-1
 * NIM    : 10119012
 */
public class PBO10119012Latihan37 {

    
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        double nilaiMahasiswa, ratarata;
        double totalNilai = 0;
        double jumlahMahasiswa = mhs.getBanyak_mahasiswa();

        for (int i =1; i <= jumlahMahasiswa; i++) {
            nilaiMahasiswa = mhs.getNilai(i);
            totalNilai += nilaiMahasiswa;
        }
        ratarata = totalNilai / jumlahMahasiswa;
        System.out.printf("%nMaka, rata-rata nilainya adalah : %1$.1f%n",ratarata);
        System.out.println("Developed by : Anggawan Ridho");
    }
}