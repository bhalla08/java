public class STRICTFP_KEYWORD {
    //LEGAL
    strictfp class A{}//strictfp applied on class
    strictfp interface M{}//strictfp applied on interface
    class A1{ strictfp void m(){}}//strictfp applied on method



    //ILLEGAL
     //The strictfp keyword cannot be applied on abstract methods, variables or constructors.
/*
    class B{
        strictfp abstract void m();//Illegal combination of modifiers
    }
    class B1{
        strictfp int data=10;//modifier strictfp not allowed here
    }
    class B2{
        strictfp B2(){}//modifier strictfp not allowed here
    }


 */
}
// Java strictfp keyword ensures that you will get the same result on every platform if you perform operations in the
// floating-point variable. The precision may differ from platform to platform that is why java programming language
// have provided the strictfp keyword, so that you get same result on every platform. So, now you have better control
// over the floating-point arithmetic.