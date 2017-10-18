package fr.pb.daos;

import fr.pb.entities.Pays;
import java.sql.*;
import java.util.*;

// -----------------
public class PaysDAO {

    /**
     *
     * @param pcnx
     * @return
     */
    public static List<Pays> selectAll(Connection pcnx) {
        List<Pays> liste = new ArrayList();
        Pays pays = null;
        try {
            String lsSQL = "SELECT * FROM pays";
            PreparedStatement lpst = pcnx.prepareStatement(lsSQL);
            ResultSet lrs = lpst.executeQuery();
            while (lrs.next()) {
                pays = new Pays(lrs.getString(1), lrs.getString(2));
                liste.add(pays);
            }

            lrs.close();
            lpst.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return liste;
    } /// selectAll

} /// class