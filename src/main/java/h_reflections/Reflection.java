package h_reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Patient {

    public void printPublicJournal(){
        System.out.println("Patienten har småbarns-hjärna");
    }

    private void printSecretJournal(){
        System.out.println("Patienten har lyckats skaffa familj och åkt på småbarns-hjärna. Oundvikligt och obotligt.");
    }
}

public class Reflection {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Patient patient = new Patient();
        patient.printPublicJournal();

        Class<Patient> patientClass = Patient.class;
        Method printSecretJournalMethod = patientClass.getDeclaredMethod("printSecretJournal");
        printSecretJournalMethod.setAccessible(true);
        printSecretJournalMethod.invoke(patient);


    }
}