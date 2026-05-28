import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.print(bean.getMessage());
        System.out.println(" -> " + (bean == bean1));
        Cat catbean = (Cat) applicationContext.getBean("cat");
        Cat catbean1 = (Cat) applicationContext.getBean("cat");
        System.out.print(catbean.getMessage());
        System.out.print(" -> " + (catbean == catbean1));
    }
}