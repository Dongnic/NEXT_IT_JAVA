package ch11_java_api;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ApiJson {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ParseException {
		
		// .jar 파일을 프로젝트 폴더에 넣고
		// 프로젝트에 우클릭 Build Path
		// Add Jar 클릭 후 추가
		
		// JSON 객체 만들기
		JSONObject jsonObject = new JSONObject();
		
		// JSON 객체는 내부에 이름과 값의 쌍으로
		// 구성된 데이터를 가진다
		// KEY와 VALUE 쌍으로 데이터를 담는 HashMap과 유사
		// HashMap<String, Object> 
		jsonObject.put("이름", "아이유");
		jsonObject.put("나이", "30");
		
		// JSON 배열
		JSONArray jsonArray = new JSONArray();
		jsonArray.add("좋은날");
		jsonArray.add("라일락");
		jsonArray.add("밤편지");
		jsonArray.add("마시멜로우");
		jsonArray.add("있잖아");
		
		jsonObject.put("노래리스트", jsonArray);
		System.out.println(jsonObject);
		System.out.println(jsonObject.toString());
		System.out.println(jsonObject.toJSONString());
		
		System.out.println("===============================");
		JSONObject taeyeon = new JSONObject();
		taeyeon.put("이름", "태연");
		taeyeon.put("나이", "34");
		JSONArray songArray = new JSONArray();
		songArray.add("사계");
		songArray.add("만약에");
		songArray.add("INVU");
		songArray.add("제주도의 푸른밤");
		taeyeon.put("노래", songArray);
		System.out.println(taeyeon.toJSONString());
		
		jsonObject.put("태연", taeyeon);
		System.out.println(jsonObject.toJSONString());
		
		String serverResult = "{\"노래리스트\":[\"좋은날\",\"라일락\",\"밤편지\",\"마시멜로우\",\"있잖아\"],\"이름\":\"아이유\",\"나이\":\"30\",\"태연\":{\"노래\":[\"사계\",\"만약에\",\"INVU\",\"제주도의 푸른밤\"],\"이름\":\"태연\",\"나이\":\"34\"}}";
		
		// JSON 파싱
		JSONParser jsonParser = new JSONParser();
		JSONObject iuJson = (JSONObject)jsonParser.parse(serverResult);
		System.out.println(iuJson);
		
		// 키를 이용하여 값 꺼내기
		System.out.println(iuJson.get("이름"));
		String name = (String)iuJson.get("이름");
		System.out.println(name);
		System.out.println(iuJson.get("나이"));
		System.out.println("=========================================");
		// 유니크 아이디 생성
		// Guest20220519 162434 143 123456님 환영합니다
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		
		String a = sdf.format(new Date());
		Random random = new Random();
		int b = (random.nextInt(900000)+100000);
		System.out.println("Guest"+a+b+"님 환영합니다.");
		
	}

}
