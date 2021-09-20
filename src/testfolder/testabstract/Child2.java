package testfolder.testabstract;

public class Child2 extends ParentAbstract2{
    @Override
    protected double doAbstract() {
        System.out.println("Child re-define abstract method 2");
        return 0.0;
    }
}
