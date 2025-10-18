package Experiment01;

import java.sql.SQLOutput;

public class Student {
    public void identity(String x, int y) {
        String name = x;
        int roll_No = y;
        System.out.println("Name =" + name);
        System.out.println("Roll_No =" + roll_No);
    }
    public void main() {
        Student st = new Student();
        st.identity("Yusuf", 4);

    }
    }

