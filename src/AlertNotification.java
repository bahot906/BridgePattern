public class AlertNotification extends Notification {

    public AlertNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void send(String recipient, String message) {
        String subject = "CRITICAL ALERT";
        String formattedMessage = "!!! " + message + " !!!";
        sender.sendMessage(recipient, subject, formattedMessage);
    }
}