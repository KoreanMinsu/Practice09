package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {

       List<Goods> itemList = new ArrayList<Goods>(); //ArrayList에 Goods 속성값 저장공간 생성
       
       Scanner sc = new Scanner(System.in);  
       System.out.println("상품을 입력해주세요(종료 q)");
       while(true) { //반복적상품 입력을 위한 while 문
    	   String[] scan = (sc.nextLine()).split(",");
    	   
    	   String name = scan[0];
    	   int price = Integer.parseInt(scan[1]);
    	   int count = Integer.parseInt(scan[2]);
    	   
    	   Goods goods = new Goods(name, price, count);
    	   itemList.add(goods);
    	   if(scan.equals("q")) { //scan 이 array상태로 q값만 뺴오기 어려움.. scan 이후 split array 나중에
    		   break;
    	   }
       }
       
    }

}
