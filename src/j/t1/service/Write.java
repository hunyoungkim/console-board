package j.t1.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Date;
import j.t1.control.Action;
import j.t1.model.Command;

public class Write implements Action{

	@Override
	public void execute(BufferedReader bufferedReader) throws IOException {
		Command command = new Command();
		Date  date = new Date();

		
		System.out.println("쓰기화면입니다.");
				
		System.out.print("작성자 :" + "  ");
		String user = bufferedReader.readLine();
		command.setUser(user);
		
		System.out.print("비밀번호를 입력하세요(숫자만) :" + "  ");
		int pass = (Integer.parseInt(bufferedReader.readLine()));
		command.setPass(pass);
	
		
		System.out.print("제목 :" + "  ");
		String subject = bufferedReader.readLine();
		command.setSubject(subject);
		
		System.out.print("내용 :" + "  ");
		String content = bufferedReader.readLine();
		command.setContent(content);
		
		System.out.print("이메일주소를 입력하세요 :" + "  ");
		String email=bufferedReader.readLine();
		command.setEmail(email);
		
		Date cdate = date;
		command.setCdate(cdate);
		
		Date udate = date;
		command.setUdate(udate);
		
		arrayList.add(command);
		
		System.out.print("글 등록 완료 :" + "  ");
		System.out.println("=================================");
		System.out.println();
	}

}
