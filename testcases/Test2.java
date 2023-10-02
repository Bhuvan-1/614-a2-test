class Test2 {
  public static void main(String[] arg) {
    A s;
    int ret;
    int ret1;
    int ret2;
    s = new A();
    ret = 15;
    ret2 = 20;
    ret1 = 19;
    ret = s.execute(ret, ret1, ret2);
    System.out.println(ret);
    s = new B();
  }
}

class A {
  public int execute(int arg, int a2, int a3) {
    A tt;
    tt = this;
    arg = tt.fibb(arg);
    System.out.println(arg);
    arg = tt.fibb(a2);
    System.out.println(a2);
    arg = tt.fibb(a3);
    System.out.println(arg);
    return arg;
  }
  public int dummy(int a, int b, int c) {
    a = b / c;
    return a;
  }
  public int fibb(int n) {
    A bb;
    int num;
    int numPlusOne;
    int res;
    int zero;
    int one;
    int two;
    boolean cond1;
    boolean cond2;
    zero = 0;
    two = 2;
    one = 1;
    num = 0;
    numPlusOne = 1;
    res = numPlusOne;
    cond1 = n <= one;
    cond2 = n <= two;
    if (cond1) {
      res = num;
    } else if (cond2) {
      res = numPlusOne;
    } else {
      cond1 = n != zero;
      while (cond1) {
        res = num + numPlusOne;
        num = numPlusOne;
        numPlusOne = res;
        n = n - one;
        cond1 = n != zero;
      }
    }
    bb = this;
    one = bb.dummy(res, one, two);
    return res;
  }

  public int compute(int val) {
    int res;
    A a;
    a = this;
    res = a.fibb(val);
    return res;
  }
}

class B extends A {
  public int dummy(int a, int b, int c) {
    a = a + b;
    return a;
  }
}