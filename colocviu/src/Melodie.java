public class Melodie {
   private static int materialId=0;
   private String titlu;
   Interpret interpret;
   private double durata;
   private Boolean esteDisponibil;

   public Melodie( String titlu, Interpret interpret, double durata, Boolean esteDisponibil) {
      materialId = materialId+1;
      this.titlu = titlu;
      this.interpret = interpret;
      this.durata = durata;
      this.esteDisponibil = esteDisponibil;
   }

   public int getMaterialId() {
      return materialId;
   }

   public void setMaterialId(int materialId) {
      this.materialId = materialId;
   }

   public String getTitlu() {
      return titlu;
   }

   public void setTitlu(String titlu) {
      this.titlu = titlu;
   }

   public Interpret getInterpret() {
      return interpret;
   }

   public void setInterpret(Interpret interpret) {
      this.interpret = interpret;
   }

   public double getDurata() {
      return durata;
   }

   public void setDurata(double durata) {
      this.durata = durata;
   }

   public Boolean getEsteDisponibil() {
      return esteDisponibil;
   }

   public void setEsteDisponibil(Boolean esteDisponibil) {
      this.esteDisponibil = esteDisponibil;
   }

   public void afiseazaDetalii(){
      String disponibil;
      if(esteDisponibil){
         disponibil="este disponibila";
      }
      else{
         disponibil="nu este disponibila";
      }
      System.out.println("Melodia este "+titlu+" avand interpretul "+ interpret.getNume()+", durata "+ durata+" si  "+disponibil);
   }
}
