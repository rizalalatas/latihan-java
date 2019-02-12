import java.util.Scanner;
public class TugasUts{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Nama  : RIJAL BANI SALAM S");
		System.out.println("Npm   : 1506700003");
		System.out.println("Kelas : A");
		System.out.println("==============================");
		System.out.println("   APLIKASI NILAI AKADEMIK    ");
		System.out.println("==============================");
		System.out.print("  Masukan Nilai Tugas1:");
		double tugas1=input.nextInt();
		System.out.print("  Masukan Nilai Tugas2:");
		double tugas2=input.nextInt();
		System.out.print("  Masukan Nilai Tugas3:");
		double tugas3=input.nextInt();
		System.out.print("  Masukan Nilai Tugas4:");
		double tugas4=input.nextInt();
		System.out.println("==============================");
		double tugas=(tugas1+tugas2+tugas3+tugas4)/4.0;
		System.out.println("  Nilai Tugas: "+tugas);
		System.out.print("  Masukan Nilai UTS:");
		double uts=input.nextInt();
		System.out.print("  Masukan Nilai UAS:");
		double uas=input.nextInt();
		System.out.println("==============================");
		double akhir=(tugas+uts+uas)/3.0;
		System.out.println("  Nilai Akhir: "+akhir);
		System.out.println("==============================");
		if(akhir > 90){
			System.out.println("Anda Berhasil Dengan Sangat Baik");
			System.out.println("             Grade = A");
		}else if(akhir > 70){
			System.out.println("Anda Berhasil Dengan Baik");
			System.out.println("             Grade = B");
		}else if(akhir > 60){
			System.out.println("Anda Berhasil Dengan Nilai Minimum");
			System.out.println("             Grade = C");
		}

		System.out.println("*******************************");
		System.out.println("   *************************");
	}
}