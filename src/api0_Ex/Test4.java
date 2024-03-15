package api0_Ex;

import java.awt.FlowLayout;

import javax.swing.*;

/*
 * 아이디: 영문(대/소), _, -, 숫자 - 4자 이상
 * 비밀번호 : 영문(대/소), ~!@#$%^&*()_+-= , 숫자 - 6자 이상 
 * 성명: 영문(대/소), 한글
 * 나이: 숫자
 * 전화번호 : 02-123-4567, 010-123-4567, 010-1234-5678, 043-123-4567, 143-1234-1234
 * 이메일 :
 * 주민번호 : 이건 그냥 생년월일 010511-1234567 (8번째는 1/2/3/4)
 */

public class Test4 extends JFrame {
///생성자를 통해 처음 보여지는 화면 생성됨 
	public void Frame_Test() {

		setSize(300, 300); // 윈도우의 사이즈를 결정
		setLocation(750, 350); // 처음의 위치를 결정
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 윈도우 창 종료시 깔끔하게 닫을 수 있다.

		// FlowLayout 객체 전달하기
		setLayout(new FlowLayout(FlowLayout.CENTER)); // 레이아웃 정렬방식

		// 버튼을 만들어서
		JButton btn1 = new JButton("버튼1"); // 버튼 생성
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");

		// 프레임에 추가하기
		add(btn1); // 버튼을 프레임에 추가
		add(btn2);
		add(btn3);

		setVisible(true); // 눈에 보여질 것인가? (N: false, Y: true)

	}

	public static void main(String[] args) {
//		new Frame_Test(); // 생성자 생성
	}

}
