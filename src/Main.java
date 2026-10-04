public class Main {
    public static void main(String[] args) {
        MessageSender emailSender = new EmailSender();
        MessageSender telegramSender = new TelegramSender();

        Notification alert = new AlertNotification(emailSender);
        alert.send("user@example.com", "Unauthorized login attempt detected");

        System.out.println("--> Switching Alert channel to Telegram...");
        alert.setSender(telegramSender);
        alert.send("@security_admin", "Unauthorized login attempt detected");

        System.out.println();

        Notification promo = new PromoNotification(telegramSender);
        promo.send("@john_doe", "Autumn Sale starts now!");

        System.out.println("--> Switching Promo channel to Email...");
        promo.setSender(emailSender);
        promo.send("john@example.com", "Autumn Sale starts now!");
    }
}