/*----------------------------------------------------------------------------------------------------------------------
    Türemiş sınıf türünden referans taban sınıf türünden referansa doğrudan atanabilir (upcasting)
    Çünkü türemiş sınıf nesnesi içerisinde zaten taban sınıf nesnesi vardır. Dolayısıyla o bölümün adresi atandığında
    problem oluşmaz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String [] args)
    {
        B y = new B();
        A x;

        x = y; //upcasting

        y.a = 10;
        y.b = 30;

        System.out.printf("x.a = %d%n", x.a);

        x.a = 45;
        System.out.printf("y.a = %d%n", y.a);

        System.out.println(x == y); //true
    }
}

class A {
    public int a;
}

class B extends A {
    public int b;
}
