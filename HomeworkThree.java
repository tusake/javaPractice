package Text;

public class HomeworkThree {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<101;i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		System.out.println("1到100之间可以被3整除的整数的和为："+sum);
	}

}
