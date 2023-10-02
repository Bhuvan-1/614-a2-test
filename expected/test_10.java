class test_10 {
    public static void main(String[] this_args) {
        int age;
        age = 10;
    }
}

class Inheritance_Testing {
    public int check() {
        int age;
        CricketStadium stadium;
        Cat cat;
        int t0;
        int t2;
        cat = new Cat();
        stadium = new CricketStadium();
        t0 = 100;
        age = t0;
        t2 = 10;
        age = t2;
        return age;
    }
}

class Stadium {
    public int age() {
        int age;
        age = 100;
        return age;
    }
}

class CricketStadium extends Stadium {
}

class Animal {
}

class Cat extends Animal {
    public int age() {
        int age;
        age = 10;
        return age;
    }
}
