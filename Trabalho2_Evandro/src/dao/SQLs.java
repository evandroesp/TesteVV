/**
 *
 * @author 0047171
 */

package dao;

public enum SQLs {
    INSERT_CARRO("insert into carro(ano, modelo, montadora, idPlaca) values (?, ?, ?, ?)"), 
    LISTALL_CARRO("select * from carro"),
    UPDATE_CARRO("update carro set ano=?, modelo=?, montadora=?, idPlaca=? where idCarro=?"),
    DELETE_CARRO("delete from carro where idCarro=?"),
    FIND_CARRO("select * from carro where idCarro=?"),
    
    INSERT_PLACA("insert into placa(letras, numeros) values (?, ?)"), 
    LISTALL_PLACA("select * from placa"),
    UPDATE_PLACA("update placa set letras=?, numeros=? where idPlaca=?"),
    DELETE_PLACA("delete from placa where idPlaca=?"),
    FIND_PLACA("select * from placa where idPlaca=?");
   
    private final String sql;
    
    SQLs(String sql){
        this.sql = sql; 
    }

    public String getSql() {
        return sql;
    }    
}

