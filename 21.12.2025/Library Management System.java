class Library {
    int bookId;
    String bookName;
    boolean issued;

    void issueBook() {
        issued = true;
    }

    void returnBook() {
        issued = false;
    }

    void display() {
        System.out.println(bookId + " " + bookName + " Issued: " + issued);
    }

    public static void main(String[] args) {
        Library b = new Library();
        b.bookId = 101;
        b.bookName = "Java";
        b.issueBook();
        b.display();
        b.returnBook();
        b.display();
    }
}
