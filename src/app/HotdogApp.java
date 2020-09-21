package app;

import controller.HotdogController;
import dto.HotdogVO;

public class HotdogApp {
	public static void main(String[] args) {
		HotdogController hotdogController = new HotdogController();

		// C �⺻ �ֵ��׸��
		System.out.println("-�ֵ���-");
		hotdogController.createHodog(0, "ĥ���ֵ���", 5000);
		hotdogController.createHodog(1, "�Ұ���ֵ���", 5500);
		hotdogController.createHodog(2, "ġŲ�ֵ���", 5000);
		hotdogController.createHodog(3, "����ֵ���", 5000);
		hotdogController.createHodog(4, "�������ֵ���", 5500);
		System.out.println();
		
		// C ��Ʈ�޴�
		System.out.println("-��Ʈ�޴�- (�ݰ� �̺�Ʈ)");
		hotdogController.createSetMenu(0, "ĥ����Ʈ", "�ݶ�/���̴�", 6000);
		hotdogController.createSetMenu(1, "�Ұ�⼼Ʈ", "�ݶ�/���̴�", 7000);
		hotdogController.createSetMenu(2, "ġŲ��Ʈ", "�ݶ�/���̴�", 6000);
		hotdogController.createSetMenu(3, "����Ʈ", "�ݶ�/���̴�", 6000);
		hotdogController.createSetMenu(4, "��������Ʈ", "�ݶ�/���̴�", 7000);
		System.out.println();
				
		// C �����
		System.out.println("-��-");
		hotdogController.createBread(0, "��Ʈ ", 800);
		hotdogController.createBread(1, "�ܹ��� ��", 800);
		hotdogController.createBread(2, "�Ļ�", 800);
		hotdogController.createBread(3, "��Ʈ ", 800);
		hotdogController.createBread(4, "�÷� �귡��", 1000);
		hotdogController.createBread(5, "�Ƕ��", 1000);
		System.out.println();

		// C ��Ƽ���
		System.out.println("-��Ƽ-");
		hotdogController.createPatty(0, "ġŲ ��Ƽ", 1200);
		hotdogController.createPatty(1, "��� ��Ƽ ", 1200);
		hotdogController.createPatty(2, "�Ұ�� ��Ƽ", 1500);
		hotdogController.createPatty(3, "����Ƣ�� ��Ƽ ", 1200);
		hotdogController.createPatty(4, "���� ��Ƽ ", 1400);
		hotdogController.createPatty(5, "������ ", 1500);
		hotdogController.createPatty(6, "�콬���� ", 1200);
		System.out.println();

		// C ���θ��
		System.out.println("-����-");
		hotdogController.createTopping(0, "ġ�� ", 500);
		hotdogController.createTopping(1, "��Ŭ ", 500);
		hotdogController.createTopping(2, "�Ҷ��Ǵ� ", 700);
		hotdogController.createTopping(3, "�丶�� ", 700);
		hotdogController.createTopping(4, "���ξ��� ", 700);
		hotdogController.createTopping(5, "��ġ���� ", 500);
		hotdogController.createTopping(6, "������ ", 500);
		hotdogController.createTopping(7, "���� ", 300);
		hotdogController.createTopping(8, "�ӽ�Ÿ�� ", 300);
		hotdogController.createTopping(9, "����", 500);
		hotdogController.createTopping(10, "�Ҵ߼ҽ�", 700);
		hotdogController.createTopping(11, "��Ʈ", 1000);
		hotdogController.createTopping(12, "Ư���ҽ�", 700);
		System.out.println();

		// C ��������
		System.out.println("-�����-");
		hotdogController.createDrink(0, "�ݶ�", 1000);
		hotdogController.createDrink(1, "���̴�", 1000);
		hotdogController.createDrink(2, "���̽� Ƽ", 1000);
		hotdogController.createDrink(3, "����", 1200);
		hotdogController.createDrink(4, "�Ƹ޸�ī��", 1200);
		hotdogController.createDrink(5, "��", 1000);
		System.out.println();

//		// ��� �׽�Ʈ
//		hotdogController.getHotdogAll();
//		hotdogController.getDrinkAll();
//		System.out.println();
//
//		// U �⺻ �ֵ��� ����
//		HotdogVO hotdogU = new HotdogVO();
//		hotdogU.setId(1);
//		hotdogU.setHotdog("������ �ֵ���");
//		hotdogU.setPrice(5000);
//		hotdogController.putHotdog(hotdogU);
//
//		// U ����� ����
//		HotdogVO drinkU = new HotdogVO();
//		drinkU.setId(1);
//		drinkU.setDrink("������ ����� ");
//		drinkU.setPrice(1000);
//		hotdogController.putDrink(drinkU);
//
//		// U �� ����
//		HotdogVO breadU = new HotdogVO();
//		breadU.setId(0);
//		breadU.setBread("������ ��");
//		breadU.setPrice(1000);
//
//		// U ��Ƽ ����
//		HotdogVO pattyU = new HotdogVO();
//		pattyU.setId(0);
//		pattyU.setPatty("������ ��Ƽ");
//		pattyU.setPrice(1000);
//		hotdogController.putPatty(pattyU);
//
//		// U ���� ����
//		HotdogVO toppingU = new HotdogVO();
//		toppingU.setId(0);
//		toppingU.setTopping("������ ����");
//		toppingU.setPrice(1000);
//		hotdogController.putTopping(toppingU);
//
//		// R ������ ��� �׽�Ʈ
//		hotdogController.getHotdogAll();
//		hotdogController.getDrinkAll();
//		hotdogController.getBread();
//		hotdogController.getPatty();
//		hotdogController.getTopping();
//		System.out.println();
//
//		// D �⺻ �ֵ��� ����
//		HotdogVO hotdogD = new HotdogVO();
//		hotdogD.setId(3);
//		hotdogController.deleteHotdog(hotdogD);
//
//		// D ����� ����
//		HotdogVO drinkD = new HotdogVO();
//		drinkD.setId(1);
//		hotdogController.deleteDrink(hotdogD);
//		
//		// D �� ����
//		HotdogVO breadD = new HotdogVO();
//		breadD.setId(0);
//		hotdogController.deleteBread(breadD);
//
//		// D ��Ƽ ����
//		HotdogVO pattyD = new HotdogVO();
//		pattyD.setId(0);
//		hotdogController.deletePatty(pattyD);
//
//		// D ���� ����
//		HotdogVO toppingD = new HotdogVO();
//		toppingD.setId(0);
//		hotdogController.deleteTopping(toppingD);
//
//		// R ������ ��� �׽�Ʈ
//		hotdogController.getHotdogAll();
//		hotdogController.getDrinkAll();
//		hotdogController.getBread();
//		hotdogController.getPatty();
//		hotdogController.getTopping();
//		System.out.println();

		// ���� �� ����
		hotdogController.runApp();
	}
}
