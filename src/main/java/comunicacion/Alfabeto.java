package comunicacion;

public class Alfabeto extends Pictograma {
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String interpretacion, String origen, String[] letras) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }
    
    
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    } 
    
    public int cantidadLetras(){
        return letras.length;
    }
    
    @Override
    public String toString(){
        String pantalla = letras[0];
        for (int i=1; i<letras.length; i++){
            pantalla = pantalla + ", " + letras[i];
        }
        return pantalla;
    }
    @Override
    public String interpretacion() {
        return interpretacion;
    }
}
