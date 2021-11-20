package Datos;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sf;

    static {
        try {
            //Crea la conexión en un metodo estatico.
            sf = new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            System.out.println("Error al realizar la conexión " + e);
        }
    }

    //Creamos un metodo para recoger la conexión
    public static SessionFactory getSessionFactory() {
        return sf;
    }

}
