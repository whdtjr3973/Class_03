package com.biz.exec;

import java.util.Scanner;

public class KeyInput_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("������(����)�Է� >> ");
		String keyStr = scan.nextLine();
		System.out.println(keyStr);
		
		if(keyStr.equalsIgnoreCase("KOREA")) {
			System.out.println("���ѹα� ����̱���");
		} else if(keyStr.equalsIgnoreCase("USA")){
			System.out.println("�̱���� �̱���");
		} else {
			System.out.println("�� �𸣴� ���̳׿�");
		}
		
	}

}
