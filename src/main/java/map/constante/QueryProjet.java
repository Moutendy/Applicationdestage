package map.constante;

public class QueryProjet {
    /*les requetes pour afficher les informations sur les stagiares coté stagiaire*/
   public static final String tache_stagiaire="select ta.* from encadrant e join projet as p on e.id = p.idencadrant " +
                                              "join stagiaire as st on st.projet = p.id" +
                                               "join tache ta st on ta.projet = p.id" +
                                               " where st.id =:id";
    public static final String projet_stagiaire="select p.* from encadrant e join projet as p on e.id = p.idencadrant " +
            "join stagiaire as st on st.encadrant = e.id " +
            "where st.id =:id";

    /*les requetes pour afficher les informations sur les stagiares coté encadrant*/
    public static final String list_stagiaire="select st.* from encadrant e join projet as p on e.id = p.idencadrant " +
            "join stagiaire as st on st.encadrant = e.id and st.projet=p.id" +
            "where e.id =:id";
    public static final String projet_stagiaire_for_encadrant="select p.* from encadrant e join projet as p on e.id = p.idencadrant " +
            "join stagiaire as st on st.encadrant = e.id and st.projet=p.id" +
            "where st.id =:id";
    public static final String tache_projet_for_stagiaire="select * from encadrant e join projet as p on e.id = p.idencadrant " +
            "join stagiaire as st on st.encadrant = e.id" +
            " and st.projet=p.id " +
            "join tache ta st on ta.projet =p.id" +
            "where ta.id =:id";
}
