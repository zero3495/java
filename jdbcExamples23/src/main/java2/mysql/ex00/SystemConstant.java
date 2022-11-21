package mysql.ex00;

public class SystemConstant {
	
	public static final String HOST = "127.0.0.1";
	public static String user = "root";
	public static String password = "Do!ng123";
	
	public static String dbURL = "jdbc:mysql://" + HOST 
			+ ":3306/cmsdb?useUnicode=yes&characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Taipei&allowPublicKeyRetrieval=true";
	public static String dbURL1 = "jdbc:mysql://" + HOST 
			+ ":3306/cmsdb?user=root&password=Do!ng123&useUnicode=yes&characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Taipei&allowPublicKeyRetrieval=true";
/*jdbc:mysql://127.0.0.1
 * :3306/cmsdb?user=root&password=Do!ng123&
 * useUnicode=yes&characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Taipei&allowPublicKeyRetrieval=true*/	
	static {
		System.out.println("dbURL=" + dbURL);
		System.out.println("user=" + user);
		System.out.println("password=" + password);
	}

	public static String getDbURL() {
		return dbURL;
	}

	public static String getUser() {
		return user;
	}

	public static String getPassword() {
		return password;
	}
}
