package Clase.readers.classes;

import Clase.Angajat;
import Clase.Aplicant;
import Clase.readers.ApplicantReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends ApplicantReader {

    public AngajatReader(String fileName) {
        super(fileName);
    }

    @Override
    public  List<Aplicant> read() throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(super.fileName));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (input2.hasNext()) {
            String nume = input2.next();
            String prenume = input2.next();
            int varsta = input2.nextInt();
            int punctaj = input2.nextInt();
            int nr = input2.nextInt();
            String[] vect = new String[5];
            for (int i = 0; i < nr; i++)
                vect[i] = input2.next();
            int salariu = input2.nextInt();
            String ocupatie = input2.next();
            Angajat a = new Angajat(nume, prenume, varsta, punctaj, nr, vect, salariu, ocupatie);
            angajati.add(a);
        }
        input2.close();
        return angajati;
    }

}
