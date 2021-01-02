/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı long türden bir sayının en fazla 3 basamaklı ayrılmış sayılarından
	oluşan diziyi döndüren getDigitsInThrees metodunu NumberUtil sınıfı içerisinde yazınız ve test ediniz:
	Örnek:
	1234567 -> 1 234 567
	1234 -> 1 234
	34789 -> 34 789
	234567 -> 234 567
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.ArrayUtil;
import org.csystem.util.NumberUtil;

import java.util.Scanner;

class App {
    public static void main(String [] args)
    {
        GetDigitsTest.run();
    }
}

class GetDigitsTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        for (;;) {
            System.out.print("Bir sayı giriniz:");
            long val = Long.parseLong(kb.nextLine());

            ArrayUtil.display(NumberUtil.getDigits(val));
            ArrayUtil.display(NumberUtil.getDigitsInTwos(val));
            ArrayUtil.display(NumberUtil.getDigitsInThrees(val));

            if (val == 0)
                break;
        }

        System.out.println("Tekrar yapıyor musunuz?");
        System.out.println();
    }
}

