package com.kh.list.mvc.controller;

import java.util.ArrayList;

import com.kh.list.mvc.model.dao.MusicDao;
import com.kh.list.mvc.model.vo.Music;


// Controller : ������� ��û�� �޾Ƽ� ó�����ִ� Ŭ���� ó������� View�� ��ȯ�Ѵ�.
public class MusicController {
	
	private ArrayList<Music> list = new ArrayList();
	
	{ // �ʱ�ȭ ��� : ��ü ���� �� ������ ����Ǵ� ���					<<< �ϴ� ������ ���ذ� �� �ȵ�
		list.add(new Music("OMG", "������"));
		list.add(new Music("ditto", "������"));
	}
	
		
	// ����ڰ� ���ο� �� �߰� ��û�� �� ������ ����Ǵ� �޼ҵ�
	public void insertMusic(String title, String artist) {
		// list�� ����ڰ� �Է��� title�� artist�� ���� Music��ü�� �߰�
		list.add(new Music(title, artist));
	}
	
	
	// ��ü �� ��ȸ ��û �� ����Ǵ� �޼ҵ�
	public ArrayList<Music> selectAllMusic() {
		
		for(int i = 0; i < list.size(); i++) {
			
		}
		return list;
	}
	
	// Ư�� �� �˻� ��û�� ���� ������ ����Ǵ� �޼ҵ�
	public ArrayList<Music> searchMusic(String keyword) {
		
		// �˻��� ����� ��� ArrayList<Music> ��ü ����
		ArrayList<Music> searched = new ArrayList();
		
		// ��ȸ => ���� �Է��� keyword�� ���Ե� Music ��ü�� ��ȸ
		// 1. list�� ���̸�ŭ �ݺ��ϸ鼭 
		// 2_1. ��Ҹ� �ϳ��ϳ� ��
		// 2_2. Ű���尡 ����� title�ʵ忡 ������ �Ǿ��ִ°�?
		// 3. ������ �Ǿ��ִٸ� ��Ҹ� searched �� �߰� 
//		int count = 0;
//		String title = ((Music)list.get(count))
				
		for(int i = 0; i < list.size(); i++)/* 1�� �� */ {
			// ���ڿ�.contains(���ԵǾ��ִ��� �ñ��� ���ڿ�)
			// �ش� ���ڿ��� ���ԵǾ��ִٸ� true / ������ false ��ȯ
			if(list.get(i).getTitle().contains(keyword)) {
				searched.add(list.get(i));
			}
		}
		return searched;
	}
	
	// Ư�� ���� ���� ��û �� ���� ������ �޼ҵ�
	public int deleteMusic(String title) {
		
		// ����� ���� ���� ���� ���� �ʱ�ȭ
		int result = 0; // ������ ����� Ƚ��
		
		// ó��
		// ��ü �� ��� �߿���(�ݺ���)
		
		for(int i = 0; i < list.size(); i++) {
			// ����� �� ������ ����ڰ� �Է��� �� ���𰡿� �����ϴٸ�(���ǹ�)
			if(list.get(i).getTitle().equals(title)) {
				// �� ��Ҹ� �����Ѵ� remove()
				list.remove(i);					// �̰� �˾ƾ���
				// ���� Ƚ���� ������Ų��.
				result++;
			}
		}
		return result;	// result�� 0 �̶�� ������ �̷������ �ʾҴ�.
	}
	
	// Ư�� �� ���� ��û �� ������ �޼ҵ�
	public int updateMusic(String title, String updateTitle, String updateArtist) {
		// ����� ���� ���� ���� ����
		int result = 0; // �� ���� Ƚ��
		
		// ó��
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)){
				// ��� 1. �̰͵� ���� 
//				list.set(i, new Music(updateTitle, updateArtist));
				// ��� 2. �ٸ� ���
				list.get(i).setTitle(updateTitle);
				list.get(i).setTitle(updateArtist);
				result++;
			}
		}
		return result;	// 0�̶�� ������ �̷������ �ʾҴٴ� ��!
	}
	
	// ������ ó���� Controller����
	public void outputFile(){
		
		new MusicDao().outputFile(list);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
