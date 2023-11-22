public class Furnizor {
    private String numeSRL;
    private String infoFiscal;
    private int bilant;
    public Furnizor(){
        numeSRL="-";
        infoFiscal="-";
        bilant=0;
    }
    public Furnizor(String numeSRL, String infoFiscal, int bilant){
        this.numeSRL=numeSRL;
        this.infoFiscal=infoFiscal;
        this.bilant=bilant;
    }
    public void setNumeSRL(String numeSRL) {
        this.numeSRL = numeSRL;
    }

    public void setInfoFiscal(String infoFiscal) {
        this.infoFiscal = infoFiscal;
    }

    public void setBilant(int bilant) {
        this.bilant = bilant;
    }

    public String getNumeSRL() {
        return numeSRL;
    }

    public String getInfoFiscal() {
        return infoFiscal;
    }

    public int getBilant() {
        return bilant;
    }

    @Override
    public String toString() {
        return "furnizorul are numele "+numeSRL+", informatia fiscala"+infoFiscal+" si bilantul de "+bilant;
    }
}
