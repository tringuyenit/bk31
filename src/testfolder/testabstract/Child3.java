package testfolder.testabstract;

public class Child3 implements InterfaceTest{
    @Override
    public void run(int num) {
        System.out.println("override run, with argument " + num);
    }

    @Override
    public void run2() {
        System.out.println("override run2");
    }

//    public void childDoSomething(){
//        this.jump("lala"); // cannot access private method of interface
//    }

    // NO NEED TO OVERRIDE 'DEFAULT' METHOD OF INTERFACE
}
