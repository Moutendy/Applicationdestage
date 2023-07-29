package map.constante;

public class QueryMessage {
    public static final String list_message_recu_by_encadrant="select st.*,sms.message from stagiaire st" +
            "join encadrant as e on st.encadrant = e.id" +
            "join messenger as sms on sms.issue = st.email" +
            "where e.email =:email";
    public static final String message_recu_inbox="select sms.message from messenger sms " +
            "join stagiaire as st on st.email = sms.issue" +
            " where sms.recipient =:email and sms.issue =:emailstagiare";
}
