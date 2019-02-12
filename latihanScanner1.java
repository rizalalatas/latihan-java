import java.util.Scanner;
public class latihanScanner1{
	public static void main(String args []){
		Scanner masukan = new Scanner(System.in);
		String x;
		System.out.println("Masukan Sebuah Kata :"); 
		x = masukan.next();
		System.out.println("Kata Yang Anda Masukan Adalah :"+x);
	}
}