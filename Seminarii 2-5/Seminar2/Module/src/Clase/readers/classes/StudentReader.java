package Clase.readers.classes;

import Clase.Aplicant;
import Clase.Student;
import Clase.readers.ApplicantReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends ApplicantReader {
    public StudentReader(String fileName) {
        super(fileName);
    }
    @Override
    public  List<Aplicant> read() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.fileName));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student aplicant=new Student();
            super.readAplicant(input, aplicant);
            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            aplicant.setAn_studii(an_studii);
            aplicant.setFacultate(facultate);

            studenti.add(aplicant);
        }
        input.close();
        return studenti;
    }
}


