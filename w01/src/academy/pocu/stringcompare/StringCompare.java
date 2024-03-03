package academy.pocu.stringcompare;

public class StringCompare {
    public static void main(String[] args) {
        String name1 = "Taehyun";
        String name2 = "Taehyun";
        String name3 = new String(name1);
        String name4 = new String("Taehyun");

        /**
         * Java에서 문자열은 참조형이기 때문에 기본적으로 비교 연산자(==)는 메모리 주소를 비교
         *
         * 이러한 맥락에서 name3과 name4는 new 키워드를 사용하여 String 자료형의 객체를 생성했기 때문에
         * 동일한 `Taehyun` 값을 대입 했더라도 name1 변수와는 다른 메모리 주소를 갖는다
         *
         * 그러나 new 키워드를 사용하지 않고 문자열을 생성할 경우 Java 내부 최적화로 인하여 변수를 상수처럼 사용하는 것으로 판단
         * 기존에 생성된 문자열의 메모리 주소를 그대로 가져다가 사용하기 때문에 name1 변수와 name2 변수의 메모리 주소는 동일하고
         * 문자열 값을 그대로 비교한 경우 또한 동일한 메모리 주소를 가리키기 때문에 비교 연산자 결과로 true를 반환한다.
         *
         * 관련해서는 string constant pool 키워드를 중심으로 찾아보면 좋으며
         * 메모리 주소가 아닌 문자열 값 자체에 대한 비교를 위해서는 equals 메서드를 사용해야 한다.
         */
        System.out.printf("Compare name1 and name2: %b %s", name1 == name2, System.lineSeparator()); // true
        System.out.printf("Compare name1 and name3: %b %s", name1 == name3, System.lineSeparator()); // false
        System.out.printf("Compare name1 and name4: %b %s", name1 == name4, System.lineSeparator()); // false
        System.out.printf("Compare name1 and \"Taehyun\": %b %s", name1 == "Taehyun", System.lineSeparator()); // true
    }
}
