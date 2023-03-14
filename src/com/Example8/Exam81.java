package com.Example8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.survivalcoding.game.Hero;

public class Exam81 {
    public static void main(String[] args) {
        // list
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        names.add("홍길동");
        names.add("홍길동");
        names.add("홍길동");
        age.add(12);
        age.add(23);
        age.add(434);

        for (int i = 0; i < names.size(); i++) {
            // System.out.println(names.get(i));
        }
        // iterator
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String name = it.next();
            // System.out.println(name);
        }
        // foreach 동일
        // System.out.println(names.get(1));
        // array는 array가 길어지면 요소의 탐색이 느리다
        // linked : 앞뒤 주소 접근 - 삽입, 제거가 빠르다. array가 길어지면 요소의 탐색이 느리다
        LinkedList<String> ll = new LinkedList<>();


        // 중복값을 허용하지 않는 집합
        // contains 제공
        // 검색할 때 겁나게 빠르다
        // Iterator를 사용하거나 foreach
        Set<String> colors = new HashSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        System.out.println(colors.size());
        // 키 : 키이ㅡ 쌍으로 이루어진 요소를 담는 자료구조
        // 중복 허용안됨
        // 검색 빠름
        Map<String, Integer> cities = new HashMap<>();
        cities.put("서울시", 997);
        cities.put("수원시", 997);
        cities.put("부산시", 997);
        int seoul = cities.get("서울시");
        System.out.println("서울시 인구는 " + seoul + "만");
        cities.remove("서울시");
        cities.put("수원시", 130);
        cities.remove("수원시 인구는 " + cities.get("수원시") + "만");
        // 순서 보장이 안됨 매번 출력 결과의 순서가 다르게 표시 될수 있음
        for (String key : cities.keySet()) {
            int value = cities.get(key);
            System.out.println(key + " 인구는 " + value + "만");
        }

        Map<String, List<String>> s = new HashMap<String, List<String>>();
        List<List<Hero>> h = new ArrayList<List<Hero>>();

        // 요소의 참조
        /*
        Hero hero = new Hero();
        hero.name = "강은현";
        List<Hero> heroList = new ArrayList<>();
        heroList.add(hero);
        hero.name = "한석봉";
        System.out.println(heroList.get(0).name);
        */
        //연습문제 2-1
        //1) 
    }
}
