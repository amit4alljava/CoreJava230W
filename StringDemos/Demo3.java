
public class Demo3 {

	public static void main(String[] args) {
		String x = new String("Hello");
		// Dynamic Query
				String type="mobile";
				String os = "android";
				StringBuffer sql = new StringBuffer("select * from products");
				if(type.length()>0){
					sql.append(" where type=").append(type);
					
				}
				if(os.length()>0){
					sql.append(" and os=").append(os);
				}


	}

}
