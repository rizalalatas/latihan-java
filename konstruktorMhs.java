public class konstruktorMhs{
	int npm;
	String nama;

	public konstruktorMhs(int npm,String nama){
		npm=npm;
		nama=nama;
		System.out.println("NPM  :"+npm);
		System.out.println("NAMA :"+nama);
	}

	public static void main(String[] args){
		konstruktorMhs mhs = new konstruktorMhs(1506700003,"RIJAL BANI SALAM SUKARNI");
	}
}