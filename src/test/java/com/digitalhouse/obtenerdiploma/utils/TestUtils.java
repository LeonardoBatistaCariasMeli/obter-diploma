package com.digitalhouse.obtenerdiploma.utils;

import com.digitalhouse.obtenerdiploma.dto.StudentDTO;
import com.digitalhouse.obtenerdiploma.dto.SubjectDTO;

import java.util.ArrayList;

public interface TestUtils {

    static StudentDTO getStudentDTOAproved() {
        var subjects = new ArrayList<SubjectDTO>();
        subjects.add(new SubjectDTO("Portuguese", 4));
        subjects.add(new SubjectDTO("Math", 4));
        subjects.add(new SubjectDTO("History", 10));
        return new StudentDTO("Leonardo", subjects);
    }

    static String getMessageAproved() {
        return "Leonardo usted ha conseguido el promedio de 6.0";
    }

    static StudentDTO getStudentDTOWithHonors() {
        var subjects = new ArrayList<SubjectDTO>();
        subjects.add(new SubjectDTO("History", 10));
        subjects.add(new SubjectDTO("Math", 10));
        subjects.add(new SubjectDTO("Geographic", 10));

        return new StudentDTO("Leonardo", subjects);
    }

    static String getMessageWithHonor() {
        return "¡Felicitaciones Leonardo! Usted tiene el gran promedio de 10.0";
    }
}
