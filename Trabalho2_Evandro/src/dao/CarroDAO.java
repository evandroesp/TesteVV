/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Carro;
import classes.Placa;
import java.sql.*;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author 0047171
 * 
 */
public class CarroDAO implements GenericDAO<Carro> {

    @Override
    public int insert(Carro car) {
        //System.out.println("Inicio Cadastro Carro!");
        int chavePrimaria = -1;
        int idPlaca = new PlacaDAO().insert(car.getPlaca());
        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt
                = connection.prepareStatement(SQLs.INSERT_CARRO.getSql(),
                        Statement.RETURN_GENERATED_KEYS)) {
            System.out.println("Conexão aberta!");
            stmt.setInt(1, car.getAno());
            stmt.setString(2, car.getModelo());
            stmt.setString(3, car.getMontadora());
            stmt.setInt(4, idPlaca);
            stmt.execute();
            System.out.println("Dados Gravados!");
            ResultSet chaves = stmt.getGeneratedKeys();
            if (chaves.next()) {
                chavePrimaria = chaves.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("SQLException CarroDAO insert");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException CarroDAO insert");
        } catch (Exception e) {
            System.out.println("Exception CarroDAO insert");
        }
        return chavePrimaria;

    }

    @Override
    public List<Carro> listAll() {
        List<Carro> lista = new LinkedList<>();

        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt
                = connection.prepareStatement(SQLs.LISTALL_CARRO.getSql())) {

            System.out.println("Conexão aberta!");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                //System.out.println("add. "+ rs.getRow());
                int idCarro = rs.getInt("idCarro");
                int ano = rs.getInt("ano");
                String modelo = rs.getString("modelo");
                String montadora = rs.getString("montadora");
                Placa placa = new PlacaDAO().findByID(rs.getInt("idPlaca"));
                lista.add(new Carro(idCarro, ano, modelo, montadora, placa));
            }
            
            Collections.sort(lista);
            
            return lista;
        } catch (SQLException e) {
            System.out.println("SQLException CarroDAO listAll");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException CarroDAO listAll");
        } catch (Exception e) {
            System.out.println("Exception CarroDAO listAll");
        }
        return null;
    }

    public int update(Carro car) {
        
        Placa plc = car.getPlaca();
        if(plc.update()==-1)
            return -1;
        
        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt
                = connection.prepareStatement(SQLs.UPDATE_CARRO.getSql())) {
            stmt.setInt(1, car.getAno());
            stmt.setString(2, car.getModelo());
            stmt.setString(3, car.getMontadora());
            stmt.setInt(4, plc.getIdPlaca());
            stmt.setInt(5, car.getIdCarro());
            System.out.println("Conexão aberta!");
            if (stmt.execute()) {
                return 1;
            }
        } catch (SQLException e) {
            System.out.println("Exceção SQL - update");
        } catch (Exception e) {
            System.out.println("Exceção no código! - update");
        }
        return -1;
    }

    public int delete(Carro obj) {
        
        Placa plc = obj.getPlaca();
        if(plc.delete()==-1){
            System.out.println("perdeu!" + obj);
            return -1;
        }
        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt
                = connection.prepareStatement(SQLs.DELETE_CARRO.getSql())) {
            stmt.setInt(1, obj.getIdCarro());
            System.out.println("ConexÃ£o aberta!" + obj);
            if (stmt.executeUpdate()>0) {
                System.out.println("Carro apagado");
                return 1;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Exceção SQL - delete");
        } catch (Exception e) {
            System.out.println("Exceção no código! - delete");
        }
        return -1;
    }

    public Carro findByID(int id) {
        Carro car = null;
        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt
                = connection.prepareStatement(SQLs.FIND_CARRO.getSql())) {
            stmt.setInt(1, id);

            System.out.println("Conexão aberta!");

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int ano = rs.getInt("ano");
                String modelo = rs.getString("modelo");
                String montadora = rs.getString("montadora");
                Placa placa = new PlacaDAO().findByID(rs.getInt("idPlaca"));
                car = new Carro(id, ano, modelo, montadora, placa);
            }

        } catch (SQLException e) {
            System.out.println("Exceção SQL - findById");
        } catch (Exception e) {
            System.out.println("Exceção no código!- findById");
        }
        return car;
    }
}
