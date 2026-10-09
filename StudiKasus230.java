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

        System.out.print("Jenis Kegiatan BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA : ");
        jenis = input.nextLine();

        if (jenis.equalsIgnoreCase("BELMAWA") || 
            jenis.equalsIgnoreCase("BAKORMA") || 
            jenis.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Jumlah Dokumen : ");
            jumlahDokumen = input.nextInt();

            System.out.print("Peringkat : ");
            peringkat = input.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                if (jumlahDokumen == 4) {
                System.out.println("Status: berhak memperoleh dana penghargaan");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status: tidak lengkap, (kurang " + kurang + " dokumen) Dana Penghargaan tidak diberikan");
                }
            } else {
                System.out.println("Status: tidak memperoleh dana penghargaan");
            }

        } else if (jenis.equalsIgnoreCase("PKM")) {
                        System.out.print("Jumlah Dokumen : ");
                        jumlahDokumen = input.nextInt();

                        System.out.print("Status Pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
                        statusPendanaan = input.nextInt();

                        if (statusPendanaan == 1) {
                            if (jumlahDokumen == 4) {
                                System.out.println("Status: berhak memperoleh dana penghargaan");
                            } else {
                                int kurang = 4 - jumlahDokumen;
                                System.out.println("Status: tidak lengkap, (kurang " + kurang + " dokumen) Dana Penghargaan tidak diberikan");
                            }
                        } else {
                            System.out.println("Status: tidak memperoleh dana penghargaan");
                        }                
        } else {
            System.out.print("Jumlah Dokumen : ");
            jumlahDokumen = input.nextInt();

            System.out.print("Peringkat : ");
            peringkat = input.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                if (jumlahDokumen == 4) {
                System.out.println("Status: Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status: Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
                }
        }

        input.close();
    }
}
}