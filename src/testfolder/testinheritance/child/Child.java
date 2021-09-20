package testfolder.testinheritance.child;

import testfolder.testinheritance.parent.Parent;

public class Child extends Parent {
    // child in different package from parent
    public Child() {
        System.out.println("Child created"); // Child Constructor executes after Parent Constructor
    }

    public Child(String name, int number, int id, boolean deleted) {
        super (name, number, id, deleted); // if parent is not abstract class, this constructor is not a must (check ParentAbstract)
    }

    private void doSomeShit(){
        this.deleted = true;
    }

    @Override
    public void doSomething(int num1, int num2){
        System.out.println("Override doSomething()");
    }

    public void doSomething(String s){
        System.out.println("Overload doSomething()");
    }

    public static int cannotBeOverriden2(){
        return 70;
        //Can not override static-methods of parent class (WHEN object of type Parent)
    }

    /*
    1. Overriding methods must have:
    - Number of arguments that is the same as the overriden
    method in the parent class => same signature
    - The same return data types as the overriden method
    parent
    2. Can not override:
    - Constant (final) methods in the parent class
    - Static methods in the parent class
    - Private methods in the parent class
    3. Accessibility can not be more restricted in a
    - Child class (compared to in its parent class)
    For example, if overriding a protected method, the
    new overriding method can only be protected or
    public, and can not be private.
    */
}
