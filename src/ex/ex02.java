package ex;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 105021008 陳畯程
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入所使用的度數");
		int d=scn.nextInt();
		double su=0;
		double nsu=0;
		if(d<=120){
			su=d*2.10;
			System.out.print("夏月電費:"+su);
			nsu=d*2.10;
			System.out.print("非夏月電費:"+nsu);
		}else if(120<d&&d<=330){
			su=120*2.10+(d-120)*3.02;
			System.out.print("夏月電費:"+su);
			nsu=120*2.10+(d-120)*2.68;
			System.out.print("非夏月電費:"+nsu);
		}else if(330<d&&d<=500){
			su=120*2.10+210*3.02+(d-330)*4.39;
			System.out.print("夏月電費:"+su);
			nsu=120*2.10+210*2.68+(d-330)*3.61;
			System.out.print("非夏月電費:"+nsu);
		}else if(500<d&&d<=700){
			su=120*2.10+210*3.02+170*4.39+(d-500)*4.97;
			System.out.print("夏月電費:"+su);
			nsu=120*2.10+210*2.68+170*3.61+(d-500)*4.01;
			System.out.print("非夏月電費:"+nsu);
		}else if(d>700){
			su=120*2.10+210*3.02+170*4.39+200*4.97+(d-700)*5.63;
			System.out.print("夏月電費:"+su);
			nsu=120*2.10+210*2.68+170*3.61+200*4.01+(d-700)*4.50;
			System.out.print("非夏月電費:"+nsu);
		}
	}

}
