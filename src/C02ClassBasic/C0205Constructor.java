package C02ClassBasic;

public class C0205Constructor {
    public static void main(String[] args) {
//        캘린더 객체 생성 후 연도, 월, 일 세팅(setter 사용)
        Calendar c1 = new Calendar(2024,12,11);


//        캘린더 객체출력 : "오늘은 xxx연도, xx월, xx일 입니다."(getter 사용)
        System.out.println("오늘은 " + c1.getYear() + "년도, " + c1.getMonth() + "월, " + c1.getDay() + "일 입니다.");
    }

}
//    year, month, day 변수값 존재하는 클래스, getter/setter 추가
    class Calendar{
        private int year;
        private int month;
        private int day;

//      생성자는 메서드의 일종으로 클래스명과 동일한 이름을 갖는 메서드
//      생성자를 통해 객채변수값들을 객체가 만들어지는 시점에 초기화(세팅)
    public Calendar(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

//    별도의 생성자를 만들경우, 초기(기본)생성자는 더이상 사용할수 없으므로, 별도 추가 필요.
    public  Calendar(){

    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }
}


