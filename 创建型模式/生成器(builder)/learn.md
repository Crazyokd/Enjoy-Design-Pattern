<h1 align="center">
    建造者模式
</h1>

## 重学设计模式
### 背景

多个对象以不同方式组合为一个对象

### 常规方案

`if-else`判断使用哪种组合方式，每种方式暴力堆砌不同对象。

### 设计模式

将组合过程抽象为接口（组合步骤对应抽象方法），通过判断组合类型具体调用接口方法（模拟不同组合）

## 大话设计模式
- 主要涉及两个类————Builder和Director。Builder类抽象了生成某个对象所需要的所有固定步骤，Director类隔离了用户与生成过程。
- Director类保有一份Builder类的引用（关联），在构造Director类时，应传入Builder类的引用，所以一种Director对应一种具体的生成过程（ConcreteBuilder）。
- 具体的生成过程往往和产品（Product）相联系，所以Director类的职责在于指导生成Product。
- 若需要扩展生成过程（ConcreteBuilder）的种类，只需要创建新的具体的ConcreteBuilder类即可（必要时还可以关联新的Product类）
- 客户端方面只需要新建一组组的具体的ConcreteBuilder对象和Director对象，然后调用Director对象的特定方法（该方法在内部调用其ConcreteBuilder的所有生成过程）即可。