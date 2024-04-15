package javabasic;

public class Person {
    public String name;
    public int age;  // 필드

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.printf("이름은 %s 나이는 %d" , name, age);
    }

}
