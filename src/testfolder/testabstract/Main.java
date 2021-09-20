package testfolder.testabstract;

public class Main {
    public static void main(String[] args) {

        ParentAbstract pa = new ParentAbstract(69, "new TRI") {
            @Override
            protected double doAbstract() {
                System.out.println("re-define absstract right in statement");
                return 0.2;
            }
        }; // make abstract object but need to define abstract method right there
        pa.doAbstract();

        Child c = new Child(70, "Tri 2");
        c.doAbstract();

        ParentAbstract pa2 = new Child(71, "Tri 3");
        pa2.doAbstract();

        // ------------------------------------------------------------
        System.out.println();
        // test parent that does not have constructor
        ParentAbstract2 parentAbstract2 = new ParentAbstract2() {
            @Override
            protected double doAbstract() {
                return 0;
            }
        }; // even if abstract parent does not have constructor, we still can make object, but still need to re-define

        // ------------------------------------------------------------
        // TEST INTERFACE
        System.out.println();
        Child3 child3 = new Child3();
        child3.run(69);
        child3.run2();
        child3.f(); // THIS IS THE DEFAULT METHOD OF INTERFACE
    }
}
