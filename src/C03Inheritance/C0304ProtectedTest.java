package C03Inheritance;


import C03Inheritance.ProtectedPackage.ProtectedTest;

public class C0304ProtectedTest extends C0304ProtectedClass{
    public static void main(String[] args) {
        C0304ProtectedClass p1 = new C0304ProtectedClass();
//        public변수 접근가능
        System.out.println(p1.st4);
//        protected변수 접근가능(같은 패키지 이므로)
        System.out.println(p1.st3);
        System.out.println(p1.st2);

//        private변수는 같은클래스내에서만 접근
//        System.out.println(p1.st1);
        C0304ProtectedTest p2 = new C0304ProtectedTest();
        System.out.println(p2.st2);
//         상속관계에 있다 하더라도 default변수는 접근불가
//        System.out.println(p2.st2);
    }
}
