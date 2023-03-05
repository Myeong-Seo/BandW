package bandw.project.bandw;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@SpringBootTest
class BandWApplicationTests {

	@Test
	void contextLoads() {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://bw-database.cd6uosjs1jca.ap-northeast-2.rds.amazonaws.com:3380/Mink?autoReconnect=true&serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
			String id = "Mink";
			String pwd = "foqrb123";

			Connection conn = DriverManager.getConnection(url,id,pwd);
			PreparedStatement ps = null;
			ResultSet rs = null;


			String sql = "select * from user";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while(rs.next()){
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3)
				+ " " + rs.getString(4) + " " + rs.getString(5));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally {

		}

	}
}
