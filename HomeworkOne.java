package Text;
import java.util.Scanner;
public class HomeworkOne {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		HomeworkOne number = new HomeworkOne();
		System.out.print("������绰����");
		double money=scan.nextDouble();
		if(number.bill(money)) {
			System.out.println("���Ѳ��㣬���ֵ��");
		}
		else {
			System.out.println("���Ϊ:"+money+",�����ʹ�á�");
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
