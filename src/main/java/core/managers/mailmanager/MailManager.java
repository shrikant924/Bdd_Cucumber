package core.managers.mailmanager;


import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.io.IOException;
import java.util.Properties;


public class MailManager {
    public static void main(String[] args) {
        sendMailWithAttachment();
    }

    public static void sendMail(String subject) {
        String host = MailManagerConfig.getString("mm.host");
        String user = MailManagerConfig.getString("mm.user");
        String password = MailManagerConfig.getString("mm.password");
        String to = MailManagerConfig.getString("recepient");
        String[] toList = to.split("\\|");
        //Get the session object
        Properties props = new Properties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.socketFactory.port", MailManagerConfig.getString("mm.socketFactory.port"));
        props.put("mail.smtp.socketFactory.class", MailManagerConfig.getString("mm.smtp.socketFactory"));
        props.put("mail.smtp.socketFactory.fallback", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.port", MailManagerConfig.getString("mm.smtp.port"));

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(user, password);
                    }
                });

        //Compose the message
        try {
            MimeMessage message = new MimeMessage(session);

            message.setFrom(new InternetAddress(user));
            for (int j = 0; j < toList.length; j++) {
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(toList[j]));
            }
             message.setSubject(subject);
            message.setContent("hello", "text/html");
            message.setText("hello");
            message.saveChanges();

            System.out.println("sending...");
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");

        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }

    public static void sendMailWithAttachment() {


        String host = MailManagerConfig.getString("mm.host");
        String user = MailManagerConfig.getString("mm.user");
        String password = MailManagerConfig.getString("mm.password");
        String subject= MailManagerConfig.getString("subject");
        String to = MailManagerConfig.getString("recepient");
        String[] toList = to.split("\\|");

        //Get the session object
        Properties props = new Properties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.socketFactory.port", MailManagerConfig.getString("mm.socketFactory.port"));
        props.put("mail.smtp.socketFactory.class", MailManagerConfig.getString("mm.smtp.socketFactory"));
        props.put("mail.smtp.socketFactory.fallback", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.port", MailManagerConfig.getString("mm.smtp.port"));

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(user, password);
                    }
                });

        //Compose the message
        try {
            MimeMessage message = new MimeMessage(session);
            MimeBodyPart messageBody = new MimeBodyPart();

            message.setFrom(new InternetAddress(user));
            for (int j = 0; j < toList.length; j++) {
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(toList[j]));
            }
            message.setSubject(subject);

            File file = new File(MailManagerConfig.getString("ReportPath"));
            messageBody.attachFile(file);




            MimeMultipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBody);

            message.setContent(multipart);
            Transport.send(message);

            //Utils.addLog.info("Report mailed successfully...");

        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }
}
