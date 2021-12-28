package lab6.ex2;

// Class Declaration
class Nomenculture {
    // Instance Variables
    String phylum;
    String family;
    String genus;
    String species;

  
    // method 1
    public String getInfo() {
        return ("Phylum is: "
                + phylum +
        ",Family is:"+family+" ,Genus is:"+genus+" ,species is: "+species);
    }
}
public class Outside{
    public static void main(String[] args) {
        Nomenculture chordata = new Nomenculture();
        chordata.phylum="Chordata";
        chordata.family="Muscicapidae";
        chordata.genus="Copsychus";
        chordata.species="Copsycus saularis";
        System.out.println(chordata.getInfo());
    }
}