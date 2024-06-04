public class Main {
    public static void main(String[] args) {
        System.out.println("Representar la diferencia simétrica de 3 conjuntos.");
        String[]setA={"2","4","10","11","12"};
        String[]setB={"30","2","4","55","80","Hola","Chao"};
        String[]setC={"2","33","55","Hola"};
        String[]setFinal={};
        int k=1;
        for(int i=0; i < setA.length ; i++){
            for(int j=0 ;j < setB.length; j++){
                if (setA[i].equals(setB[j])){
                j=7;
                } else{
                    if(j==7){
                        setFinal[k]=setA[i];
                        k=k+1;
                    }

                }

            }

        }

    }
}