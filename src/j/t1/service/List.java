package j.t1.service;

import java.io.BufferedReader;
import j.t1.control.Action;


public class List implements Action {

	@Override
	public void execute(BufferedReader bufferedReader) {
		System.out.println("목록화면입니다.");
		

		if (arrayList.size() > 0) {
			for (int i = 0; i < arrayList.size(); i++) {
				System.out.print("글제목 : ");
				System.out.println(arrayList.get(i).getSubject());
				System.out.print("작성자 : ");
				System.out.println(arrayList.get(i).getUser());
				System.out.print("글내용 : ");
				System.out.println(arrayList.get(i).getContent());
				System.out.print("작성자 메일 : ");
				System.out.println(arrayList.get(i).getEmail());
				System.out.print("글 작성일 : ");
				System.out.println(arrayList.get(i).getCdate());
				System.out.print("글 수정일 : ");
				System.out.println(arrayList.get(i).getUdate());
				System.out.println("=================================");
				System.out.println();
			}
		} else {
			System.out.println("등록된 글이 없습니다.");
			System.out.println("=================================");
		System.out.println();
		}

	}

}
