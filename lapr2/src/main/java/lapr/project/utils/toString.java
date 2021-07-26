package lapr.project.utils;

import java.util.List;
import lapr.project.model.Stand;

/** @author Grupo 18_LAPR2 15-16 */

public class toString {
     
    public static String[] ListaStandsToString(List<Stand> list){
        String[] vec = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            vec[i] = list.get(i).getDescricao();
        }
        return vec;
    }
}