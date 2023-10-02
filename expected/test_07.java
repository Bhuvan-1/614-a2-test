class test_07 {
    public static void main(String[] args) {
        Animal s;
        s = new Animal();
        System.out.println(s);
    }
}

class Inheritance_Testing {
    public int check() {
        Cat c;
        int age;
        int t0;
        c = new Cat();
        t0 = 10;
        age = t0;
        return age;
    }
}

class Animal {
    public int age() {
        int age;
        age = 10;
        return age;
    }
}

class Cat extends Animal {
}
