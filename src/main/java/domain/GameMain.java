package domain;

import java.util.Scanner;

public class GameMain {

	static String nameArray [];
	
	//��ǥ �������� �̸� �����ϴ� �޼ҵ�
	static void nameDistinguish(String names){
		nameArray = names.split(",");	//��ǥ�� �ڵ��� �̸� �и��� �迭�� ����
	}
		
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������ �ڵ��� �̸��� �Է��ϼ���.(�̸��� ��ǥ(,) �������� ����");
		
		String names = in.next();	//�ڵ��� �̸� �Է�
		nameDistinguish(names);		//��ǥ �������� �̸� ����

	}

}
