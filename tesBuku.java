public class tesBuku{
	public static void main(String[] args){
		Buku buku = new Buku("Pemrograman Berbasis Objek Dengan Java","Indrajani","Elexmedia Komputindo",2007);
		Buku buku2 = new Buku("Dasar Pemrograman Java","Abdul Kadir","Andi Ofset",2006);
	
		buku.cetakBuku();
		buku2.cetakBuku();
	}
}