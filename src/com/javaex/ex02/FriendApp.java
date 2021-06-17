package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	
    	List<Friend> fList = new ArrayList<Friend>();
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("친구를 3명 등록해 주세요");
    	
    	for(int i=0;i<3;i++) { //3명 등록 위한 for문
    		String[] scan = (sc.nextLine()).split(" "); // 한 줄내 스페이스를 구분점으로 정보 분할
    		
    		String name = scan[0]; //속성값 저장
    		String hp = scan[1];
    		String school = scan[2];
    		
        	Friend friend = new Friend(name, hp, school); //ArrayList에 구분하여 넣기위한 공간 생성.
        	fList.add(friend); //조건에 맞게 입력값 ArrayLiLst 에 저장.
        	
    	}
    	
    	
    	
    	
    	for(int i=0;i<fList.size();i++) {
    		System.out.println("이름:"+ fList.get(i).getName() + "  핸드폰:"+ fList.get(i).getHp() + "  학교:" + fList.get(i).getSchool());
    	}
    	sc.close();
    	
    	
    	
    	
    	
    	
    	

    	
    	
    }

}
