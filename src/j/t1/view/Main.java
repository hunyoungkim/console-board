package j.t1.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import j.t1.service.Delete;
import j.t1.service.List;
import j.t1.service.Update;
import j.t1.service.Write;

public class Main {
public static void main(String[] args) throws IOException {
	InputStreamReader inputStreamReader =  new InputStreamReader(System.in);
	BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	
	String sel;
	do {
		System.out.println("메뉴를 선택하세요");
		System.out.print("1. 목록화면" + " ");
		System.out.print("2. 글 등록" + " ");
		System.out.print("3. 글 수정" + " ");
		System.out.print("4. 글 삭제" + " ");
		System.out.println("5. 종료" + " ");
		System.out.println("메뉴 번호를 입력하세요 :" + " ");
		sel = bufferedReader.readLine();
		
		switch (sel) {
		case "1":
			List list = new List();
			list.execute(bufferedReader);
			
			break;
		case "2":
			Write write = new Write();
			write.execute(bufferedReader);
			break;
			
		case "3":
			Update update = new Update();
			update.execute(bufferedReader);
			break;
			
		case "4":
			Delete delete = new Delete();
			delete.execute(bufferedReader);
			break;
			
		case "5":
			System.exit(0);
			break;
			
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		
	
	} while (true);
	
}
}
