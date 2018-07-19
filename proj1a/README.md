# proj1a

* Linked List Deque

第一部分`实现双向链表`，没有skeleton，只有一个测试类。
Reading中提供了以下两种方法：
> * Add a second sentinel node to the back of the list.
> * An alternate approach is to implement the list so that it is circular, with the front and back pointers sharing the same sentinel node.

在这里，我选择了用后者实现。

其中，需要注意有以下几点：

> * 每实现一个方法后，一定要用Java Visualizer跑一次，从sentinel一直next下去看是否回到sentinel，从sentinel一直prev下去看是否回到sentinel，很有可能自以为写的是对的，测试样例也没有报错，但实际并不正确。
> * 写双向链表的增删方法时，不能只看一个方向，要双向考虑，这里最好的检验方法就是用Java Visualizer跑一次。
> * 写删除方法时，要考虑链表为空的情况。