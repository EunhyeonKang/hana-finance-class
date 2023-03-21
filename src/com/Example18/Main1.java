package com.Example18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        // return 타입이 String
        // 메서드 체이닝
        // Foreach는 마지막에밖에 못옴
        nums.stream().filter((Integer num) -> num % 2 == 0) // 2 4 6
        .map((num) -> num + "번") // 변환 "2번" "4번" "6번"
        .forEach((num) -> System.out.println(num + 1)); // 무지성 뻉뻉이

        List<String> names = new ArrayList<>();
        names.add("박경덕");
        names.add("박준하");
        names.add("이동학");
        names.add("박태현");
        List<String> parks = getParkList(names);
        System.out.println(parks);
        
        // 박씨 걸러내기
        System.out.println(names.stream().filter(name->name.startsWith("박")).collect(Collectors.toList()));
    }

    public static List<String> getParkList(List<String> names) {
        //stream list변환
        return names.stream().filter(name->name.startsWith("박")).collect(Collectors.toList());
        /*
        List<String> results = new ArrayList<>();

        for (String name : names) {
            if (name.startsWith("박")) {
                results.add(name);
            }
        }

        return results;
        */
    }
}
