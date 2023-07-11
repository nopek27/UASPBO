import java.util.Scanner;


public class EditMenu extends Main{
   public static Scanner scan = new Scanner(System.in);
   static String namaminuman;
    public static void Menu(){
		   String cobalagi ="n";
		   
		   
    do {
			
			int pilihan = pilihMenu();
			System.out.println("Anda Memilih Pilihan " + pilihan);
			
			switch (pilihan) {
			case 1:
				tambahMenu();
				break;
			case 2:
				updateMenu();
				break;
			case 3:
				deleteMenu();
				break;
			default:
				System.out.println("pilihan salah!!!");
			}
			
			System.out.println("Masih mau mengedit menu? (y/n)");
			cobalagi = scan.next();
		}while (cobalagi.equals("y"));
    }

	public static int pilihMenu() {
		System.out.println(" ");
		System.out.println("1. Tambah Menu");
		System.out.println("2. Upadate Menu");
		System.out.println("3. Delete Menu");
		System.out.print("Masukkan Opsi: ");
		int pilih = 0;
		
		try {
			pilih = scan.nextInt();
		}catch (Exception e) {
			System.out.println("Inputan salah!");
		}
		return pilih;
		
	}

	private static void tambahMenu() {
		text.teks ();
		
		System.out.print("Masukkan nama minuman: ");
		scan.nextLine();
		String minuman = scan.nextLine();

		System.out.print("Masukkan harga minuman: ");
		int harga = scan.nextInt();
		
		Gudang minumanan = new Gudang(minuman, harga);
		listminuman.add(minumanan);
		
	}

	private static void deleteMenu() {
		Main.show();
		System.out.println("Anda memilih pilihan delete menu");
		
		System.out.print("Masukkan nomor menu yang ingin di delete: ");
		
		try {
		int nomor = scan.nextInt();
		Gudang minuman = listminuman.get(nomor - 1);
		namaminuman=minuman.getminuman();
		System.out.println("Apakah anda yakin menghapus Menu Nomor" + namaminuman + " dari menu?(y/n)");
		scan.nextLine();
		String validation = scan.nextLine();
		
		if(validation.equals("y")) {
		listminuman.remove(nomor-1);
		System.out.println("Minuman berhasil dihapus!");
		}
		}catch(Exception e) {
			System.out.println("Nomor tidak ada!");
		}
		
	}
	private static void updateMenu() {
	Main.show();
		System.out.print("Masukkan nomor menu yang ingin di ubah: ");
		
		try {
		int nomor = scan.nextInt();
		Gudang minuman = listminuman.get(nomor - 1);
		namaminuman=minuman.getminuman();
		System.out.println("Apakah anda yakin mengganti menu " + namaminuman+ " dari menu?(y/n)");
		scan.nextLine();
		String validation = scan.nextLine();
		
		if(validation.equals("y")) {
		listminuman.remove(nomor-1);
		System.out.print("Masukkan Nama Minuman Baru: ");
		String minumanbaru = scan.nextLine();

		System.out.print("Masukkan harga Minuman: ");
		int harga = scan.nextInt();

		Gudang minumanan = new Gudang(minumanbaru, harga);
		listminuman.add(minumanan);
		
		
		}
		}catch(Exception e) {
			System.out.println("Nomor tidak ada!");
		}
		
	}
}

     