package pl.sda;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("my-beans.xml");

//        Message message = (Message) context.getBean("message");
//
//        System.out.println(message.getText());
//        message.setText("wybuch");
//
//        Message messageCopy = (Message) context.getBean("message");
//        System.out.println(messageCopy.getText());


        //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        Book book1 = (Book) context.getBean("book2");
        System.out.println(book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName());
        context.close();
    }
}
