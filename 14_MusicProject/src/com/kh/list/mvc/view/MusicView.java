package com.kh.list.mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.list.mvc.controller.MusicController;
import com.kh.list.mvc.model.vo.Music;

// View : �ð����� ���, ��/���
public class MusicView {
	
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	// ����ȭ��
	public void	mainMenu() {								// ��κ� ����̶� ��ȯ���� ���� ���� -> void
		//ArrayList
		while(true) {										// ����ڰ� ��� �� �� �ִ�
			System.out.println(" *** ������ ���� �Ҹ��ٴ� *** ");
			System.out.println("1. ���ο� �� �߰�");	// add()
			System.out.println("2. ��ü �� ��ȸ");	// toString() or �ݺ���
			System.out.println("3. Ư�� �� �˻�");	// �ݺ��� + get()
			System.out.println("4. Ư�� �� ����"); 	// �ݺ��� + remove()
			System.out.println("5. Ư�� �� ����");	// �ݺ��� + set()
			System.out.println("6. �÷��̸���Ʈ ���Ϸ� ���");	// I/O
			System.out.println("0. ���α׷� ����");	
			System.out.println();
			
			System.out.print("���ϴ� �޴��� �����ϼ��� > ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu){
			case 1 : insertMusic(); break;
			case 2 : selectAllMusic(); break;
			case 3 : searchMusic(); break;
			case 4 : deleteMusic(); break;
			case 5 : updateMusic(); break;
			case 6 : mc.outputFile(); System.out.println("���� �������� �߾�� ~ "); break;
			case 0 : System.out.println("���α׷��� �����մϴ�"); return;
			default : System.out.println("���� �޴��Դϴ�. �ٽ� �������ּ���!");	// default �Ŀ� ������ �����ϱ� break; �Ⱦ�
			}
		}
	}
	
	// 1. ���ο� ���� �߰��� �� �ִ� ȭ��
	private void insertMusic() {					// �� �޴��� �ۿ����� ���ٵ��� �ʵ��� ������ private
		System.out.println("----- �� �߰� -----");
		System.out.println("����� �Է����ּ��� > ");
		String title = sc.nextLine();
		System.out.println("�������� �Է����ּ��� > ");
		String artist = sc.nextLine();
		
		// ��û => �÷��̸���Ʈ�� title�̶�� ������ ������ artist��� �������� ���� Music�� �߰�����
		
		mc.insertMusic(title, artist);
		System.out.println("�߰� �Ϸ�");
		System.out.println();
	}
	
	// 2. ��ü �� ��ȸ�� �� �� �ִ� ȭ��
	private void selectAllMusic() {
		System.out.println("----- ��ü �� ��ȸ  -----");
		
		// ��û
		ArrayList<Music> list = mc.selectAllMusic();
		
		if(list.isEmpty()) { // �÷��̸���Ʈ�� ���� �ϳ��� ���� ���
			System.out.println("����Ʈ�� ���� �������� �ʽ��ϴ�.");
		} else { // ���� �ϳ��� ���� ��� 
			for(Music m : list) {		// �ڡڡڡڡڡڡ��̰� �����ؾ��� ��ڡڡڡڡڡڡڡ�
				System.out.println(m);
			}
		}
		System.out.println();
	} 
	
	// 3. Ư�� ���� �˻��� �� �ִ� ȭ��
	private void searchMusic() {					// �� �κ� �����ؾ��� ��
		System.out.println("----- �� �˻�  -----");
		System.out.println("�˻�� �Է��� �ּ���");
		String keyword = sc.nextLine();
		
		// ��û
		ArrayList<Music> searched = mc.searchMusic(keyword);
		System.out.println("�˻� ���");
		
		if(searched.isEmpty()) { // ���� ���(����Ʈ�� ������� ���)
			System.out.println("��ȸ�� ����� �������� �ʽ��ϴ�.");
		} else {	// �������
			System.out.println("��ȸ ����� " + searched.size() + "�� �Դϴ�.");
			for(Music m : searched) {
				System.out.println("�� �� : " + m.getTitle() + ", ������ : " + m.getArtist() + "�Դϴ�.");
			}
		}
	}
	
	
	// 4. Ư�� ���� ������ �� �ִ� ȭ�� = ���� ��ġ�ϴ�.
	private void deleteMusic() {
		System.out.println("----- �� ����  -----");
		System.out.println("�����ϰ� ���� ���� ������ �Է����ּ���");
		String title = sc.nextLine();
		
		// ��û
		int result = mc.deleteMusic(title);
		
		// ��� ���� 0�̸� ������ �� ���ٰ� ȣ���ؾ���
		if(result > 0) {
			System.out.println("���������� ���� !");
		} else {
			System.out.println("������ ���� ã�� ���߽��ϴ�.");
		}
		System.out.println();
	}

	// ���� ����� �Է� �޾Ƽ� ������ ���, ������ ���������� �����ϱ�
	// 5. Ư�� ���� ������ �� �ִ� ȭ��
	private void updateMusic() {
		
		System.out.println("�� ���� ���� !");
		
		// �������(�˻��뵵), ������ ���, ������ ������(������ �뵵)
		System.out.println("������ ����� �Է��ϼ���");
		String title = sc.nextLine();
		
		System.out.println("������ ��� > ");
		String updateTitle = sc.nextLine();
		
		System.out.println("������ ������ >");
		String updateArtist = sc.nextLine();
		
		int result = mc.updateMusic(title, updateTitle, updateArtist);
		
		// ��� ���� 0�̸� ������ �� ���ٰ� ȣ���ؾ���
		if(result > 0) {
			System.out.println("���������� ���� !");
		} else {
			System.out.println("������ ���� ã�� ���߽��ϴ�.");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
}
