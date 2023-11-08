public class NumarComplex {
    private int parteReala;
    private int parteIm;
    public NumarComplex(int parteReala, int parteIm){
        this.parteReala=parteReala;
        this.parteIm=parteIm;
    }
    public NumarComplex adunare(NumarComplex a){
        NumarComplex rezultat=new NumarComplex(parteReala+a.parteReala,parteIm+a.parteIm);
        return rezultat;
    }

    public NumarComplex scadere(NumarComplex a){
        NumarComplex rezultat=new NumarComplex(parteReala-a.parteReala,parteIm-a.parteIm);
        return rezultat;
    }
    public NumarComplex inmultire(int a){
        NumarComplex rezultat=new NumarComplex(parteReala*a,parteIm*a);
        return rezultat;
    }

    @Override
    public String toString() {
        return parteReala+"+"+parteIm+"*i";
    }
}
