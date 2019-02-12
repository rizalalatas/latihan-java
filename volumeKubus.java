import java.util.Scanner;
public class volumeKubus{
	public static void main(String[] args){
		Scanner hitung = new Scanner(System.in);
		int sisi;
		int volume;
		

		System.out.println("Masukan Nilai Sisi :");
		sisi = hitung.nextInt()
		volume=(sisi*sisi*sisi);
		System.out.println("Volume Kubus Adalah :"+volume);


	}
}