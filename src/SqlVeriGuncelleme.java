import java.sql.*;
public class SqlVeriGuncelleme {
    public void veriGuncelleme(int guncellencekid, Object yenideger,String degistirlecekkolon,String degistirilecektablo) {

        String connectionUrl = "jdbc:sqlserver://localhost:1433;instanceName=SQLEXPRESS;databaseName=db_biyoMedEkipman;encrypt=true;trustServerCertificate=true;";

        try (Connection con = DriverManager.getConnection(connectionUrl, "VTYS_Proje", "1234");
             Statement stmt = con.createStatement()) {
 String idkolonad ;
ResultSet rs1 = stmt.executeQuery("SELECT * FROM " + degistirilecektablo);
idkolonad = rs1.getMetaData().getColumnName(1);
            String sqlGuncelle = "UPDATE "+degistirilecektablo+" SET " + degistirlecekkolon + " = ?" + " WHERE " +idkolonad+ " = " +guncellencekid;
 PreparedStatement psguncelle = con.prepareStatement(sqlGuncelle);
 psguncelle.setObject(1,yenideger);
 psguncelle.executeUpdate();

        } catch (Exception e) {
            System.err.println("Bağlantı Hatası: " + e.getMessage());
            e.printStackTrace();
        }
    }
}




