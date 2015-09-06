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
	// frame ���� ��Ÿ�� �� ������Ʈ�� ����
	Container ct;
	JLabel first, second, l1, l2, l3, l4;
	JTextField txt1, txt2, txt3, txt4;
	JButton btn1;

	// ��ȣȭ & ��ȣȭ �Լ��� ���̴� �������� ����
	char[] text2;
	char[] Change_text, Change_text2;
	char[][] text_parse22;
	String text, Key;
	
	

	public m3512() {
		ct = getContentPane();
		ct.setLayout(new FlowLayout()); 
		first = new JLabel(
				"                      *********���� ��ҹ��� ���********************* ");
		first.setAlignmentX(1);

		l1 = new JLabel("��ȣŰ : ");
		txt1 = new JTextField(25);
		l2 = new JLabel("��   �� : ");
		txt2 = new JTextField(25);
		l3 = new JLabel("��ȣ�� : ");
		txt3 = new JTextField(25);
		l4 = new JLabel("��ȣ�� : ");
		txt4 = new JTextField(25);

		btn1 = new JButton("��������");
		btn1.addActionListener(this);// �� ��ư ������ �ٷ� ��ȣȭ �Լ� �۵�

		// container �ȿ� �ֱ�

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

	// ��ȣȭ �Լ�
	public void encrypt(String key, String text) {

		// 1.��ȣȭ �� �� ���̴� �� ����
		// ��������
		
		String text_replace = text.replaceAll("\\p{Space}", "");
		// ���� �迭�� �ٲٱ�
		
		String lower = text_replace.toLowerCase();
		text2 = lower.toCharArray();
		
		// Ȧ���� ���ڿ��� ¦���� �������
		char[] text3 = new char[text2.length + 1];
		// ��ȣȭ�� ���ڿ� ����
		Change_text = new char[text3.length];

		// 2.��ȣ�� �Ҷ� ���̴� ������
		// ��������
		String Key_replace = key.replaceAll("\\p{Space}", "");
		String lowerkey = Key_replace.toLowerCase();
		// ������ ���ڿ� �迭�� �ٲٱ�
		char[] text_parse = lowerkey.toCharArray();
		
		// 5*5��ȣ�� �����
		char[] text_parse2 = new char[25];
		text_parse22 = new char[5][5];

		// 3.��ȣ�� �ߺ� üũ(�ϴ� �ߺ��Ǵ� �͵��� �� x�� �ٲ۵� ���߿� x�� ���ش�.)
		
	
		for (int i = 0; i < text_parse.length; i++) {
			for (int j = 0; j < text_parse.length; j++) {
				if (text_parse[i] == text_parse[j] && i != j)
					text_parse[j] = 'x';
				
			}
			
		}
		// 4.��ȣ�ǿ� ���� ��ġ
		int array = -1;// �迭�� �� �ǹ�

		for (int i = 0; i < text_parse.length; i++) {
			if (text_parse[i] == 0)
				break;
			array++;

			if (text_parse[i] != 'x') { // �ߺ��Ǵ� ���ڿ� ���� ��Ű�� �ʴ´�.
				text_parse2[array] = text_parse[i]; // ��ȣ�ǿ� �ߺ����� ���� ���ڿ� �߰�

			} else {
				array--; // ���� �ߺ��� ���ڿ��� ������ �迭 ������ �� �� ���ҽ�Ŵ
			}
		}

		char add = 'a'; // a~z �߿��� Ű���� �ߺ����� ���� ���ĺ��� ��������.

		while (add != 'z' & array < 24) {
			for (int aa = 0; aa < text_parse2.length; aa++) {
				if (text_parse2[aa] == add) {
					add++;
					aa = -1;
				} else if (aa == text_parse.length - 1)
					break;
			}
			array++;
			text_parse2[array] = add; // ���Ե��� ���� ���ĺ��� ������� �־��ش�.
			add++;
		}

		// 2���� �迭 5*5�� ����

		int room = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				text_parse22[i][j] = text_parse2[room];
				room++;

			}
		}

		// �� 2���� �ɰ��� Ȧ���϶� �������� x �߰�

		// int f = 0;
		int s = 0;
    
		while (s < text2.length) {
			text3[s] = text2[s]; // text3�� text2����
			s++;
			
		}
		for(int i = 0; i<text3.length-1; i = i+2){
			if(text3[i] == text3[i+1])
				text3[i+1] = 'x';
		}
		System.out.println(text3);

		if (text2.length % 2 != 0)// �Էµ� ���ڿ��� Ȧ���̸� �ڿ� x�߰��� ¦���� �������
			text3[s] = 'x';
		//TODO:ee�� ������ ex�� �ٲپ� ó�����ش�.
		
		// ��ȣ���� ��� �� �˾ƺ���
		int save[][] = new int[30][2];
		int enter = 0;

		while (enter < text3.length) { // �迭�� �� ��ġ save�� ����
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (text3[enter] == text_parse22[i][j]) {
						save[enter][0] = i; // 0�� �ष
						save[enter][1] = j; // 1�� ��
				}

			
			}
		}
		enter++;
	}
		// ��Ģ�� ���� ��ȣȭ
		
		

		for (int i = 0; i < text3.length - 1; i = i + 2) {
			
			
			 //TODO: �ߺ��Ǵ� �� ó��
						
			if (save[i][0] != save[i + 1][0] && save[i][1] != save[i + 1][1]) {
				Change_text[i] = text_parse22[save[i + 1][0]][save[i][1]];
				Change_text[i + 1] = text_parse22[save[i][0]][save[i + 1][1]];

			}
			
			// ���� ���� ��ġ�ϸ� ���� �ϳ� ������ �������ִ� ���ĺ� ����
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
		

		// 2���� ���ڰ� ���� �ٸ� ��� ���� ������ ��
		// �� ������ ��� ���� ������ ���� ��ġ�� ���ĺ� ����


	}

	// ��ȣȭ �Լ�
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
			
			// ���� ���� ��ġ�ϸ� ���� �ϳ� ������ �������ִ� ���ĺ� ����
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
		m3512 t1 = new m3512();// Class ��ü����
		t1.setTitle("���� ���� ��ȣȭ ���α׷�");
		t1.setSize(350, 350);
		t1.setVisible(true);
		t1.setResizable(false);
		t1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// �����ư

	}

	public void actionPerformed(ActionEvent e) {
		text = txt2.getText();// ����ڰ� �Է��� �� ������ ����
		Key = txt1.getText(); // ����ڰ� �Է��� Ű�� ������ ����
		encrypt(Key, text);
		decryption();
		
		String encrypt_res = new String();// char�� String����
		for (int i = 0; i < Change_text.length; i++) {
			
			encrypt_res += Change_text[i];
			
		}
		String decrypt_res = new String();// char�� String����
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