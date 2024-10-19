package org.example;

import java.util.ArrayList;

public class CU {
    private String nameCU;
    ArrayList<Mark> marks;
    int totalStudents;

    public CU(String nameCU, int totalStudents) {
        this.nameCU = nameCU;
        this.marks = new ArrayList<>();
        this.totalStudents = totalStudents;
    }

    public void insertMarkCU(int numStudent, double mark){
        Mark m = new Mark(numStudent, mark);
        marks.add(m);
    }

    public double searchStudent(int numStudent){
        for (Mark m : marks){
            if (m.getNumStudent() == numStudent){
                return m.getMark();
            }
        }
        return -1.0;
    }

    public double averageCU(){
        double sum = 0.0;
        for (Mark m : marks){
            sum += m.getMark();
        }
        return sum / marks.size();
    }

    public boolean isApproved(int numStudent){
        for (Mark m : marks){
            if (m.getNumStudent() == numStudent && m.getMark() > 9.5){
                return true;
            }
        }
        return false;
    }
}
