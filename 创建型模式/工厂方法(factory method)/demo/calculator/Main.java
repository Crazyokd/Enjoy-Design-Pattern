import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        try{
            System.out.println("请输入数字A：");
            System.out.println("请选择运算符号(+、-、*、/)：");
            System.out.println("请输入数字A：");
            String strNumberA = scanner.next();
            String strOperator = scanner.next();
            String strNumberB = scanner.next();
            String strResult = "";

            OperationFactory operFactory = null;
            switch(strOperator){
                case "+":
                {
                    operFactory = new AddOperationFactory();
                    break;
                }
            case "-":
                {
                    operFactory = new SubOperationFactory();
                    break;
                }
            case "*":
                {
                    operFactory = new MulOperationFactory();
                    break;
                }
            case "/":
                {
                    operFactory = new DivOperationFactory();
                    break;
                }
            }
            Operation oper = operFactory.createOperator();
            oper.numberA = Double.parseDouble(strNumberA);
            oper.numberB = Double.parseDouble(strNumberB);
            strResult = oper.GetResult().toString();

            System.out.println("结果是："+ strResult);

        }catch (Exception ex){
            System.out.println("您的输入有错："+ ex.getMessage());
        }
        scanner.close();
    }
}

abstract class Operation{
    double numberA;
    double numberB;
    
    public abstract Double GetResult();
}


class AddOperation extends Operation{
    public Double GetResult(){
        return this.numberA+this.numberB;
    }
}

class SubOperation extends Operation{
    public Double GetResult(){
        return this.numberA-this.numberB;
    }
}

class MulOperation extends Operation{
    @Override
    public Double GetResult(){
        return this.numberA*this.numberB;
    }
}

class DivOperation extends Operation{
    @Override
    public Double GetResult(){
        return this.numberA/this.numberB;
    }
}


abstract class OperationFactory{
    public abstract Operation createOperator();
}

class AddOperationFactory extends OperationFactory{
    public Operation createOperator(){
        return new AddOperation();
    }
}
class SubOperationFactory extends OperationFactory{
    public Operation createOperator(){
        return new SubOperation();
    }
}
class MulOperationFactory extends OperationFactory{
    public Operation createOperator(){
        return new MulOperation();
    }
}
class DivOperationFactory extends OperationFactory{
    public Operation createOperator(){
        return new DivOperation();
    }
}