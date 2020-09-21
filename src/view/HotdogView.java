package view;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import dto.HotdogVO;

public class HotdogView { // C , R
	private Scanner scanner = new Scanner(System.in);
	private Random random = new Random();
	private String[] strArr = new String[50]; //�������� ����
	private int stored = 0;
	private String name = null;
	private int idNum = 0;
	private String[] strArr1 = new String[50]; //�������� ����
	private int stored1 = 0;
	private String ID = null;
	private String review = null;

	// Main menu
	public int getMenu() {
		System.out.println("���ִ� �ֵ��׹�� ���Դϴ�.");
		System.out.println("0) ����");
		System.out.println("1) �ֹ��ϱ�");
		System.out.print("�޴� �Է� : ");
		int choice = -1;
		try {
			choice = scanner.nextInt();
			scanner.nextLine();
		} catch (InputMismatchException e) {
			scanner.nextLine();
			System.out.println("������ ���ڸ� �Է����ּ���.");
		}
		return choice;
	}

	// Menu2
	public int getMenu2() {
		System.out.println();
		System.out.println("���ִ� �ֵ����ֹ� �޴�ȭ���Դϴ�.");
		System.out.println("0) ���ư��� ");
		System.out.println("1) �⺻�޴� ");
		System.out.println("2) ��Ʈ�޴�(���� �̺�Ʈ)");
		System.out.println("3) ������ ��õ�޴� (Random ����) ");
		System.out.println("4) �ֵ��� ���� ���� ���� (�غ����� �����Դϴ�.)");
		System.out.println("5) �������� Ȯ��(��ٱ���)");
		System.out.println("6) �����ۼ� ");
		System.out.println("7) ���亸��");
		System.out.print("�޴� �Է� : ");
		int choice2 = -1;
		try {
			choice2 = scanner.nextInt();
			scanner.nextLine();
		} catch (InputMismatchException e) {
			scanner.nextLine();
			System.out.println("������ ���ڸ� �Է����ּ���.");
		}
		return choice2;
	}
	
	// �ֹ����� �Է�
	public void getString() {
		stored = putStr(scanner, strArr, stored, name, idNum);
	}

	// �ֹ����� ���
	public void outString() {
		outStr(strArr, stored, idNum, name);
	}

	// �ֹ����� ����
	public static int putStr(Scanner scanner, String[] strArr, int stored, String name, int idNum) {
		HotdogVO hotdogVO = new HotdogVO();
		hotdogVO.setLocalDateTime(LocalDateTime.now());
		System.out.println("�̸��� �ֹ���ȣ�� �Է����ּ���.");
		System.out.print("�̸� : ");
		name = scanner.nextLine();
		System.out.println("�ֹ���ȣ�� �Է����ּ���.");
		System.out.print("�ֹ���ȣ: ");
		idNum = scanner.nextInt();
		scanner.nextLine();
		System.out.print("��� �ּ� �Է� : ");
		String str1 = scanner.nextLine();
		strArr[stored++] = name + "���� " + " �ֹ���ȣ:" + idNum;
		strArr[stored++] = "�ּ�:" + str1 + '\n';
		System.out.println("��������� ����Ǿ����ϴ�.[" + LocalDateTime.now() + "]");
		System.out.println("�ֹ��� �ּż� �����մϴ�.");
		return stored;
	}

	// ��ٱ��� ���
	public static void outStr(String[] strArr, int stored, int idNum, String name) {
		if (stored != 0) {
			for (int i = 0; i < stored; i++) {
				System.out.println(strArr[i]);
			}
		} else {
			System.out.println("����� ������ �����ϴ�.");
		}
	}
	
	//���� ����
	public void getReview() {
		stored1 = putReview(scanner, strArr1, stored1, ID, review);
	}

	// �������� ���
	public void outReview() {
		outID(strArr1, stored1, review, ID);
	}

	//���� �ۼ�
	public static int putReview(Scanner scanner, String[] strArr1, int stored1, String ID, String review) {
		HotdogVO hotdogVO = new HotdogVO();
		hotdogVO.setLocalDateTime(LocalDateTime.now());
		System.out.println("ID�� �Է����ּ���.");
		System.out.print("ID : ");
		ID = scanner.nextLine();
		System.out.println("���並 �Է����ּ���.");
		System.out.print("����: ");
		review = scanner.nextLine();
		System.out.print("����: ");
		String str2 = scanner.nextLine();
		strArr1[stored1++] = ID + "���� " + " ����:" + review;
		strArr1[stored1++] = "����:" + str2 + '\n';
		System.out.println("���䰡 ����Ǿ����ϴ�. [" + LocalDateTime.now() + "]");
		System.out.println("�����մϴ�..");
		return stored1;
	}

