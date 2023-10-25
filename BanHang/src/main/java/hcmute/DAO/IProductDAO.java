package hcmute.DAO;

import java.util.List;

import hcmute.models.ProductModels;

public interface IProductDAO {
	List<ProductModels> findAll();
	ProductModels findOne(int id);
	List<ProductModels> findbycate(int id);
}
