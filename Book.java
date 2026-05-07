//class Book {
//    String bookTitle = "Без названия";  // стандартное название
//    int pageCount = 100;                // стандартное количество страниц
//}
//class Book {
//
//    private final String bookTitle;
//    private final int pageCount;
//
//    private Book(Builder b) {
//        this.bookTitle = b.bookTitle;
//        this.pageCount = b.pageCount;
//    }
//
//    public String toString() {
//        return "Book: " + bookTitle + ", " + pageCount + " pages.";
//    }
//
//    public static class Builder {
//        private String bookTitle;
//        private int pageCount;
//
//        public Builder setTitle(String title) {
//            bookTitle = title;
//            return this;
//        }
//
//        public Builder setPages(int pages) {
//            pageCount = pages;
//            return this;
//        }
//
//        public Book build() {
//            return new Book(this);
//        }
//    }
//}
//
//class Solution {
//    public static void main(String[] args) {
//        System.out.println(
//                new Book.Builder()
//                        .setTitle("Java Basics")
//                        .setPages(500)
//                        .build()
//        );
//    }
//}
//record Book(String title, String author) {}
//record Book(String title, String author) {}
//record Book(String title, String author) {}
//public class Book {
//    private final String title;
//
//    public Book(String title) {
//        this.title = title;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//}
//class Book {
//    private final String title;
//    private final String author;
//
//    // Конструктор
//    public Book(String title, String author) {
//        this.title = title;
//        this.author = author;
//    }
//
//    // Геттеры
//    public String getTitle() {
//        return title;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//}