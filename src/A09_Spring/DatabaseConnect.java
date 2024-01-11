package A09_Spring;

import java.sql.*;

public class DatabaseConnect extends Print{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/board1?useSSL=false";
        String userName = "root";
        String pw = "1234";
        try {
            Connection connection = DriverManager.getConnection(url, userName, pw);
            print("😁✔🐱‍🚀🐱‍🏍😍 DB 커넥션 성공 😁✔🐱‍🚀🐱‍🏍😍");

//            statement : 쿼리를 담아 DB 로 보낼 수 있는 객체
            Statement st = connection.createStatement();
            String myQuery = "SELECT * FROM author";
            ResultSet rs = st.executeQuery(myQuery);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                print("ID: " + id + ", Name: " + name);
            }
        } catch (SQLException e) {
            print(e.getMessage());
        }
    }
}
