package ExampleThree;

public class UserManager {
	
	public void createAccount(User user) {
		System.out.println(user.fullName + " kullan�c� kay�t oldu");
	}

	public void delete(User user) {
		System.out.println(user.fullName + " kullan�c�s�n�n kayd� silindi");
	}

	public void signIn(User user) {
		System.out.println(user.fullName + " kullan�c� giri� yapt�");
	}

	public void logOut(User user) {
		System.out.println(user.fullName + " kullan�c� ��k�� yapt�");
	}

	public void profileEdit(User user) {
		System.out.println(user.fullName + " kullan�s�n�n bilgileri g�ncellendi");
	}

}
