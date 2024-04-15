package javabasic;

public class Example0501 {
    public static void main(String[] args) {
        Person person1 = new Person("Name", 20); // new 뒤는 항상 생성자가 온다!!

        System.out.println(person1.name);
        System.out.println(person1.age);
        person1.introduce();

    }
}
