
public class OutputPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("101~200֮��������У�");
		for (int i = 101; i <= 200; i++) {
			//����101~200֮�����ֵ�����
			double m = Math.sqrt(i);
			int j;
			for (j = 2; j <= m; j++) {
				if(i%j==0)
					break;
			//�����ִ�2������i֮�䷢����������ѭ��
			}
			if(j > m)//����ѭ����ɺ�j��������һ�Σ����Ա�m��
				System.out.print(i+" ");			
		}
	}
}