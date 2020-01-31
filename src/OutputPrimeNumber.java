
public class OutputPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("101~200之间的素数有：");
		for (int i = 101; i <= 200; i++) {
			//控制101~200之间数字的增加
			double m = Math.sqrt(i);
			int j;
			for (j = 2; j <= m; j++) {
				if(i%j==0)
					break;
			//当数字从2到根号i之间发生整除跳出循环
			}
			if(j > m)//数字循环完成后，j又自增了一次，所以比m大
				System.out.print(i+" ");			
		}
	}
}