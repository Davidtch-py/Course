package model;
import view.Iomanager;

import java.util.Arrays;
import java.util.Random;
import javafx.concurrent.Worker;
import javafx.scene.control.IndexRange;


public class Course {
    private String name;
    private double notes [] ;
    public final static int MAX= 3;

    public Course(String name, double[] notes) {
        notes = new double [MAX];
        for (int i = 0; i < notes.length; i++) {
            notes[i] = 0;
        }
    }
    public Course(double[] notes) {
        this.notes = notes;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getNotes() {
        return notes;
    }

    public void setNotes(double[] notes) {
        this.notes = notes;
    }




    public double calculateAverage() {
        double sum = 0;
        for (int i = 0; i < notes.length; i++)
            sum += notes[i];
        return sum/notes.length;
    }

    public String showNotes() {
        String msg = "";
        for (int i = 0; i < notes.length; i++) {
            msg += notes[i] + "";
        }
        return msg;
    }
    // vector a string
    public String showNotes2() {
        return notes.toString();
    }


    // estudiantes encima del promedio
    public int studentsAboveAverage() {
        int count = 0;
        double average = calculateAverage();
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] > average)
                count++;
        }
        return count;
    }
    //cuantos pasaron
    public int studentsPassed() {
        int count = 0;
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] >= 3)
                count++;
        }
        return count;
    }
    //cual *fue la mayor nota

    public int highestNote() {
        double highest = notes[0];
        int position= 0;
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] > highest)
                highest = notes[i];
                position = i;
        }
        return position;
    }
    //cual fue la menor nota
    public int lowestNote() {
        double lowest = notes[0];
        int position= 0;
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] < lowest)
                lowest = notes[i];
                position = i;
        }
        return position;
    }

    //mostrar la ubicacion de la nota
    public int searchNote() {
        Iomanager io = new Iomanager();
        int count = -1;
        double note = io.readDouble("ingrese la nota a buscar: ");
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] == note)
                count = i;
        }
        return count;
    }
    //mostrar la ubicacion de la nota con libreria
    public int searchNote2(){
        Iomanager io = new Iomanager();
        double note = io.readDouble("ingrese la nota a buscar: ");
        return java.util.Arrays.binarySearch(notes, note);
    }   

    //usuario llene las notas
    public void fillNotes() {
        Iomanager io = new Iomanager();
        for (int i = 0; i < notes.length; i++) {
            notes[i] = io.readDouble("ingrese la nota: ");
        }
    }


    //ordenar notas
    public double[] ordenadasnotas2(double[] notes) {
        double aux;
        for (int i = 0; i < notes.length; i++) {
            for (int j = 0; j < notes.length; j++) {
                if (notes[i] < notes[j]) {
                    aux = notes[i];
                    notes[i] = notes[j];
                    notes[j] = aux;
                }
            }
        }
        return notes;
    }
    

    
}
