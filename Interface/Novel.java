public class Novel extends Book implements BookOperations{
    private String genre;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Novel(String title, String author, int year, String genre){
        super(title, author, year);
        setGenre(genre);
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

    public void display(){
        System.out.println("Title    : " + getTitle());
        System.out.println("Genre    : " + getGenre());
        System.out.println("Author   : " + getAuthor());
        System.out.println("Year     : " + getYear());
        System.out.println("Borrowed : " + isBorrowed());
    }
}
