interface Animal{
    public void sound();
}

class Pig implements Animal{
    @Override
    public void sound() {
        System.out.println("꿀꿀");
    }
}
class Cow implements Animal{
    @Override
    public void sound() {
        System.out.println("음메");
    }
}

public class AnimalClass {
    public static void main(String[] args) {
        Pig pig = new Pig();
        Cow cow = new Cow();
        pig.sound();
        cow.sound();
    }
}
// TEST_YSsssss
