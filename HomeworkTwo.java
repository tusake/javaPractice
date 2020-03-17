package Text;
import java.util.Scanner;
import static java.lang.System.out;
public class HomeworkTwo {
	public static void main(String[] args) {
		out.println("请输入频道");
		Scanner channel = new Scanner(System.in);
		switch(channel.nextInt()) {
		case 27:out.println("CCTV综合");break;
		case 30:out.println("CCTV中文国际");break;
		case 31:out.println("CCTV体育频道");break;
		case 33:out.println("CCTV新闻频道");break;
		default:out.println("输入错误");break;
		}
	}

}
