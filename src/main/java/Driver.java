import com.notificationSystem.CompositionVersion.EmailNotifier;
import com.notificationSystem.CompositionVersion.Logger;
import com.notificationSystem.CompositionVersion.SMSNotifier;
import com.notificationSystem.InheritanceVersion.*;

public class Driver {
    public static void main(String[] args) {
        /*For Inheritance version
            First stage we can just create a parent class and use it till that no issues will come in design wise
        * */
        Notifier notifier = new SmsNotifier();
        notifier.send("Message to send via SMS");

        notifier = new EmailNotifer();
        notifier.send("Message to send via Mail");

        //Now we wanna add logger/some Instrumental code
        MailLogger logger = new MailLogger();
        logger.send("Message to send via Mail");

        SmsLogger smsLogger = new SmsLogger();
        smsLogger.send("Message to send via SMS");

        /* In the above block we are duplicating the code for just adding one extra feature
           and if we wanna add another feature we have to create a new class and bioler plate
           code getting increased to overcome this problem we have to implement Has-a relationship.
        */

        //Here's how composition works and reducing the code redundancy and also boilerplate code
        com.notificationSystem.CompositionVersion.Notifier compositeNotifier = new EmailNotifier();
        compositeNotifier.send("Message sent via Email composition");

        compositeNotifier = new SMSNotifier();
        compositeNotifier.send("Message sent via SMS composition");

        Logger compositeLogger = new Logger(new EmailNotifier());
        compositeLogger.send("Message will add a logger and send via mail");

        compositeLogger = new Logger(new SMSNotifier());
        compositeLogger.send("Message will add a logger and send via SMS");

        /*
          Using has a relationship in Logger class helps us to reduce creating redundant code and
          helps to maintain the code
        */

    }
}
