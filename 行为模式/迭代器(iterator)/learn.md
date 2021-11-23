<h1 align="center">
迭代器模式
</h1>

## 大话设计模式
- 主要包括Aggregate类和Iterator类。
- 迭代器类保有一份ConcreteAggregate对象引用
- ConcreteAggregate类能够产生一个迭代器（将this作为迭代器的引用），~~从这个角度来讲，这个方法是可以没有的~~。
- 使用ConcreteAggregate类产生具体的迭代器对象屏蔽了具体的迭代器细节，具体产生怎样的迭代器由该方法确定，从而将职责从客户端分离出去。