package domain;

import java.util.Scanner;

public class GameMain {

	static String nameArray [];
	
	//��ǥ �������� �̸� �����ϴ� �޼ҵ�
	static void nameDistinguish(String names){
		nameArray = names.split(",");	//��ǥ�� �ڵ��� �̸� �и��� �迭�� ����
	}
	
	//�̸��� 5�� �������� Ȯ���ϴ� �޼ҵ�
	static boolean isNameLessThan5(){
		for(int i=0; i<nameArray.length; ++i){
			if(nameArray[i].length()>5){
				System.out.println("�ڵ��� �̸��� 5�� ���ϸ� �����մϴ�.");
				System.out.println("������ �ڵ��� �̸��� �Է��ϼ���. �̸��� ��ǥ(,) �������� ����");
				return false;
			}
		}
		return true;
	}
		
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������ �ڵ��� �̸��� �Է��ϼ���.(�̸��� ��ǥ(,) �������� ����)");
		
		do{
			String names = in.next();	//�ڵ��� �̸� �Է�
			nameDistinguish(names);		//��ǥ �������� �̸� ����
		}while( !isNameLessThan5() );	//�̸��� 5�� ������ �� ���� �ݺ�

	}

}
