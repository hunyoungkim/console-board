package j.t1.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Date;

import j.t1.control.Action;
import j.t1.model.Command;

public class Update implements Action {

	@Override
	public void execute(BufferedReader bufferedReader) throws NumberFormatException, IOException {
		System.out.println("수정화면입니다.");

		boolean bool = false;
		Command command = new Command();
		Date cdate = new Date();
		Date udate = new Date();
		int checkpass = 0;
		System.out.println("작성자를 입력하세요");
		String checkuser = bufferedReader.readLine();
		int a = 0;
		int b= 0;

		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getUser().equals(checkuser)) {
				System.out.println("글 비밀번호를 입력하세요");
				checkpass = Integer.parseInt(bufferedReader.readLine());
				a = 1;
				if (arrayList.get(i).getPass() == checkpass) {
					b = 1;
					cdate = arrayList.get(i).getCdate();
					arrayList.remove(i);
					bool = true;
				}
			}
		}

		if (bool == true) {

			System.out.print("제목 :" + "  ");
			String subject = bufferedReader.readLine();
			command.setSubject(subject);

			System.out.print("내용 :" + "  ");
			String content = bufferedReader.readLine();
			command.setContent(content);

			System.out.print("이메일주소를 입력하세요 :" + "  ");
			String email = bufferedReader.readLine();
			command.setUser(checkuser);
			command.setPass(checkpass);
			command.setEmail(email);
			command.setCdate(cdate);
			command.setUdate(udate);

			arrayList.add(command);
			System.out.println("수정되었습니다..");
			System.out.println("=================================");
			System.out.println();
		} else {
			if  (a == 0) {
				System.out.println("작성자가 없습니다..");
				System.out.println("=================================");
				System.out.println();
			} else if (b == 0){
				System.out.println("비밀번호가 틀립니다.");
				System.out.println("=================================");
				System.out.println();
			}
		}
	}

}
