package test;

import com.atguigu.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

    @Test
    public void test02() {

    }

    @Test
    public void test01() {
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }

    }
}
