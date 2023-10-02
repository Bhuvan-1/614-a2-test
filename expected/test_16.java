class test_16 {
    public static void main(String[] args) {
        int number;
        number = 10;
        System.out.println(number);
    }
}

class Test_Single_Method_Multiple_Calls {
    public int check() {
        Animal a;
        int age1;
        int age2;
        int t0;
        int t2;
        a = new Animal();
        t0 = 10;
        age1 = t0;
        age1 = age1 * age1;
        t2 = 10;
        age2 = t2;
        return age2;
    }
}

class Animal {
    public int age() {
        int age;
        age = 10;
        return age;
    }
}
