# Лабораторная работа № 8. Принципы SOLID

**Автор:** Нарольский Максим Витальевич  
**Группа:** Фит-251  

## Описание работы
Рефакторинг Java-кода с устранением нарушений пяти принципов объектно-ориентированного проектирования SOLID и демонстрацией работы полученных компонентов (JDK 25 LTS):

1. **SRP (Single Responsibility Principle)** — класс `ReportManager` разделён на независимые компоненты: `StatisticsCalculator` (вычисления), `ReportFormatter` (форматирование отчёта) и `ReportFileSaver` (сохранение в файл).
2. **OCP (Open/Closed Principle)** — условное ветвление в `DiscountCalculator` заменено на полиморфизм через интерфейс `DiscountPolicy` (`RegularDiscount`, `VipDiscount`, `SuperVipDiscount`, `StudentDiscount`).
3. **LSP (Liskov Substitution Principle)** — метод `fly()` убран из базового класса `Bird` и вынесен в отдельный интерфейс `Flyable`, благодаря чему подкласс `Penguin` не нарушает контракт базового типа.
4. **ISP (Interface Segregation Principle)** — громоздкий интерфейс `Machine` разделён на узкоспециализированные интерфейсы `Printer`, `Scanner` и `Fax`.
5. **DIP (Dependency Inversion Principle)** — класс `NotificationService` переведён на зависимость от абстракции `MessageSender` (`EmailSender`, `SmsSender`) с передачей реализации через конструктор.

## Сборка и запуск демонстрации

Выполните следующие команды в терминале из корневой директории репозитория:

```bash
# Компиляция всех исходных файлов проекта
javac -d out solid/src/*.java solid/src/srp/*.java solid/src/ocp/*.java solid/src/lsp/*.java solid/src/isp/*.java solid/src/dip/*.java

# Запуск демонстрации всех 5 принципов
java -cp out Main
```
