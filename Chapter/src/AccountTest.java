import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account obj = new Account();
		obj.setName("Tom");
		obj.setBalance(500);
		System.out.println("이름은"+obj.getName()+"통장 잔고는 "+obj.getBalance()+"입니다");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("통장 잔고를 입려해주세요.");
		
	}

}
