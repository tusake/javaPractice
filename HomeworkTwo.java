package Text;
import java.util.Scanner;
import static java.lang.System.out;
public class HomeworkTwo {
	public static void main(String[] args) {
		out.println("������Ƶ��");
		Scanner channel = new Scanner(System.in);
		switch(channel.nextInt()) {
		case 27:out.println("CCTV�ۺ�");break;
		case 30:out.println("CCTV���Ĺ���");break;
		case 31:out.println("CCTV����Ƶ��");break;
		case 33:out.println("CCTV����Ƶ��");break;
		default:out.println("�������");break;
		}
	}

}
