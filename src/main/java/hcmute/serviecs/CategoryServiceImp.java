package hcmute.serviecs;

import java.util.List;

import hcmute.DAO.CategoryDAOimp;
import hcmute.DAO.ICategoryDAO;
import hcmute.models.CategoryModels;

public class CategoryServiceImp implements ICategoryService {
	ICategoryDAO cate = new CategoryDAOimp();
	@Override
	public List<CategoryModels> findAll() {
		return cate.findAll();
	}

	@Override
	public void insert(CategoryModels model) {
		// TODO Auto-generated method stub
		cate.insert(model);

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		cate.delete(id);

	}

	@Override
	public void update(CategoryModels model) {
		// TODO Auto-generated method stub
		CategoryModels old = cate.findOne(model.getCateId());
		old.setCateId(model.getCateId());
		old.setCateName(model.getCateName());
		old.setImg(model.getImg());
		cate.update(model);
	}

	@Override
	public CategoryModels findOne(int id) {
		// TODO Auto-generated method stub
		return cate.findOne(id);
	}

}
