import java.util.List;
import java.util.Map;

public class Lab {

    private String name;
    private Map<TestLab, Double> priceTest;
    private List<MedicalTechnologist> medicalTechnologistList;
    private List<Patient> patientList;
    private Double balanceAmount = 0.0;

    public Lab() {
    }

    public Lab(String name, Map<TestLab, Double> priceTest) {
        this.name = name;
        this.priceTest = priceTest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<TestLab, Double> getPriceTest() {
        return priceTest;
    }

    public void setPriceTest(Map<TestLab, Double> priceTest) {
        this.priceTest = priceTest;
    }

    public List<MedicalTechnologist> getMedicalTechnologistList() {
        return medicalTechnologistList;
    }

    public void setMedicalTechnologistList(List<MedicalTechnologist> medicalTechnologistList) {
        this.medicalTechnologistList = medicalTechnologistList;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }

    public Double getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(Double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    @Override
    public String toString() {
        return "Lab{" +
                "name='" + name + '\'' +
                ", priceTest=" + priceTest +
                ", medicalTechnologistList=" + medicalTechnologistList +
                ", patientList=" + patientList +
                ", balanceAmount=" + balanceAmount +
                '}';
    }
}
