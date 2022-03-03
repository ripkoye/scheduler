package main.java;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

import static main.readfile.readfile1.salary;

public class core {
    public static void main(String[]args){
        main.readfile.readfile1 read = new main.readfile.readfile1();
        ArrayList<Float> allsalary = new ArrayList<>();
        allsalary = salary(read.pathSE, 8);
        System.out.println(allsalary);

    }
}
