public class TelegramSender implements MessageSender {
    @Override
    public void sendMessage(String recipient, String subject, String body) {
        System.out.printf("[TELEGRAM] Sending to %s | [%s] %s%n", recipient, subject.toUpperCase(), body);
    }
}