package org.sp.app0628.layout;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//메모장을 만들어 보자
public class Editor extends JFrame{
	JMenuBar bar;//메뉴바
	
	//메뉴
	JMenu m_file; //파일
	JMenu m_edit; //편집
	JMenu m_style; //서식
	JMenu m_view; //보기
	JMenu m_help; //도움말
	
	//8개의 메뉴 아이템
	JMenuItem i_new; 
	JMenuItem i_window; 
	JMenuItem i_open; 
	JMenuItem i_save; 
	JMenuItem i_saveas; 
	JMenuItem i_page; 
	JMenuItem i_print; 
	JMenuItem i_exit;
	
	JTextArea area;
	JScrollPane scroll; //스크롤
	
	public Editor() {
		bar = new JMenuBar();
		
		m_file = new JMenu("파일(F)");
		m_edit = new JMenu("편집(E)");
		m_style = new JMenu("서식(O)");
		m_view = new JMenu("보기(V)");
		m_help = new JMenu("도움말(H)");
		
		i_new = new JMenuItem("새로 만들기");
		i_window = new JMenuItem("새창");
		i_open = new JMenuItem("열기");
		i_save = new JMenuItem("저장");
		i_saveas = new JMenuItem("다른 이름으로 저장");
		i_page = new JMenuItem("페이지 설정");
		i_print = new JMenuItem("인쇄");
		i_exit = new JMenuItem("닫기");
		
		//area 생성
		area = new JTextArea();
		scroll= new JScrollPane(area); //Component view -> 괄호 안에 Component형 인스턴스가 와야 한다. 
		// JTextArea api 문서를 보면 부모가 Component 로 명시 돼 있음. 괄호 안에 명시 가능
		// area에 스크롤이 적용됐고, area가 scroll에 함축된 상태
		
		//'파일' 메뉴에 하위 아이템들 부착하기
		m_file.add(i_new);
		m_file.add(i_window);
		m_file.add(i_open);
		m_file.add(i_save);
		m_file.add(i_saveas);
		m_file.addSeparator(); //구분선 긋기
		m_file.add(i_page);
		m_file.add(i_print);
		m_file.addSeparator(); //구분선 긋기
		m_file.add(i_exit);
		
		//바에 메뉴들 부착
		bar.add(m_file);
		bar.add(m_edit);
		bar.add(m_style);
		bar.add(m_view);
		bar.add(m_help);
		
		//바를 프레임에 부착
		this.setJMenuBar(bar);
		
		//center에 area 부착 -> area를 내포한 scroll을 부착하면 됨.
		this.add(scroll); //center는 디폴트이다. 방위 명시 필요 없음!
		
		this.setSize(800, 700);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Editor();
		
	}
}
