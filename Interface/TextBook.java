public class TextBook extends Book implements BookOperations{
    private String subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public TextBook(String title, String author, int year, String subject){
        super(title, author, year);
        setSubject(subject);
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
        System.out.println("Subject  : " + getSubject());
        System.out.println("Author   : " + getAuthor());
        System.out.println("Year     : " + getYear());
        System.out.println("Borrowed : " + isBorrowed());
 
    }

}
