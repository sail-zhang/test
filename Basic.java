package Concept;

public class Basic {
//单行注释
/*
 多行
 注释
*/
//JavaDoc:文档注释 /** */
    String name;//实例变量，从属于类
    int age;//如果不初始化，默认为0和null，布尔值默认false
    static double salary = 10000;//类变量,可以直接用
    static final double PI = 3.14;//常量

    public static void main(String[] args) {//main方法，里面的是局部变量
        String student = "Qihang";//标识符大小形敏感
        char character = 'A';
        boolean flag = true;
        int num = 10;
        int num2 = 010;//八进制0
        int num3 = 0x10;//十六进制0x
        byte i = (byte)num;//强制转换 高容量-->低容量
        double i2 = num;//自动转化 低-->高
        int money = 1_0000_0000;//_不显示，数字长点看起来方便点
        //x ? y : z 如果x==true,则结果为y，否则为z    三元运算符
        System.out.println("Hello world!\n");//Hello
        // \t制表符  \n换行
        System.out.println(student);
    }

    public void var(){//其他方法
        Basic learn = new Basic();
        System.out.println(learn.age);//输出为0
        System.out.println(learn.name);//输出为null
        System.out.println(salary);
    }
}

