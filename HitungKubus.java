import java.util.Scanner;
public class HitungKubus{
	Scanner hitung = new Scanner(System.in);
		int sisi;
		int volume;

		public HitungKubus(int nilai){
			this.sisi=nilai;

		}


		void tampilkan(){
		System.out.println("Masukan Nilai Sisi :");
		sisi = hitung.nextInt();
		volume=(sisi*sisi*sisi);
		
		return volume;
		}
	public static void main(String[] args){
		HitungKubus tampil = new HitungKubus();
		System.out.println("Hasilnya Adalah ="+HitungKubus.tampilkan());

		


	}
}