	// ���� ���
		public static void outID(String[] strArr1, int stored1, String review, String ID) {
			if (stored1 != 0) {
				for (int i = 0; i < stored1; i++) {
					System.out.println(strArr1[i] +" "+ LocalDateTime.now());
				}
			} else {
				System.out.println("����� ���䰡 �����ϴ�."+"[" + LocalDateTime.now() + "]");				
				}
			}

	// C �⺻ �ֵ���
	public void createHotdog(List<HotdogVO> hotdogSet, int id, String hotdog, int price) {
		HotdogVO hotdogVO = new HotdogVO();
		hotdogVO.setId(id);
		hotdogVO.setHotdog(hotdog);
		hotdogVO.setPrice(price);
		hotdogSet.add(hotdogVO);
		System.out.println(hotdogVO.toString());
	}
	
	// C ��Ʈ �޴�
	public void createSetMenu(List<HotdogVO> setMenu, int id, String hotdogSet, String drink, int price) {
		HotdogVO hotdogVO = new HotdogVO();
		hotdogVO.setId(id);
		hotdogVO.setHotdog(hotdogSet);
		hotdogVO.setDrink(drink);
		hotdogVO.setPrice(price);
		setMenu.add(hotdogVO);
		System.out.println(hotdogVO.addSetMenu());
	}

	// C ��
	public void createBread(List<HotdogVO> breadList, int id, String bread, int price) {
		HotdogVO hotdogVO = new HotdogVO();
		hotdogVO.setId(id);
		hotdogVO.setBread(bread);
		hotdogVO.setPrice(price);
		breadList.add(hotdogVO);
		System.out.println(hotdogVO.addBread());
	}

	// C ��Ƽ
	public void createPatty(List<HotdogVO> pattyList, int id, String patty, int price) {
		HotdogVO hotdogVO = new HotdogVO();
		hotdogVO.setId(id);
		hotdogVO.setPatty(patty);
		hotdogVO.setPrice(price);
		pattyList.add(hotdogVO);
		System.out.println(hotdogVO.addPatty());
	}

	// C ����
	public void createTopping(List<HotdogVO> toppingList, int id, String topping, int price) {
		HotdogVO hotdogVO = new HotdogVO();
		hotdogVO.setId(id);
		hotdogVO.setTopping(topping);
		hotdogVO.setPrice(price);
		toppingList.add(hotdogVO);
		System.out.println(hotdogVO.addTopping());
	}

	// C �����
	public void createDrink(List<HotdogVO> drinkList, int id, String drink, int price) {
		HotdogVO hotdogVO = new HotdogVO();
		hotdogVO.setId(id);
		hotdogVO.setDrink(drink);
		hotdogVO.setPrice(price);
		drinkList.add(hotdogVO);
		System.out.println(hotdogVO.addDrink());
	}

	// R �ֵ���
	public void getHotdogAll(List<HotdogVO> hotdogSet) {
		Iterator<HotdogVO> itr = hotdogSet.iterator();
		while (itr.hasNext()) {
			HotdogVO hotdogVO = itr.next();
			System.out.println(hotdogVO.toString());
		}
	}
	
	//R ��Ʈ�޴�
	public void getSetMenuAll(List<HotdogVO> setMenu) {
		Iterator<HotdogVO> itr = setMenu.iterator();
		while (itr.hasNext()) {
			HotdogVO hotdogVO = itr.next();
			System.out.println(hotdogVO.addSetMenu());
		}
	}

	// R �����
	public void getDrinkAll(List<HotdogVO> drinkList) {
		Iterator<HotdogVO> itr = drinkList.iterator();
		while (itr.hasNext()) {
			HotdogVO hotdogVO = itr.next();
			System.out.println(hotdogVO.addDrink());
		}
	}

	// R ���� ��
	public void getBread(List<HotdogVO> breadList) {
		int randomIndex = random.nextInt(breadList.size());
		HotdogVO hotdogVO = breadList.get(randomIndex);
		System.out.println(hotdogVO.addBread());
	}

	// R ���� ��Ƽ
	public void getPatty(List<HotdogVO> pattyList) {
		int randomIndex = random.nextInt(pattyList.size());
		HotdogVO hotdogVO = pattyList.get(randomIndex);
		System.out.println(hotdogVO.addPatty());
	}

	// R ���� ����
	public void getTopping(List<HotdogVO> toppingList) {
		int randomIndex = random.nextInt(toppingList.size());
		HotdogVO hotdogVO = toppingList.get(randomIndex);
		System.out.println(hotdogVO.addTopping());
	}

	// R ���� �����
	public void getDrink(List<HotdogVO> drinkList) {
		int randomIndex = random.nextInt(drinkList.size());
		HotdogVO hotdogVO = drinkList.get(randomIndex);
		System.out.println(hotdogVO.addDrink());
	}
}