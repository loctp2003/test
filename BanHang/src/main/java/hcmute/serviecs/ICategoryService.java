package hcmute.serviecs;

import java.util.List;

import hcmute.models.CategoryModels;

public interface ICategoryService {
	List<CategoryModels> findAll() ;
	void insert(CategoryModels model);
	void delete(int id);
	void update(CategoryModels model);
	CategoryModels findOne(int id);
}
