class test_02 {
    public static void main(String[] no_arg) {
        Animal s;
        int ret;
        s = new Animal();
        ret = s.age();
        System.out.println(ret);
    }
}

class Test_Age_Inlining {
    public int checkInlining() {
        int value;
        Animal s;
        int t0;
        s = new Animal();
        t0 = 100;
        value = t0;
        return value;
    }
}

class Animal {
    public int age() {
        int age;
        age = 100;
        return age;
    }
}