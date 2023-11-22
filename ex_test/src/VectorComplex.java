public class VectorComplex {
    NumarComplex[] vector;
    public VectorComplex(int elem){
        vector=new NumarComplex[elem];
    }
    public NumarComplex sumaElemente(){
        NumarComplex rezultat=new NumarComplex(0,0);
        for(int i=0;i<vector.length;i++){
            rezultat=rezultat.adunare(vector[i]);
        }
        return rezultat;
    }

    public VectorComplex suma2Vectori(VectorComplex a){
        VectorComplex rezultat=new VectorComplex(vector.length);
        for(int i=0;i<vector.length;i++){
            rezultat.vector[i]=vector[i].adunare(a.vector[i]);
        }
        return rezultat;
    }
}
