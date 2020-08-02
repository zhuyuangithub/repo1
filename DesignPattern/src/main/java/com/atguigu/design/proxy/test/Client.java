package com.atguigu.design.proxy.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class classTest = Class.forName("com.atguigu.design.proxy.test.TeacherProxy");

        System.out.println(classTest.getClassLoader()  + "|" + classTest.getName() + "|" + classTest.getInterfaces());

//        TeacherProxy teacherProxy = (TeacherProxy) classTest.newInstance();
//
//        System.out.println("对象为:" + teacherProxy);


        Constructor[] constructors = classTest.getDeclaredConstructors();

        System.out.println("构造器都有" + Arrays.asList(constructors));


        Constructor constructor = classTest.getDeclaredConstructor(String.class, int.class, String.class, List.class);

        System.out.println("constructor为：" + constructor );

        //使私有方法公有化
        constructor.setAccessible(true);

        TeacherProxy teacherProxy1 = (TeacherProxy) constructor.newInstance("小明",25,"男", new ArrayList<Object>(Arrays.asList("1","2","3")));

        System.out.println("teacherProxy1的值为：" + teacherProxy1);

        //获取所有方法
        Method[] methods = classTest.getMethods();

        System.out.println("methods的值：" + Arrays.asList(methods));

        Method method1 = classTest.getDeclaredMethod("doTeach");

        System.out.println("method1：" + method1);

        method1.invoke(teacherProxy1);


        Method method2 = classTest.getDeclaredMethod("doTeach",String.class);

        System.out.println("method2：" + method2);
        method2.setAccessible(true);

        method2.invoke(teacherProxy1, "zhuyuan");

    }

}
