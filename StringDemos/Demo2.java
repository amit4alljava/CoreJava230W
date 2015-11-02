
public class Demo2 {

	public static void main(String[] args) {
		// Dynamic Query
		String type="mobile";
		String os = "android";
		String sql = "select * from products";
		if(type.length()>0){
			sql = sql + " where type="+type;
			
		}
		if(os.length()>0){
			sql = sql + " and os="+os;
		}

	}

}
