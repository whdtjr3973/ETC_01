package com.biz.etc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exec_02 {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<String>();

		strList.add("ȫ�浿");
		strList.add("�̸���");
		strList.add("������");
		strList.add("�Ӳ���");
		strList.add("����");
		strList.add("��ͺ�");

		Collections.shuffle(strList);

		for (String s : strList) {
			System.out.println(s);
		}
	}

}
