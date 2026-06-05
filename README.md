# Biyomedikal-Ekipman-Yonetim-ve-Satis-Sistemi
Problem Tanımı:Bir biyomedikal şirketi için veri tabanı , veri tabanını etkiyecek kod ve son kullanınıcının kullanıcağı bir arayüz oluşturmak amaçlıyoruz.

Yapılan araştırmalar: Normalizasyon kuralları ne olduğunu , buna uygun bir veri tabanı nasıl oluşturulur[^1]. Bir veri tabını ile java nasıl bağlanır ve kodlarken kullanılan syntax[^2]. View , trigger 
ve stored procedure nedir ve nasıl kullanılır[^3].

Akış Şeması:<img width="1081" height="707" alt="Akış-diyagramı-1" src="https://github.com/user-attachments/assets/b3136192-a9ce-44e8-954c-e1d37259a9a4" />
<img width="429" height="796" alt="Akış-diyagramı-3" src="https://github.com/user-attachments/assets/a76a8ac6-8d2f-4d34-9d7e-a621510d4374" />
<img width="459" height="785" alt="Akış-diyagramı-4" src="https://github.com/user-attachments/assets/9953a568-ded9-436e-99d0-9723b274b007" /><img width="587" height="724" alt="Akış-diyagramı-5" src="https://github.com/user-attachments/assets/43441302-34d4-4b80-addb-799eda7a5630" /><img width="195" height="842" alt="Akış-diyagramı-2" src="https://github.com/user-attachments/assets/88bb88eb-babe-4666-b500-2d651562eb98" />


Yazılım Mimarisi:Veri tabanı (MSSQL) --> JDBC --> Java --> Sprint Boot --> HTML

Veri Tabanı Diyagramı:<img width="1068" height="803" alt="ER-3" src="https://github.com/user-attachments/assets/0d03ee91-565e-4ee6-b345-3fb91d05315c" />
<img width="992" height="821" alt="ER-1" src="https://github.com/user-attachments/assets/be0d59f6-f7de-4744-b1a9-e4b2f431f2e6" />

Genel Yapı:Veri tabanını MSSQL ile backendi java ile yazdım. Veri tabanında toplam 11 tablodan oluşuyor. Veri tabanı ile javayı JDBC kullanarak 
bağladım ve sınıflar kullanarak kodu oluşturdum.

Referanslar:([BÖLÜM-4-Veri-Tabanı-Tasarımı-ve-Normalizasyonu .pdf](https://github.com/user-attachments/files/28573773/BOLUM-4-Veri-Tabani-Tasarimi-ve-Normalizasyonu.1.pdf),https://medium.com/baakademi/normali̇zasyon-fe8005778f68)[^1],
(https://www.tutorialspoint.com/jdbc/jdbc-sql-syntax.htm)[^2]
(https://learn.microsoft.com/en-us/sql/sql-server/?view=sql-server-ver17
[7. Hafta SQL'e giriş (DDL,DCL,DML).pdf](https://github.com/user-attachments/files/28573757/7.Hafta.SQL.e.giris.DDL.DCL.DML.pdf))[^3],




