package paso;

/**
 * @author @diegoacosta127
 */

public class Paso {

    public static void main(String[] args) {
        
        Agrupacion[] votoValido = new Agrupacion[5];
        votoValido[0] = new Agrupacion (1435,1);
        votoValido[1] = new Agrupacion (3472,2);
        votoValido[2] = new Agrupacion (123,3);
        votoValido[3] = new Agrupacion (7891,4);
        votoValido[4] = new Agrupacion (9893,5);
        int totalVotos = 0;
        
        for (int i = 0; i< votoValido.length; i++){
            totalVotos += votoValido[i].getVotos();
        }
        int a = 0;
        for (int i = 0; i<votoValido.length; i++){
            if(votoValido[i].getVotos()>totalVotos*0.015)
                a++;
        }
        Agrupacion[] listaApta = new Agrupacion[a];
        int b=0;
        for (int i = 0; i<votoValido.length; i++){
            if(votoValido[i].getVotos()>totalVotos*0.015){
                listaApta[b] = votoValido[i];
                listaApta[b].setPorcentaje(votoValido[i].getVotos()*100/totalVotos);
                b++;
            }
        }
        Agrupacion aux;
        //System.out.println("Hasta acá no hay error");
        for(int i = 0; i<listaApta.length-1; i++){
            for(int j = i+1; j<listaApta.length; j++ ){
                if(listaApta[i].getVotos()<listaApta[j].getVotos()){
                    aux = listaApta[i];
                    listaApta[i] = listaApta[j];
                    listaApta[j] = aux;
                }
            }
        }
        
        for(int i = 0; i<listaApta.length; i++){
            System.out.println("La lista "+ listaApta[i].getID()+ " obtuvo " + listaApta[i].getPorcentaje()+"% de los votos");
        }
        
        listaApta[0].setCandidato("Mandrake");
        listaApta[0].setNombre("Una manga de ladrones del primero al último");
        System.out.println("La agrupación "+listaApta[0].getNombre()+" con el candidato "+listaApta[0].getCandidato()+" es la que más votos obtuvo con "+listaApta[0].getVotos()+ " votos.");
        
        
    }
    
}