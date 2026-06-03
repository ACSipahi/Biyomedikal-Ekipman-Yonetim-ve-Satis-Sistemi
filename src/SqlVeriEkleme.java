import java.sql.*;
import java.util.Scanner;

public class SqlVeriEkleme {
   Scanner input = new Scanner(System.in);
    private String eklenekcektablo;
    private int kolonsayisi;
    public String getEklenekcektablo() {
        return eklenekcektablo;
    }

    public void setEklenekcektablo(String eklenekcektablo) {
        this.eklenekcektablo = eklenekcektablo;
    }
public void tabloVeriEkleme(){
    String connectionUrl = "jdbc:sqlserver://localhost:1433;instanceName=SQLEXPRESS;databaseName=db_biyoMedEkipman;encrypt=true;trustServerCertificate=true;";

    try (Connection con = DriverManager.getConnection(connectionUrl, "VTYS_Proje", "1234");
         Statement stmt = con.createStatement()) {
    String sqlsorgu = "SELECT * FROM " + eklenekcektablo;
    ResultSet rs1 = stmt.executeQuery(sqlsorgu);
 kolonsayisi =rs1.getMetaData().getColumnCount();
 rs1.next();
 for (int i = 2 ; i < kolonsayisi + 1 ; i++) {

        System.out.print(rs1.getMetaData().getColumnName(i) + " ");

 }
        System.out.print(" için değerleri girin");
String sqlinsert;
 switch(kolonsayisi) {
     case 2:
         sqlinsert = "INSERT INTO " + eklenekcektablo + " VALUES(?)";
         break;
     case 4:
         sqlinsert = "INSERT INTO " + eklenekcektablo + " VALUES(?,?,?)";
         break;
     case 6 :
         sqlinsert = "INSERT INTO " + eklenekcektablo + " VALUES(?,?,?,?,?)";
         break;
     default :
         sqlinsert = "INSERT INTO " + eklenekcektablo + " VALUES(?)";
 }

 Object eklenecekdeger[] = new Object[kolonsayisi+1];
 for (int i = 1 ; i < kolonsayisi;i++){
     eklenecekdeger[i] = input.next();
 }
        PreparedStatement sqlEkle = con.prepareStatement(sqlinsert);
 for (int i = 1; i < kolonsayisi  ; i++) {
     sqlEkle.setObject(i,eklenecekdeger[i]);
     sqlEkle.executeUpdate();
 }


    } catch (Exception e) {
        System.err.println("Bağlantı Hatası: " + e.getMessage());
        e.printStackTrace();
    }
}
}


