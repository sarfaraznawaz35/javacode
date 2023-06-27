package demo1.anonymous_lambda;

public class cwh109_lamdTest {
    public static void main(String[] args){

        // lambda expression
        Inter_DemoAno obj = (a) ->{
            System.out.println("I am meth1 from lambda expression.." + a);
        };
        obj.meth1(6);
    }
}
