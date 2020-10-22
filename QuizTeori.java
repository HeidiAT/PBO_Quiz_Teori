import java.util.Scanner;

public class QuizTeori
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String nama;
		int tipe, j, bayar, tothar, k;
		
		System.out.println("Tipe Rumah: ");
		System.out.println("31 >> Rp 100.000");
		System.out.println("32 >> Rp 125.000");
		System.out.println("33 >> Rp 450.000");
		System.out.println("34 >> Rp 480.000");
		System.out.println("35 >> Rp 500.000");
		System.out.println("40 >> Rp 550.000");
		System.out.print("Masukkan Nama: ");
			nama = input.nextLine();
		System.out.print("Masukkan Tipe Rumah: ");
			tipe = input.nextInt();
		if (tipe == 31)
		{
			System.out.print("Masukkan Jumlah Meteran Pemakaian: ");
				j = input.nextInt();
			tothar = j * 100000;
			System.out.println("Total Harga: "+tothar);
			System.out.print("Masukkan Bayar: ");
				bayar = input.nextInt();
			k = bayar - tothar;
			System.out.println("Kembalian: "+k);
		}
		else if (tipe == 32)
		{
			System.out.print("Masukkan Jumlah Meteran Pemakaian: ");
				j = input.nextInt();
			tothar = j * 125000;
			System.out.println("Total Harga: Rp "+tothar);
			System.out.print("Masukkan Bayar: Rp ");
				bayar = input.nextInt();
			k = bayar - tothar;
			System.out.println("Kembalian: Rp "+k);
		}
		else if (tipe == 33)
		{
			System.out.print("Masukkan Jumlah Meteran Pemakaian: ");
				j = input.nextInt();
			tothar = j * 450000;
			System.out.println("Total Harga: Rp "+tothar);
			System.out.print("Masukkan Bayar: Rp ");
				bayar = input.nextInt();
			k = bayar - tothar;
			System.out.println("Kembalian: Rp "+k);
		}
		else if (tipe == 34)
		{
			System.out.print("Masukkan Jumlah Meteran Pemakaian: ");
				j = input.nextInt();
			tothar = j * 480000;
			System.out.println("Total Harga: Rp "+tothar);
			System.out.print("Masukkan Bayar: Rp ");
				bayar = input.nextInt();
			k = bayar - tothar;
			System.out.println("Kembalian: Rp "+k);
		}
		else if (tipe == 35)
		{
			System.out.print("Masukkan Jumlah Meteran Pemakaian: ");
				j = input.nextInt();
			tothar = j * 500000;
			System.out.println("Total Harga: Rp "+tothar);
			System.out.print("Masukkan Bayar: Rp ");
				bayar = input.nextInt();
			k = bayar - tothar;
			System.out.println("Kembalian: Rp "+k);
		}
		else if (tipe == 40)
		{
			System.out.print("Masukkan Jumlah Meteran Pemakaian: ");
				j = input.nextInt();
			tothar = j * 550000;
			System.out.println("Total Harga: Rp "+tothar);
			System.out.print("Masukkan Bayar: Rp ");
				bayar = input.nextInt();
			k = bayar - tothar;
			System.out.println("Kembalian: Rp "+k);
		}
		else
			System.out.println("Pilihan Anda salah!! Silahkan Pilih Tipe pada Daftar");
	}
}