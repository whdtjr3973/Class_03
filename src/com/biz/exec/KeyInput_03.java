package com.biz.exec;

import java.util.Scanner;

import com.biz.model.ScoreVO;

public class KeyInput_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ScoreVO sVO = new ScoreVO();
		
		System.out.print("�й� >> ");
		String strNumber = scan.nextLine();
		
		System.out.println("�������� >> ");
		String strKor = scan.nextLine();
		
		System.out.println("�������� >> ");
		String strEng = scan.nextLine();
		
		System.out.println("�������� >> ");
		String strMath = scan.nextLine();
		
		sVO.setNumber(strNumber);
		sVO.setKor(Integer.valueOf(strKor));
		sVO.setEng(Integer.valueOf(strEng));
		sVO.setMath(Integer.valueOf(strMath));
		
		System.out.println("==================================");
		
		System.out.println("�Է� ���� Ȯ��");
		System.out.println("----------------------------------");
		System.out.println(sVO.toString());
	}

}
