> # 1. This Keyword in java

### 1. This Keyword is used to refer the current class instance variable.

```java
class Test
{
    int i;
    void setValue(int i)
    {
        this.i=i;
    }
    void show()
    {
        System.out.println(i);
    }
}
class Main
{
    public static void main(String[] args)
    {
        Test t=new Test();
        t.setValue(10);
        t.show();
    }
}
```

---

### Output : 10

---

### 2. This Keyword is used to invoke current class method

     Java is applying default this keyword in methods

```java
class Test
{
    void m1()
    {
        System.out.println("m1 method");
    }
    void m2()
    {
        this.m1();  // this.m1() == m1()
    }
}
class Main
{
    public static void main(String[] args)
    {
        Test t=new Test();
        t.m2();
    }
}
```

---

### Output : m1 method

---

### This Keyword is used to invoke current class constructor

```java
class Test
{
    Test()
    {
        System.out.println("Test1 class constructor");
    }
    Test(int i)
    {
        this();
        System.out.println("Test2 class constructor");
    }
}
class Main
{
    public static void main(String[] args)
    {
        Test t=new Test(10);
    }
}
```

---

### Output : Test1 class constructor <Br>--------- Test2 class constructor

---

## <br><br><br>

> # 2. Super Keyword in java

## 1. Super keyword is used to invoke parent class instance variable

```java
class Test
{
    int a=30;
}
class Main extends Test
{
    int a=20;
    void m1(int a)
    {
    //  System.out.println(a);            10
    //  System.out.println(this.a);       20
        System.out.println(super.a);    //30
    }
    public static void main(String[] args)
    {
        Main m=new Main();
        m.m1(10);
    }
}
```

---

### Output : 30

---

## 2. Super keyword is used to invoke parent class method

### Example :

```java
class Test
{
    void m1()
    {
        System.out.println("I am in class A");
    }
}
class Main extends Test
{
    void m1()
    {
        System.out.println("I am in class B");
    }
    void show()
    {
        m1(); // calling the current class method
        super.m1();  // calling the parent class method
    }
    public static void main(String[] args)
    {
        Main m=new Main();
        m.show();
    }
}
```

---

### Output : I am in class B<Br>--------- I am in class A

---

## 3. Super keyword is used to invoke parent class constructor

    1. super() is used to invoke parent class constructor.
    2. super is a keyword

---

### Example :

```java
class Test
{
    Test()
    {
        System.out.println("I am in class A");
    }
}
class Main extends Test
{
    Main()
    {
        super();
        System.out.println("I am in class B");
    }
    public static void main(String[] args)
    {
        Main m=new Main();
    }
}
```

## <br><br><br>

> # Final Keyword in java

---

### 1. Final keyword is used to make a variable constant.

```java
class Main
{
    final int a=10;
    public static void main(String[] args)
    {
        Main m=new Main();
        m.a=20;
        System.out.println(m.a);
    }
}
```

---

### Output : Error

---

### 2. Final keyword is used to make a method final.

```java
class Main
{
    final void display()
    {
        System.out.println("I am in class B");
    }
}
class B extends Main
{
    void display()
    {
        System.out.println("I am in class A");
    }
    public static void main(String[] args)
    {
        B b=new B();
        b.display();
    }
}
```

---

### Output : Error

---

### 3. Final keyword is used to make a class final.

```java
final class Main
{
    void display()
    {
        System.out.println("I am in class B");
    }
}
class B extends Main
{
    public static void main(String[] args)
    {
        B b=new B();
        b.display();
    }
}

```

---

### Output : Error

---

## <br><br><br>

> # Static keyword in java

### 1. Static keyword is used to make a variable or method as a class variable or class method.

### 2. Static variable or method can be accessed by using class name.

---

## Example 1

    - Static variable can be accessed without creating an object of the class.

```java
class Main
{
    static int a=10;
    void display()
    {
        System.out.println("I am in class B");
    }
}
class B extends Main
{
    public static void main(String[] args)
    {
        B b=new B();
        b.display();
        System.out.println(Main.a);
    }
}

```

---

### Output : I am in class B 10

---

## Example 2

    - Static method can be accessed without creating an object of the class.

```java
class Main
{
    static int a=10;
    static void display()
    {
        System.out.println("I am in class");
    }
}
class B
{
    public static void main(String[] args)
    {
        Main.display();
        System.out.println(Main.a);
    }
}

```

---

### Output : I am in class 10

---

## Example 3

```java
class Employee
{
    int empid;
    String name;
    static String company="TCS";
    Employee(int epmid, String name)
    {
        this.empid=empid;
        this.name=name;
    }
    public void display()
    {
        System.out.println("Employee id : "+empid);
        System.out.println("Employee name : "+name);
        System.out.println("Employee company : "+company);
        System.out.println("");
    }
    public static void main()
    {
        Employee e1=new Employee(101,"Ajay");
        Employee e2=new Employee(102,"Vijay");
        e1.display();
        e2.display();
    }
}
```

---

### Output :

Employee id : 101
Employee name : Ajay
Employee company : TCS

Employee id : 102
Employee name : Vijay
Employee company : TCS

---

### 4. Static method only access static data and static methods.

```java
// Static variable
class StaticDemo
{
    int i=0;
    static void display()
    {
        System.out.println(i);
    }
}
// Static method
class StaticDemo
{
    static void display()
    {
        display1();
        System.out.println("Static method");
    }
    void display1()
    {
        System.out.println("Non static method");
    }
}
```

---

### Output : Error

---
