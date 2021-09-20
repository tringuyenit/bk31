package testfolder.testabstract;

public interface InterfaceTest {
    // attributes must be public static final
    public static final int a = 0;
    /* the above 'a' is public static final, so do not need ' publicstatic final' as well
     it cannot be changed even we try to impement methed like setA() */

//    public int d; // must initiate value
//    private int b = 0; // cannot be private
//    protected int c = 0; // cannot be protected


    // method must be public or private, not protected
    // abstract method do not need 'abstract' key word, and must be public
    // private method must have body
    void run(int num);
    abstract void run2(); // 'abstract' keyword is redundant
    default void f(){
        System.out.println("### default method");
        //default method make use of both public and private method
        jump("lala"); // access private method of interface
        run(3);
        run2();
        System.out.println("default method ###");
    } // default method of interface is like....public method but not abstract, whereas in abstract class, public method with body is allowed but interface not


    //    protected void jump(String a); // cannot be protected
    //    private void jump(String a); // private method must have body

    private void jump(String a) {
        System.out.println("Body of private method in interface jump()");
        // private method must have body
    }
}
