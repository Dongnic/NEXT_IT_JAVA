package ch10_extends_interface.simple.starcraft;

import java.util.ArrayList;

public class StarcraftMain {

	public static void main(String[] args) {
		Marin marin = new Marin();

		System.out.println(marin.getName());
		
		marin.stimpack();
		marin.move(10, 20);
		
		Zealot zealot = new Zealot();
		
		System.out.println(zealot.getName());
		
		zealot.move(10, 20);
		
		Zealot zealot1 = new Zealot();
		Zealot zealot2 = new Zealot();
		Zealot zealot3 = new Zealot();
		Zealot zealot4 = new Zealot();
		Zealot zealot5 = new Zealot();
		Zealot zealot6 = new Zealot();
		
		// 질럿 6마리 드래그로 선택
		ArrayList<Zealot> zealotList1 = new ArrayList<>();
		zealotList1.add(zealot1);
		zealotList1.add(zealot2);
		zealotList1.add(zealot3);
		zealotList1.add(zealot4);
		zealotList1.add(zealot5);
		zealotList1.add(zealot6);
		
		// 선택한 질럿 이동명령
		for(int i = 0; i < zealotList1.size(); i++) {
			zealotList1.get(i).move(10, 30);
		}
		
		HighTemplar highTemplar = new HighTemplar();
		
		highTemplar.psionicStorm();
		// 하이템플러도 같이 선택하기
		// zealotList1이 Zealot 객체이기 때문에 안 담김
//		zealotList1.add(highTemplar);
		
		// 다형성(Polymorphism)
		// 하나의 객체가 여러가지 타입을 가질 수 있다.
		// 부모 클래스 타입의 참조 변수로(ProtossUnit, StarUnit)
		// 자식 클래스 타입의 인스턴스(Zealot 객체)를 참조할 수 있는 것
		
		// 자식 클래스인 객체에서 부모객체로 형변환이 가능하다.
		ProtossUnit protoss = zealot1; // 자동 형 변환
		ProtossUnit protoss2 = (ProtossUnit)zealot2; // 강제 형 변환 
		
		// 자식 객체에서 부모, 조부모 객체로도 형변환이 가능하다
		StarUnit Star = zealot1;
		
		// 드래그 선택
		ArrayList<StarUnit> starList = new ArrayList<>();
		starList.add(zealot1);
		starList.add(zealot2);
		starList.add(zealot3);
		starList.add(zealot4);
		starList.add(zealot5);
		starList.add(zealot6);
		starList.add(highTemplar);
		starList.add(marin);
		
		ArrayList<ProtossUnit> proList = new ArrayList<>();
		proList.add(zealot1);
		proList.add(highTemplar);
		// 프로토스 객체에 마린은 안됨 
//		proList.add(marin);

		for(int i = 0; i < starList.size(); i++) {
			starList.get(i).move(10, 30);
		}
		
		// StarUnit을 담는 ArrayList인 starList에 
		// zealot, marin 등 담기는 순간 자동 형 변환이 되어 담긴다.
		
		// .get()을 사용할 때는 형 변환이 된 상태이므로
		// 자식이 가진 메소드를 바로 사용할 수 없다.
		System.out.println(starList.get(7).getName());
//		starList.get(7).stimpack(); // 현재 marin은 StarUnit객체 
		
		// 그러므로 사용을 위해서는 다시 형 변환을 해야한다.(StraUnit -> Marin)
		((Marin)starList.get(7)).stimpack();
		((HighTemplar)starList.get(6)).psionicStorm();
		
		// i의 값이 어떤 객체인지 모를때는 다음과 같은 방법을 사용
		for(int i = 0; i < starList.size(); i++) {
			if(starList.get(i).getName().equals("하이템플러")) {
				((HighTemplar)starList.get(i)).psionicStorm();
			}
		}
		
		// 객체 Instanceof 클래스 (true, false 반환)
		// 좌측의 객체가 우측의 클래스로 형변환이 가능하다면 true / 아니라면 false
		for(int i = 0; i < starList.size(); i++) {
			if(starList.get(i) instanceof HighTemplar) {
				((HighTemplar)starList.get(i)).psionicStorm();
			}
		}
		
		// 마린 스팀팩 써보기 
		for(int i = 0; i < starList.size(); i++) {
			if(starList.get(i) instanceof Marin) {
				((Marin)starList.get(i)).stimpack();
			}
		}
		
		// 조부모 객체 생성
		StarUnit puma = new StarUnit("퓨마", 0, 0, 0, 0, 0, 0, 0);
		
		// 일반적으로 부모 객체는 자식 객체로 형 변환할 수 없다.
		System.out.println(puma instanceof Marin); // false
		// 자식 객체는 부모 객체로 형 변환이 가능하다
		System.out.println(marin instanceof StarUnit); // true
		
		// 부모 객체로 형 변환 되었던 자식 객체는 
		// 다시 자식 객체로 형 변환이 가능하다
		ProtossUnit zea = zealot;
		System.out.println(zea instanceof Zealot); // true
		
		
		
	}

}
