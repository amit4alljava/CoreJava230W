import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
class Order{
	private int oid;
	private String name;
	private ArrayList<Product> productList;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Product> getProductList() {
		return productList;
	}
	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}
	
}
class Product{
	private String name;
	private String desc;
	private String brand;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", desc=" + desc + ", brand=" + brand
				+ "]";
	}
	
}
class Address{
	private String state;
	private String city;
	private String pinCode;
	Address(String state, String city, String pinCode){
		this.state = state;
		this.city = city;
		this.pinCode = pinCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pinCode="
				+ pinCode + "]";
	}
	
}
class ITCustomer{
	private int id;
	private String name;
	
	private HashMap<String,ArrayList<Address>> addressMap ;
	private TreeMap<Integer,Order> orderMap ;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HashMap<String, ArrayList<Address>> getAddressMap() {
		return addressMap;
	}

	public void setAddressMap(HashMap<String, ArrayList<Address>> addressMap) {
		this.addressMap = addressMap;
	}

	public TreeMap<Integer, Order> getOrderMap() {
		return orderMap;
	}

	public void setOrderMap(TreeMap<Integer, Order> orderMap) {
		this.orderMap = orderMap;
	}
	
}
public class Demo {

	public static void main(String[] args) {
		TreeMap<String,ITCustomer> customerMap = new TreeMap<>();
		ITCustomer customer = new ITCustomer();	
		customer.setId(1001);
		customer.setName("Ram");
		Address a1 = new Address("Delhi","Delhi","110007");
		Address a2 = new Address("Delhi","Delhi","110008");
		Address a3 = new Address("Delhi","Delhi","110007");
		ArrayList<Address> addressList = new ArrayList<>();
		addressList.add(a1);
		addressList.add(a2);
		addressList.add(a3);
		HashMap<String,ArrayList<Address>> addressMap = new HashMap<>();
		addressMap.put("office",addressList);
		customer.setAddressMap(addressMap);
		customerMap.put(customer.getName(),customer);
		System.out.println(customerMap.get("Ram")
				.getAddressMap().get("office")
				.get(0));
		
		TreeMap<Integer,Order> orderMap = new TreeMap<>();
		ArrayList<Product> productList = new ArrayList<>();
		Product p1 = new Product();
		p1.setName("Mobile");
		p1.setDesc("Mobile Phone");
		p1.setBrand("Apple");
		Product p2 = new Product();
		p2.setName("Mobile");
		p2.setDesc("Mobile Phone");
		p2.setBrand("Nokia");
		productList.add(p1);
		productList.add(p2);
		Order order = new Order();
		order.setOid(10);
		order.setName("Mobile Order");
		order.setProductList(productList);
		orderMap.put(order.getOid(), order);
		customer.setOrderMap(orderMap);
		System.out.println(customerMap.get("Ram").
				getOrderMap().get(10)
				.getProductList().get(0));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
