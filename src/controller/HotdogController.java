package controller;

import java.util.Scanner;

import dto.HotdogVO;
import service.HotdogRepository;
import view.HotdogView;
import view.HotdogView2;

public class HotdogController {
	private HotdogView hotdogView = new HotdogView();
	private HotdogView2 hotdogView2 = new HotdogView2();
	private HotdogRepository hotdogRepository = new HotdogRepository();

	// main
	public void runApp() {
		int choice;
		int choice2;
		int num=0;
		while (true) {
			choice = hotdogView.getMenu();
			switch (choice) { // ���θ޴�
			case 0: // ����
				return;
			case 1: // �ֹ��ϱ�
				choice2 = hotdogView.getMenu2();
				// �޴�2
				switch (choice2) { // �ֹ��޴�
				case 0: // ���ư���
					continue;
				case 1: // �⺻�޴�
					System.out.println("-----------------------------------------------");
					hotdogView.getHotdogAll(hotdogRepository.getHotdogSet());// �⺻ �ֵ���
					System.out.println("-----------------------------------------------");
					hotdogView.getDrinkAll(hotdogRepository.getDrinkList());// �����
					System.out.println("-----------------------------------------------");
					hotdogView.getString();
					System.out.println();
					continue;
					
				case 2: //��Ʈ�޴�
					System.out.println("-----------------------------------------------");
					hotdogView.getSetMenuAll(hotdogRepository.getSetMenu());
					System.out.println("-----------------------------------------------");
					hotdogView.getString();
					System.out.println();
					continue;
				case 3: // ���� ���� �޴�
					System.out.println("-----------------------------------------------");
					hotdogView.getBread(hotdogRepository.getBreadList());// ��
					hotdogView.getPatty(hotdogRepository.getPattyList());// ��Ƽ
					hotdogView.getTopping(hotdogRepository.getToppingList());// ����1
					hotdogView.getTopping(hotdogRepository.getToppingList());// ����2
					hotdogView.getDrink(hotdogRepository.getDrinkList());// �����
					System.out.println("-----------------------------------------------");
					hotdogView.getString();
					System.out.println();
					continue;
				case 4: // ���� ���� ����
					System.out.println("-----------------------------------------------");
					System.out.println("�˼��մϴ�.");
					System.out.println("�غ����� �����Դϴ� . . . . .");
					System.out.println("-----------------------------------------------");
					continue;
				case 5: // ��ٱ������
					System.out.println("-----------------------------------------------");
					hotdogView.outString();
					System.out.println("-----------------------------------------------");
					System.out.println("�����մϴ�.");
					System.out.println();
					continue;
				case 6: //�����Է�
					hotdogView.getReview();
					continue;
				case 7: //���� ���
					hotdogView.outReview();
					continue;
					
				}
			}
		}
	}

	// C �ֵ���
	public void createHodog(int id, String hotdog, int price) {
		hotdogView.createHotdog(hotdogRepository.getHotdogSet(), id, hotdog, price);
	}
	
	//C ��Ʈ�޴�
	public void createSetMenu(int id, String hotdog, String drink, int price) {
		hotdogView.createSetMenu(hotdogRepository.getSetMenu(), id, hotdog, drink, price);
	}

	// C ��
	public void createBread(int id, String bread, int price) {
		hotdogView.createBread(hotdogRepository.getBreadList(), id, bread, price);
	}

	// C ��Ƽ
	public void createPatty(int id, String patty, int price) {
		hotdogView.createPatty(hotdogRepository.getPattyList(), id, patty, price);
	}

	// C ����
	public void createTopping(int id, String topping, int price) {
		hotdogView.createTopping(hotdogRepository.getToppingList(), id, topping, price);
	}

	// C �����
	public void createDrink(int id, String drink, int price) {
		hotdogView.createDrink(hotdogRepository.getDrinkList(), id, drink, price);
	}

	// R All �ֵ���
	public void getHotdogAll() {
		hotdogView.getHotdogAll(hotdogRepository.getHotdogSet());
	}

	// R All �����
	public void getDrinkAll() {
		hotdogView.getDrinkAll(hotdogRepository.getDrinkList());
	}

	// R ��
	public void getBread() {
		hotdogView.getBread(hotdogRepository.getBreadList());
	}

	// R ��Ƽ
	public void getPatty() {
		hotdogView.getPatty(hotdogRepository.getPattyList());
	}

	// R ����
	public void getTopping() {
		hotdogView.getTopping(hotdogRepository.getToppingList());
	}

	// R �����
	public void getDrink() {
		hotdogView.getDrink(hotdogRepository.getDrinkList());
	}

	// U �⺻ �ֵ���
	public void putHotdog(HotdogVO hotdogVO) {
		hotdogView2.putHotdog(hotdogRepository.getHotdogSet(), hotdogVO);
	}

	// U ��
	public void putBread(HotdogVO hotdogVO) {
		hotdogView2.putBread(hotdogRepository.getBreadList(), hotdogVO);
	}

	// U ��Ƽ
	public void putPatty(HotdogVO hotdogVO) {
		hotdogView2.putPatty(hotdogRepository.getPattyList(), hotdogVO);
	}

	// U ����
	public void putTopping(HotdogVO hotdogVO) {
		hotdogView2.putTopping(hotdogRepository.getToppingList(), hotdogVO);
	}

	// U �����
	public void putDrink(HotdogVO hotdogVO) {
		hotdogView2.putDrink(hotdogRepository.getDrinkList(), hotdogVO);
	}

	// D �⺻ �ֵ���
	public void deleteHotdog(HotdogVO hotdogVO) {
		hotdogView2.deleteHordog(hotdogRepository.getHotdogSet(), hotdogVO);
	}

	// D ��
	public void deleteBread(HotdogVO hotdogVO) {
		hotdogView2.deleteBread(hotdogRepository.getBreadList(), hotdogVO);
	}

	// D ��Ƽ
	public void deletePatty(HotdogVO hotdogVO) {
		hotdogView2.deletePatty(hotdogRepository.getPattyList(), hotdogVO);
	}

	// D ����
	public void deleteTopping(HotdogVO hotdogVO) {
		hotdogView2.deleteTopping(hotdogRepository.getToppingList(), hotdogVO);
	}

	// D �����
	public void deleteDrink(HotdogVO hotdogVO) {
		hotdogView2.deleteDrink(hotdogRepository.getDrinkList(), hotdogVO);
	}
}