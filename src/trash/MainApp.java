package trash;

public class MainApp {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		AccountDAO account = new AccountDAO();
//		getData tes = new getData();
//		tes.setId(1);
//		tes.setAccount_number("1234");
//		tes.setName("Jannah");
//		tes.setAddress("Pekalongan");
//		
//		account.add(tes);
		account.findAll();

	}

}
