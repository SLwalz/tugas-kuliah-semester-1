import java.util.Scanner;
public class kodeprojekSem1 {
    static int ulangMenu=1, totalGaji[]=new int[5], nip[]=new int[5];
    static int lamaLembur[]=new int[5], jenisGaji[]=new int[5], lembur=50000;
    static int gajiPokokKodeC=3500000, gajiPokokKodeT=3500000, gajiPokokKodeA=5500000;
    static int gajiPokokKodeSC=2050000, gajiPokokKodeS=3750000, tunjangan=1000000;
    static int bayaranLembur[]=new int[5];
    static String namaPegawai[]=new String[5], jabatanPegawai[]=new String[5];
    public static void main (String args[]){
        char kembali;
        int pilihMenu, dataKe=0, isiNIP=0;
        Scanner kemal22=new Scanner(System.in);
        do {
            System.out.println("---------------------------------------------------------------");
            System.out.println("\tSELAMAT DATANG DI SISTEM PENGGAJIAN BANK WEEBOE");
            System.out.println("---------------------------------------------------------------");
            System.out.println("silahkan pilih menu yang anda inginkan");
            System.out.println("1. tambah pegawai baru");
            System.out.println("2. cek data pegawai");
            System.out.println("3. hitung gaji anda");
            System.out.println("4. cetak slip gaji");
            System.out.println("5. laporan pegawai");
            System.out.println("0. akhiri program");
            System.out.println("---------------------------------------------------------------");
            System.out.print("pilih menu: ");
            pilihMenu=kemal22.nextInt();
            System.out.println("---------------------------------------------------------------");
            switch (pilihMenu) {
                case 1:
                do{
                    System.out.print("masukkan nama: ");
                    kemal22.nextLine();
                    namaPegawai[dataKe]=kemal22.nextLine();
                    
                    System.out.print("masukkan nip: ");
                    nip[dataKe]=kemal22.nextInt();
                    
                    System.out.print("masukkan jabatan: ");
                    kemal22.nextLine();
                    jabatanPegawai[dataKe]=kemal22.nextLine();

                    System.out.print("masukkan lembur (jam): ");
                    lamaLembur[dataKe]=kemal22.nextInt();
                    dataKe++;
                    System.out.println("---------------------------------------------------------------");
                } while(dataKe<1);

                    System.out.println("kembali ke menu? (y)");
                    kembali=kemal22.next().charAt(0);
                    kembaliKeMenu(kembali);
                    
                    break;
                
                case 2:
                    System.out.print("masukkan NIP yang ingin dicari: ");
                    isiNIP=kemal22.nextInt();
                    System.out.println("---------------------------------------------------------------");
                    lihatDataPegawai(isiNIP);

                    System.out.println("kembali ke menu? (y)");
                    kembali=kemal22.next().charAt(0);
                    kembaliKeMenu(kembali);
                    break;

                case 3:
                    System.out.print("masukkan NIP yang ingin dihitung Gajinya: ");
                    isiNIP=kemal22.nextInt();
                    System.out.println("---------------------------------------------------------------");
                    hitungGaji(isiNIP);
                    System.out.println("Gaji Anda Sudah Diproses, Silahkan Cetak Slip Gaji");
                    System.out.println("---------------------------------------------------------------");

                    System.out.println("kembali ke menu? (y)");
                    kembali=kemal22.next().charAt(0);
                    kembaliKeMenu(kembali);
                    break;

                case 4:
                    System.out.print("masukkan NIP yang ingin dihitung Gajinya: ");
                    isiNIP=kemal22.nextInt();
                    System.out.println("---------------------------------------------------------------");
                    cetakSlipGaji(isiNIP);
                    System.out.println("---------------------------------------------------------------");

                    System.out.println("kembali ke menu? (y)");
                    kembali=kemal22.next().charAt(0);
                    kembaliKeMenu(kembali);
                    break;

                case 5:
                    System.out.println("DATA PENGGAJIAN BANK WEEBOE");
                    System.out.println("data pegawai yang tersedia: ");
                    System.out.println("banyak pengeluaran bank: ");
                    System.out.println("banyak Auditor: ");
                    System.out.println("banyak Customer Service: ");
                    System.out.println("banyak Staff: ");
                    System.out.println("banyak Security: ");
                    System.out.println("banyak Teller: ");    
                    
                case 0:
                    System.out.print("terima kasih telah menggunakan sistem penghitung gaji Bank WeeBoe >_<");
                    ulangMenu=0;
                    break;  

                default:
                    System.out.println("mohon pilih menu yang tersedia");
                    break;
            }
            
        }while(ulangMenu==1);
        
    }
    static char kembaliKeMenu(char a){
        if(a=='y'||a=='Y'){
            ulangMenu=1;
        } else{
            System.out.print("terima kasih telah menggunakan sistem penghitung gaji Bank WeeBoe >_<");
            ulangMenu=0;
        }
        return a;
    }
    static int lihatDataPegawai(int a){
        int pencarian;
        for (int i=0;i<nip.length;i++){
            if(nip[i]==a){
                pencarian=i;
                System.out.println("\t\t\tDATA PEGAWAI");
                System.out.println("NAMA: "+namaPegawai[pencarian]);
                System.out.println("NIP: "+nip[pencarian]);
                System.out.println("JABATAN: "+jabatanPegawai[pencarian]);
                System.out.println("LAMA LEMBUR: "+lamaLembur[pencarian]+" jam");
                System.out.println("---------------------------------------------------------------");
                break;
            }
            else if(nip[i]==0){
                System.out.println("data tidak ditemukan");
                System.out.println("---------------------------------------------------------------");
                break;
            }
        }
        return a;
    }
    static int hitungGaji(int a){
        int pencarian; 
        String tempJabatan;
        for (int i=0;i<nip.length;i++){
            if(nip[i]==a){
                pencarian=i;
                tempJabatan=jabatanPegawai[pencarian];
                if (tempJabatan.equalsIgnoreCase("Auditor")){
                    totalGaji[pencarian]=gajiPokokKodeA+tunjangan+lembur*lamaLembur[pencarian];
                    jenisGaji[pencarian]=gajiPokokKodeA;
                    bayaranLembur[pencarian]=lembur*lamaLembur[pencarian];
                } else if (tempJabatan.equalsIgnoreCase("Customer Service")){
                    totalGaji[pencarian]=gajiPokokKodeC+tunjangan+lembur*lamaLembur[pencarian];
                    jenisGaji[pencarian]=gajiPokokKodeC;
                    bayaranLembur[pencarian]=lembur*lamaLembur[pencarian];
                } else if (tempJabatan.equalsIgnoreCase("Staff")){
                    totalGaji[pencarian]=gajiPokokKodeS+tunjangan+lembur*lamaLembur[pencarian];
                    jenisGaji[pencarian]=gajiPokokKodeS;
                    bayaranLembur[pencarian]=lembur*lamaLembur[pencarian];
                } else if (tempJabatan.equalsIgnoreCase("Security")){
                    totalGaji[pencarian]=gajiPokokKodeSC+tunjangan+lembur*lamaLembur[pencarian];
                    jenisGaji[pencarian]=gajiPokokKodeSC;
                    bayaranLembur[pencarian]=lembur*lamaLembur[pencarian];
                } else if (tempJabatan.equalsIgnoreCase("Teller")){
                    totalGaji[pencarian]=gajiPokokKodeT+tunjangan+lembur*lamaLembur[pencarian];
                    jenisGaji[pencarian]=gajiPokokKodeT;
                    bayaranLembur[pencarian]=lembur*lamaLembur[pencarian];
                }
            }
        } 
        return a;   
    }
    static int cetakSlipGaji(int a){
        int pencarian;
        for (int i=0;i<nip.length;i++){
            if(nip[i]==a){
                pencarian=i;
                System.out.printf("\t\t SLIP GAJI\t\t\t|\n");
                System.out.println("-------------------------------------------------");
                System.out.println("PT WEEBOE SEJAHTERA \t        30 Desember 2016|");
                System.out.printf("\t\t\t atas nama %s  \t\t|\n",namaPegawai[pencarian]);
                System.out.printf("\t\t\t jabatan %s  \t|\n",jabatanPegawai[pencarian]);
                System.out.println("-------------------------------------------------");
                System.out.printf("Gaji pokok \t\tRp\t%d \t| \n",jenisGaji[pencarian]);
                System.out.printf("Besar tunjangan \tRp\t%d \t| \n",tunjangan);
                System.out.printf("Bayaran Lembur \t\tRp\t%d \t\t| \n",bayaranLembur[pencarian]);
                System.out.printf("Total gaji \t\tRp\t%d \t| \n",totalGaji[pencarian]);
            }
        } 
        return a;   
    }
}
//ulang menu
// System.out.println("kembali ke menu?");
//             kembali=kemal22.next().charAt(0);
//             kembaliKeMenu(kembali);
