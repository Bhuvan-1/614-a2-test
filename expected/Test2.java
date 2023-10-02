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
    ret = s.execute(ret,ret1,ret2);
    System.out.println(ret);
    s = new B();
  }
}
class A {
  public int execute(int arg, int a2, int a3) {
    A tt;
    // Inlined method: A.fibb
    int _mee_0; // Arg: n
    A _mee_1; // VarDecl: bb
    int _mee_2; // VarDecl: num
    int _mee_3; // VarDecl: numPlusOne
    int _mee_4; // VarDecl: res
    int _mee_5; // VarDecl: zero
    int _mee_6; // VarDecl: one
    int _mee_7; // VarDecl: two
    boolean _mee_8; // VarDecl: cond1
    boolean _mee_9; // VarDecl: cond2
    // Inlined method: A.fibb
    int _mee_10; // Arg: n
    A _mee_11; // VarDecl: bb
    int _mee_12; // VarDecl: num
    int _mee_13; // VarDecl: numPlusOne
    int _mee_14; // VarDecl: res
    int _mee_15; // VarDecl: zero
    int _mee_16; // VarDecl: one
    int _mee_17; // VarDecl: two
    boolean _mee_18; // VarDecl: cond1
    boolean _mee_19; // VarDecl: cond2
    // Inlined method: A.fibb
    int _mee_20; // Arg: n
    A _mee_21; // VarDecl: bb
    int _mee_22; // VarDecl: num
    int _mee_23; // VarDecl: numPlusOne
    int _mee_24; // VarDecl: res
    int _mee_25; // VarDecl: zero
    int _mee_26; // VarDecl: one
    int _mee_27; // VarDecl: two
    boolean _mee_28; // VarDecl: cond1
    boolean _mee_29; // VarDecl: cond2
    tt = this;
    // arg = tt.fibb(arg);
    // Possible Targets: 1
    //   class A.fibb
    _mee_0 = arg; // Arg-Formal: n = arg
    _mee_5 = 0;
    _mee_7 = 2;
    _mee_6 = 1;
    _mee_2 = 0;
    _mee_3 = 1;
    _mee_4 = _mee_3;
    _mee_8 = _mee_0 <= _mee_6;
    _mee_9 = _mee_0 <= _mee_7;
    if (_mee_8)
      {
        _mee_4 = _mee_2;
      }
    else
      if (_mee_9)
        {
          _mee_4 = _mee_3;
        }
      else
        {
          _mee_8 = _mee_0 != _mee_5;
          while (_mee_8)
            {
              _mee_4 = _mee_2 + _mee_3;
              _mee_2 = _mee_3;
              _mee_3 = _mee_4;
              _mee_0 = _mee_0 - _mee_6;
              _mee_8 = _mee_0 != _mee_5;
            }
        }
    _mee_1 = tt;
    _mee_6 = _mee_1.dummy(_mee_4,_mee_6,_mee_7);
    arg = _mee_4;
    System.out.println(arg);
    // arg = tt.fibb(a2);
    // Possible Targets: 1
    //   class A.fibb
    _mee_10 = a2; // Arg-Formal: n = a2
    _mee_15 = 0;
    _mee_17 = 2;
    _mee_16 = 1;
    _mee_12 = 0;
    _mee_13 = 1;
    _mee_14 = _mee_13;
    _mee_18 = _mee_10 <= _mee_16;
    _mee_19 = _mee_10 <= _mee_17;
    if (_mee_18)
      {
        _mee_14 = _mee_12;
      }
    else
      if (_mee_19)
        {
          _mee_14 = _mee_13;
        }
      else
        {
          _mee_18 = _mee_10 != _mee_15;
          while (_mee_18)
            {
              _mee_14 = _mee_12 + _mee_13;
              _mee_12 = _mee_13;
              _mee_13 = _mee_14;
              _mee_10 = _mee_10 - _mee_16;
              _mee_18 = _mee_10 != _mee_15;
            }
        }
    _mee_11 = tt;
    _mee_16 = _mee_11.dummy(_mee_14,_mee_16,_mee_17);
    arg = _mee_14;
    System.out.println(a2);
    // arg = tt.fibb(a3);
    // Possible Targets: 1
    //   class A.fibb
    _mee_20 = a3; // Arg-Formal: n = a3
    _mee_25 = 0;
    _mee_27 = 2;
    _mee_26 = 1;
    _mee_22 = 0;
    _mee_23 = 1;
    _mee_24 = _mee_23;
    _mee_28 = _mee_20 <= _mee_26;
    _mee_29 = _mee_20 <= _mee_27;
    if (_mee_28)
      {
        _mee_24 = _mee_22;
      }
    else
      if (_mee_29)
        {
          _mee_24 = _mee_23;
        }
      else
        {
          _mee_28 = _mee_20 != _mee_25;
          while (_mee_28)
            {
              _mee_24 = _mee_22 + _mee_23;
              _mee_22 = _mee_23;
              _mee_23 = _mee_24;
              _mee_20 = _mee_20 - _mee_26;
              _mee_28 = _mee_20 != _mee_25;
            }
        }
    _mee_21 = tt;
    _mee_26 = _mee_21.dummy(_mee_24,_mee_26,_mee_27);
    arg = _mee_24;
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
    if (cond1)
      {
        res = num;
      }
    else
      if (cond2)
        {
          res = numPlusOne;
        }
      else
        {
          cond1 = n != zero;
          while (cond1)
            {
              res = num + numPlusOne;
              num = numPlusOne;
              numPlusOne = res;
              n = n - one;
              cond1 = n != zero;
            }
        }
    bb = this;
    // one = bb.dummy(res,one,two);
    // Possible Targets: 2
    //   class B.dummy
    //   class A.dummy
    // INLINING FAILED
    one = bb.dummy(res,one,two);
    return res;
  }
  public int compute(int val) {
    int res;
    A a;
    // Inlined method: A.fibb
    int _mee_30; // Arg: n
    A _mee_31; // VarDecl: bb
    int _mee_32; // VarDecl: num
    int _mee_33; // VarDecl: numPlusOne
    int _mee_34; // VarDecl: res
    int _mee_35; // VarDecl: zero
    int _mee_36; // VarDecl: one
    int _mee_37; // VarDecl: two
    boolean _mee_38; // VarDecl: cond1
    boolean _mee_39; // VarDecl: cond2
    a = this;
    // res = a.fibb(val);
    // Possible Targets: 1
    //   class A.fibb
    _mee_30 = val; // Arg-Formal: n = val
    _mee_35 = 0;
    _mee_37 = 2;
    _mee_36 = 1;
    _mee_32 = 0;
    _mee_33 = 1;
    _mee_34 = _mee_33;
    _mee_38 = _mee_30 <= _mee_36;
    _mee_39 = _mee_30 <= _mee_37;
    if (_mee_38)
      {
        _mee_34 = _mee_32;
      }
    else
      if (_mee_39)
        {
          _mee_34 = _mee_33;
        }
      else
        {
          _mee_38 = _mee_30 != _mee_35;
          while (_mee_38)
            {
              _mee_34 = _mee_32 + _mee_33;
              _mee_32 = _mee_33;
              _mee_33 = _mee_34;
              _mee_30 = _mee_30 - _mee_36;
              _mee_38 = _mee_30 != _mee_35;
            }
        }
    _mee_31 = a;
    _mee_36 = _mee_31.dummy(_mee_34,_mee_36,_mee_37);
    res = _mee_34;
    return res;
  }
}
class B extends A {
  public int dummy(int a, int b, int c) {
    a = a + b;
    return a;
  }
}
// RTA + SYMTAB
// class A -> (Instantiated)
//  (Parent) : NULL
//  (Fields)
//  (Methods)
//    (dummy : [a=int][b=int][c=int])
//    (compute : [val=int])
//      [res=int]
//      [a=A]
//    (fibb : [n=int])
//      [bb=A]
//      [zero=int]
//      [res=int]
//      [num=int]
//      [one=int]
//      [cond2=boolean]
//      [cond1=boolean]
//      [two=int]
//      [numPlusOne=int]
//    (execute : [a2=int][a3=int][arg=int])
//      [tt=A]
//  (Children): B 
// class B -> (Instantiated)
//  (Parent) : A
//  (Fields)
//  (Methods)
//    (dummy : [a=int][b=int][c=int])
//  (Children): 
// class Test2
//  (Parent) : NULL
//  (Fields)
//  (Methods)
//    (main : )
//      [s=A]
//  (Children): 

