class test_03 {
    public static void main(String[] test3args) {
        Animal s;
        s = new Animal();
        System.out.println(s);
    }
}

class Test_Age_And_Height_Inlining {
    public int check() {
        Animal s;
        int age;
        int height;
        int heightPlusAge;
        int t0;
        int t3;
        int t4;
        int t2;
        s = new Animal();
        t0 = 10;
        age = t0;
        t2 = 3;
        t4 = 160;
        t3 = t4 * t2;
        height = t3;
        heightPlusAge = height + age;
        return heightPlusAge;
    }
}

class Animal {
    public int age() {
        int age;
        age = 10;
        return age;
    }

    public int heightInFt() {
        int height;
        int heightInCm;
        int cmToFtFactor;
        cmToFtFactor = 3;
        heightInCm = 160;
        height = heightInCm * cmToFtFactor;
        return height;
    }
}
