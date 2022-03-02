
public class Account {

	int acctNo = 10;
	String accName = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		Account acc1 = new Account ();
		acc.accName = "SavingAccount";
		System.out.println(acc.accName+"\t"+acc1.accName);
		System.out.println(acc); //address (classname@hashCode)
		System.out.println(acc1);
	}

}
