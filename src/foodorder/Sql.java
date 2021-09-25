package foodorder;

import java.sql.*;
class Sql{
    static Connection con;
    public static Connection createConnection()throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "1234");
           // return con;
       } catch (Exception e) {
           System.out.println(e);
        }
        return con;
    }

    public static void addCustomer(CustomerDetails d1) throws SQLException {

        PreparedStatement stmt=con.prepareStatement("insert into customer values(?,?,?,?)");
        stmt.setInt(1,d1.getUserId());
        stmt.setString(1,d1.getName());
        stmt.setLong(1,d1.getPhone_no());
        stmt.setString(1,d1.getPassword());

        int ans=  stmt.executeUpdate();
        System.out.println(ans);

    }
}