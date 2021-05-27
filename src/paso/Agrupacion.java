package paso;

/**
 *
 * @author @diegoacosta127
 */
public class Agrupacion {
    public String nombre;
    public String candidato;
    public int votos;
    public int ID;
    public double porcentaje;
    
    Agrupacion(){
    
    }
    
    Agrupacion(int votos, int ID){
        this.votos = votos;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCandidato() {
        return candidato;
    }

    public void setCandidato(String candidato) {
        this.candidato = candidato;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
}