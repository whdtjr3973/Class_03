package com.biz.exec;

import java.util.Scanner;

public class KeyInput_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("������(��������) >> ");
			String strNation = scan.nextLine();
			if(strNation.equalsIgnoreCase("KOREA")) {
				System.out.println("���ѹα� �̱���");
			}else if(strNation.equalsIgnoreCase("USA")) {
				System.out.println("���� �ζ�");
			}else if(strNation.equalsIgnoreCase("CHINA")) {
				System.out.println("��� ����");
			} else if(strNation.equals("--END")) {
				System.out.println("�ȳ�~~");
				break;
			}
			else{
				System.out.println("�𸣰ڴµ���");
			}
		}

	}

}
