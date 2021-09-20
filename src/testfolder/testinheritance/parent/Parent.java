package testfolder.testinheritance.parent;

public class Parent {
    private String name;
    private int number;
    private static int age = 69;

    protected int id;

    public boolean deleted;

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getId() {
        return id;
    }

    public boolean isDeleted() {
        return deleted;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Parent() {
        System.out.println("Parent created"); // Parent Constructor executes before Child Constructor
    }

    public Parent(String name, int number, int id, boolean deleted) {
        this.name = name;
        this.number = number;
        this.id = id;
        this.deleted = deleted;
    }

    public void doSomething(int num1, int num2){
        System.out.println("Parent do something");
    }

    public final int cannotBeOverriden1(){
        return 69;
        //Can not override final-methods of parent class
    }

    public static int cannotBeOverriden2(){
        return age;
        //Can not override static-methods (of parent class) ---> complex explain below

        /*
        We can declare static methods with the same signature in the subclass,
        but it is not considered overriding as there won’t be any run-time polymorphism.
        Hence, the answer is ‘Cannot override static methods’.
        If a derived class defines a static method with the same signature
        as a static method in the base class,
        the method in the derived class is HIDDEN by the method in the base class IF ONLY object of type Parent

        Also, cannot override above method by keyword 'static' (below)
         */
    }

//    public int cannotBeOverriden2() {
//        // cannot override above method by keyword 'static'
//    }


}
