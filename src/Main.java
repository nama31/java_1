//public class Main {
//    public static void main(String[] args) {
//        Library bib = new Library();
//        bib.addBook("jk.rowling","harry potter");
//        bib.showBooks();
//        System.out.println(bib.borrowBook("harry potter"));
//        bib.showBooks();
//
//
//    }
//
//}
//
//class Book{
//    String autor;
//    String title;
//    int isAvalible = 0;
//    public Book(String autor, String title){
//        this.autor = autor;
//        this.title = title;
//    }
//
//    public String getAutor() {
//        return autor;
//    }
//
//    public void setAutor(String autor) {
//        this.autor = autor;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public int getIsAvalible() {
//        return isAvalible;
//    }
//
//    public void setIsAvalible(int isAvalible) {
//        this.isAvalible = isAvalible;
//    }
//    public void changeAvalible(){
//        this.isAvalible = 1;
//    }
//    public void giveAvalible(){
//        this.isAvalible = 0;
//    }
//}
//
//
//class Library{
//    Book[] books = new Book[10];
//    int indexIsAvalible = 0;
//
//    public void addBook(String autor,String title){
//        Book newBook = new Book(autor,title);
//        if(books[indexIsAvalible]==null){
//        books[indexIsAvalible] = newBook;
//        indexIsAvalible +=1;}
//        else{
//            for(int i = 0;i<10;i++){
//                if(books[i]==null){
//                    books[i] = newBook;
//                    indexIsAvalible = i+1;
//                }
//            }
//        }
//    }
//
//    public boolean borrowBook(String title){
//        for(int i = 0;i<10;i++){
//            if(books[i].title == title){
//                books[i].changeAvalible();
//                return true;
//            }
//        }
//        return false;
//    }
//    public boolean returnBook(String title){
//        for(int i = 0;i<10;i++){
//            if(books[i].title == title){
//                books[i].giveAvalible();
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public void showBooks(){
//        for(int i = 0;i<10;i++){
//            if(books[i] != null && books[i].getIsAvalible() == 0){
//                System.out.println(books[i].autor+""+books[i].title+""+'\n');
//            }
//        }
//    }
//
//    public void replaceaBook(String title){
//        for(int i = 0;i<10;i++){
//            if(books[i].title.equals(title)){
//                 books[i] = null;
//            }
//        }
//    }
//    public void getBooks(){
//        for(int i =0;i<10;i++){
//            System.out.println(books[i].title+"\n");
//        }
//    }
//
//}

