package hcmute.serviecs;

import java.util.List;

import hcmute.models.ProductModels;

public interface IProductService {
	List<ProductModels> findAll();
	void insert(ProductModels model);
	ProductModels findOne(int id);
	List<ProductModels> findbycate (int id);
}
