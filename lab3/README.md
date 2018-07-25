# Lab3

lab3主要练习为方法用JUnit写test。

第一部分是找Arithmetic的bug，sum()方法出错，*改为+。


第二部分为了实现IntList的reverse()方法而设计test，先根据要求设计test，再实现reverse()，并用test逐步测试，最终实现。


第三部分根据实际情况写test找bug，首先确认`1==1`，再经过测试得`128!=128`，说明`Flik.java`有bug，超过127方法失效。

原因是Integer'是对象类型，"=="符号比较的是两者的地址，在给Integer赋值时，实际上是自动装箱的过程，也就是调用了`Integer.valueOf(int)`方法，当这个值大于等于-128小于等于127时使用了常量池，所以两个地址是相等的，而超出此范围则不使用常量池，故不相等。