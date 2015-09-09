package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.City;

public interface DBConnection {
	public boolean insert(Object object);
	public Object load(Object object) throws SQLException;
	public void close();
	
}
