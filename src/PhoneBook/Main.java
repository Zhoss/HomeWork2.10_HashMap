package PhoneBook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContactToPhoneBook(new PhoneContact("Русанов Глеб", "89546381623"));
        phoneBook.addContactToPhoneBook(new PhoneContact("Демидов Родион", "89249591966"));
        phoneBook.addContactToPhoneBook(new PhoneContact("Васильев Максим", "89627423731"));
        phoneBook.addContactToPhoneBook(new PhoneContact("Михайлова Таисия", "89878424584"));
        phoneBook.addContactToPhoneBook(new PhoneContact("Гришин Александр", "89523780349"));
        phoneBook.addContactToPhoneBook(new PhoneContact("Павловский Егор", "8967743557"));
        phoneBook.addContactToPhoneBook(new PhoneContact("Смирнова Дарья", "89124709017"));
        phoneBook.addContactToPhoneBook(new PhoneContact("Макаров Николай", "89456967743"));
        phoneBook.addContactToPhoneBook(new PhoneContact("Овчинникова Стефания", "89636872294"));
        phoneBook.addContactToPhoneBook(new PhoneContact("Карасева Вероника", "89442065020"));
        phoneBook.addContactToPhoneBook(new PhoneContact("Баранова Мария", "89685159542"));
        phoneBook.addContactToPhoneBook(new PhoneContact("Гущина Анастасия", "8985845974"));
        phoneBook.addContactToPhoneBook(new PhoneContact("Черкасова Ульяна", "89994721984"));
        phoneBook.addContactToPhoneBook(new PhoneContact("Чернов Алексей", "89714740651"));
        phoneBook.addContactToPhoneBook(new PhoneContact("Соболева Софья", "89545785546"));
        phoneBook.addContactToPhoneBook(new PhoneContact("Панина Марьям", "89621788974"));
        phoneBook.addContactToPhoneBook(new PhoneContact("Платонов Дмитрий", "89997935854"));
        phoneBook.addContactToPhoneBook(new PhoneContact("Акимов Евгений", "89717539395"));
        phoneBook.addContactToPhoneBook(new PhoneContact("Митрофанов Фёдор", "89777023081"));
        phoneBook.addContactToPhoneBook(new PhoneContact("Герасимова Ульяна", "89255413781"));
        phoneBook.printPhoneBook();
    }
}