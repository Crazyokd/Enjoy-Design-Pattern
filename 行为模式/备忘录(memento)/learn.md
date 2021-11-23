<h1 align="center">
备忘录模式
</h1>

## 大话设计模式
- 主要包括三个类Originator、Memento、Caretaker
- Originator负责创建一个备忘录Memento，用以记录当前时刻它的内部状态，并可使用备忘录恢复内部状态。Originator可根据需要决定Memento存储Originator的哪些内部状态。
- Memento负责存储Originator对象的内部状态，并可防止Originator以外的其他对象访问备忘录。备忘录有两个接口，Caretaker只能看到备忘录的窄接口，它只能将备忘录传递给其他对象。Originator能够看到一个宽接口，允许它访问返回到先前状态所需的所有数据
- Caretaker负责保存好备忘录Memento，不能对备忘录的内容进行操作或检查。
- 其中Originator所谓的对备忘录类数据的访问，其本质是因为由Originator创造备忘录，所以备忘录对象的所有数据信息由Originator进行指定（构造方法传入）
- 备忘录的一大特征就是不提供内部数据（属性）的对外设置（set方法），只提供get接口，唯一的方法就是构造函数初始设置。
- Caretaker保有备忘录对象的引用，可以自由设置其备忘录引用，主要用于保存备忘录。保存或使用备忘录时要与它进行交互。
- 备忘录类作为Originator与Caretaker之间交互的媒介。客户端实际并不知道备忘录类。