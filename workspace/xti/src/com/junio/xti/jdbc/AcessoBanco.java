package com.junio.xti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import com.mysql.jdbc.PreparedStatement;

public class AcessoBanco {

	public static void main(String[] args)throws Exception {

		String sql = "select codigo,nome,sexo,email from pessoa";
		String url = "jdbc:mysql://localhost:3306/xti";
		String user = "root";
		String pass = "";
		
		try(Connection con = DriverManager.getConnection(url, user ,pass);
		PreparedStatement stm = (PreparedStatement) con.prepareStatement(sql);
		ResultSet rs = stm.executeQuery()){
			while(rs.next()){
				String s = rs.getString("codigo")
						+"; "+rs.getString("nome")
						+"; "+rs.getString("sexo")
						+"; "+rs.getString("email");
				System.out.println(s);
			}
		}
		
		

	}

}
