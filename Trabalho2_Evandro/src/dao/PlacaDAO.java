/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Placa;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author silviacb
 */
public class PlacaDAO implements GenericDAO<Placa>{
    
    @Override
    public int insert(Placa plc) {
        System.out.println("Inicio Cadastro Placa!");
        int chavePrimaria = -1;
        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt
                = connection.prepareStatement(SQLs.INSERT_PLACA.getSql(),
                        Statement.RETURN_GENERATED_KEYS)) {
            System.out.println("Conexão aberta!");
            stmt.setString(1, plc.getLetras());
            stmt.setInt(2, plc.getNumeros());
            stmt.execute();
            System.out.println("Dados Gravados!");
            ResultSet chaves = stmt.getGeneratedKeys();
            if (chaves.next()) {
                chavePrimaria = chaves.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("exceção com recursos");
        } catch (ClassNotFoundException e) {
            System.out.println("Classe não encontrada!");
        }
        return chavePrimaria;

    }

    @Override
    public List<Placa> listAll() {
        List<Placa> lista = new LinkedList<>();

        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt
                = connection.prepareStatement(SQLs.LISTALL_PLACA.getSql())) {

            System.out.println("Conexão aberta!");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idPlaca = rs.getInt("idPlaca");
                String letras = rs.getString("letras");
                int numeros = rs.getInt("numeros");
                lista.add(new Placa(idPlaca, letras, numeros));
            }
            return lista;
        } catch (SQLException e) {
            System.out.println("Exceção SQL");
        } catch (Exception e) {
            System.out.println("Exceção no código!");
        }
        return null;
    }

    public int update(Placa plc) {
        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt
                = connection.prepareStatement(SQLs.UPDATE_PLACA.getSql())) {
            stmt.setString(1, plc.getLetras());
            stmt.setInt(2, plc.getNumeros());
            stmt.setInt(3, plc.getIdPlaca());
            System.out.println("Conexão aberta! placa" + plc);
            if (stmt.executeUpdate()>0) {
                return 1;
            }
        } catch (SQLException e) {
            System.out.println("Exceção SQL - update, placa");
        } catch (Exception e) {
            System.out.println("Exceção no código! - update, placa");
        }
        return -1;
    }

    public int delete(Placa obj) {
        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt
                = connection.prepareStatement(SQLs.DELETE_PLACA.getSql())) {
            stmt.setInt(1, obj.getIdPlaca());
            System.out.println("ConexÃ£o aberta! Del plc " + obj.getIdPlaca() + obj);
            if (stmt.executeUpdate()>0) {
                //alterado para executeUpdate() pois estava executando e retornando falso;
                System.out.println("Apagado " + obj.getIdPlaca() + obj);
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

    public Placa find(Connection con, int idPlaca) {
        try {
            PreparedStatement stmt
                    = con.prepareStatement(SQLs.FIND_PLACA.getSql());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String letras = rs.getString("letras");
                int numeros = rs.getInt("numeros");
                return new Placa(letras, numeros);
            }
        } catch (SQLException e) {
            System.out.println("Exceção find PlacaDAO");
        }
        return null;
    }

    public Placa findByID(int id) {
        Placa c = null;
        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt
                = connection.prepareStatement(SQLs.FIND_PLACA.getSql())) {
            stmt.setInt(1, id);

            System.out.println("Conexão aberta!");

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String letras = rs.getString("letras");
                int numeros = rs.getInt("numeros");
                c = new Placa(id, letras, numeros);
            }

        } catch (SQLException e) {
            System.out.println("Exceção SQL - findById");
        } catch (Exception e) {
            System.out.println("Exceção no código!- findById");
        }
        return c;
    }
}
