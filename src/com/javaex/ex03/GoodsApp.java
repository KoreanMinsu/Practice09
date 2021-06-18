package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		List<Goods> itemList = new ArrayList<Goods>();
		Scanner sc = new Scanner(System.in);
		System.out.println("상품 입력 해주세요(종료 q)");
		while (true) {
			String scan = sc.nextLine();
			if (scan.equals("q")) {
				System.out.println("입력완료");
				System.out.println("======================");
				for (Goods g : itemList) {
					System.out.println(g.GoodsInfo());
				}
				System.out.println("모든 상품의 갯수는" + Goods.getAllCount() + "개입니다.");
				break;
			}

			String[] scanInfo = scan.split(",");
			String name = scanInfo[0];
			int price = Integer.parseInt(scanInfo[1]);
			int count = Integer.parseInt(scanInfo[2]);

			Goods goods = new Goods(name, price, count);
			itemList.add(goods);
		}

		sc.close();

	}

}
