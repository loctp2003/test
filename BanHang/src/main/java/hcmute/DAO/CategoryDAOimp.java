package hcmute.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import hcmute.models.CategoryModels;

public class CategoryDAOimp implements ICategoryDAO {
	Connection conn=null;
	PreparedStatement ps = null;
	ResultSet rs =null;


	@Override
	public List<CategoryModels> findAll() {
		List<CategoryModels> listCate = new ArrayList<CategoryModels>();
		String sql ="select * from category";
		try {
			new DBConnection();
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next())
			{
				CategoryModels category = new CategoryModels();
				category.setCateId(rs.getInt("CategoryID"));
				category.setCateName(rs.getString("CategoryName"));
				category.setImg(rs.getString("Icon"));
				listCate.add(category);

			}
			conn.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return listCate;
	}

	@Override
	public void insert(CategoryModels model) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO category ( CategoryName, Icon)\r\n"
				+ "VALUES ( ?, ?)";
		try {
			new DBConnection();
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1,model.getCateName());
			ps.setString(2,model.getImg());
			ps.executeUpdate();
			conn.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM category WHERE CategoryID = ?";
		try {
			new DBConnection();
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(CategoryModels model) {
		// TODO Auto-generated method stub
		String sql = "update Category set CategoryName=?, Icon=? where CategoryID=?";
		try {
			new DBConnection();
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, model.getCateName());
			ps.setString(2,model.getImg());
			ps.setInt(3,model.getCateId());
			ps.executeUpdate();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public CategoryModels findOne(int id) {
		// TODO Auto-generated method stub
		String sql = "Select * from category where CategoryID = ?";
		CategoryModels model = new CategoryModels();
		try {
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next())
			{
				model.setCateId(rs.getInt("CategoryID"));
				model.setCateName(rs.getString("CategoryName"));
				model.setImg(rs.getString("icon"));
			}
			conn.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}


}
