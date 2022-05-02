package DongJun.submit11;

import java.util.ArrayList;
import java.util.Collections;

public class Q01_ProductMain {

	public static void main(String[] args) {

		ArrayList<product> prodList = new ArrayList<>();
		
		// Q01 - 2
		prodList.add(new product("냉장고", 2_000_000));
		prodList.add(new product("TV", 1_000_000));
		prodList.add(new product("에어컨", 800_000));
		prodList.add(new product("컴퓨터", 1_300_000));
		prodList.add(new product("선풍기", 100_000));
		System.out.println("-- 2번 --");
		System.out.println(prodList);
		
		// Q01 - 3
		System.out.println("-- 3번 --");
		Collections.sort(prodList);
		for(int i = 0; i < prodList.size(); i++) {
			System.out.println(prodList.get(i));
		}
		// Q01 - 4
		System.out.println("-- 4번 --");
		for(int i = 0; i < prodList.size(); i++) {
			if(prodList.get(i).getName().equals("TV")) {
				System.out.println(i);
			}
		}
	} // main

}
