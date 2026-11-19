import java.util.List;
import srp.*;
import ocp.*;
import lsp.*;
import isp.*;
import dip.*;

public class Main {
    public static void main(String[] args) {
        // 1. SRP — Единственная ответственность
        System.out.println("=== 1. SRP (Single Responsibility Principle) ===");
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);
        StatisticsCalculator statsCalculator = new StatisticsCalculator();
        ReportFormatter formatter = new ReportFormatter();
        ReportFileSaver fileSaver = new ReportFileSaver();

        int sum = statsCalculator.calculateSum(numbers);
        double avg = statsCalculator.calculateAverage(numbers);
        String report = formatter.format(sum, avg);
        System.out.println(report);
        fileSaver.saveToFile(report, "report.txt");

        // 2. OCP — Открытость / закрытость
        System.out.println("\n=== 2. OCP (Open/Closed Principle) ===");
        DiscountCalculator discountCalculator = new DiscountCalculator();
        double price = 1000.0;
        System.out.println("Regular discount: " + discountCalculator.calculateDiscount(new RegularDiscount(), price));
        System.out.println("VIP discount: " + discountCalculator.calculateDiscount(new VipDiscount(), price));
        System.out.println("Super VIP discount: " + discountCalculator.calculateDiscount(new SuperVipDiscount(), price));
        System.out.println("Student discount: " + discountCalculator.calculateDiscount(new StudentDiscount(), price));

        // 3. LSP — Подстановка Барбары Лисков
        System.out.println("\n=== 3. LSP (Liskov Substitution Principle) ===");
        List<Bird> birds = List.of(new Sparrow(), new Penguin());
        for (Bird bird : birds) {
            bird.eat();
        }
        Flyable flyingBird = new Sparrow();
        flyingBird.fly();

        // 4. ISP — Разделение интерфейсов
        System.out.println("\n=== 4. ISP (Interface Segregation Principle) ===");
        String doc = "Lab_Work_8.pdf";
        Printer simplePrinter = new OldPrinter();
        simplePrinter.print(doc);

        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.print(doc);
        mfp.scan(doc);
        mfp.fax(doc);

        // 5. DIP — Инверсия зависимостей
        System.out.println("\n=== 5. DIP (Dependency Inversion Principle) ===");
        NotificationService emailService = new NotificationService(new EmailSender());
        emailService.notify("Lab work #8 completed successfully!");

        NotificationService smsService = new NotificationService(new SmsSender());
        smsService.notify("Verification code: 2518");
    }
}
