package model.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentDaoJDBC implements DepartmentDao{

	private Connection conn;
	
	public DepartmentDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	
	
	@Override
	public void insert(Department obj) {
		
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"INSERT INTO department "
					+ "(Id,Name) "
					+ "VALUES "
					+ "(?, ?)",
					Statement.RETURN_GENERATED_KEYS);
			
			st.setInt(1, obj.getId());
			st.setString(2, obj.getNome());
			
			int rows = st.executeUpdate();
			
			if(rows > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if(rs.next()) {
					int id = rs.getInt(1);
					obj.setId(id);
					DB.closeResultSet(rs);
				}
			}
			else {
				throw new DbException("erro  inesperadoa!  nenhma linha afetada");
			}
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(st);
			
		}
	}

	@Override
	public void update(Department obj) {
		
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"UPDATE department "
					+ "SET Name = ? "
					+ "WHERE Id = ?",
					Statement.RETURN_GENERATED_KEYS);
			
			st.setString(1, obj.getNome());
			st.setInt(2, obj.getId());

			st.executeUpdate();
			
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(st);
			
		}
		
	}

	@Override
	public void deleteById(Integer id) {
		
		
	}

	@Override
	public Department findById(Integer id) {
		
		return null;
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
