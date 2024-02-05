package com.oop;

/**
 * @polymorphism many forms
 * 
 *               1.compile time polymorphism
 * 
 *               static polymorphism
 * 
 *               method overloading(achieve)
 * 
 *               by compiler
 * 
 * 
 *               2.runtime polymorphism
 * 
 * 
 *               dynamic polymorphism
 * 
 *               method overriding(achieve)
 * 
 *               by JVM
 * 
 * 
 * 
 * 
 *               =========== method overloading ==============
 * 
 *               -->same name as of class name
 * 
 *               -->same class
 * 
 *               -->different argument
 * 
 *               -no of arg -sequence of arg -type of arg
 * 
 * 
 * 
 *               --return type doesn't affect method overloading
 * 
 *               --we can overload the main method also
 * 
 *               -->automatic promotion to another datatype
 * 
 *               -->if both parent(object class) and child are present it will
 *               call child method with same data type
 * 
 *               -->string and stringBuffer are at same level so null cannot be
 *               refered, if refered ambigious error will occur.
 * 
 * 
 *               -->if two same typeof method are there and having same
 *               parameter like int,float and float,int and we give the
 *               parameter as 10,10 then it will show ambiguous error
 * 
 * 
 *               -->In general varargs get the least priority if no method
 *               matched,the only vararg method will get the chance,beacause int
 *               came in 1.0 version and varargs came in 1.5 version
 * 
 *               =========== method overriding ==============
 * 
 * 
 * 
 *               -->same name as of class name
 * 
 *               -->different class
 * 
 *               -->same argument
 * 
 *               -no of arg -sequence of arg -type of arg
 * 
 *               --> is-a relationship
 * 
 *               -->before java 1.4 they should have same return type
 * 
 *               -->From java 5.0 onwards it is possible to have the different
 *               return type for a overriding method in chid class ,but child's
 *               return type should be sub-type of parent's return type. this
 *               phenomenon is called as covariant return type
 * 
 *               -->The access modifier for an overriding method can allow more
 *               but not less, access than the overridden method.For example a
 *               protected instance method in the super class can be made public
 *               but not private in the subclass.doing so will generate compile
 *               time error ie;the child class should have more scoped access
 *               modifier
 * 
 *               --------------- Exception and Overriding
 *               method--------------------
 * 
 *               -->Rule 1 : If the super-class overridden method does not
 *               throws an exception, subclass overriding method can only throws
 *               the unchecked exception, throwing checked exception will lead
 *               to compile-time error.
 * 
 *               -->Rule 2 : If the super-class overridden method does throws an
 *               exception, subclass overriding method can only throw same,
 *               subclass exception. Throwing parent exception in Exception
 *               hierarchy will lead to compile time error.Also there is no
 *               issue if subclass overridden method is not throwing anyt6
 *               exception
 * 
 * 
 *               ---------- overriding and Abstract method
 * 
 *               --->abstract methods are always overrided
 * 
 *               --->abstract methods in an interface or abstract class are
 *               meant to be overridden in derived concrete classes otherwise
 *               compile-time error will be thrown
 * 
 *               ------- invoking overridden method from
 *               sub-class---------------
 * 					
 * 					-->we can call parent class method in overriding method using super keyword
 * 
 * 					-->we can call the parent class method using child class objwct using super.show();
 */

public class Demo5 {

}
