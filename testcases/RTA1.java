public class RTA1 {
    public static void main( String[] args){
        A a;
        B b;
        C c;
        D d;
        E e;
        F f;
        G g;
        H h;
        I i;
        J j;

        int boo;

        boo = b.foo();

        boo = c.foo();

        boo = d.foo();

        boo = e.foo();

        boo = f.foo();

        boo = g.foo();

        boo = i.foo();

        boo = j.foo();


    }
}


class Instantiator{
    public int init(){
        A a;
        B b;
        C c;
        D d;
        E e;
        F f;
        G g;
        H h;
        I i;
        J j;
        
        c = new C();
        e = new E();
        i = new I();
        j = new J();
        a = new A();
        g = new G();

        return 0;
    }
}


class A {}

class B extends A {

    public int foo() {
        A a;
        int ret;
        ret = 125;
        return ret;
    }

}

class C extends A {

    public int foo() {
        int ret;
        ret = 150;
        return ret;
    }

}

class D extends A {

    public int foo() {
        int ret;
        ret = 200;
        return ret;
    }

}



class E extends B{}

class F extends B{
    
        public int foo() {
            int ret;
            ret = 250;
            return ret;
        }
    
}

class I extends F{}


class G extends D{}
class J extends G{}

class H extends D{
        
            public int foo() {
                int ret;
                ret = 300;
                return ret;
            }
        
}