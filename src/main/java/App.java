import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());


        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        ApplicationContext applicationContext2 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat bean3 =
                (Cat) applicationContext2.getBean("cat");
        System.out.println(bean3.getName());

        Cat bean4 =
                (Cat) applicationContext2.getBean("cat");
        System.out.println(bean4.getName());

        System.out.println(bean3.equals(bean4));
        System.out.println(bean.equals(bean2));

    }
}