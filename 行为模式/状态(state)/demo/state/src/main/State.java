package main;

public interface State {
    void handle(Context context);
}

class ConcreteStateA implements State{
    @Override
    public void handle(Context context){
        context.setState(new ConcreteStateB());
    }
}

class ConcreteStateB implements State{
    @Override
    public void handle(Context context){
        context.setState(new ConcreteStateA());
    }
}
