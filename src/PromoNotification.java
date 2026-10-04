public class PromoNotification extends Notification {

    public PromoNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void send(String recipient, String message) {
        String subject = "Special Offer for You";
        String formattedMessage = message + "\nUse promo code 'DISCOUNT20' to get 20% off!";
        sender.sendMessage(recipient, subject, formattedMessage);
    }
}