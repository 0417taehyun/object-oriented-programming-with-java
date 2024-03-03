package academy.pocu.calculator;

public class Calculator {
    public static Vector add(Vector v1, Vector v2) {
        Vector v3 = new Vector(v1.x+v2.x, v1.y+ v2.y);

        v1.x += 6547.0f; // 참조형이기 때문에 원본의 값 변경

        return v3;
    }

    public static void main(String[] args) {
        Vector v1 = new Vector(1, 3);
        Vector v2 = new Vector(26, 79);
        Vector v3 = add(v1, v2);

        System.out.printf("v1 x: %f y: %f %s", v1.x, v1.y, System.lineSeparator()); // 참조형이기 때문에 원본의 값 변경
        System.out.printf("v2 x: %f y: %f %s", v2.x, v2.y, System.lineSeparator());
        System.out.printf("v3 x: %f y: %f %s", v3.x, v3.y, System.lineSeparator());
    }
}
