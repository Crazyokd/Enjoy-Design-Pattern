<h1 align="center">
享元模式
</h1>

## 大话设计模式
- 工厂抽象类聚合共享抽象类，通过工厂具体生成共享类
- 工厂内部使用懒加载，也可以说是多个具体共享类的单例模式。
- 所谓的效率提升集中在单例模式上。
- 无法使用单例的部分必须抽象出去，作为内部状态，并使得共享类关联内部状态相关类。