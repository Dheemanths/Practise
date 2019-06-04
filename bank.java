package Xavienttelus.Neustar;

interface private_banks{
	abstract int SB_int(int sb);
	abstract int FD_int(int fd);
	
	
}

 class icici_bank implements private_banks{
	public int SB_int(int sb) {
		System.out.println("sb intrest value is "+sb);
		return sb;
		
	}
	
	public int FD_int(int fd) {
		System.out.println("fd intrest value is "+fd);
		return fd;
	}
	
}

 
public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private_banks ib= new icici_bank();
		ib.SB_int((int) 6.7);
		
		ib.FD_int((int)5.6);
	}

}
