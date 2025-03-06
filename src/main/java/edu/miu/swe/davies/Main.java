package edu.miu.swe.davies;

import edu.miu.swe.davies.model.Patient;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        var patients = List.of(
                new Patient("Dave", "Wabuluka", "1234", "dwabuluka@gmail.com","miu address","27/2/1990"),
                new Patient("Dave", "Wabuluka", "1234", "dwabuluka@gmail.com","miu address","27/2/1990"),
                new Patient("Dave", "Wabuluka", "1234", "dwabuluka@gmail.com","miu address","27/2/1990"),
                new Patient("Dave", "Wabuluka", "1234", "dwabuluka@gmail.com","miu address","27/2/1990")
        );
        patients.forEach(System.out::println);
    }
}