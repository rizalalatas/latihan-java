public class Buku{
	String judul;
	String pengarang;
	String penerbit;
	int tahun;

	public Buku(String judul,String pengarang,String penerbit,int tahun){
		this.judul=judul;
		this.pengarang=pengarang;
		this.penerbit=penerbit;
		this.tahun=tahun;
		}
		
		void cetakBuku(){
		System.out.println("JUDUL 		:"+judul);
		System.out.println("PENGARANG 	:"+pengarang);
		System.out.println("PENERBIT 	:"+penerbit);
		System.out.println("TAHUN 		:"+tahun);
	}

 }
