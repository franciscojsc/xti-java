package com.junio.xti.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class ContaCRUD {

	public void transferir(Connection con,Conta origem, Conta destino, double valor) throws Exception{
		if(origem.saldo >= valor){
			
			try{
			con.setAutoCommit(false);
			/* SAQUE*/
			origem.saldo -= valor;
			alterar(con, origem);
			
			//int x = 1/0;
			
			/*DEPÓSITO*/
			destino.saldo += valor;
			alterar(con, destino);
			
			con.commit();//para confirmar a transação
			}catch(Exception e){
				
				con.rollback();//para desfazer a transação
				
			} 
		}
		
	}
	
	
	
	public void criar(Connection con, Conta conta) throws SQLException {
		String sql = "insert into conta values(?,?,?)";
		try (PreparedStatement stm = (PreparedStatement) con.prepareStatement(sql)) {
			stm.setInt(1, conta.numero);
			stm.setString(2, conta.cliente);
			stm.setDouble(3, conta.saldo);
			stm.executeUpdate();
		}

	}
	
	public void alterar(Connection con, Conta conta) throws SQLException {
		String sql = "update conta set cliente = ?, saldo = ? where numero = ?";
		try (PreparedStatement stm = (PreparedStatement) con.prepareStatement(sql)) {
			stm.setString(1, conta.cliente);
			stm.setDouble(2, conta.saldo);
			stm.setInt(3, conta.numero);
			stm.executeUpdate();
		}

	}
	
	public void excluir (Connection con, Conta conta) throws SQLException {
		String sql = "delete from conta where numero =?";
		try (PreparedStatement stm = (PreparedStatement) con.prepareStatement(sql)) {
			stm.setInt(1, conta.numero);
			stm.executeUpdate();
		}

	}

	public List<Conta> ler(Connection con) throws SQLException {
		List<Conta> lista = new ArrayList<>();
		String sql = "select numero, cliente,saldo from conta";
		try (PreparedStatement stm = (PreparedStatement) con.prepareStatement(sql); ResultSet rs = stm.executeQuery()) {
			while (rs.next()) {
				lista.add(new Conta(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
			}
		}
		return lista;
	}

	public static void main(String[] args) throws Exception {

		String sql = "insert into pessoa values(?,?,?,?)";
		String url = "jdbc:mysql://localhost:3306/xti";
		String user = "root";
		String pass = "";

		try (Connection con = (Connection) DriverManager.getConnection(url, user, pass);
				PreparedStatement stm = (PreparedStatement) con.prepareStatement(sql);) {
			
			ContaCRUD crud = new ContaCRUD();
			
			
			List<Conta> contas = crud.ler(con);
			for (Conta conta : contas) {
				System.out.println(conta);
			}
		
			Conta origem = contas.get(0);
			Conta destino = contas.get(1);
			
			crud.transferir(con, origem, destino, 50);
			
		    contas = crud.ler(con);
			for (Conta conta : contas) {
				System.out.println(conta);
			}
		}

	}
}
