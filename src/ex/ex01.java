package ex;

/*
 * Topic: ISBN(International Standard Book Number) 是一種世界共通的書籍編碼方法，世界上任 何一本書籍之出版，皆有著唯一的一組 ISBN 碼。此碼由十個位數組成，每一位數可 以為 0~9 的任何一個數字，或者為 X ，代表此位數為 10 。其判斷方法如下，首先， 將此 ISBN 碼的十個位數分開，自左而右依次為第一位數，第二位數至第十位數，接 著進行第一次的累加，使得第二位數成為第一位數到第二位數的和，第三位數為第一 位數到第三位數的累加和，第十位數為第一位數到第十位數的累加和;進行完第一次 的累加和後，接著再依照相同之方法進行第二次的累加動作，我們稱此時最後所求得 之累加和為此 ISBN 碼之識別碼，倘若此識別碼為 11 的倍數，則此 ISBN 碼為合法 的。例如，若輸入之 ISBN 碼為 0 1 3 1 6 2 9 5 9 X ，則經由計算可得其識別碼為 165 ，乃是 11 之倍數，故此為一合法之 ISBN 碼。輸入一串 ISBN 碼，以空格隔開。
 * Date: 2016/12/05
 * Author: 105021008 陳畯程
 */
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int ISBN[][] = new int[3][10];
		String a = "";
		for (int i = 0; i < 10; i++) {
			a = scn.next();
			ISBN[0][i] = fun(a.charAt(0));
		}
		for (int i = 1; i < 10; i++) {
			ISBN[1][0] = 0;
			ISBN[1][i] = ISBN[1][i - 1] + ISBN[0][i];
		}
		for (int i = 1; i < 10; i++) {
			ISBN[2][0] = 0;
			ISBN[2][i] = ISBN[2][i - 1] + ISBN[1][i];
		}
		System.out.println(ISBN[2][9]);
		if (ISBN[2][9] % 11 == 0) {
			System.out.println("是ISBN");
		} else {
			System.out.println("不是ISBN");
		}
	}

	public static int fun(char s){
		int a=0;
		switch(s){
		case '1':
			a=1;
			break;
		case '2':
			a=2;
			break;
		case '3':
			a=3;
			break;
		case '4':
			a=4;
			break;
		case '5':
			a=5;
			break;
		case '6':
			a=6;
			break;
		case'7':
			a=7;
			break;
		case '8':
			a=8;
			break;
		case '9':
			a=9;
			break;
		case 'X':
			a=10;
			break;
		}
		return a ;
	}
}
