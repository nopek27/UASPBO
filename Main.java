import java.util.ArrayList;
import java.util.Scanner;

//Encaptulation : private setget
//Inheritance : extends
//Polimorfisme : override overloading
//Abstract : abstract


public class Main {
    public static ArrayList<Gudang>listminuman = new ArrayList<>();

    public static Scanner scan = new Scanner(System.in);
    public static EditMenu editmenu = new EditMenu();
    public static text text = new text();
    public static void main(String[] args) {
        String cobalagi = "n";
        String kembali = "n";
        int totalharga=0;
        initGudang(); 
        

    do {
        int pilih = PilihMenu();
        System.out.println(" ");
        switch (pilih) {
        case 1: //pesan
            show();
        do {
             totalharga = Beli()+totalharga;
             System.out.println(" ");
             System.out.println("Total Pesanan = "+totalharga);
             System.out.print("Pesan Lagi? (y/n) = ");
             cobalagi = scan.next();

            
            }
        while(cobalagi.equals("y"));
             System.out.println(" ");
             System.out.println("Kembali Ke Menu Awal? (ketik y)");
             System.out.println("Bayar pesanan? (ketik n)");
             System.out.print("Ketik = ");
             kembali = scan.next();
             break;
      
        case 2:
        EditMenu.Menu();
            do {

            }
            
            while(cobalagi.equals("y"));
                System.out.println("Kembali Ke Menu Awal? (y/n)");
                kembali = scan.next();
                break;

        default:
        System.out.println("Masukkan Menu Yang Benar!");
        kembali = "y";
        }
    }
    while (kembali.equals("y"));
    if (kembali.equals("n")){
        System.out.println("");
        System.out.println("Total Pesanan Kamu = "+totalharga+" Ribu");
        System.out.println("Segera Bayar Kekasir...");
    }

}
           

       
        
    
    //method inisiasi
    public static void initGudang(){
        Gudang minuman1 = new Gudang("Arak Original", 30000);
        Gudang minuman2 = new Gudang("Arak Leci", 60000);
        Gudang minuman3 = new Gudang("Arak Madu", 30000);

        listminuman.add(minuman1);
        listminuman.add(minuman2);
        listminuman.add(minuman3);
    }

    //method showing
   public static void show(){
    for(int i = 0; i < listminuman.size(); i++){
	System.out.println((i+1)+ "\t" + listminuman.get(i).minuman + "\t\t" + listminuman.get(i).harga);

    }
    }

    //method order
    public static int Beli(){
        int totalharga=0;
            System.out.print("Masukkan Nomer Pesanan = ");
            int nomorpesanan = scan.nextInt();
                if(nomorpesanan !=0){ 
                    totalharga = listminuman.get(nomorpesanan-1).harga; 
                }
        return totalharga;
    }


    //list pilihan
    public static int PilihMenu(){
        System.out.println("1. Pesan");
        System.out.println("2. Edit Minuman");
        int pilih = 0;
		
		try {
            System.out.print("Pilih Menu = ");
			pilih = scan.nextInt();
		}catch (Exception e) {
			System.out.println("Inputan salah!");
		}
		return pilih;
    }
   
}