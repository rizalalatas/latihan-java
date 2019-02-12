public class methodMhs{
	String npm;
	String nama;

	void dataMhs(){
		System.out.println("NPM  :"+npm);
		System.out.println("NAMA :"+nama);
	}

	public static void main(String[] args){
		//membuat object
		methodMhs mhs = new methodMhs();

		//memanggil atribut dan memberikan nilai

		mhs.npm="1506700003";
		mhs.nama="RIJAL BANI SALAM SUKARNI";
		mhs.dataMhs();
	}

}
