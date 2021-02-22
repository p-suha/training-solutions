package exam03retake01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MailBox {

    private List<Mail> mails = new ArrayList<>();


    public void addMail(Mail newMail) {
        mails.add(newMail);
    }

    public List<Mail> getMails() {
        return new ArrayList<>(mails);
    }

    private List<Mail> getMailsByFrom(String searched) {
        List<Mail> results = new ArrayList<>();

        for (Mail m_item : mails) {
            if (m_item.getFrom().getName().contains(searched) || m_item.getFrom().getEmail().contains(searched)) {
                results.add(m_item);
            }
        }

        return results;
    }

    private List<Mail> getMailsByTo(String searched) {
        List<Mail> results = new ArrayList<>();

        for (Mail mail_item : mails) {
            for (Contact contact : mail_item.getTo()) {
                if (contact.getName().contains(searched)) {
                    results.add(mail_item);
                }
            }
        }

        return results;
    }

    private List<Mail> getMailsByContent(String searched) {

        List<Mail> results = new ArrayList<>();
        for (Mail m_item : mails) {

            if (m_item.getMessage().contains(searched) || m_item.getSubject().contains(searched)) {
                results.add(m_item);
            }
        }
        return results;
    }

    public List<Mail> findByCriteria(String searched) {
        String searched_only = searched.substring(searched.indexOf(":") + 1);
        if (searched.startsWith("from:")) {

            return getMailsByFrom(searched_only);
        } else if (searched.startsWith("to:")) {
            return getMailsByTo(searched_only);
        } else {
            return getMailsByContent(searched);
        }
    }
}
