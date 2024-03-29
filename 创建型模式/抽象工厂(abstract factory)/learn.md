<h1 align="center">
    抽象工厂模式
</h1>

## 重学设计模式
### 背景

并入新系统，新系统与原系统有相同功能但实现不同（方法名、方法体）

### 常规方案

在接口实现类(`impl`)中堆砌`if-else`，方法内部具体系统具体调用

### 设计模式

每个系统分别实现接口(`Adapter`)，通过代理调用具体实现类。

## 大话设计模式
- 即使是具体的工厂也能生产不同种类的产品，其中每种产品又继承自抽象类
- 具体的工厂之间所生产的产品是"并列"的
- 所以特点就是这些工厂的父类（抽象工厂）有多个抽象方法，这些方法的特点就是返回值是一个抽象产品类。

## refactoringguru
- 通过具体的工厂生成对应类型的各种产品。
- 每个工厂都能生产不同种类的各种产品。