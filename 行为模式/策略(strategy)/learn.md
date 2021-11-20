<h1 align="center">
    策略模式
</h1>

## 大话设计模式
核心是两个类，一个Strategy类，一个Context类。
<img src="https://refactoringguru.cn/images/patterns/diagrams/strategy/structure-2x.png" alt="装饰设计模式的结构" width="480">

- 具体的策略具体实现Strategy类。
- Context类中包含有Strategy类的引用，并有相关的构造方法，实参传入一个具体的策略对象，从而做到不同场景使用不同策略
- 场景类中应有一个抽象方法，内部实现写死，但实际上又是动态的，因为实际上调用的是策略类（属性）的抽象方法
- 具体的策略类和工厂方法的具体类并无区别
- 为了进一步降低耦合，场景类的构造方法的形参可以改为判断类型的，从而在构造方法中根绝具体类型生成策略对象，并为策略对象引用属性赋值。

