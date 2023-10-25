package hcmute.models;

public class ProductModels {
	public ProductModels(int prodId, String prodName, String des, int price, String img, int cateId, int sellerId,
			int amount, int stoke) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.des = des;
		this.price = price;
		this.img = img;
		this.cateId = cateId;
		this.sellerId = sellerId;
		this.amount = amount;
		this.stoke = stoke;
	}
	public ProductModels() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int prodId;
	private String prodName;
	private String des;
	private int price;
	private String img;
	private int cateId;
	private int sellerId;
	private int amount;
	private int stoke;
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getCateId() {
		return cateId;
	}
	public void setCateId(int cateId) {
		this.cateId = cateId;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getStoke() {
		return stoke;
	}
	public void setStoke(int stoke) {
		this.stoke = stoke;
	}
	@Override
	public String toString() {
		return "ProductModels [prodId=" + prodId + ", prodName=" + prodName + ", des=" + des + ", price=" + price
				+ ", img=" + img + ", cateId=" + cateId + ", sellerId=" + sellerId + ", amount=" + amount + ", stoke="
				+ stoke + "]";
	}
	

}
