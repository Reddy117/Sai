
public class Bank {

	String bankName;
	String branchCode;
	String IFSC;

	public static void main(String[] args) {
//		System.out.println("Neft transfer");
//		System.out.println("IMPS transfer");
//		System.out.println("RTGS transfer");
//		System.out.println("Within same transfer");
		
		Bank b=new Bank();
		b.neftTransfer(1000);
		b.neftTransfer(5000);
		b.addTwoNums(15,20);
		b.multplicationTable(12);
		b.multplicationTable(19);
		
	}

	public void neftTransfer(int amount) {
		System.out.println("transfer as neft " + amount);

	}
	
	public void IMPS(int amount) {
		System.out.println("transfer as IMPS " + amount);

	}
	
	public void RTGS(int amount) {
		System.out.println("transfer as RTGS " + amount);

	}
	
	public void wintinBank(int amount) {
		System.out.println("transfer as within bank " + amount);

	}
	
	public void addTwoNums(int a,int b) {
		System.out.println(a+b);
	}
	
	public void multplicationTable(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
	}
}
