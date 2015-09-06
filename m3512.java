import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class m3512 extends JFrame implements ActionListener {
	// frame 위에 나타낼 각 컨포넌트들 선언
	Container ct;
	JLabel first, second, l1, l2, l3, l4;
	JTextField txt1, txt2, txt3, txt4;
	JButton btn1;

	// 암호화 & 복호화 함수에 쓰이는 전역변수 선언
	char[] text2;
	char[] Change_text, Change_text2;
	char[][] text_parse22;
	String text, Key;
	
	

	public m3512() {
		ct = getContentPane();
		ct.setLayout(new FlowLayout()); 
		first = new JLabel(
				"                      *********띄어쓰기 대소문자 허용********************* ");
		first.setAlignmentX(1);

		l1 = new JLabel("암호키 : ");
		txt1 = new JTextField(25);
		l2 = new JLabel("평   문 : ");
		txt2 = new JTextField(25);
		l3 = new JLabel("암호문 : ");
		txt3 = new JTextField(25);
		l4 = new JLabel("복호문 : ");
		txt4 = new JTextField(25);

		btn1 = new JButton("누르세요");
		btn1.addActionListener(this);// 이 버튼 누르면 바로 암호화 함수 작동

		// container 안에 넣기

		ct.add(first);
		ct.add(l1);
		ct.add(txt1);
		ct.add(l2);
		ct.add(txt2);
		ct.add(l3);
		ct.add(txt3);
		ct.add(l4);
		ct.add(txt4);
		ct.add(btn1);
	}

	// 암호화 함수
	public void encrypt(String key, String text) {

		// 1.암호화 될 때 쓰이는 변 수들
		// 공백제거
		
		String text_replace = text.replaceAll("\\p{Space}", "");
		// 평문을 배열로 바꾸기
		
		String lower = text_replace.toLowerCase();
		text2 = lower.toCharArray();
		
		// 홀수인 문자열을 짝수로 만들어줌
		char[] text3 = new char[text2.length + 1];
		// 암호화된 문자열 저장
		Change_text = new char[text3.length];

		// 2.암호판 할때 쓰이는 변수들
		// 공백제거
		String Key_replace = key.replaceAll("\\p{Space}", "");
		String lowerkey = Key_replace.toLowerCase();
		// 가져온 문자열 배열로 바꾸기
		char[] text_parse = lowerkey.toCharArray();
		
		// 5*5암호판 만들기
		char[] text_parse2 = new char[25];
		text_parse22 = new char[5][5];

		// 3.암호판 중복 체크(일단 중복되는 것들을 다 x로 바꾼뒤 나중에 x를 빼준다.)
		
	
		for (int i = 0; i < text_parse.length; i++) {
			for (int j = 0; j < text_parse.length; j++) {
				if (text_parse[i] == text_parse[j] && i != j)
					text_parse[j] = 'x';
				
			}
			
		}
		// 4.암호판에 문자 배치
		int array = -1;// 배열의 방 의미

		for (int i = 0; i < text_parse.length; i++) {
			if (text_parse[i] == 0)
				break;
			array++;

			if (text_parse[i] != 'x') { // 중복되는 문자욜 포함 시키지 않는다.
				text_parse2[array] = text_parse[i]; // 암호판에 중복되지 않은 문자열 추가

			} else {
				array--; // 만약 중복된 문자열이 있으면 배열 증가를 다 시 감소시킴
			}
		}

		char add = 'a'; // a~z 중에서 키값과 중복되지 않은 알파벳을 가려낸다.

		while (add != 'z' & array < 24) {
			for (int aa = 0; aa < text_parse2.length; aa++) {
				if (text_parse2[aa] == add) {
					add++;
					aa = -1;
				} else if (aa == text_parse.length - 1)
					break;
			}
			array++;
			text_parse2[array] = add; // 삽입되지 않은 알파벳을 순서대로 넣어준다.
			add++;
		}

		// 2차원 배열 5*5로 삽입

		int room = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				text_parse22[i][j] = text_parse2[room];
				room++;

			}
		}

		// 평문 2개씩 쪼개서 홀수일때 마지막에 x 추가

		// int f = 0;
		int s = 0;
    
		while (s < text2.length) {
			text3[s] = text2[s]; // text3에 text2삽입
			s++;
			
		}
		for(int i = 0; i<text3.length-1; i = i+2){
			if(text3[i] == text3[i+1])
				text3[i+1] = 'x';
		}
		System.out.println(text3);

		if (text2.length % 2 != 0)// 입력된 문자열이 홀수이면 뒤에 x추가해 짝수로 만들어줌
			text3[s] = 'x';
		//TODO:ee가 있으면 ex로 바꾸어 처리해준다.
		
		// 암호판의 행과 열 알아보기
		int save[][] = new int[30][2];
		int enter = 0;

		while (enter < text3.length) { // 배열의 방 위치 save에 저장
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (text3[enter] == text_parse22[i][j]) {
						save[enter][0] = i; // 0이 행ㅇ
						save[enter][1] = j; // 1이 열
				}

			
			}
		}
		enter++;
	}
		// 규칙에 따라 암호화
		
		

		for (int i = 0; i < text3.length - 1; i = i + 2) {
			
			
			 //TODO: 중복되는 수 처리
						
			if (save[i][0] != save[i + 1][0] && save[i][1] != save[i + 1][1]) {
				Change_text[i] = text_parse22[save[i + 1][0]][save[i][1]];
				Change_text[i + 1] = text_parse22[save[i][0]][save[i + 1][1]];

			}
			
			// 같은 열에 위치하면 열을 하나 밑으로 내려가있는 알파벳 삽입
			else {
				if (save[i][0] != save[i + 1][0]
						&& save[i][1] == save[i + 1][1]) {
					if (save[i][0] == 4)
						save[i][0] = -1;
					else if (save[i + 1][0] == 4)
						save[i + 1][0] = -1;
					Change_text[i] = text_parse22[save[i][0] + 1][save[i][1]];
					Change_text[i + 1] = text_parse22[save[i + 1][0] + 1][save[i + 1][1]];

				}

				else if (save[i][0] == save[i + 1][0]
						&& save[i][1] != save[i + 1][1]) {
					if (save[i][1] == 4) {
						save[i][1] = -1;
					} else if (save[i + 1][1] == 4)
						save[i + 1][1] = -1;

					Change_text[i] = text_parse22[save[i][0]][save[i][1] + 1];
					Change_text[i + 1] = text_parse22[save[i + 1][0]][save[i + 1][1] + 1];

				
			}
			}

			}
		

		// 2개의 문자가 서로 다른 행과 열에 존재할 떄
		// 각 문자의 행과 열이 만나는 곳에 위치한 알파벳 삽입


	}

	// 복호화 함수
	public void decryption() {
		Change_text2 = new char[Change_text.length];
		for (int i = 0; i < Change_text.length; i++) {
			Change_text2[i] = Change_text[i];
		}

		int save[][] = new int[30][2];
		int find = 0;
		while (find < Change_text2.length) {
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (Change_text2[find] == text_parse22[i][j]) {
						save[find][0] = i;
						save[find][1] = j;
					}
				}
			}
			find++;
		}

