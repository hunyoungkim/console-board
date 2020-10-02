package j.t1.service;

import java.io.BufferedReader;
import java.io.IOException;


import j.t1.control.Action;


public class Delete implements Action{

	@Override
	public void execute(BufferedReader bufferedReader) throws IOException {
		System.out.println("삭제화면입니다.");
		
		System.out.println("작성자를 입력하세요");
		String checkuser = bufferedReader.readLine();
		
		int checkpass = 0;
		
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getUser().equals(checkuser)) {
				System.out.println("글 비밀번호를 입력하세요");
				checkpass = Integer.parseInt(bufferedReader.readLine());
				if (arrayList.get(i).getPass() == checkpass) {
						arrayList.remove(i);
					System.out.println("글이 삭제 되었습니다.");
					
				} else {
					System.out.println("비밀번호가 틀립니다.");
				}
			}else {
				System.out.println("작성자가 없습니다.");
			}
	}
	}
}
