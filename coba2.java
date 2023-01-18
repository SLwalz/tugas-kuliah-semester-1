import java.util.Scanner;
public class coba2 {
    
    public static void main (String args[]){
        Scanner as=new Scanner(System.in);
        int nip[]=new int[100], golongan[]=new int[100], tahunKerja[]=new int[100], gaji[]=new int[100], lembur[]=new int[100];
        String nama[]=new String[100];
        int i=0, j=0, ulang=1, print=0, pilihMenu=0, ulangMenu=1;
        char ulang2;

        do {
            System.out.println("\t MENU");
            System.out.println("1. tambah pegawai baru");
            System.out.println("2. cek data pegawai");
            System.out.println("3. hitung gaji anda");
            System.out.println("4. cetak slip gaji");
            System.out.println("5. laporan pegawai");//total data pegawai sekarang, total pengeluran penggajian, total tiap golongan/ jabatan
            System.out.println("pilih menu: ");
            pilihMenu=as.nextInt();
            switch (pilihMenu){

                //satu
                case 1:
        do{
        
        System.out.print("masukkan nama: ");
        as.nextLine();
        nama[i]=as.nextLine();
        
        System.out.print("masukkan nip: ");
        nip[i]=as.nextInt();
        
        System.out.print("masukkan golongan: ");
        golongan[i]=as.nextInt();
        
        //gausa yg bawah
        System.out.print("masukkan tahun kerja: ");
        tahunKerja[i]=as.nextInt();
        
        System.out.print("masukkan lembur: ");
        lembur[i]=as.nextInt();
        
        System.out.println(i);
        i++;
         }while(i<1);
         
         

         //balek
        System.out.print("balek menu? ");
        ulang2=as.next().charAt(0);
        if (ulang2=='y'){
            as.nextLine();
            ulangMenu=1;
        }
        else {
            System.out.print("terima kasih telah menggunakan sistem penghitung gaji Bank WeeBoe >_<");
            ulangMenu=0;
        }
        break;


        //dua
        case 2:
        int balek=1;
            do{
            
            int a=0;
            System.out.print("print data ke-");
            a=as.nextInt();
                System.out.println(nama[a]);
                
                System.out.println(nip[a]);
                
                System.out.println(golongan[a]);
                
                System.out.println(tahunKerja[a]);
                
                System.out.println(lembur[a]);
                
            System.out.println("print lg? ");
            balek=as.nextInt();
        }while(balek==1);
        System.out.print("balek menu? ");
        ulang2=as.next().charAt(0);
        if (ulang2=='y'){
            ulangMenu=1;
           
        }
        else {
            System.out.print("terima kasih telah menggunakan sistem penghitung gaji Bank WeeBoe >_<");
            ulangMenu=0;
        }
        break;

        case 3:
        int pilih=0;
        int hitungGolongan=0, hitungLembur=0;
        System.out.print("hitung pada gaji data ke brp ");
        pilih=as.nextInt();
        hitungGolongan=golongan[pilih];
        hitungLembur=lembur[pilih];
        gaji[pilih]=gajih(hitungGolongan, hitungLembur );
        System.out.println(gaji[pilih]);
        System.out.println("gaji sudah dihitung, cek pada slip");
        //balek
        System.out.print("balek menu? ");
        ulang2=as.next().charAt(0);
        if (ulang2=='y'){
            ulangMenu=1;
           
        }
        else {
            System.out.print("terima kasih telah menggunakan sistem penghitung gaji Bank WeeBoe >_<");
            ulangMenu=0;
        }
        break;

        case 4:
        int milih=0;
        String namaTemp=nama[milih];
        int gajiTemp=gaji[milih];
        System.out.println("print gaji data berapa? ");
        milih=as.nextInt();
        
        System.out.printf("\t\t SLIP GAJI\n");
        System.out.println("-------------------------------------------------");
        System.out.println("PT WEEBOE SEJAHTERA \t Tanggal 30 Februari 2016");
        System.out.printf("\t\t\t atas nama %s\n",namaTemp);
        System.out.println("-------------------------------------------------");
        System.out.printf("Total gaji %d \n\n",gajiTemp);
        System.out.print("balek menu? ");
        ulang2=as.next().charAt(0);
        if (ulang2=='y'){
            ulangMenu=1;
           
        }
        else {
            System.out.print("terima kasih telah menggunakan sistem penghitung gaji Bank WeeBoe >_<");
            ulangMenu=0;
            
        }
        break;

        case 5:
        System.out.println("DATA AKHIR PERUSAHAAN WEEBOE");
        System.out.println("data yang tersediia: ");
        System.out.println("pengeluaran perusahaan dalam penggajian: ");
        System.out.println("banyak pegawai gol 1: ");
        System.out.print("balek menu? ");
        ulang2=as.next().charAt(0);
        if (ulang2=='y'){
            ulangMenu=1;
           
        }
        else {
            System.out.print("terima kasih telah menggunakan sistem penghitung gaji Bank WeeBoe >_<");
            ulangMenu=0;
            
        }
        break;
        default:
        System.out.println("kesalahan saat input, mohon ulangi");
    }


    }while(ulangMenu==1);
}  
//a=golongan, gol smp 3 b=lama lembur
    static int gajih(int a, int b){
        int gol1=1000000, gol2=2000000,gol3=3000000;
        int gjpokok=5000000, total=0, lemb=50000;
        if (a==1){
            total=gjpokok+gol1+(lemb*b);
        }
        else if (a==2){
            total=gjpokok+gol2+(lemb*b);
        }
        else if (a==3){
            total=gjpokok+gol3+(lemb*b);
        }
        return total;
    }
    // static char pulangMenu(char a){

    // }
}


