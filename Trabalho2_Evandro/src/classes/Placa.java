package classes;

import dao.PlacaDAO;
import java.util.List;

/**
 *
 * @author Silvia Bertagnolli
 * editado por 0047171
 */
public class Placa {
    private int idPlaca;
    private String letras;
    private int numeros;

    public Placa(){}
    public Placa(String letras, int numeros){
        this(-1, letras, numeros);
    }    
    public Placa(int idPlaca, String letras, int numeros) {
        this.idPlaca = idPlaca;
        this.letras = letras;
        this.numeros = numeros;
    }
    
    public int getIdPlaca() {
        return idPlaca;
    }

    public void setIdPlaca(int idPlaca) {
        this.idPlaca = idPlaca;
    }

    public String getLetras() {
        return letras;
    }

    public void setLetras(String letras) {
        this.letras = letras;
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return letras + numeros;
    }  
    
    public int insert() {
        return new PlacaDAO().insert(this);
    }
    public static List<Placa> listAll(){
        return new PlacaDAO().listAll();
    }
    public int update(){
        return new PlacaDAO().update(this);
    }
    public int delete(){
         return new PlacaDAO().delete(this);
    }
    public Placa findByID(){
        return new PlacaDAO().findByID(this.getIdPlaca());
    }

}
