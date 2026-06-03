import java.sql.*;
public class SqlVeriYazdir {
    private String kullanilantablo;
    private int tablouzunlugu;
 public String getKullanilantablo() {
        return kullanilantablo;
    }

    public void setKullanilantablo(String kullanilantablo) {
        this.kullanilantablo = kullanilantablo;
    }

    public void tabloVeriYaz()

    {
        String connectionUrl = "jdbc:sqlserver://localhost:1433;instanceName=SQLEXPRESS;databaseName=db_biyoMedEkipman;encrypt=true;trustServerCertificate=true;";

        try (Connection con = DriverManager.getConnection(connectionUrl, "VTYS_Proje", "1234");
             Statement stmt = con.createStatement()) { String sqlselectionline= "SELECT * FROM " + kullanilantablo;
            ResultSet rs1 = stmt.executeQuery(sqlselectionline);
            tablouzunlugu = rs1.getMetaData().getColumnCount();
            for (int i = 1 ; i < 11 ; i++) {while(rs1.next()) { for (int j = 1 ; j < tablouzunlugu + 1 ; j++) {
                System.out.print(rs1.getObject(j)+" ");
            }
                System.out.println("");
            }
            }



        } catch (Exception e) {
            System.err.println("Bağlantı Hatası: " + e.getMessage());
            e.printStackTrace();
        }
    }
}



