import java.util.List;
import java.util.Map;

public class LabDemo extends Thread {
    public static void main(String[] args) {

        Lab lab = new Lab("Laboratory", Map.of(TestLab.PROTEIN_C, 30.0, TestLab.BLOOD, 50.0, TestLab.PCR, 20.0));

        Patient patient1 = new Patient("Ivan", 1000.0);
        Patient patient2 = new Patient("Peter", 1500.0);
        Patient patient3 = new Patient("Alex", 2500.0);


        MedicalTechnologist medicalTechnologist1 =
                new MedicalTechnologist("Plamen", TestLab.PROTEIN_C, List.of(patient2));
        MedicalTechnologist medicalTechnologist2 =
                new MedicalTechnologist("Nikolai", TestLab.BLOOD, List.of(patient3));
        MedicalTechnologist medicalTechnologist3 =
                new MedicalTechnologist("Milena", TestLab.PCR, List.of(patient1));


        List<Patient> patients = List.of(patient1, patient2, patient3);
        List<MedicalTechnologist> medicalTechnologists = List.of(medicalTechnologist1, medicalTechnologist2, medicalTechnologist3);

        medicPatientLab(patients, medicalTechnologists, lab);
    }


    public static void medicPatientLab(List<Patient> patients, List<MedicalTechnologist> medicalTechnologists, Lab lab) {

        for (MedicalTechnologist medic : medicalTechnologists) {
            if (medic.getTestLab().equals(TestLab.PROTEIN_C)) {
                for (Patient patient : patients) {
                    if (medic.getPatients().contains(patient)) {
                        patient.setAmount(patient.getAmount() - lab.getPriceTest().get(TestLab.PROTEIN_C));
                        lab.setBalanceAmount(lab.getBalanceAmount() + lab.getPriceTest().get(TestLab.PROTEIN_C));
                        System.out.println("MedicalTechnologist-" + medic.getName() + "  " + "Patient-" + patient.getName() + "  "
                                + "Test-" + TestLab.PROTEIN_C.label);
                    }
                }
            } else if (medic.getTestLab().equals(TestLab.BLOOD)) {
                for (Patient patient : patients) {
                    if (medic.getPatients().contains(patient)) {
                        patient.setAmount(patient.getAmount() - lab.getPriceTest().get(TestLab.BLOOD));
                        lab.setBalanceAmount(lab.getBalanceAmount() + lab.getPriceTest().get(TestLab.BLOOD));
                        System.out.println("MedicalTechnologist-" + medic.getName() + "  " + "Patient-" + patient.getName() + "  "
                                + "Test-" + TestLab.BLOOD.label);
                    }
                }
            } else {
                for (Patient patient : patients) {
                    if (medic.getPatients().contains(patient)) {
                        patient.setAmount(patient.getAmount() - lab.getPriceTest().get(TestLab.PCR));
                        lab.setBalanceAmount(lab.getBalanceAmount() + lab.getPriceTest().get(TestLab.PCR));
                        System.out.println("MedicalTechnologist-" + medic.getName() + "  " + "Patient-" + patient.getName() + "  "
                                + "Test-" + TestLab.PCR.label);
                    }
                }
            }
        }

        System.out.println("Patient Balance Amount:" + patients);
        System.out.println("Lab Balance Amount: " + lab.getBalanceAmount());
    }
}





