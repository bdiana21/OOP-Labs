public class Lucrator {
    String nume;
    CalendarLucru calendar;
    public Lucrator(String nume, CalendarLucru calendar) {
        this.nume = nume;
        this.calendar = calendar;
    }
    public void lucreaza(String zi) throws ExceptieZiNelucratoare
    {
        if(zi.equals("samabata")|| zi.equals("duminica")){
            throw new ExceptieZiNelucratoare("Exceptie: lucru in zi nelucratoare");
        }


    }
}
