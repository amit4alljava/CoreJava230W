import java.util.ResourceBundle;


public class ObjectFactory {
public static BEntry createObject() throws Exception{
	ResourceBundle r = ResourceBundle.getBundle("objects");
	String className = r.getString("keyobject");
	//BEntry obj = new B();
	BEntry obj = (BEntry)Class.forName(className).newInstance();
	return obj;
}
}
