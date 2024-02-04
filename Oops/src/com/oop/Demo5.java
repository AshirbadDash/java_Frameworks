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
 *               -->same name as of class name
 * 
 *               -->different class
 * 
 *               -->different argument
 * 
 *               -no of arg -sequence of arg -type of arg
 * 
 * 
 * 
 */

public class Demo5 {

}