for (int i = 0; i < Change_text2.length - 1; i = i + 2) {
			
			if (save[i][0] != save[i + 1][0] && save[i][1] != save[i + 1][1]) {
				Change_text2[i] = text_parse22[save[i + 1][0]][save[i][1]];
				Change_text2[i + 1] = text_parse22[save[i][0]][save[i + 1][1]];

			}
			
			// 같은 열에 위치하면 열을 하나 밑으로 내려가있는 알파벳 삽입
			else {
				if (save[i][0] != save[i + 1][0]
						&& save[i][1] == save[i + 1][1]) {
					if (save[i][0] == 0)
						save[i][0] = 5;
					else if (save[i + 1][0] == 0)
						save[i + 1][0] = 5;
					Change_text2[i] = text_parse22[save[i][0] -1][save[i][1]];
					Change_text2[i + 1] = text_parse22[save[i + 1][0] -1][save[i + 1][1]];

				}

				else if (save[i][0] == save[i + 1][0]
						&& save[i][1] != save[i + 1][1]) {
					if (save[i][1] == 0) {
						save[i][1] = 5;
					} else if (save[i + 1][1] == 0 )
						save[i + 1][1] = 5;

					Change_text2[i] = text_parse22[save[i][0]][save[i][1] -1];
					Change_text2[i + 1] = text_parse22[save[i + 1][0]][save[i + 1][1] -1];

				}
			}

			}
	
	}

	public static void main(String[] args) {
		m3512 t1 = new m3512();// Class 객체선언
		t1.setTitle("다중 문자 암호화 프로그램");
		t1.setSize(350, 350);
		t1.setVisible(true);
		t1.setResizable(false);
		t1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 종료버튼

	}

	public void actionPerformed(ActionEvent e) {
		text = txt2.getText();// 사용자가 입력한 평문 가지고 오기
		Key = txt1.getText(); // 사용자가 입력한 키값 가지고 오기
		encrypt(Key, text);
		decryption();
		
		String encrypt_res = new String();// char를 String으로
		for (int i = 0; i < Change_text.length; i++) {
			
			encrypt_res += Change_text[i];
			
		}
		String decrypt_res = new String();// char를 String으로
		for (int i = 0; i < Change_text2.length; i++) {
			if (Change_text2[Change_text2.length-1] == 'x'
					&& text2.length % 2 != 0) {
				Change_text2[Change_text2.length-1] = 0;
			}
			
			decrypt_res += Change_text2[i];
		}
		
		txt3.setText(encrypt_res);
		txt4.setText(decrypt_res);

	}

}