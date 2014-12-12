package files.classemail;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Email {

    private String toAddress;
    private String fromAddress;
    private String subject;
    private String body;
    private int emailId;
    private String sendDate;


    public Email(){};

    public Email(String toAddress, String fromAddress, String subject, String body, String sendDate, int emailId) {
        this.toAddress = toAddress;
        this.fromAddress = fromAddress;
        this.subject = subject;
        this.body = body;
        this.emailId = emailId;
        this.sendDate = sendDate;
    }

    public String getToAddress() {
        return toAddress;
    }

    @XmlElement
    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    @XmlElement
    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getSubject() {
        return subject;
    }

    @XmlElement
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    @XmlElement
    public void setBody(String body) {
        this.body = body;
    }

    public int getEmailId() {
        return emailId;
    }

    @XmlAttribute
    public void setEmailId(int emailId) {
        this.emailId = emailId;
    }

    public String getSendDate() {
        return sendDate;
    }

    @XmlElement
    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    @Override
    public String toString() {
        return String.format("Email: \nid: %s\nSend date: %s\nFrom Address: %s\nTo Address: %s\nSubject: %s\nBody: %s\n",
                emailId, sendDate, fromAddress, toAddress, subject, body);
    }
}
