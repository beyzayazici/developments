
public class FindValuesTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
			int sum = 0;
			int counter = 0;
			int max = 0;
			int min = 100;
			
			
			for(;;) {
				System.out.print("Bir değer girmek istiyor musunuz ? Evet için 1(bir) Hayır için 0(sıfır) değerlerinden birini giriniz : ");
				int selectVal = Integer.parseInt(kb.nextLine());
				
				if(selectVal == 1) {
					
					System.out.printf("%d.ninci tamsayıyı giriniz : ", counter + 1);
					int val = Integer.parseInt(kb.nextLine());
					
					if(val <= 100 && val >= 0) {
						sum += val;
						counter++;
						max = max < val ? val : max;
						min = min > val ? val : min;
					}
					else
						System.out.print("Geçersiz değer girdiniz.");	
				}
				
				else if(selectVal == 0) {
					FindValues.printValues(counter, sum, max, min);
					break;
				}
				
				else
					System.out.println("Geçersiz değer girdiniz.");
			}
	}
}
