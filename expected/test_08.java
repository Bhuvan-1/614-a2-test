class test_08 {
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
        t0 = 100;
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
    public int age() {
        int age;
        age = 100;
        return age;
    }
}
