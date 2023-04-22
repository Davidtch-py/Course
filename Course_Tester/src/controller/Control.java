package controller;

import java.util.Arrays;

import model.Course;
import view.Iomanager;

public class Control {
    private Iomanager io ;

    public Control() {
        io = new Iomanager();
    }

    public void init() {
        double notes [] = {3.1,2.8, 4.1, 3.0, 2.9,1.4,3.8,1.9,5.0,4.8};
        Course course = new Course(notes);

        // course.fillNotes();
        io.showMessage(Arrays.toString(course.ordenadasnotas2(notes)));
    }
    
}
