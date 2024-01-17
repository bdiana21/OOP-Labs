
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Interpret i1 = new Interpret(1, "ana");
        Interpret i2 = new Interpret(2, "dana");
        Interpret i3 = new Interpret(3, "ioana");
        Interpret i4 = new Interpret(4, "carina");
        Interpret i5 = new Interpret(5, "cristina");

        Melodie m1 = new Melodie("pop", i1, 3.5, true);
        Melodie m2 = new Melodie("rock", i2, 5, true);
        Melodie m3 = new Melodie("lemn", i3, 4, false);
        EpisodPodcast e1 = new EpisodPodcast("ep1", i4, 25, true, 2, 1);
        EpisodPodcast e2 = new EpisodPodcast("ep2", i5, 60, false, 10, 3);

        Abonament abonament1 = new Abonament(1, "Premium");
        Abonament abonament2 = new Abonament(2, "Standard");

        Abonat a1 = new Abonat("diana", abonament1);
        Abonat a2 = new Abonat("adina", abonament2);


        ServiciuStreamingAudio clasa1 = new ServiciuStreamingAudio();
        clasa1.adaugaAbonat(a1);
        clasa1.adaugaAbonat(a2);

        clasa1.adaugaInterpret(i1);
        clasa1.adaugaInterpret(i2);
        clasa1.adaugaInterpret(i3);
        clasa1.adaugaInterpret(i4);
        clasa1.adaugaInterpret(i5);

        clasa1.adaugaMaterial(m1);
        clasa1.adaugaMaterial(m2);
        clasa1.adaugaMaterial(m3);
        clasa1.adaugaMaterial(e1);
        clasa1.adaugaMaterial(e2);

        clasa1.afiseazaMateriale();

        //  for(Abonat a:clasa1.getListaAbonati()){
        for (Melodie m : clasa1.getListaMaterialeAudio()) {
            if (a1.ascultaMateriale(m)) {
                m.afiseazaDetalii();
            }
        }
        // }

        for (Abonat a : clasa1.getListaAbonati()) {
            for (Melodie m : clasa1.getListaMaterialeAudio()) {
                if (m instanceof EpisodPodcast) {
                    try {
                        a.adaugaInListaFavoritePodcast((EpisodPodcast) m);
                        System.out.println("Materialul " + m.getTitlu() + " a fost adaugat in lista abonatului " + a.getNume());
                    } catch (PremiumNotEnabledException e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    try {
                        a.adaugaInListaFavoriteMelodii(m);
                        System.out.println("Materialul " + m.getTitlu() + " a fost adaugat in lista abonatului " + a.getNume());

                    } catch (PremiumNotEnabledException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }


        }
        Abonament abonamentNou=new Abonament(3,"Premium");
        clasa1.getListaAbonati().get(1).modificaAbonament(abonamentNou);
        for (Melodie m : clasa1.getListaMaterialeAudio()) {
            if (m instanceof EpisodPodcast) {
                try {
                    a2.adaugaInListaFavoritePodcast((EpisodPodcast) m);
                    System.out.println("Materialul " + m.getTitlu() + " a fost adaugat in lista abonatului " + a2.getNume());
                } catch (PremiumNotEnabledException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                try {
                    a2.adaugaInListaFavoriteMelodii(m);
                    System.out.println("Materialul " + m.getTitlu() + " a fost adaugat in lista abonatului " + a2.getNume());

                } catch (PremiumNotEnabledException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        a1.sorteazaListaFavorite();
        a1.afiseazaListaFavorite();

        Abonament abClonare=new Abonament(4,"Standard");
        a2.getAbonament().clonare(abClonare);

    }}