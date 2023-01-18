import java.util.Scanner;
public class cobacoba {
    static int ulangMenu=1, totalGaji[]=new int[100], nip[]=new int[100];
    static int lamaLembur[]=new int[100];
    static String namaPegawai[]=new String[100], jabatanPegawai[]=new String[100];
    public static void main (String args[]){
        char kembali;
        int pilihMenu, dataKe=0;
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
                    jabatanPegawai[dataKe]=kemal22.nextLine();

                    System.out.print("masukkan lembur: ");
                    lamaLembur[dataKe]=kemal22.nextInt();
                    dataKe++;
                    
                }while(dataKe<1);
                    System.out.println("kembali ke menu?");
                    kembali=kemal22.next().charAt(0);
                    kembaliKeMenu(kembali);
                
                    break;
                    
                default:
                    System.out.println("");
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
    
}
//ulang menu
// System.out.println("kembali ke menu?");
//             kembali=kemal22.next().charAt(0);
//             kembaliKeMenu(kembali);
