package com.elephant.thinkinginjava;

/**
 * Created by elephant on 15/12/14.
 *
 */
public class VarargType {
    static void f(Character... args){
        System.out.print(args.getClass());
        System.out.println("length："+args.length);
    }
    static void g(int... args){
        System.out.print(args.getClass());
        System.out.println("length：" + args.length);
    }
    public static void main(String[] args){
        f('a');
        f();
        g(1);
        g();
        System.out.println("char[]:"+new Character[0].getClass());
        System.out.println("int[]:"+new int[0].getClass());

    }
}
