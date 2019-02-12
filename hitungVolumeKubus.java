import java.util.Scanner;
public class hitungVolumeKubus{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		int sisi,volume;

		System.out.println("program Perhitungan volume Kubus");

		System.out.println("Msukan Sisi Kubus");

		sisi = sc.nextInt();

		volume = (sisi*sisi*sisi);

		System.out.println("volume kubus adalah"+volume);
	}
}