package ohtu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Submission {
    private String student_number;
    private int week;
    private int hours;
    private boolean a1;
    private boolean a2;
    private boolean a3;
    private boolean a4;
    private boolean a5;
    private boolean a6;
    private boolean a7;
    private boolean a8;
    private boolean a9;
    private boolean a10;
    private boolean a11;
    private boolean a12;
    private boolean a13;
    private boolean a14;
    private boolean a15;
    private boolean a16;
    private boolean a17;
    private boolean a18;
    private boolean a19;
    private boolean a20;
    private boolean a21;
    
    
    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    
    public int totalDoneEx(){
        HashMap<Integer,Boolean> exercises= new HashMap<Integer, Boolean>();
        exercises.put(1,a1);
        exercises.put(2,a2);
        exercises.put(3,a3);
        exercises.put(4,a4);
        exercises.put(5,a5);
        exercises.put(6,a6);
        exercises.put(7,a7);
        exercises.put(8,a8);
        exercises.put(9,a9);
        exercises.put(10,a10);
        exercises.put(11,a11);
        exercises.put(12,a12);
        exercises.put(13,a13);
        exercises.put(14,a14);
        exercises.put(15,a15);
        exercises.put(16,a16);
        exercises.put(17,a17);
        exercises.put(18,a18);
        exercises.put(19,a19);
        exercises.put(20,a20);
        exercises.put(21,a21);
        int sumOfExercises = 0;
        for (int i = 1; i < exercises.size(); i++) {
         
            if(exercises.get(i) == true){
                sumOfExercises ++;
            }   
        }
        
        
        return sumOfExercises;
    }
    


    @Override
    public String toString() {

            
        
        return " week "+ week + ": time spent: "+hours+" hours, exercises done: "+this.totalDoneEx();
    }
    
}