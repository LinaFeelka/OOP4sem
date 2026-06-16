public class lab6 {
    //приватные поля
    private String title;
    private String author;
    private int year;
    
    //конструктор, инициализирующий все поля
    public lab6 (String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    //геттеры
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    
    // Сеттеры
    public void setTitle(String title) { this.title = title; }

    public void setAuthor(String author) { this.author = author; }

    public void setYear(int year) { this.year = year; }

    //метод displayInfo(), выводящий информацию о книге
    public void displayInfo() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Год издания: " + year);
    }

    public static void main (String[] args) {
        //объекты класса
        lab6 book1 = new lab6("Нос", "Николай ВасильевичГоголь", 1835);
        lab6 book2 = new lab6("Капитанская дочка", "Александр Сергеевич Пушкин", 1836);

        //вызов методов объктов
        book1.displayInfo();
        System.out.println("");
        book2.displayInfo();
    }
}
