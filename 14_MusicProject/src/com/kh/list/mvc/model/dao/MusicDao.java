package com.kh.list.mvc.model.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.kh.list.mvc.model.vo.Music;

public class MusicDao {
	

	public void outputFile(ArrayList<Music> list) {
		
		
		try(BufferedWriter br = new BufferedWriter(new FileWriter("playList.txt"));){
			br.write("\t\t\t\t\t\t\t\t\t플레이 리스트");
			br.newLine();
			br.newLine();
			br.write("\t\t곡명\t\t\t\t\t\t\t가수명");
			br.newLine();
			
			for(int i = 0; i < list.size(); i++) {
				br.write((i + 1) + "번: " + list.get(i).getTitle() + "\t\t\t\t\t\t\t\t" + list.get(i).getArtist());
				br.newLine();
			}
			
			System.out.println();
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
			
			
	}
	
}
