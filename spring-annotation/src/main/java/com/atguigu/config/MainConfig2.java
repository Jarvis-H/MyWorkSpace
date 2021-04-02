package com.atguigu.config;

import com.atguigu.bean.Person;
import com.atguigu.condition.LinuxCondition;
import com.atguigu.condition.WindowsCondition;
import org.springframework.context.annotation.*;
import sun.security.ssl.ProtocolVersion;
//类中组件统一设置: 放在类上，满足这个条件，这个类的所有bean注册才会生效
@Conditional({WindowsCondition.class})
@Configuration
public class MainConfig2 {

    /**
     * ConfigurableBeanFactory#SCOPE_PROTOTYPE  prototype
     * ConfigurableBeanFactory#SCOPE_SINGLETON  singleton
     * org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST  request
     * <p>
     *
     * @Scope ：调整作用域
     * <p>
     * prototype   多实例的：ioc容器启动，并不会去调用方法创建对象放在容器中，
     * 而是在每次获取的时候才会调用方法创建对象
     * <p>
     * singleton   单实例的（默认）：ioc容器启动会调用方法创建对象到ioc容器中，
     * 以后每次获取就是直接从容器（map.get()）中拿
     * <p>
     * request     同一次请求创建一个实例
     * <p>
     * session     同一个session创建一个实例
     * <p>
     * 懒加载：
     * 单实例bean：默认在容器启动的时候创建对象
     * 懒加载：容器启动的时候先不加载对象，第一次使用的时候（获取）Bean创建对象，并初始化
     **/
    //默认单实例
//    @Scope("prototype")
    @Lazy
    @Bean("person")
    public Person person() {
        System.out.println("给容器中添加Person....");
        return new Person("张三", 25);
    }

    /**
     * @Conditional({Condition}) : 按照一定的条件进行判断，满足条件给容器中注册bean
     * <p>
     * 如果系统是windows,给容器中注册("bill")
     * 如果系统是linux,给容器中注册("linus")
     **/
    @Conditional({WindowsCondition.class})
    @Bean("bill")
    public Person person01() {
        return new Person("Bill Gates", 62);
    }

    @Conditional({LinuxCondition.class})
    @Bean("linux")
    public Person person02() {
        return new Person("linus", 48);
    }
}
