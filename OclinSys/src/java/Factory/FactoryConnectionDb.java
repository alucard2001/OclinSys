package Factory;

public class FactoryConnectionDb {

    public static final int PGSQL = 1;
    public static String[] configPGSQL = {"onclinsys", "postgres", "Tatiana17"};

    public static ConnectionDb open(int Typy) {
        try {
            return new PgSQLConnectionFactory(configPGSQL);
        } catch (Exception e) {
            return null;
        }
    }
}
