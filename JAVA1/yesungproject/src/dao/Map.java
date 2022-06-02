package dao;

import java.util.ArrayList;

import main.Event;

public class Map {

	private static Map instance = new Map();

	private Map() {

	}

	public static Map getInstance() {
		return instance;
	}

	public static void showMap(ArrayList<Event> m) {
		int totalCount = m.size();
		int showCountOnePage = 5;

		int countPage = (int) Math.ceil((double) totalCount / showCountOnePage);
		int countLastPage = totalCount % showCountOnePage;
		for (int i = 0; i < countPage; i++) {
			System.out.println("\n");
			if (i == countPage - 1) {
				for (int k = i * showCountOnePage; k < totalCount; k++) {
					System.out.print(m.get(k));
				}

			} else {
				for (int k = i * showCountOnePage; k < (i + 1) * showCountOnePage; k++) {
					System.out.print(m.get(k));
				}
			}
		}

	}

}
