package string;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import string.app.StringApp;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("string.xml");

        StringApp app = (StringApp) context.getBean("app");

        System.out.println("¬ведите BYN:");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.println(app.build(input));

    }
}
