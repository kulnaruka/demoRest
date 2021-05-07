package com.restproject.demorest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AliensRepo {
	

	Connection con = null; 
	ArrayList<Alien> aliens = new ArrayList<Alien>();
	
	public AliensRepo() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "Kul_21513");
			Statement st = con.createStatement();
			String query1 = "select * from sys.restdb";
			ResultSet rs  = st.executeQuery(query1);
			while(rs.next()) {
				Alien a = new Alien();
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setPoint(rs.getInt(3));
				aliens.add(a);
				}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Alien> getAlien(){
		return aliens ;
	}
	
	public Alien getAlien(int id) {
		for(Alien a: aliens) {
			if(a.getId()==id) {
				return a;
			}
		}
		return null;
	}

	public void addAlien(Alien a) {
		String sql = "insert into sys.restdb values(?,?,?)";
		try {
			PreparedStatement st =con.prepareStatement(sql);
			st.setInt(1, a.getId());
			st.setString(2, a.getName());
			st.setInt(3, a.getPoint());
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
