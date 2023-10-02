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
    // Inlined method: Simp.constructs
    int _mee_0; // VarDecl: ret
    int[] _mee_1; // VarDecl: s1
    boolean _mee_2; // VarDecl: s2
    int _mee_3; // VarDecl: s3
    float _mee_4; // VarDecl: s4
    Test3 _mee_5; // VarDecl: s5
    Simp _mee_6; // VarDecl: s6
    boolean _mee_7; // VarDecl: s7
    // Inlined method: Simp.constructs
    int _mee_8; // VarDecl: ret
    int[] _mee_9; // VarDecl: s1
    boolean _mee_10; // VarDecl: s2
    int _mee_11; // VarDecl: s3
    float _mee_12; // VarDecl: s4
    Test3 _mee_13; // VarDecl: s5
    Simp _mee_14; // VarDecl: s6
    boolean _mee_15; // VarDecl: s7
    // Inlined method: Simp.constructs
    int _mee_16; // VarDecl: ret
    int[] _mee_17; // VarDecl: s1
    boolean _mee_18; // VarDecl: s2
    int _mee_19; // VarDecl: s3
    float _mee_20; // VarDecl: s4
    Test3 _mee_21; // VarDecl: s5
    Simp _mee_22; // VarDecl: s6
    boolean _mee_23; // VarDecl: s7
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
    // ret = sss.constructs();
    // Possible Targets: 1
    //   class Simp.constructs
    _mee_0 = 100;
    _mee_1 = new int[_mee_0];
    _mee_2 = false;
    _mee_3 = 10;
    _mee_4 = 12;
    _mee_5 = new Test3();
    _mee_6 = new Simp();
    System.out.println(_mee_0);
    _mee_1[_mee_3] = _mee_3;
    _mee_0 = 99;
    _mee_1[_mee_0] = _mee_3;
    if (_mee_2)
      {
        _mee_0 = 100;
        _mee_1 = new int[_mee_0];
        _mee_2 = false;
        _mee_3 = 10;
        _mee_4 = 12;
        _mee_5 = new Test3();
        _mee_6 = new Simp();
        _mee_1[_mee_3] = _mee_3;
        _mee_1[_mee_0] = _mee_3;
        System.out.println(_mee_0);
      }
    _mee_2 = !_mee_2;
    if (_mee_2)
      {
        _mee_0 = 100;
        _mee_1 = new int[_mee_0];
        _mee_2 = false;
        _mee_3 = 10;
        _mee_4 = 12;
        _mee_5 = new Test3();
        _mee_6 = new Simp();
        _mee_1[_mee_3] = _mee_3;
        _mee_0 = 99;
        _mee_1[_mee_0] = _mee_3;
      }
    else
      if (_mee_2)
        {
          _mee_0 = 100;
          _mee_1 = new int[_mee_0];
          _mee_2 = false;
          _mee_3 = 10;
          _mee_4 = 12;
          _mee_5 = new Test3();
          _mee_6 = new Simp();
          System.out.println(_mee_0);
          _mee_1[_mee_3] = _mee_3;
          _mee_1[_mee_0] = _mee_3;
        }
    _mee_3 = 1938;
    while (_mee_2)
      {
        _mee_0 = _mee_0 + _mee_0;
        _mee_2 = _mee_0 <= _mee_3;
      }
    System.out.println(_mee_3);
    _mee_7 = !_mee_2;
    _mee_2 = _mee_2 && _mee_7;
    _mee_2 = _mee_2 || _mee_7;
    _mee_2 = _mee_3 <= _mee_0;
    _mee_2 = _mee_3 != _mee_0;
    _mee_0 = _mee_3 + _mee_0;
    _mee_0 = _mee_0 - _mee_3;
    _mee_0 = _mee_0 * _mee_3;
    _mee_0 = _mee_0 / _mee_3;
    System.out.println(_mee_0);
    _mee_3 = 99;
    _mee_0 = _mee_1[_mee_3];
    _mee_3 = _mee_1.length;
    System.out.println(_mee_3);
    System.out.println(_mee_0);
    ret = _mee_0;
    // ret = sss.constructs();
    // Possible Targets: 1
    //   class Simp.constructs
    _mee_8 = 100;
    _mee_9 = new int[_mee_8];
    _mee_10 = false;
    _mee_11 = 10;
    _mee_12 = 12;
    _mee_13 = new Test3();
    _mee_14 = new Simp();
    System.out.println(_mee_8);
    _mee_9[_mee_11] = _mee_11;
    _mee_8 = 99;
    _mee_9[_mee_8] = _mee_11;
    if (_mee_10)
      {
        _mee_8 = 100;
        _mee_9 = new int[_mee_8];
        _mee_10 = false;
        _mee_11 = 10;
        _mee_12 = 12;
        _mee_13 = new Test3();
        _mee_14 = new Simp();
        _mee_9[_mee_11] = _mee_11;
        _mee_9[_mee_8] = _mee_11;
        System.out.println(_mee_8);
      }
    _mee_10 = !_mee_10;
    if (_mee_10)
      {
        _mee_8 = 100;
        _mee_9 = new int[_mee_8];
        _mee_10 = false;
        _mee_11 = 10;
        _mee_12 = 12;
        _mee_13 = new Test3();
        _mee_14 = new Simp();
        _mee_9[_mee_11] = _mee_11;
        _mee_8 = 99;
        _mee_9[_mee_8] = _mee_11;
      }
    else
      if (_mee_10)
        {
          _mee_8 = 100;
          _mee_9 = new int[_mee_8];
          _mee_10 = false;
          _mee_11 = 10;
          _mee_12 = 12;
          _mee_13 = new Test3();
          _mee_14 = new Simp();
          System.out.println(_mee_8);
          _mee_9[_mee_11] = _mee_11;
          _mee_9[_mee_8] = _mee_11;
        }
    _mee_11 = 1938;
    while (_mee_10)
      {
        _mee_8 = _mee_8 + _mee_8;
        _mee_10 = _mee_8 <= _mee_11;
      }
    System.out.println(_mee_11);
    _mee_15 = !_mee_10;
    _mee_10 = _mee_10 && _mee_15;
    _mee_10 = _mee_10 || _mee_15;
    _mee_10 = _mee_11 <= _mee_8;
    _mee_10 = _mee_11 != _mee_8;
    _mee_8 = _mee_11 + _mee_8;
    _mee_8 = _mee_8 - _mee_11;
    _mee_8 = _mee_8 * _mee_11;
    _mee_8 = _mee_8 / _mee_11;
    System.out.println(_mee_8);
    _mee_11 = 99;
    _mee_8 = _mee_9[_mee_11];
    _mee_11 = _mee_9.length;
    System.out.println(_mee_11);
    System.out.println(_mee_8);
    ret = _mee_8;
    // ret = sss.constructs();
    // Possible Targets: 1
    //   class Simp.constructs
    _mee_16 = 100;
    _mee_17 = new int[_mee_16];
    _mee_18 = false;
    _mee_19 = 10;
    _mee_20 = 12;
    _mee_21 = new Test3();
    _mee_22 = new Simp();
    System.out.println(_mee_16);
    _mee_17[_mee_19] = _mee_19;
    _mee_16 = 99;
    _mee_17[_mee_16] = _mee_19;
    if (_mee_18)
      {
        _mee_16 = 100;
        _mee_17 = new int[_mee_16];
        _mee_18 = false;
        _mee_19 = 10;
        _mee_20 = 12;
        _mee_21 = new Test3();
        _mee_22 = new Simp();
        _mee_17[_mee_19] = _mee_19;
        _mee_17[_mee_16] = _mee_19;
        System.out.println(_mee_16);
      }
    _mee_18 = !_mee_18;
    if (_mee_18)
      {
        _mee_16 = 100;
        _mee_17 = new int[_mee_16];
        _mee_18 = false;
        _mee_19 = 10;
        _mee_20 = 12;
        _mee_21 = new Test3();
        _mee_22 = new Simp();
        _mee_17[_mee_19] = _mee_19;
        _mee_16 = 99;
        _mee_17[_mee_16] = _mee_19;
      }
    else
      if (_mee_18)
        {
          _mee_16 = 100;
          _mee_17 = new int[_mee_16];
          _mee_18 = false;
          _mee_19 = 10;
          _mee_20 = 12;
          _mee_21 = new Test3();
          _mee_22 = new Simp();
          System.out.println(_mee_16);
          _mee_17[_mee_19] = _mee_19;
          _mee_17[_mee_16] = _mee_19;
        }
    _mee_19 = 1938;
    while (_mee_18)
      {
        _mee_16 = _mee_16 + _mee_16;
        _mee_18 = _mee_16 <= _mee_19;
      }
    System.out.println(_mee_19);
    _mee_23 = !_mee_18;
    _mee_18 = _mee_18 && _mee_23;
    _mee_18 = _mee_18 || _mee_23;
    _mee_18 = _mee_19 <= _mee_16;
    _mee_18 = _mee_19 != _mee_16;
    _mee_16 = _mee_19 + _mee_16;
    _mee_16 = _mee_16 - _mee_19;
    _mee_16 = _mee_16 * _mee_19;
    _mee_16 = _mee_16 / _mee_19;
    System.out.println(_mee_16);
    _mee_19 = 99;
    _mee_16 = _mee_17[_mee_19];
    _mee_19 = _mee_17.length;
    System.out.println(_mee_19);
    System.out.println(_mee_16);
    ret = _mee_16;
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
    if (s2)
      {
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
    if (s2)
      {
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
      }
    else
      if (s2)
        {
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
    while (s2)
      {
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
// RTA + SYMTAB
// class Test3 -> (Instantiated)
//  (Parent) : NULL
//  (Fields)
//  (Methods)
//    (main : )
//      [s=Simp]
//  (Children): 
// class Simp -> (Instantiated)
//  (Parent) : NULL
//  (Fields)
//    [s5=Test3]
//    [s6=Simp]
//  (Methods)
//    (foo6 : )
//      [s13=Simp]
//    (argument : [a1=int[]][a2=int][a3=float][a4=Test3][a5=Simp])
//    (foo1 : )
//      [s7=int[]]
//      [s8=int]
//    (foo2 : )
//      [s9=boolean]
//    (constructs : )
//      [ret=int]
//      [s3=int]
//      [s4=float]
//      [s5=Test3]
//      [s6=Simp]
//      [s7=boolean]
//      [s1=int[]]
//      [s2=boolean]
//    (foo3 : )
//      [ret=int]
//      [s3=int]
//      [s4=float]
//      [sss=Simp]
//      [s5=Test3]
//      [s6=Simp]
//      [s7=boolean]
//      [s1=int[]]
//      [s2=boolean]
//    (foo4 : )
//      [s11=int]
//    (foo5 : )
//      [s12=Test3]
//  (Children): 

