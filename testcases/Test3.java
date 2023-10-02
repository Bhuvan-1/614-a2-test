// 
// Yet Another Test Test
// 
class Test3 {
  public static void main(String[] arg) {
    Simp s;
    int res;
    s = new Simp();
    res = s.foo3();
    System.out.println(res);
  }
}

class Simp {
  int[] s1;
  boolean s2;
  int s3;
  float s4;
  Test3 s5;
  Simp s6;

  public int[] foo1() {
    int[] s7;
    int s8;
    s8 = 1;
    s7 = new int[s8];
    return s7;
  }

  public boolean foo2() {
    boolean s9;
    s9 = false;
    s9 = true;
    return s9;
  }

  public int foo3() {
    Simp sss;
    int ret;
    int[] s1;
    boolean s2;
    int s3;
    float s4;
    Test3 s5;
    Simp s6;
    boolean s7;
    ret = 100;
    s1 = new int[ret];
    s2 = false;
    s3 = 10;
    s4 = 12;
    s5 = new Test3();
    s6 = new Simp();
    s1[s3] = s3;
    ret = 99;
    s1[ret] = s3;
    sss = this;
    ret = sss.constructs();
    ret = sss.constructs();
    ret = sss.constructs();
    return ret;
  }

  public float foo4() {
    int s11;
    s11 = 1;
    return s11;
  }

  public Test3 foo5() {
    Test3 s12;
    s12 = new Test3();
    return s12;
  }

  public Simp foo6() {
    Simp s13;
    s13 = new Simp();
    return s13;
  }

  public int argument(int[] a1, int a2, float a3, Test3 a4, Simp a5) {
    return a2;
  }

  public int constructs() {
    int ret;
    int[] s1;
    boolean s2;
    int s3;
    float s4;
    Test3 s5;
    Simp s6;
    boolean s7;
    
    ret = 100;
    s1 = new int[ret];
    s2 = false;
    s3 = 10;
    s4 = 12;
    s5 = new Test3();
    s6 = new Simp();
    System.out.println(ret);
    s1[s3] = s3;
    ret = 99;
    s1[ret] = s3;
    
    if (s2) {
      ret = 100;
      s1 = new int[ret];
      s2 = false;
      s3 = 10;
      s4 = 12;
      s5 = new Test3();
      s6 = new Simp();
      s1[s3] = s3;
      s1[ret] = s3;
      System.out.println(ret);
    }

    s2 = !s2;
    if (s2) {
      ret = 100;
      s1 = new int[ret];
      s2 = false;
      s3 = 10;
      s4 = 12;
      s5 = new Test3();
      s6 = new Simp();
      s1[s3] = s3;
      ret = 99;
      s1[ret] = s3;
    } else if (s2) {
      ret = 100;
      s1 = new int[ret];
      s2 = false;
      s3 = 10;
      s4 = 12;
      s5 = new Test3();
      s6 = new Simp();
      System.out.println(ret);
      s1[s3] = s3;
      s1[ret] = s3;
    }

    s3 = 1938;
    while (s2) {
      ret = ret + ret;
      s2 = ret <= s3;
    }

    System.out.println(s3);
    s7 = !s2;
    s2 = s2 && s7;
    s2 = s2 || s7;
    s2 = s3 <= ret;
    s2 = s3 != ret;
    ret = s3 + ret;
    ret = ret - s3;
    ret = ret * s3;
    ret = ret / s3;
    System.out.println(ret);
    s3 = 99;
    ret = s1[s3];

    s3 = s1.length;
    System.out.println(s3);
    System.out.println(ret);
    return ret;
  }
}
