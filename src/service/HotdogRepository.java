package service;

import java.util.ArrayList;
import java.util.List;

import dto.HotdogVO;

public class HotdogRepository {
	List<HotdogVO> breadList = new ArrayList<>(); //빵
	List<HotdogVO> pattyList = new ArrayList<>(); //패티
	List<HotdogVO> toppingList = new ArrayList<>(); //토핑
	List<HotdogVO> drinkList = new ArrayList<>(); //음료
	List<HotdogVO> hotdogSet = new ArrayList<>(); //핫도그
	List<HotdogVO> setMenu = new ArrayList<>(); //세트메뉴

	public List<HotdogVO> getSetMenu() {
		return setMenu;
	}

	public void setSetMenu(List<HotdogVO> setMenu) {
		this.setMenu = setMenu;
	}

	public List<HotdogVO> getBreadList() {
		return breadList;
	}

	public void setBreadList(List<HotdogVO> breadList) {
		this.breadList = breadList;
	}

	public List<HotdogVO> getPattyList() {
		return pattyList;
	}

	public void setPattyList(List<HotdogVO> pattyList) {
		this.pattyList = pattyList;
	}

	public List<HotdogVO> getToppingList() {
		return toppingList;
	}

	public void setToppingList(List<HotdogVO> toppingList) {
		this.toppingList = toppingList;
	}

	public List<HotdogVO> getDrinkList() {
		return drinkList;
	}

	public void setDrinkList(List<HotdogVO> drinkList) {
		this.drinkList = drinkList;
	}

	public List<HotdogVO> getHotdogSet() {
		return hotdogSet;
	}

	public void setHotdogSet(List<HotdogVO> hotdogSet) {
		this.hotdogSet = hotdogSet;
	}
}
