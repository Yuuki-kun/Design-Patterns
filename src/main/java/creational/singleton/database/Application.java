/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.singleton.database;

import java.sql.DatabaseMetaData;

/**
 *
 * @author tongcongminh
 */
public class Application {
    public static void main(String[] args) {
        
        Database db = Database.getInstance();
        db.querySQL("select * from...");
        
        Database db2 = Database.getInstance();
        db2.querySQL("SELECT * FROM ....");
        
        //the db and db1 contain the same object
        System.out.println(db.equals(db2));
        
    }
}
