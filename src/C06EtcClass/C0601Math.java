package C06EtcClass;

public class C0601Math {
    public static void main(String[] args) {
//        Math.random() : 0.0~1.0 사이의 임의의 double 형을 반환
//        System.out.println(Math.random());
////        로또 번호 7개 뽑아보기. 0~99 까지의 임의 숫자
//        for(int i = 0;i<7;i++){
//            System.out.println((int)(Math.random()*100));
//        }
//        Math.abc() : 절대값 반환
        System.out.println(Math.abs(-5));
//        Math.ceil() : 올림, Math.floor() : 내림, Math.round(): 반올림
        System.out.println(Math.ceil(5.7657));
        System.out.println(Math.floor(5.76774));
        System.out.println(Math.round(5.77234));

        System.out.println(Math.max(5,8));
        System.out.println(Math.min(5,8));

//        Math.pow(a,b) : a의b제곱
        System.out.println(Math.pow(5,3));

//        Math.sqrt() : 제곱근
        System.out.println(Math.sqrt(25));

        int n = 100;
    }
}
