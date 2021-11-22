<h1 align="center">
状态模式
</h1>

## 大话设计模式
- 主要由两个类组成————Context类和State类
- Context类中保有State类的引用，关键方法(Request())实际上调用了State对象的方法(handle(Context context))
- **Context类的状态实际是由State类传递和决定的。**
- Context类的下一状态由当前状态决定或传递。
- 具体的状态类之间拥有不同的表现，和'状态'相关的属性和行为转到状态类中实现，细化了Context类的职责。