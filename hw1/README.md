##  [HW 1](https://sp18.datastructur.es/materials/hw/hw1/hw1)

不得不称赞世界名校的HW是真的良心，小小的一个HW，教你实现一个简易的音乐播放器，而且练习到了队列、包的导入、接口、抽象类、迭代器、异常处理。

首先给出的skeleton大部分都不能直接使用，需要自己导包使之生效。

最开始是要求实现一个单向队列，创建`BoundedQueue`接口，还用到了Java8的default；再创建`AbstractBoundedQueue`抽象类实现接口，最后创建`ArrayRingBuffer`类完成方法的实现。

各个方法的实现没什么难的，特别是已经熟悉了proj1a的思想，在写的时候几乎没有任何阻碍，写了一个测试方法，改了几处bug就成功运行。



这时，我们将通过`Karplus-Strong`算法，并且使用我们刚刚写好的`ArrayRingBuffer`类,来完成`GuitarString`类，为下一步做准备。

运行`TTFAF`，实质就是依赖我们刚写好的`GuitarString`类，编译skeleton中给出的字符串，即可以播放字符串数据转换成的音乐。

最后还是通过`GuitarString`类，来实现获取键盘输入，转换成对应的音阶，由学生对比demo实现。


课程进行到这里不得不说，世界名校的学生有自身的努力不假，不过老师和课程的安排真的起到了很大的作用。这里的老师是真的能用娱乐的形式来让学生主动去探索、去掌握新的知识。