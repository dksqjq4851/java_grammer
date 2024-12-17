package C04Interface;

public class C0401Dog implements C0401AnimalInterface1{

    @Override
    public void makeSound() {
        System.out.println("머엉머엉");
    }
}

class C0401DogMultiImpl implements C0401AnimalInterface1, C0401AnimalInterface2{

    @Override
    public void makeSound() {
        System.out.println("머엉머엉");
    }

    @Override
    public String play(String a, String b) {
        return a+"와 "+b+"가 산책을 합니다.";
    }
}
