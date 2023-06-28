/*
 * java.awt 패키지는 os마다 디자인이 틀려지는 문제 발생
 * 따라서 이 디자인을 모든 os종류와 상관없이 자바에서 지정한 디자인테마로 고정하기 위해 Swing이 개발됐고,
 * javax.swing 패키지에서 지원된다.
 * Swing 은 기존의 awt 객체 명에 접두어로 J를 붙인다.
 * 
 * 주의) awt가 완전히 사용되지 않는 것은 아니다.
 * 		예) 기존의 배치관리자 등은 여전히 사용된다.
 * 결론) java 기반으로 GUI 프로그램 개발시 awt+Swing 을 조합해서 개발.
 * */

package org.sp.app0628.layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWin extends JFrame{
				/* is a */
	JButton bt; //has a
	
	//부품이 존재한다면, 초기화할 이유가 있다.
	public MyWin() {
		bt = new JButton("난 swing버튼");
		
		//윈도우의 레이아웃을 FlowLayout으로 변경
		this.setLayout(new FlowLayout());
		
		add(bt); //나(프레임)에게 버튼 부착
		
		setSize(300, 400);
		setVisible(true);
		//윈도우창을 닫으면 setVisible(false)가 될 뿐이므로, 실제 프로그램인 즉 프로세스는 여전히 살아있다.
		//따라서 프로세스마저 죽이는 방법.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyWin(); // 레퍼런스 변수를 만들어 다른 작업을 할 일이 없으므로. 굳이 변수 선언하지 않음.
	}
}
