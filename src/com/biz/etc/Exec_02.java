package com.biz.etc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exec_02 {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<String>();

		strList.add("È«±æµ¿");
		strList.add("ÀÌ¸ù·æ");
		strList.add("¼ºÃáÇâ");
		strList.add("ÀÓ²©Á¤");
		strList.add("Àå³ì¼ö");
		strList.add("¾ç±Íºñ");

		Collections.shuffle(strList);

		for (String s : strList) {
			System.out.println(s);
		}
	}

}
