public class SystemColl {
    public static void main(String[] args) {

    }
}
class Book{
    String title;
    String author;
    int year;
    int price;


    public Book(String title , String author , int year,int price){
        this.year = year;
        this.title = title;
        this.author = author;
        this.price = price;
    }


    public String getInfo(){
        String all = "title:".trim()+title.trim()+"\n"+ "author:".trim() +author.trim()+"\n"+"the year of publish:".trim()+year+"\n"+"price:"+price;
        return all;
    }
    public void ditails(){
        String all = "title:".trim()+title.trim()+"\n"+ "author:".trim() +author.trim()+"\n"+"the year of publish:".trim()+year+"\n"+"price:"+price;
        System.out.println(all);
    }
}

class PrintedBooks extends Book{
        int numOfPages;
        String publisher;
        public PrintedBooks(String author , String title, int year,int price, int numOfPages, String publisher){
            super(title, author, year,price);
            this.numOfPages = numOfPages;
            this.publisher = publisher;

        }

        public String bookInfo(){
            return (getInfo().trim()+"the numbers of this book :"+numOfPages+"\n"+"the publisher:"+publisher);
        }

        public void printBookInfo(){
            System.out.println(bookInfo()+"\n"+bookType());
        }
        public String bookType(){
            return("this is a real book (:");
        }

}

class EBooks extends Book{
    double fileSize;
    String fileFormat;
    public EBooks(String author , String title, int year,int price, double fileSize, String fileFormat){
        super(title, author, year,price);
        this.fileSize = fileSize;
        this.fileFormat = fileFormat;

    }
    public String getBookInfo(){
        return (getInfo().trim() + "the book file size:"+fileSize+"\n"+"the book file format:"+fileFormat);
    }
    public void printBookInfo(){
        System.out.println(getBookInfo()+"\n"+"book type:"+bookType());
    }
    public String bookType(){
        return ("this is a not a real book yf zachem eto nado ne ponimau");
    }

}
