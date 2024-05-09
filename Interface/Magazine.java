public class Magazine extends Book implements BookOperations {
    private String category;
    private boolean pernahDipinjam;
    private boolean pernahDikembalikkan;

    public boolean isPernahDipinjam() {
        return pernahDipinjam;
    }

    public void setPernahDipinjam(boolean pernahDipinjam) {
        this.pernahDipinjam = pernahDipinjam;
    }

    public boolean isPernahDikembalikkan() {
        return pernahDikembalikkan;
    }

    public void setPernahDikembalikkan(boolean pernahDikembalikkan) {
        this.pernahDikembalikkan = pernahDikembalikkan;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Magazine(String title, String author, int year, String category) {
        super(title, author, year);
        setCategory(category);
    }

    @Override
    public void borrowBook() {
        this.setBorrowed(true);
        this.setPernahDipinjam(true);
    }

    @Override
    public void returnBook() {
        this.setBorrowed(false);
        this.setPernahDikembalikkan(true);
    }

    public void display() {
        System.out.println("Title    : " + getTitle());
        System.out.println("Category : " + getTitle());
        System.out.println("Author   : " + getAuthor());
        System.out.println("Year     : " + getYear());
        System.out.println("Borrowed : " + isBorrowed());
    }

}
