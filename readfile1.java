package main.readfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class readfile1 {
    public String pathSE = "/Users/School/Desktop/javawork/Scheduler/src/main/resources/Levels_Fyi_salary_Data.csv";
    public String pathDS = "/Users/School/Desktop/javawork/Scheduler/src/main/resources/Data_Science_Jobs_Salaries.csv";


    public static ArrayList<Float>salary(String path, int numberpath){
        ArrayList<Float> arraysalary = new ArrayList<Float>();
        String line;

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            for (int y = 0;(line = br.readLine()) != null;++y) {
                String[]values = line.split(",");
                values[y] = values[y].substring(0,values[y].length()-1);
                Float x = Float.parseFloat((values[numberpath]));
                arraysalary.add(x);
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(NumberFormatException e){
            System.out.println("Number Format Exception");
        }
        catch(Exception e){
            System.out.println("Other exceptions");
        }
        return (arraysalary);
    }


}
