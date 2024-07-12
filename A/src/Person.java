public class Person {
    String name;
    int IQ;
    int str;
    public Person(String name, int IQ, int str){
        this.name = name;
        this.IQ = IQ;
        this.str = str;
    }

    public Person(){
        this.name = "ISC";
        this.IQ = 100;
        this.str = 100;
    }

    public void levelup(){
        this.IQ = this.IQ + 1;
        this.str = this.str + 1;
        System.out.println(this.name + "의 지능과 힘이 증가했습니다! " + this.IQ + " / " + this.str);
    }

    @Override
    public String toString() {
        return this.name + "의 정보\n지능 스탯 : " + this.IQ + "\n힘 스탯 : " + this.str + "\n";
    }

    public static void main(String[] args) {
        Person a = new Person(); // 객체 >> 인스턴스
        a.levelup();

        Person b; // 객체
        b = new Person("홍철", 1, 1000); // 인스턴스
        b.levelup();
        System.out.print(a.toString() + "\n");
        System.out.print(b.toString());
    }
}
