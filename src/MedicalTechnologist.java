import java.util.List;

public class MedicalTechnologist  {
    private String name;
    private TestLab testLab;
    private List<Patient> patients;

    public MedicalTechnologist() {

    }

    public MedicalTechnologist(String name, TestLab testLab, List<Patient> patients) {
        this.name = name;
        this.testLab = testLab;
        this.patients = patients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestLab getTestLab() {
        return testLab;
    }

    public void setTestLab(TestLab testLab) {
        this.testLab = testLab;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    @Override
    public String toString() {
        return "MedicalTechnologist{" +
                "name='" + name + '\'' +
                ", testLab=" + testLab +
                ", patients=" + patients +
                '}';
    }

    public void medicThread() {
    }
}
