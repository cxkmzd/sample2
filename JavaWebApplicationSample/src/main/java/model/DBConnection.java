package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public Connection getDb(String dbName) throws SQLException, ClassNotFoundException {

        //DB接続用・ユーザ定数
        String url = "jdbc:mySQL://localhost/" + dbName;
        String user = "root";
        String pass = "cxkmzd0627";

        //MySQL に接続する
        Class.forName("com.mysql.cj.jdbc.Driver");

        // データベースに対する処理
        System.out.println("データベースに接続に成功");

        //コネクションを返却
        return DriverManager.getConnection(url, user, pass);
    }
}
