package javabasic;

public class Example0503 {
    public static void main(String[] args) {

        Person person1 = new Person("Name", 30);
        Person person2 = new Person("Name2", 20);
        //이를만 받고 싶을 때는 생성자 오버로딩
        person1.introduce();
        person2.introduce();

        Book book = new Book("자바 기초", "작가", 5000);
        book.printTitile();
        book.printAutho();
        book.printPrice();

    }
}
