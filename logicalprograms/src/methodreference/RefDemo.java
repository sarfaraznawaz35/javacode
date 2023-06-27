package methodreference;

public class RefDemo {
    public static void main(String[] args){
        System.out.println("Learning Method references..");

        //provide the implementation of WorkInter
        // Referring static method
        // ClassName::methodName
        WorkInter workInter = Stuff::doStuff;
        workInter.doTask();

        Runnable runnable = Stuff::threadTask;
        Thread d = new Thread(runnable);
        d.start();

        // Referring Non-static method
        // Object::methodName
        Stuff ob = new Stuff();
        Runnable runnable1 = ob::printNumber;

        Thread d1 = new Thread(runnable1);
        d1.start();
    }
}
