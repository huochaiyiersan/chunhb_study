package hui.study.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import hui.study.model.Student;

public class SpringMain {
    public static void main(String[] args){{


        //DI(Ioc)方式，Spring提供对象，需要的时候只需要声明一个引用即可

        ApplicationContext context = new ClassPathXmlApplicationContext("sources\\bean.xml");
        //此处的helloWorld对应Beans.xml中配置的<bean>标签的id
        Student obj = (Student) context.getBean("helloWorld");
       System.out.println( obj.getStuName());

        //传统方式，需要对象的时候new一个对象
        Student hw = new Student();
        hw.setStuName("ni hao");
        System.out.println(hw.getStuName());


    }}
}
