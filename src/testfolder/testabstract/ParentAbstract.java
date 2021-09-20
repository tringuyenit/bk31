package testfolder.testabstract;

public abstract class ParentAbstract {
    private int id;
    private String name = "Tri";

    public ParentAbstract(int id, String name) {
        this.id = id;
        this.name = name;
        // when abstract-parent has constructor, child must have same constructor and uses super
    }

    protected void doSomething(){
        System.out.println("Parent doSomething");
    }

//    private void doSomething2(); //private method must have body, cannot have 'private abstract', that's silly

    /* abstract method cannot be private
    because only public and protectd field can be inherited
    and abstrace method needs to be re-defined by Cild
     */
//    private abstract double doAbstract(); // cannot be done

    protected abstract double doAbstract();
//    private abstract double doAbstract2(); // cannot have 'private abstract', that's silly
}
