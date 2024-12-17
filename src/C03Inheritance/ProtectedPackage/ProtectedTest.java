package C03Inheritance.ProtectedPackage;

import C03Inheritance.C0304ProtectedClass;

public class ProtectedTest {
    public static void main(String[] args) {
        C0304ProtectedClass c1 = new C0304ProtectedClass();
//        public변수 접근가능
        System.out.println(c1.st4);
//        protected변수 접근불가능 : 상속관계 없을경우
//        System.out.println(c1.st3);
//        System.out.println(c1.st2);
//        System.out.println(c1.st1);
    }
}
