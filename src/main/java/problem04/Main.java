package problem04;

import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		// 키보드 입력을 받기 위해 Scanner 생성
		Scanner ss = new Scanner(System.in);
		Random ran = new Random();
		//실행시간 측정
		long start =system.currentTimeMillis();
		long end =system.currentTimeMillis();
		
		int result; //결과
		int i;
		int num1;
		int num2;
		int num3;
		int num4;
		int wcount =0; //승리
		int lcount =0; //패배
		String st1[]; //구구단 저장
		int rank[]; //랭킹
		
		
		// 게임 시작
		System.out.println("1 9,    2  18     (X)");
		while(i<9) {
			num1 = ran.nextInt(8)+1;
			num2 = ran.nextInt(8)+1;
			num3 = ran.nextInt(8)+1;
			num4 = ran.nextInt(8)+1;
			System.out.println(num1 + "x" +num2 +", " +num3 + "x" +num4);
			
		}
		
		while(true) {
			i=0;
			System.out.println("1. " + st1[i]);
			result = scanner.nextInt();
			if(reult ==()) {
				wcount++;
			}else {
				lcount++;
			}
		}
		
		
		// 키보드 닫기
		scanner.close();
		//정렬
		
		
		// 결과 출력
		for(i=0; i<rank.length;i++) {
		System.out.println(rank[i] + " : " + wcount + " / " + lcount +" : " + (end -start)/1000.0);
		}

		
	}
}