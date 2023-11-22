
public class Main {
    public static void main(String[] args) {
        Ghiozdan ghiozdan = new Ghiozdan();
        Manual m1 = new Manual("mate");
        Manual m2 = new Manual("info");
        Manual m3 = new Manual("engleza");
        Caiet c1 = new Caiet("mate2");
        Caiet c2 = new Caiet("info2");
        Caiet c3 = new Caiet("engleza2");

        ghiozdan.add(m1);
        ghiozdan.add(m2);
        ghiozdan.add(m3);

        ghiozdan.add(c1);
        ghiozdan.add(c2);
        ghiozdan.add(c3);

        ghiozdan.getNrRechizite();
        ghiozdan.getNrCaiete();
        ghiozdan.getNrManuale();

        ghiozdan.listItems();
        ghiozdan.listCaiet();
        ghiozdan.listManual();
    }
}