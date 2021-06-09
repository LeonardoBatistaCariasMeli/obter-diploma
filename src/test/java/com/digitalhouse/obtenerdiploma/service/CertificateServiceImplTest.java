package com.digitalhouse.obtenerdiploma.service;

import com.digitalhouse.obtenerdiploma.utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CertificateServiceImplTest {

    private CertificateService service = new CertificateServiceImpl();

    @Test
    public void shouldTestAnalyzeNotesAproved() {

        var dto = TestUtils.getStudentDTOAproved();
        var messageHonor = TestUtils.getMessageWithHonor();

        var obtido = service.analyzeNotes(dto);

        assertEquals(6, obtido.getAverage());
        assertNotEquals(messageHonor, obtido.getMessage());
    }

    @Test
    public void shouldTestAnalyzeNotesAprovedWithHonor() {
        var dto = TestUtils.getStudentDTOWithHonors();
        var messageAproved = TestUtils.getMessageAproved();

        var obtido = service.analyzeNotes(dto);

        assertEquals(10.0, obtido.getAverage());
        assertNotEquals(messageAproved, obtido.getMessage());
    }

    @Test
    public void shouldTestCalculateAvarage() {
        var dto = TestUtils.getStudentDTOWithHonors();
        var obtido = service.analyzeNotes(dto);

        assertEquals(10.0, obtido.getAverage());
        assertNotEquals(6, obtido.getAverage());
    }

    @Test
    public void shouldTestWriteDiplomaAproved() {
        var dto = TestUtils.getStudentDTOAproved();
        var obtido = service.analyzeNotes(dto);

        var messageAproved = TestUtils.getMessageAproved();
        var messageHonor = TestUtils.getMessageWithHonor();

        assertEquals(messageAproved, obtido.getMessage());
        assertNotEquals(messageHonor, obtido.getMessage());
    }

    @Test
    public void shouldTestWriteDiplomaWithHonor() {
        var dto = TestUtils.getStudentDTOWithHonors();
        var obtido = service.analyzeNotes(dto);

        var messageHonor = TestUtils.getMessageWithHonor();
        var messageAproved = TestUtils.getMessageAproved();

        assertEquals(messageHonor, obtido.getMessage());
        assertNotEquals(messageAproved, obtido.getMessage());
    }

    @Test
    public void shouldTestWithHonor() {
        var dto = TestUtils.getStudentDTOWithHonors();
        var obtido = service.analyzeNotes(dto);

        var messageHonor = TestUtils.getMessageWithHonor();
        var messageAproved = TestUtils.getMessageAproved();

        assertEquals(messageHonor, obtido.getMessage());
        assertNotEquals(messageAproved, obtido.getMessage());
    }
}
