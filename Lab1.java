public class Lab1 {
    public static class Book {


        private int bookId;
        private String bookTitle;
        private String authorName;
        private double price;
        private boolean availabilityStatus;

        // Setter methods
        public void setBookId(int bookId) {
            this.bookId = bookId;
        }

        public void setBookTitle(String bookTitle) {
            this.bookTitle = bookTitle;
        }

        public void setAuthorName(String authorName) {
            this.authorName = authorName;
        }

        public void setPrice(double price) {
            if (price > 0) {
                this.price = price;
            } else {
                System.out.println("Invalid price. Price must be positive.");
            }
        }

        public void setAvailabilityStatus(boolean availabilityStatus) {
            this.availabilityStatus = availabilityStatus;
        }

        // Getter methods
        public int getBookId() {
            return bookId;
        }

        public String getBookTitle() {
            return bookTitle;
        }

        public String getAuthorName() {
            return authorName;
        }

        public double getPrice() {
            return price;
        }

        public boolean isAvailable() {
            return availabilityStatus;
        }
    }


        public static void main(String[] args) {

            Book b = new Book();

            b.setBookId(320);
            b.setBookTitle("Harry Potter");
            b.setAuthorName("J.K Rowling");
            b.setPrice(450.75);
            b.setAvailabilityStatus(true);

            System.out.println("Book ID: " + b.getBookId());
            System.out.println("Book Title: " + b.getBookTitle());
            System.out.println("Author Name: " + b.getAuthorName());
            System.out.println("Price: " + b.getPrice());
            System.out.println("Available: " + b.isAvailable());

            b.setPrice(-100);
        }


}
