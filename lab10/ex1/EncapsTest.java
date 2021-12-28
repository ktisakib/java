package lab10.ex1;

class EncapsulationTest{
    private int serialNo;
    private String patientName;
    private int PateintAge;

    //Getter and Setter methods
    public int getSN(){
        return serialNo;
    }

    public String getPateintName(){
        return patientName;
    }

    public int getPateintAge(){
        return PateintAge;
    }

    public void setPateintAge(int newValue){
        PateintAge = newValue;
    }

    public void setPateintName(String newValue){
        patientName = newValue;
    }

    public void setSN(int newValue){
        serialNo = newValue;
    }
}
public class EncapsTest{
    public static void main(String args[]){
         EncapsulationTest obj = new EncapsulationTest();
         obj.setPateintName("Lora");
         obj.setPateintAge(69);
         obj.setSN(112233);
         System.out.println("Employee Name: " + obj.getPateintName());
         System.out.println("Employee SSN: " + obj.getSN());
         System.out.println("Employee Age: " + obj.getPateintAge());
    } 
}