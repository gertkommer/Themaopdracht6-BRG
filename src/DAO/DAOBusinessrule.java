package DAO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InvalidPropertiesFormatException;

import DButil.*;

public class DAOBusinessrule implements DAO{
	public void fetch(){}
	public ResultSet fetch(Object o) throws FileNotFoundException, InvalidPropertiesFormatException, IOException, SQLException {
		String name = (String)o;
		DBcon db = new Oraclecon();
		Connection con = db.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM Businessrule WHERE name=" + name);
		return rs;
	}
}