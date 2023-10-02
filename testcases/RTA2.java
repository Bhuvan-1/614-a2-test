import java.util.HashMap;

public class RTA2 {

    public static void main(String[] args) {
        A a;
        B b;
        C c;
        D d;
        E e;
        F f;
        G g;
        H h;
        I i;
        int boo;

        boo  = a.foo();

        boo = b.foo();

        boo = c.foo();


        boo = d.foo();


        boo = e.foo();


        boo = f.foo();

        boo = g.foo();

        boo = h.foo();

        boo = i.foo();



    }
}

class Instantiator{
    public int init(){
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();
        G g = new G();
        H h = new H();
        I i = new I();
        J j = new J();

        e = new E();
        i = new I();
        f = new F();
        j = new J();
        g = new G();
        h = new H();

        return 0;
    }
}


class A{
    public int foo(){
        int ret;
        ret = 100;
        return ret;
    }
}

class B extends A{
    // B does not implement foo()
}

class C extends A{
     // C does not implement foo()
}

class D extends A{
    public int foo(){
        int ret;
        ret = 400;
        return ret;
    }
}

class E extends B{
    // E does not implement foo()
}

class F extends B{
    public int foo(){
        int ret;
        ret = 600;
        return ret;
    }
}

class G extends D{
    // G does not implement foo()
}

class H extends D{
    public int foo(){
        int ret;
        ret = 800;
        return ret;
    }
}

class J extends C{
    public int foo(){
        int ret;
        ret = 900;
        return ret;
    }
}

class I extends C{
    // I does not implement foo()
}


