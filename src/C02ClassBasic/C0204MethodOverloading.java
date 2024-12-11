package C02ClassBasic;

public class C0204MethodOverloading {
    public static void main(String[] args) {
        C0204MethodOverloading c1 = new C0204MethodOverloading();
        System.out.println(c1.sum(10, 20));
        System.out.println(c1.sum(10, 20,30));
        System.out.println(c1.sum(3.5, 10));



    }
//    접근제어자를 안붙이면 기본적으로 default접근제어자 : 같은 패키치낸에서만 접근가능

    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
//    매개변수의 타입 또는 개수가 다르면 같은 이름의 메소드 정의가능. 이걸, 메소드오버로딩이라 부름.
    double sum(double a, double b){
        return a+b;
    }
}
