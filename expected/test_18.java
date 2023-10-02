class test_18 {
    public static void main(String[] args) {
        int number;
        number = 10;
        System.out.println(number);
    }
}

class Test_This_Usage {
    public int check() {
        Animal a;
        Animal b;
        int age;
        int t2;
        Animal t0;
        a = new Animal();
        t0 = a;
        b = t0;
        t2 = 10;
        age = t2;
        return age;
    }
}

class Animal {
    public Animal copy() {
        Animal x;
        x = this;
        return x;
    }

    public int age() {
        int age;
        age = 10;
        return age;
    }
}
