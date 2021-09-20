package testfolder.testabstract;

public class Child extends ParentAbstract{
    public Child(int id, String name) {
        super(id, name);
        // when abstract-parent has constructor, child must have same constructor and uses super
    }

    @Override
    protected double doAbstract() {
        System.out.println("Child re-define abstract method");
        return 0.0;
    }
}
