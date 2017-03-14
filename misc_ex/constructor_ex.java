class MyClass {
    MyClass(String name) {
        System.out.println("Constructor method called. " + name);
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass("Dragan");
        MyClass obj2 = new MyClass("Zoran");
    }
}