package com.biz.exec;

import java.util.Scanner;

public class KeyInput_01 {

	/*
	 * ����(�޸�)�� ��(Data)���� �����ϰ�
	 * ������ �����ϰ� Console�� �����ִ� �ڵ�
	 * 
	 * �����(Operator)�� Ű���带 ���ؼ� � ����
	 * ���� �Է��ϰ�
	 * �� �Է��� ���� ���� �����ϴ� ��쿡
	 * ����ϴ� Ŭ����
	 */
	public static void main(String[] args) {

		System.out.println("�ֿܼ� �����ΰ� �����ְ��� �Ҷ�");
		
		// System.out�� �ݴ�Ǵ� ��������
		// Ű����� ���� ����(Data)�޾Ƽ�
		// ����ϱ� ���� �غ�
		Scanner scanner = new Scanner(System.in);
		
		// nextLine()�� Ű���忡�� ����(String)�ΰ� �ԷµǱ⸦
		// ���� ��ٸ��� ��Ȳ�� �ǰ�,
		// �̷� ��Ȳ�� blocking �Ǿ��� ��� �Ѵ�.
		String keyStr = scanner.nextLine();
		System.out.println("=======================");
		System.out.println(keyStr);
		
		
		
	}

}
