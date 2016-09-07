package com.junio.xti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.PreparedStatement;

public class IncluirDados {

	public static void main(String[] args) throws Exception {

		String sql = "insert into pessoa values(?,?,?,?)";
		String url = "jdbc:mysql://localhost:3306/xti";
		String user = "root";
		String pass = "";

		/*
		 * try (Connection con = DriverManager.getConnection(url, user, pass);
		 * PreparedStatement stm = (PreparedStatement)
		 * con.prepareStatement(sql);) {
		 * 
		 * stm.executeUpdate(); }
		 */

		String[] pessoas = { "Sandra", "Beatriz", "Juliana", "Veranda", "Tereza", "Leila" };

		try (Connection con = DriverManager.getConnection(url, user, pass)) {
			
			try (PreparedStatement stm = (PreparedStatement) con.prepareStatement(sql);) {
				for (int i = 0; i < pessoas.length; i++) {
					stm.setInt(1, i + 5);
					stm.setString(2, pessoas[i]);
					stm.setString(3, "F");
					stm.setString(4, pessoas[i].toLowerCase() + "@gogkd.com.br");
					stm.addBatch();
				}
				stm.executeBatch();
			}catch (Exception e) {
			}finally {
				sql = "select nome,email from pessoa";
				
				try(PreparedStatement stm2 = (PreparedStatement) con.prepareStatement(sql)) {
					ResultSet rs = stm2.executeQuery();
					while(rs.next()){
						
						System.out.println(rs.getString(1)+ " : "+ rs.getString(2));
						
					}
				} catch (Exception e2) {
				}
				
			}
			
		}
	}

}
