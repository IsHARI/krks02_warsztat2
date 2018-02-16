package pl.coderslab.warsztat2.app;

import pl.coderslab.warsztat2.model.Users;

public class UsersApp {
	public static void main(String[] args) {
		test();
	}
	
	static void test() {
		Users user = new Users("maciej", "mastoffp@gmail.com", "correcthorsebatterystaple");
		System.out.println(user.password);
		System.out.println(user.isPasswordCorrect("hgsdgds"));
		System.out.println(user.isPasswordCorrect("correcthorsebatterystaple"));
	}
}
