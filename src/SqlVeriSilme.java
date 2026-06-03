import java.sql.*;

public class SqlVeriSilme {
    public void VeriSilme(String verisilincektablo,int silincekid){

        String connectionUrl = "jdbc:sqlserver://localhost:1433;instanceName=SQLEXPRESS;databaseName=db_biyoMedEkipman;encrypt=true;trustServerCertificate=true;";

        try (Connection con = DriverManager.getConnection(connectionUrl, "VTYS_Proje", "1234");
             Statement stmt = con.createStatement()) {
            String tabloidkolonu;
             ResultSet rssil = stmt.executeQuery("SELECT * FROM "+ verisilincektablo);
            tabloidkolonu = rssil.getMetaData().getColumnName(1);
                    String sqlsil = "DELETE FROM " + verisilincektablo +" WHERE " + tabloidkolonu + " = " +silincekid;
PreparedStatement pssil = con.prepareStatement(sqlsil);
pssil.executeUpdate();


        } catch (Exception e) {
            System.err.println("Bağlantı Hatası: " + e.getMessage());
            e.printStackTrace();
        }
    }
}



