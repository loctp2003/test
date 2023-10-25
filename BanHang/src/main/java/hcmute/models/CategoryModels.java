package hcmute.models;

public class CategoryModels {
	private int cateId;
	private String cateName;
	private String img;
	public CategoryModels(int cateId, String cateName, String img) {
		super();
		this.cateId = cateId;
		this.cateName = cateName;
		this.img = img;
	}
	public CategoryModels() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCateId() {
		return cateId;
	}
	public void setCateId(int cateId) {
		this.cateId = cateId;
	}
	public String getCateName() {
		return cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "CategoryModels [cateId=" + cateId + ", cateName=" + cateName + ", img=" + img + "]";
	}
}
