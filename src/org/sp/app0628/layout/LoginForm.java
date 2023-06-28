package org.sp.app0628.layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

//상속
// 1) 부모의 재산을 내 것처럼 접근할 수 있다.
// 2) 상속 관게에 있는 객체들은 서로 같은 종류의 자료형으로 본다.
public class LoginForm extends Frame{
				/*LoginForm is a Frame*/
	Label la_id; // 개발자가 직접 생성자로 명시하지 않으면 has a 관계에 있는 객체는 메모리에 자동으로 올라가지 않는다. null이 됨.
	Label la_pass; 
	TextField t_id;
	TextField t_pass;
	Button bt_login;
	Button bt_join;
	Panel p_center; // 가운데 영역에서 별도의 레이아웃을 적용하기 위한 패널
						// 패널은 디폴트 배치관리자가 FlowLayout 이다.
	Panel p_south; //남쪽 영역에 버튼들을 포함하게 될 패널 선언
	
	// frame과 frame이 가지고 있는 재료들을 초기화하자 -> 생성자를 정의한다는 뜻
	// LoginForm 이곧 윈도우이고, 이 윈도우가 생성될 때, 이 윈도우가 보유한 부품들도
	// 함께 메모리에 생성돼야 하므로, 초기화할 필요가 있다!! 
	public LoginForm() {
		// 부품 생성하기
		la_id = new Label("ID");
		la_pass = new Label("Password");
		t_id = new TextField();
		t_pass = new TextField();
		bt_login = new Button("Login");
		bt_join = new Button("join");
		p_center = new Panel();
		p_south = new Panel();
		
		// 배경색 지정 
		la_id.setBackground(Color.GREEN);
		
		// 패널의 레이아웃 변경
		p_center.setLayout(new GridLayout(2, 2));

		// center의 패널에 각종 폼요소들을 부착
		p_center.add(la_id); // 왼쪽에서 오른쪽으로, 위에서 아래로 채워지는 GridLayout 속성에 따라 자동으로 (0, 0)에 채워짐.
		p_center.add(t_id); // 0, 1
		p_center.add(la_pass); // 1,0
		p_center.add(t_pass); // 1, 1
		
		// 생성된 부품들을 윈도우인 프레임에 부착하자
		// 하지만 내가 곧 윈도우이므로 즉 프레임이므로 레퍼런스 변수는 나를 가리키는 this 를 사용할 수 있다.
		this.add(p_center, BorderLayout.CENTER); // 프레임에 패널부착
		
		// 남쪽 영역에 부착한 패널에 버튼 부착
		p_south.add(bt_login); // Panel의 디폴트 배치 관리자는 FlowLayout 이므로 그냥 부착하면 객체들이 나란히 배치됨.
		p_south.add(bt_join); 
		
		//프레임의 남쪽 영역에 패널 부착.
		this.add(p_south, BorderLayout.SOUTH);
		
		this.setSize(300, 120); // 나(Frame)의 크기 설정
		this.setVisible(true); // 나(Frame)의 보이게하기 설정
	}
	
	public static void main(String[] args) {
		LoginForm form = new LoginForm();
	}
}
