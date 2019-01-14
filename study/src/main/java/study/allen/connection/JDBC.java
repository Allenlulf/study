package study.allen.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
	public static void main(String[] args) throws Exception {
		String URL="jdbc:mysql://localhost:3306/test";
		String user="root";
		String password="root";
		//加载驱动
		Class.forName("java.mysql.jdbc.Driver");
		//获取连接
		Connection con=DriverManager.getConnection(URL, user, password);
		//操作数据库
		Statement statement=con.createStatement();
		//处理结果
		ResultSet rs=statement.executeQuery("select * from user");
		while(rs.next()){
			System.out.println(rs.getString("id")+" : "+rs.getString("name"));
		}
		rs.close();
		statement.close();
		con.close();
	}
}
