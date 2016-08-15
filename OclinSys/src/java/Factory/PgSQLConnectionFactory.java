package Factory;

import java.sql.Connection;
import java.sql.DriverManager;



public final class PgSQLConnectionFactory extends ConnectionDb {

   String url = "jdbc:postgresql://localhost:5432/OclinSys";
    String user = "postgres";
    String pass = "infotep";
    public PgSQLConnectionFactory(String[] params) {
        this.params = params;
        this.open();
    }

    @Override
    public Connection open() {
        try {
            Class.forName("org.postgresql.Driver");
               this.connection = DriverManager.getConnection(this.url, this.user, this.pass);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.connection;
    }
}
