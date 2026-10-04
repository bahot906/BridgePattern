public interface MessageSender {
    void sendMessage(String recipient, String subject, String body);
}