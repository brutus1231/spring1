package pl.sda;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Zad4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("my-beans.xml");

        List<String> napisy = (List) context.getBean("mojaLista");
        napisy.stream().forEach(System.out::println);

        Map<String, String> myMap = (Map<String, String>) context.getBean("mojaMapa");

        Set<String> keys = myMap.keySet();
        for (String key : keys) {
            System.out.println(key + " " + myMap.get(key));
        }

        Date myDate = (Date) context.getBean("myDate");
        System.out.println(myDate);
    }
}
