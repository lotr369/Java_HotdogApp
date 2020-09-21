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
			switch (choice) { // 메인메뉴
			case 0: // 종료
				return;
			case 1: // 주문하기
				choice2 = hotdogView.getMenu2();
				// 메뉴2
				switch (choice2) { // 주문메뉴
				case 0: // 돌아가기
					continue;
				case 1: // 기본메뉴
					System.out.println("-----------------------------------------------");
					hotdogView.getHotdogAll(hotdogRepository.getHotdogSet());// 기본 핫도그
					System.out.println("-----------------------------------------------");
					hotdogView.getDrinkAll(hotdogRepository.getDrinkList());// 음료수
					System.out.println("-----------------------------------------------");
					hotdogView.getString();
					System.out.println();
					continue;
					
				case 2: //세트메뉴
					System.out.println("-----------------------------------------------");
					hotdogView.getSetMenuAll(hotdogRepository.getSetMenu());
					System.out.println("-----------------------------------------------");
					hotdogView.getString();
					System.out.println();
					continue;
				case 3: // 랜덤 조합 메뉴
					System.out.println("-----------------------------------------------");
					hotdogView.getBread(hotdogRepository.getBreadList());// 빵
					hotdogView.getPatty(hotdogRepository.getPattyList());// 패티
					hotdogView.getTopping(hotdogRepository.getToppingList());// 토핑1
					hotdogView.getTopping(hotdogRepository.getToppingList());// 토핑2
					hotdogView.getDrink(hotdogRepository.getDrinkList());// 음료수
					System.out.println("-----------------------------------------------");
					hotdogView.getString();
					System.out.println();
					continue;
				case 4: // 토핑 직접 고르기
					System.out.println("-----------------------------------------------");
					System.out.println("죄송합니다.");
					System.out.println("준비중인 서비스입니다 . . . . .");
					System.out.println("-----------------------------------------------");
					continue;
				case 5: // 장바구니출력
					System.out.println("-----------------------------------------------");
					hotdogView.outString();
					System.out.println("-----------------------------------------------");
					System.out.println("감사합니다.");
					System.out.println();
					continue;
				case 6: //리뷰입력
					hotdogView.getReview();
					continue;
				case 7: //리뷰 출력
					hotdogView.outReview();
					continue;
					
				}
			}
		}
	}

	// C 핫도그
	public void createHodog(int id, String hotdog, int price) {
		hotdogView.createHotdog(hotdogRepository.getHotdogSet(), id, hotdog, price);
	}
	
	//C 세트메뉴
	public void createSetMenu(int id, String hotdog, String drink, int price) {
		hotdogView.createSetMenu(hotdogRepository.getSetMenu(), id, hotdog, drink, price);
	}

	// C 빵
	public void createBread(int id, String bread, int price) {
		hotdogView.createBread(hotdogRepository.getBreadList(), id, bread, price);
	}

	// C 패티
	public void createPatty(int id, String patty, int price) {
		hotdogView.createPatty(hotdogRepository.getPattyList(), id, patty, price);
	}

	// C 토핑
	public void createTopping(int id, String topping, int price) {
		hotdogView.createTopping(hotdogRepository.getToppingList(), id, topping, price);
	}

	// C 음료수
	public void createDrink(int id, String drink, int price) {
		hotdogView.createDrink(hotdogRepository.getDrinkList(), id, drink, price);
	}

	// R All 핫도그
	public void getHotdogAll() {
		hotdogView.getHotdogAll(hotdogRepository.getHotdogSet());
	}

	// R All 음료수
	public void getDrinkAll() {
		hotdogView.getDrinkAll(hotdogRepository.getDrinkList());
	}

	// R 빵
	public void getBread() {
		hotdogView.getBread(hotdogRepository.getBreadList());
	}

	// R 패티
	public void getPatty() {
		hotdogView.getPatty(hotdogRepository.getPattyList());
	}

	// R 토핑
	public void getTopping() {
		hotdogView.getTopping(hotdogRepository.getToppingList());
	}

	// R 음료수
	public void getDrink() {
		hotdogView.getDrink(hotdogRepository.getDrinkList());
	}

	// U 기본 핫도그
	public void putHotdog(HotdogVO hotdogVO) {
		hotdogView2.putHotdog(hotdogRepository.getHotdogSet(), hotdogVO);
	}

	// U 빵
	public void putBread(HotdogVO hotdogVO) {
		hotdogView2.putBread(hotdogRepository.getBreadList(), hotdogVO);
	}

	// U 패티
	public void putPatty(HotdogVO hotdogVO) {
		hotdogView2.putPatty(hotdogRepository.getPattyList(), hotdogVO);
	}

	// U 토핑
	public void putTopping(HotdogVO hotdogVO) {
		hotdogView2.putTopping(hotdogRepository.getToppingList(), hotdogVO);
	}

	// U 음료수
	public void putDrink(HotdogVO hotdogVO) {
		hotdogView2.putDrink(hotdogRepository.getDrinkList(), hotdogVO);
	}

	// D 기본 핫도그
	public void deleteHotdog(HotdogVO hotdogVO) {
		hotdogView2.deleteHordog(hotdogRepository.getHotdogSet(), hotdogVO);
	}

	// D 빵
	public void deleteBread(HotdogVO hotdogVO) {
		hotdogView2.deleteBread(hotdogRepository.getBreadList(), hotdogVO);
	}

	// D 패티
	public void deletePatty(HotdogVO hotdogVO) {
		hotdogView2.deletePatty(hotdogRepository.getPattyList(), hotdogVO);
	}

	// D 토핑
	public void deleteTopping(HotdogVO hotdogVO) {
		hotdogView2.deleteTopping(hotdogRepository.getToppingList(), hotdogVO);
	}

	// D 음료수
	public void deleteDrink(HotdogVO hotdogVO) {
		hotdogView2.deleteDrink(hotdogRepository.getDrinkList(), hotdogVO);
	}
}