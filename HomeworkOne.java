package Text;
import java.util.Scanner;
public class HomeworkOne {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		HomeworkOne number = new HomeworkOne();
		System.out.print("请输入电话费余额：");
		double money=scan.nextDouble();
		if(number.bill(money)) {
			System.out.println("话费不足，请充值。");
		}
		else {
			System.out.println("余额为:"+money+",请放心使用。");
		}	
	}
	public boolean bill(double money) {
		if(money<10) {
			return true;
		}
		else {
			return false;
		}
	}
}
