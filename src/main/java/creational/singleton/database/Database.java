/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.singleton.database;

/**
 *
 * @author tongcongminh
 */
public class Database {

    private static Database instance;

    private Database() {
        //some code such as the actual connection to a database server or server socket
        System.out.println("Database private constructor!");
    }
    
    public static Database getInstance(){
        if(Database.instance==null){
            //object that provides the intrinsic lock
            synchronized (Database.class) {
                if(Database.instance==null){
                    Database.instance = new Database();
                }
            }
        }
        return Database.instance;
    }
    
    public void querySQL(String sqlSrt){
        System.out.println("query: "+sqlSrt);
    }
}
