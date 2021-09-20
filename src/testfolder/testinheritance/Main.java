package testfolder.testinheritance;

import testfolder.testinheritance.child.Child;
import testfolder.testinheritance.parent.Child2;
import testfolder.testinheritance.parent.Parent;

public class Main {
    public static void main(String[] args) {

        Child c = new Child();
        c.deleted = true;

        c.setName("Tri"); // set/update/access private field of parent class
        System.out.println(c.getName()); // get private field of parent class
        /* how the fuck? I thought private field cannot be inherited ? */

//        c.id = 69;
       /* above be done,
       cos protected field can only be accessed in 'class', not object */

        c.doSomething("lala"); // test overload method
        c.doSomething(69, 69); // test override method

        System.out.println(c.cannotBeOverriden2()); // When object of type Child, 'can' 'override' static method
        Parent c3 = new Child(); // However....
        System.out.println(c3.cannotBeOverriden2()); // ... if object of type Parent...
        /*
        ...we cannot override static method (use method of Child), the method is being HIDDEN
        meanwhile, non-static method (below) can be overriden (use method of Child)
         */
        c3.doSomething(0, 0);

        //-----------------------------------------------------------------------------\
        // Test Child2 : class in same package as parent
        System.out.println();
        Child2 c2 = new Child2(); // child 2
//        c2.id = 69;
        /* above be done,
       cos protected field can only be accessed in 'class', not object */



        //-----------------------------------------------------------------------------
        System.out.println();

    }
}
