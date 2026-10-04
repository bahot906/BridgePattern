public class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String recipient, String subject, String body) {
        System.out.printf("[EMAIL] Sending to %s | Subject: %s | Body: %s%n", recipient, subject, body);
    }
}