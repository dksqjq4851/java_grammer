package C06EtcClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C0604GenericMain {
    public static void main(String[] args) {
        String[] stArr = {"java","python","C"};
//        stChange(stArr, 0, 1);
//        System.out.println(Arrays.toString(stArr));

        Integer[] intArr = {10,20,30};
//        integerChange(intArr, 0, 1);
//        System.out.println(Arrays.toString(intArr));

//        generic을 사용한 메서드 활용
        genericChange(stArr, 1, 2);
        genericChange(intArr, 1, 2);
        System.out.println(Arrays.toString(stArr));
        System.out.println(Arrays.toString(intArr));

        //    generic을 사용하여 범용적 클래스(객체) 생성
        GenericPerson<Integer> p1 = new GenericPerson(10);
        System.out.println(p1.getValue());

        List<String> myList = new ArrayList<>();
        Stream<String>mystream;
        IntStream intStream;
        Optional<String>optional;
    }
//      제너릭메서드는 반환타입 왼쪽에 <T>선언
//      유의점으로 T에는 참조형변수인 객체타입 들어와야함.
    static <T> void genericChange(T[] stArr, int a, int b){
        T temp = stArr[a];
        stArr[a] = stArr[b];
        stArr[b] = temp;
    }
    static void integerChange(Integer[] stArr, int a, int b){
        int temp = stArr[a];
        stArr[a] = stArr[b];
        stArr[b] = temp;
    }
}
//제너릭 클래스는 클래스명 옆에 <T>선언
class GenericPerson<T>{
    private T value;

    public T getValue() {
        return value;
    }

    public GenericPerson(T value) {
        this.value = value;
    }

}

class Person{
    private String value;

    public String getValue() {
        return value;
    }

    public Person(String value) {
        this.value = value;
    }

}
