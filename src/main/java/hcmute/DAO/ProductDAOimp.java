package hcmute.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import hcmute.models.CategoryModels;
import hcmute.models.ProductModels;

public class ProductDAOimp implements IProductDAO {
	ICategoryDAO cateDao = new CategoryDAOimp();
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	public ProductDAOimp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<ProductModels> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from product";
		List<ProductModels> listpro = new ArrayList<ProductModels>();
		try {
			new DBConnection();
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next())
			{
				ProductModels product = new ProductModels();
				product.setProdId(rs.getInt("ProductID"));
				product.setProdName(rs.getString("ProductName"));
				product.setDes(rs.getString("Description"));
				product.setPrice(rs.getInt("Price"));
				product.setImg(rs.getString("imageLink"));
				product.setCateId(rs.getInt("CategoryID"));
				product.setSellerId(rs.getInt("SellerID"));
				product.setAmount(rs.getInt("Amount"));
				product.setStoke(rs.getInt("stoke"));
				listpro.add(product);
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listpro;
	}

	@Override
	public List<ProductModels> findbycate(int id) {
		// TODO Auto-generated method stub
		List<ProductModels> list = new ArrayList<ProductModels>();
		String sql = "select * from product where CategoryID = ?";
		try {
			new DBConnection();
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) 
			{
				ProductModels product = new ProductModels();
				CategoryModels model = cateDao.findOne(rs.getInt("CategoryID"));
				product.setProdId(rs.getInt("ProductID"));
				product.setProdName(rs.getString("ProductName"));
				product.setDes(rs.getString("Description"));
				product.setPrice(rs.getInt("Price"));
				product.setImg(rs.getString("imageLink"));
				product.setCateId(rs.getInt("CategoryID"));
				product.setSellerId(rs.getInt("SellerID"));
				product.setAmount(rs.getInt("Amount"));
				product.setStoke(rs.getInt("stoke"));
				list.add(product);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public ProductModels findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
