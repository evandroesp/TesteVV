package classes;

import dao.CarroDAO;
import java.util.List;

/**
 *
 * @author Silvia Bertagnolli
 * @editado por 0047171
 */
public class Carro implements Comparable<Carro> {

    private int idCarro;
    private int ano;
    private String modelo;
    private String montadora;
    private Placa placa;

    public Carro(){}
    public Carro(int ano, String modelo, String montadora, Placa placa) {
        this(-1, ano, modelo, montadora, placa);
    }
    public Carro(int idCarro, int ano, String modelo, String montadora, Placa placa) {
        this.idCarro = idCarro;
        this.ano = ano;
        this.modelo = modelo;
        this.montadora = montadora;
        this.placa = placa;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public Placa getPlaca() {
        return placa;
    }

    public void setPlaca(Placa placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Carro" + idCarro + "{Ano:" +ano + ", Mod:" + modelo + ", Fab" + montadora + ", Plc:" + placa + '}';
    }

    public int insert() {
        return new CarroDAO().insert(this);
    }
    public static List<Carro> listAll() {
        return new CarroDAO().listAll();
    }
    public int update(){
        return new CarroDAO().update(this);
    }
    public int delete(){
         return new CarroDAO().delete(this);
    }
    public Carro findByID(){
        return new CarroDAO().findByID(this.getIdCarro());
    }

    @Override
    public int compareTo(Carro o) {
        if (this.ano < o.getAno()) {
            return -1;
        }
        if (this.ano > o.getAno()) {
            return 1;
        }
        return 0;
    }

}
