import java.util.Scanner;

public class StudiKasus230 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nama;
        String jenis;
        int jumlahDokumen;
        int peringkat;
        int statusPendanaan;

        System.out.print("Nama Mahasiswa : ");
        nama = input.nextLine();

        System.out.print("Jenis Kegiatan : ");
        jenis = input.nextLine();

           if (jenis.equalsIgnoreCase("BELMAWA")
                    || jenis.equalsIgnoreCase("BAKORMA")
                    || jenis.equalsIgnoreCase("MANDIRI")) {

                        System.out.print("Jumlah Dokumen : ");
                        jumlahDokumen = input.nextInt();

                        System.out.print("Peringkat : ");
                        peringkat = input.nextInt();

                   
                    }
                }
            }