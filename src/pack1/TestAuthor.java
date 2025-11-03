package pack1;

public class TestAuthor {
    public static void main(String[] args) {
        // Создаем объект Author
        Author author = new Author("John Doe", "john.doe@example.com", 'M');


        System.out.println("Инфо об авторе:");
        System.out.println(author.toString());

        // Тестируем геттеры
        System.out.println("\nТест геттеров:");
        System.out.println("Имя: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Пол: " + author.getGender());

        // Тестируем сеттер
        System.out.println("\nТест сеттера:");
        System.out.println("Изменяем email...");
        author.setEmail("johndoe@newemail.com");
        System.out.println("Новый email: " + author.getEmail());

        // Выводим обновленную информацию
        System.out.println("\nОбновленная информация:");
        System.out.println(author);
    }
}