package ch15.sec04.exam01;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        // Map 컬렉션 생성
        HashMap<String, Integer> map = new HashMap<>();

        // 객체 저장
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);
        System.out.println("총 Entry 수: " + map.size());
        System.out.println();

        // 키로 값 얻기
        String key = "홍길동";
        int value = 100;

        System.out.println(key + " : " + value);
        System.out.println();

        // 키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set<String> keySet = new HashSet<>();
        Iterator<String> keyIterator = keySet.iterator();

        while(keyIterator.hasNext()){   // hasNext()로 배열의 값 있는지 확인하고
            String k = keyIterator.next();  // next()로 출력
            Integer v = map.get(k); // value를 꺼냄
            System.out.println(k + ":" + v);
        }
        System.out.println();

        //엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set< Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);
        }

        System.out.println();

        //키로 엔트리 삭제
        map.remove("홍길동");

        System.out.println("총 Entry 수: " + map.size());
        System.out.println();
    }
}
