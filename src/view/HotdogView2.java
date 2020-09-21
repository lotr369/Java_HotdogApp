package view;

import java.util.Iterator;
import java.util.List;

import dto.HotdogVO;

public class HotdogView2 { // U , D
	// U �⺻ �ֵ���
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

	// U ��
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

	// U ��Ƽ
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

	// U ����
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

	// U �����
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

	// D �⺻ �ֵ���
	public void deleteHordog(List<HotdogVO> hotdogSet, HotdogVO hotdogVO) {
		Iterator<HotdogVO> itr = hotdogSet.iterator();
		while (itr.hasNext()) {
			HotdogVO arrHotdogVO = itr.next();
			if (arrHotdogVO.getId() == hotdogVO.getId()) {
				itr.remove();
			}
		}
	}

	// D ��
	public void deleteBread(List<HotdogVO> breadList, HotdogVO hotdogVO) {
		Iterator<HotdogVO> itr = breadList.iterator();
		while (itr.hasNext()) {
			HotdogVO arrHotdogVO = itr.next();
			if (arrHotdogVO.getId() == hotdogVO.getId()) {
				itr.remove();
			}
		}
	}

	// D ��Ƽ
	public void deletePatty(List<HotdogVO> pattyList, HotdogVO hotdogVO) {
		Iterator<HotdogVO> itr = pattyList.iterator();
		while (itr.hasNext()) {
			HotdogVO arrHotdogVO = itr.next();
			if (arrHotdogVO.getId() == hotdogVO.getId()) {
				itr.remove();
			}
		}
	}

	// D ����
	public void deleteTopping(List<HotdogVO> toppingList, HotdogVO hotdogVO) {
		Iterator<HotdogVO> itr = toppingList.iterator();
		while (itr.hasNext()) {
			HotdogVO arrHotdogVO = itr.next();
			if (arrHotdogVO.getId() == hotdogVO.getId()) {
				itr.remove();
			}
		}
	}

	// D �����
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