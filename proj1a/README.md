# proj1a

## Linked List Deque

第一部分`实现双向链表`，没有skeleton，只有一个测试类。
Reading中提供了以下两种方法：
> * Add a second sentinel node to the back of the list.
> * An alternate approach is to implement the list so that it is circular, with the front and back pointers sharing the same sentinel node.

在这里，我选择了用后者实现。

其中，需要注意有以下几点：

* 每实现一个方法后，一定要用Java Visualizer跑一次，从sentinel一直next下去看是否回到sentinel，从sentinel一直prev下去看是否回到sentinel，很有可能自以为写的是对的，测试样例也没有报错，但实际并不正确。
* 写双向链表的增删方法时，不能只看一个方向，要双向考虑，这里最好的检验方法就是用Java Visualizer跑一次。
* 写删除方法时，要考虑链表为空的情况。

## Array Deque

第二部分是`实现双端队列`，这次来测试类都没有，Josh甚至只给了语言描述和大致框架，实现方法和实现过程中遇到的问题全部需要自己解决。不过还是给了突破口：

> We strongly recommend that you treat your array as circular for this exercise. In other words, if your front pointer is at position zero, and you addFirst, the front pointer should loop back around to the end of the array (so the new front item in the deque will be the last item in the underlying array). This will result in far fewer headaches than non-circular approaches. See the [project 1 demo slides](https://docs.google.com/presentation/d/1XBJOht0xWz1tEvLuvOL4lOIaY0NSfArXAvqgkrx0zpc/edit#slide=id.g1094ff4355_0_101) for more details.

我也是按照这个思路实现的，其中最难实现的就是items内置数组内存的重新分配，想着好像很简单，但落实到代码上就bug百出（还好有Java Visualizer）。

这个proj的第二部分我做了整整一个白天，甚至还参考了别人的代码，感觉课程难度渐渐有些提高了，不过，实现之后便对java的这两种数据结构有了更深的认识，在使用时也变得更加得心应手。