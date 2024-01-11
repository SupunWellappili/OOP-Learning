# OOP-Learning
Object-Oriented Programming Concepts


**______OOP-(Object Oriented Programming)__________**
1. Encapsulation-ආවරණය කිරීම
2. Inheritance-උරුමය
3. Polymorphism-බහුරූපතාව
4. Abstraction-වියුක්ත කිරීම

/////////////////////////////////////////

complex
reusable

/////////////////////////////////////////

**___________Names_________**

* attributes / variable / proprty / data
* behavior / method / programs
* object (instance of a temple)
* Template / mold (.class)
* Reference variable
* local variable → int volume(stack 1ke sede)

//Template eka kiyanne original class eka
//Object eka kiyanne templete eke clone ekak/blueprint akak. 

/////////////////////////////////////////


case 1
======
x[0]=100; //Arrays waladi asign krna widiya
b1.length =18  //Object waladi asign krna widiya

______Adding a parameterized method__________

case 2 → (Adding a parameterized method)
===================================
ss

________Default Values_________

case 3----(Default Values)
======================
import java.util.*;

class Test {
byte a;
short b;
int c;
long d;
float e;
double f;
char g;
boolean h;
Scanner i;
Random j;
int[] k;
String l;
}


class Demo {
public static void main(String[] args) {
Test t1 = new Test();
System.out.println("byte " + t1.a);
System.out.println("short " + t1.b);
System.out.println("int " + t1.c);
System.out.println("long " + t1.d);
System.out.println("float " + t1.e);
System.out.println("double " + t1.f);
System.out.println("char " + t1.g);


     System.out.println("boolean " + t1.h);
        System.out.println("Scanner " + t1.i);
        System.out.println("Random " + t1.j);
        System.out.println("int[] " + t1.k);
        System.out.println("String " + t1.l);
    }
}

______this______

case 4 → (Key word "this")
=======================
"this" key word aken current object 1ke address aka refer krai
"this" kiyanne variable 1kak aka predefined variable 1kak keyword 1kak.


class Test {
int height;
int width;
int length;


    public void setSize(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }
}


class Demo {
public static void main(String[] args) {
Test d1 = new Test();
d1.setSize(12, 5, 3);
System.out.println(d1.length);
System.out.println(d1.height);
System.out.println(d1.width);
}
}

++++++++++++++++++++++++++++++++++++++++
Result
=====
//local variable 1kai object 1ke thiyena attributes haduna ganna beri wenawa anam attribute hide wenawa amanisai this key word 1ka danne


///////////////////////////////////////
case 5
======
//ss atha

//Test kiyana class aka compile kramai Template create wenne anna template ake thamai object create wenne object 1ka thulai method create wenne..ama nisa template call krnne na call wenne object we..ama nisa template piliwelata thiyenna ona nee

//object 1ke thiyana definition thamai class ake thiyennne

//Template eka kiyanne original class eka
//Object eka kiyanne templete eke clone ekak/Blueprint aka.


///////////////////////////////////////
case 6
======
Adress 1kak thawath Adress 1kakata copy wenwa misak references 1kak thawath reference 1kakta copy wenne nee
b1 = b2; //copy wenawa adrees values to adress values

eg-:
//arrays reference walath values copy wenne naaa address asign wimai wenne



**_____Garbage Collector_____**
* garbage collector software 1ken wenne awashya nethi data nethi krla danawaa.
* Reference varible wala refer wela nethi variable stack aken remove krla danawa..


case 7 → (passing an object into a method)--Same=> Arrays
====================================================
(passing an object into a method )-Calling/Invoke=> Arrays
//Object 1kaka athi values thawath Object 1kakata pass kirimai..anam object 2kak thibe.



case 8 (Return an object from a method)
=================================

case 9
=====
Box b1 = null;//reference variable 1kak initialization krnna puluwan null constand 1ken..null kiyanne compiler receive krpu value 1kak..but Runtime Error wee.
//enam object aken nowa Template(Original Class) aken thama thiyeda blnne..



**_____Object Initialization-(Constructor)_______**

ex-:
Test() {
length = 0;
height = 0;
width = 0;
}

++++++++++++++++++++++++++++++++++++++++++++++

Box b1 = new Box();//-->Box()------>>**_calling Constructor_**

//constructor kiyanne special method 1kak..
//constructor create krnna ona class 1ke name 1kenmai awagema return type 1kak nethuwa.
//constructor kranne object 1kak create  kra compile kra mohothe sita class 1ke defalut values add we...


