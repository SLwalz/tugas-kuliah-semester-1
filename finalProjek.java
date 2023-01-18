import java.util.Scanner;
public class finalProjek {
    static int ulangMenu=1, totalGaji[]=new int[10], nip[]=new int[10];
    static int lamaLembur[]=new int[10], jenisGaji[]=new int[10], lembur=50000;
    static int gajiPokokKodeC=3500000, gajiPokokKodeT=3500000, gajiPokokKodeA=5500000;
    static int gajiPokokKodeSC=2050000, gajiPokokKodeS=3750000, tunjangan=1000000;
    static int bayaranLembur[]=new int[10], counter[]=new int[11];
    static String namaPegawai[]=new String[10], jabatanPegawai[]=new String[10];
    public static void main (String args[]){
        char konfirmasi;
        String tempJabatan;
        int pilihMenu, dataKe=0, isiNIP=0;
        Scanner kemal22=new Scanner(System.in);
        do {
            System.out.println("---------------------------------------------------------------");
            System.out.println("\tSELAMAT DATANG DI SISTEM PENGGAJIAN BANK WEEBOE");
            System.out.println("---------------------------------------------------------------");
            System.out.println("silahkan pilih menu yang anda inginkan");
            System.out.println("1. tambah pegawai baru");
            System.out.println("2. cek data pegawai");
            System.out.println("3. hitung gaji");
            System.out.println("4. cetak slip gaji");
            System.out.println("5. laporan pegawai");
            System.out.println("9. aturan menggunakan sistem");
            System.out.println("0. akhiri program");
            System.out.println("---------------------------------------------------------------");
            System.out.print("pilih menu: ");
            pilihMenu=kemal22.nextInt();
            System.out.println("---------------------------------------------------------------");
            switch (pilihMenu) {
                case 1:
                int confirmMenu1=0;
                do{
                    do{
                    System.out.print("masukkan nama        : ");
                    kemal22.nextLine();
                    namaPegawai[dataKe]=kemal22.nextLine();
                    
                    System.out.print("masukkan nip         : ");
                    nip[dataKe]=kemal22.nextInt();
                    
                    System.out.print("masukkan jabatan     : ");
                    kemal22.nextLine();
                    jabatanPegawai[dataKe]=kemal22.nextLine();

                    System.out.print("masukkan lembur (jam): ");
                    lamaLembur[dataKe]=kemal22.nextInt();
                    tempJabatan=jabatanPegawai[dataKe];
                    dataKe++;
                    counter[0]+=1;
                    if (tempJabatan.equalsIgnoreCase("Auditor")){
                        counter[1]+=1;
                        break;
                    } else if (tempJabatan.equalsIgnoreCase("Customer Service")){
                        counter[2]+=1;
                        break;
                    } else if (tempJabatan.equalsIgnoreCase("Staff")){
                        counter[3]+=1;
                        break;
                    } else if (tempJabatan.equalsIgnoreCase("Security")){
                        counter[4]+=1;
                        break;
                    } else if (tempJabatan.equalsIgnoreCase("Teller")){
                        counter[5]+=1;
                        break;
                    }
                    System.out.println("---------------------------------------------------------------");
                    } while(dataKe<1);
                int a=0;
                System.out.println("ingin cek data yang lain?");
                System.out.println("1. ya\n2. tidak");
                a=kemal22.nextInt();
                    if (a==1){
                        confirmMenu1=1;
                    }
                    else{
                        break;
                    }
                } while(confirmMenu1==1);
                ulangMenu=1;
                    
                    break;
                
                case 2:
                int confirmMenu2=0;
                    do{
                    System.out.print("masukkan NIP yang ingin dicari: ");
                    isiNIP=kemal22.nextInt();
                    System.out.println("---------------------------------------------------------------");
                    lihatDataPegawai(isiNIP);
                    int a=0;
                    System.out.println("ingin cek data yang lain?");
                    System.out.println("1. ya\n2. tidak");
                    a=kemal22.nextInt();
                    if (a==1){
                        confirmMenu2=1;
                    }
                    else{
                        break;
                    }
                    } while(confirmMenu2==1);
                    ulangMenu=1;
                    break;

                case 3:
                    hitungGaji();
                    System.out.println("penghitungan gaji telah selesai, silahkan cetak slip gaji anda");
                    break;

                case 4:
                    System.out.print("masukkan NIP yang ingin dihitung Gajinya: ");
                    isiNIP=kemal22.nextInt();
                    System.out.println("---------------------------------------------------------------");
                    cetakSlipGaji(isiNIP);
                    System.out.println("---------------------------------------------------------------");

                    System.out.println("kembali ke menu? (y)");
                    konfirmasi=kemal22.next().charAt(0);
                    kembaliKeMenu(konfirmasi);
                    break;

                case 5:
                int pengeluaranBank=0;
                for(int i=0;i<totalGaji.length;i++){
                    pengeluaranBank+=totalGaji[i];
                    }
                    
                    System.out.println("\t\tDATA PENGGAJIAN BANK WEEBOE");
                    System.out.println("data pegawai yang tersedia: "+counter[0]);
                    System.out.println("banyak Auditor            : "+counter[1]);
                    System.out.println("banyak Customer Service   : "+counter[2]);
                    System.out.println("banyak Staff              : "+counter[3]);
                    System.out.println("banyak Security           : "+counter[4]);
                    System.out.println("banyak Teller             : "+counter[5]);  
                    System.out.println("total pengeluaran bank   : Rp "+pengeluaranBank);  
                    System.out.println("---------------------------------------------------------------");

                    System.out.println("kembali ke menu? (y)");
                    konfirmasi=kemal22.next().charAt(0);
                    kembaliKeMenu(konfirmasi);
                    break;
                
                case 9:
                    System.out.println("\t\tATURAN MENGGUNAKAN SISTEM (BACA DAHULU!!)");
                    System.out.println("1. jabatan yang tersedia hanya");
                    System.out.println("    a. Auditor");
                    System.out.println("    b. Customer Service");
                    System.out.println("    c. Security");
                    System.out.println("    d. Staff");
                    System.out.println("    e. Teller");
                    System.out.println("2. lakukan 'hitung gaji anda' sebelum melihat laporan pegawai");
                    break;
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
                System.out.println("NAMA       : "+namaPegawai[pencarian]);
                System.out.println("NIP        : "+nip[pencarian]);
                System.out.println("JABATAN    : "+jabatanPegawai[pencarian]);
                System.out.println("LAMA LEMBUR: "+lamaLembur[pencarian]+" jam");
                System.out.println("---------------------------------------------------------------");
                
                break;
            }
            else if(nip[i]==0){
                System.out.println("                    data tidak ditemukan");
                System.out.println("---------------------------------------------------------------");
                break;
            }
        }
        return a;
    }
    static void hitungGaji(){
        int pencarian=0;
        for (int i=0;i<counter[0];i++){
            pencarian=i;
                if (jabatanPegawai[pencarian].equalsIgnoreCase("Auditor")){
                    totalGaji[pencarian]=gajiPokokKodeA+tunjangan+lembur*lamaLembur[pencarian];
                    jenisGaji[pencarian]=gajiPokokKodeA;
                    bayaranLembur[pencarian]=lembur*lamaLembur[pencarian];
                    
                } else if (jabatanPegawai[pencarian].equalsIgnoreCase("Customer Service")){
                    totalGaji[pencarian]=gajiPokokKodeC+tunjangan+lembur*lamaLembur[pencarian];
                    jenisGaji[pencarian]=gajiPokokKodeC;
                    bayaranLembur[pencarian]=lembur*lamaLembur[pencarian];
                    
                } else if (jabatanPegawai[pencarian].equalsIgnoreCase("Staff")){
                    totalGaji[pencarian]=gajiPokokKodeS+tunjangan+lembur*lamaLembur[pencarian];
                    jenisGaji[pencarian]=gajiPokokKodeS;
                    bayaranLembur[pencarian]=lembur*lamaLembur[pencarian];
                    
                } else if (jabatanPegawai[pencarian].equalsIgnoreCase("Security")){
                    totalGaji[pencarian]=gajiPokokKodeSC+tunjangan+lembur*lamaLembur[pencarian];
                    jenisGaji[pencarian]=gajiPokokKodeSC;
                    bayaranLembur[pencarian]=lembur*lamaLembur[pencarian];
                    
                } else if (jabatanPegawai[pencarian].equalsIgnoreCase("Teller")){
                    totalGaji[pencarian]=gajiPokokKodeT+tunjangan+lembur*lamaLembur[pencarian];
                    jenisGaji[pencarian]=gajiPokokKodeT;
                    bayaranLembur[pencarian]=lembur*lamaLembur[pencarian];
                }
        } 
    }
    static int cetakSlipGaji(int a){
        int pencarian;
        for (int i=0;i<nip.length;i++){
            if(nip[i]==a){
                pencarian=i;
                System.out.printf("\t\t SLIP GAJI\n");
                System.out.println("=================================================");
                System.out.println("PT WEEBOE SEJAHTERA \t tanggal 30 Desember 2016");
                System.out.printf("\t\t\t atas nama %s  \n",namaPegawai[pencarian]);
                System.out.printf("\t\t\t jabatan %s  \n",jabatanPegawai[pencarian]);
                System.out.println("=================================================");
                System.out.printf("Gaji pokok \t\tRp\t%d  \n",jenisGaji[pencarian]);
                System.out.printf("Besar tunjangan \tRp\t%d  \n",tunjangan);
                System.out.printf("Bayaran Lembur \t\tRp\t%d  \n",bayaranLembur[pencarian]);
                System.out.printf("Total gaji \t\tRp\t%d  \n",totalGaji[pencarian]);
                break;
            }
            else if(nip[i]==0){
                System.out.println("                    data tidak ditemukan");
                // System.out.println("---------------------------------------------------------------");
                break;
            }
        } 
        return a;   
    }
    static void correctNotification(){
        System.out.println("Gaji Anda Sudah Diproses, Silahkan Cetak Slip Gaji");
        System.out.println("---------------------------------------------------------------");
    }
}