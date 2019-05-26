package pl.sda;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Zad5 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("my-beans.xml");

        Message propMessage = (Message) context.getBean("propMessage");
        System.out.println(propMessage.getText());
    }
}
