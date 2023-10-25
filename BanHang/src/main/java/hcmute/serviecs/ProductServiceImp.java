package hcmute.serviecs;

import java.util.List;

import hcmute.DAO.CategoryDAOimp;
import hcmute.DAO.ICategoryDAO;
import hcmute.DAO.IProductDAO;
import hcmute.DAO.ProductDAOimp;
import hcmute.models.ProductModels;

public class ProductServiceImp implements IProductService {
	IProductDAO pro = new ProductDAOimp();
	public ProductServiceImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<ProductModels> findAll() {
		// TODO Auto-generated method stub
		return pro.findAll();
	}

	@Override
	public void insert(ProductModels model) {
		// TODO Auto-generated method stub

	}

	@Override
	public ProductModels findOne(int id) {
		// TODO Auto-generated method stub
		return pro.findOne(id);
	}

	@Override
	public List<ProductModels> findbycate(int id) {
		// TODO Auto-generated method stub
		return pro.findbycate(id);
	}

}
