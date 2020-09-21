package view;

import java.util.Iterator;
import java.util.List;

import dto.HotdogVO;

public class HotdogView2 { // U , D
	// U 기본 핫도그
	public void putHotdog(List<HotdogVO> hotdogSet, HotdogVO hotdogVO) {
		Iterator<HotdogVO> itr = hotdogSet.iterator();
		while (itr.hasNext()) {
			HotdogVO arrHotdogVO = itr.next();
			if (arrHotdogVO.getId() == hotdogVO.getId()) {
				arrHotdogVO.setHotdog(hotdogVO.getHotdog());
				arrHotdogVO.setPrice(hotdogVO.getPrice());
			}
		}
	}

	// U 빵
	public void putBread(List<HotdogVO> breadList, HotdogVO hotdogVO) {
		Iterator<HotdogVO> itr = breadList.iterator();
		while (itr.hasNext()) {
			HotdogVO arrHotdogVO = itr.next();
			if (arrHotdogVO.getId() == hotdogVO.getId()) {
				arrHotdogVO.setBread(hotdogVO.getBread());
				arrHotdogVO.setPrice(hotdogVO.getPrice());
			}
		}
	}

	// U 패티
	public void putPatty(List<HotdogVO> pattyList, HotdogVO hotdogVO) {
		Iterator<HotdogVO> itr = pattyList.iterator();
		while (itr.hasNext()) {
			HotdogVO arrHotdogVO = itr.next();
			if (arrHotdogVO.getId() == hotdogVO.getId()) {
				arrHotdogVO.setPatty(hotdogVO.getPatty());
				arrHotdogVO.setPrice(hotdogVO.getPrice());
			}
		}
	}

	// U 토핑
	public void putTopping(List<HotdogVO> toppingList, HotdogVO hotdogVO) {
		Iterator<HotdogVO> itr = toppingList.iterator();
		while (itr.hasNext()) {
			HotdogVO arrHotdogVO = itr.next();
			if (arrHotdogVO.getId() == hotdogVO.getId()) {
				arrHotdogVO.setTopping(hotdogVO.getTopping());
				arrHotdogVO.setPrice(hotdogVO.getPrice());
			}
		}
	}

	// U 음료수
	public void putDrink(List<HotdogVO> drinkList, HotdogVO hotdogVO) {
		Iterator<HotdogVO> itr = drinkList.iterator();
		while (itr.hasNext()) {
			HotdogVO arrHotdogVO = itr.next();
			if (arrHotdogVO.getId() == hotdogVO.getId()) {
				arrHotdogVO.setDrink(hotdogVO.getDrink());
				arrHotdogVO.setPrice(hotdogVO.getPrice());
			}
		}
	}

	// D 기본 핫도그
	public void deleteHordog(List<HotdogVO> hotdogSet, HotdogVO hotdogVO) {
		Iterator<HotdogVO> itr = hotdogSet.iterator();
		while (itr.hasNext()) {
			HotdogVO arrHotdogVO = itr.next();
			if (arrHotdogVO.getId() == hotdogVO.getId()) {
				itr.remove();
			}
		}
	}

	// D 빵
	public void deleteBread(List<HotdogVO> breadList, HotdogVO hotdogVO) {
		Iterator<HotdogVO> itr = breadList.iterator();
		while (itr.hasNext()) {
			HotdogVO arrHotdogVO = itr.next();
			if (arrHotdogVO.getId() == hotdogVO.getId()) {
				itr.remove();
			}
		}
	}

	// D 패티
	public void deletePatty(List<HotdogVO> pattyList, HotdogVO hotdogVO) {
		Iterator<HotdogVO> itr = pattyList.iterator();
		while (itr.hasNext()) {
			HotdogVO arrHotdogVO = itr.next();
			if (arrHotdogVO.getId() == hotdogVO.getId()) {
				itr.remove();
			}
		}
	}

	// D 토핑
	public void deleteTopping(List<HotdogVO> toppingList, HotdogVO hotdogVO) {
		Iterator<HotdogVO> itr = toppingList.iterator();
		while (itr.hasNext()) {
			HotdogVO arrHotdogVO = itr.next();
			if (arrHotdogVO.getId() == hotdogVO.getId()) {
				itr.remove();
			}
		}
	}

	// D 음료수
	public void deleteDrink(List<HotdogVO> drinkList, HotdogVO hotdogVO) {
		Iterator<HotdogVO> itr = drinkList.iterator();
		while (itr.hasNext()) {
			HotdogVO arrHotdogVO = itr.next();
			if (arrHotdogVO.getId() == hotdogVO.getId()) {
				itr.remove();
			}
		}
	}
}