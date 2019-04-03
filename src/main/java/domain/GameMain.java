package domain;

import java.util.Scanner;

public class GameMain {

	static String nameArray[];
	static Car cars[];
	static int position[];

	// ��ǥ �������� �̸� �����ϴ� �޼ҵ�
	static void nameDistinguish(String names) {
		nameArray = names.split(",");
	}

	// �̸��� 5�� �������� Ȯ���ϴ� �޼ҵ�
	static boolean isNameLessThan5() {
		for (int i = 0; i < nameArray.length; ++i) {
			if (nameArray[i].length() > 5) {
				System.out.println("�ڵ��� �̸��� 5�� ���ϸ� �����մϴ�.");
				System.out.println("������ �ڵ��� �̸��� �Է��ϼ���. �̸��� ��ǥ(,) �������� ����");
				return false;
			}
		}
		return true;
	}

	// �ڵ��� ��ü �����ϴ� �޼ҵ�
	static void makeCars() {
		cars = new Car[nameArray.length];
		for (int i = 0; i < nameArray.length; ++i) {
			cars[i] = new Car(nameArray[i]);
		}
	}

	// 0~9 ���� ���� ���� �޼ҵ�
	static int randomNum() {
		return (int) (Math.random() * 10);
	}

	// 4 �̻��̸� ���������ִ� �޼ҵ�
	static void isMoreThan4(int randomNum, int index) {
		if (randomNum >= 4) {
			cars[index].addPosition();
		}
	}

	// ������ ����ϴ� �޼ҵ�
	static void printState(int index) {
		System.out.print(nameArray[index] + " : ");
		for (int i = 0; i < cars[index].getPosition(); ++i) {
			System.out.print("-");
		}
		System.out.println();
	}

	// �õ� Ƚ����ŭ �ݺ��ϴ� �޼ҵ�
	static void repeat(int moveNum) {
		while (moveNum != 0) {
			moveNum--;
			for (int i = 0; i < nameArray.length; ++i) {
				isMoreThan4(randomNum(), i); // random ���� 4�̻����� Ȯ��
				printState(i); // ��Ȳ ���
			}
			System.out.println();
		}
	}

	// ���� ū position�� ���ϴ� �޼ҵ�
	static int maxValue() {
		position = new int[nameArray.length];
		int maxPosition = 0;
		for (int i = 0; i < nameArray.length; ++i) {
			position[i] = cars[i].getPosition();
			if (maxPosition < position[i]) {
				maxPosition = position[i];
			}
		}
		return maxPosition;
	}

	// �̸��� �̸����̿� ��ǥ�� �־� ����� ����ϴ� �޼ҵ�
	static void printResult(int index, boolean rest) {
		if (rest)
			System.out.print(", ");
		System.out.print(nameArray[index]);
	}

	// ��� ��� �޼ҵ�
	static void result(int maxPosition) {
		boolean rest = false;
		for (int i = 0; i < nameArray.length; ++i) {
			if (position[i] == maxPosition) {
				printResult(i, rest);
				rest = true;
			}
		}
		System.out.println(" �� ���� ����߽��ϴ�.");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������ �ڵ��� �̸��� �Է��ϼ���.(�̸��� ��ǥ(,) �������� ����)");

		do {
			String names = in.next(); // �ڵ��� �̸� �Է�
			nameDistinguish(names); // ��ǥ �������� �̸� ����
		} while (!isNameLessThan5());
		makeCars(); // �ڵ��� ��ü ����

		System.out.println("�õ��� Ƚ���� ��ȸ�ΰ���?");
		int moveNum = in.nextInt(); // ���� Ƚ�� �Է�
		System.out.println("���� ���");
		repeat(moveNum); // nȸ �ݺ�

		int maxPosition = maxValue();
		result(maxPosition);
	}

}
