package Text;

public class HomeworkFour {
	public static void main(String[] args) {
		int[] number={1,11,111,2,22,222,3,33,333,0};
		HomeworkFour anwser =new HomeworkFour();
		System.out.println("��Ϊ"+anwser.sum(number)+
								    	"�����ֵΪ"+anwser.max(number)+
										"����СֵΪ"+anwser.min(number)+
										"��ƽ��ֵΪ"+anwser.average(number));
	}
	private int sum(int[] number){
		int sum=0;
		for(int i=0;i<number.length;i++){
			sum += number[i];
		}
		return sum;
	}
	private int max(int[] number){
			int max=number[0];
			for(int i=0;i<number.length-1;i++) {
				if(number[i]<number[i+1]) {
					max=number[i+1];
				}
			}
			return max;
	}
	private int min(int[] number){
		int min=number[0];
		for(int i=0;i<number.length-1;i++) {
			if(number[i]>number[i+1]) {
				min=number[i+1];
			}
		}
		return min;
	}
	private int average(int[] number){
		return sum(number)/number.length;
	}
}
