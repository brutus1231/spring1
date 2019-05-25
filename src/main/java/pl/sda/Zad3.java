package pl.sda;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Zad3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("my-beans.xml");

        Person person1 = (Person) context.getBean("person1");
        System.out.println(person1.getAddress().getCity());

    }
}
