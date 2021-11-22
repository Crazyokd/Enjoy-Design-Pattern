package main;

public class Context {
    private State state;
    public Context(){}
    public Context(State state){
        this.state = state;
    }
    public void setState(State state){
        this.state=state;
    }
    public State getState(){
        return this.state;
    }
    public void Request(){
        state.handle(this);
    }
}
