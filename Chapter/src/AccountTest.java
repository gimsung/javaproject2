import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account obj = new Account();
		obj.setName("Tom");
		obj.setBalance(500);
		System.out.println("�̸���"+obj.getName()+"���� �ܰ�� "+obj.getBalance()+"�Դϴ�");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� �ܰ� �Է����ּ���.");
		
	}

}
