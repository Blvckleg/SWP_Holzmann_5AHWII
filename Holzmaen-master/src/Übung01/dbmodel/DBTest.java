package Übung01.dbmodel;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class DBTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DBManager db=new DBManager();
        Connection con = null;
        try{
            con = db.getConnection();
            System.out.println("Connected");
            Abteilung a1= db.getAbteilungByAid(1,con);
            System.out.println(a1);


        }finally{
            List<Abteilung> l = db.getAbteilungen(con);
            for(Abteilung a : l){
                System.out.println(a);
            }
            if(con != null) db.releaseConnection(con);
        }
        System.out.println("Closed");
    }


}
