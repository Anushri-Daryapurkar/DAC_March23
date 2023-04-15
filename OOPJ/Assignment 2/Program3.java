class Book{
    private  String title;
    private  String author;
    private  String publisher; 
    private  String isbn;
    private  int year;
    private  double price;
    private  int quantity;

    Book()
    {
    
    }

    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return this.title;
    } 
    public void setAuthor(String author){
        this.author=author;
    }
    public String getAuthor(){
        return this.author;
    } 
    public void setPublisher(String publisher){
        this.publisher=publisher;
    }
    public String getPublisher(){
        return this.publisher;
    } 
    public void setIsbn(String isbn){
        this.isbn=isbn;
    }
    public String getIsbn(){
        return this.isbn;
    } 
    public void setYear( int year){
        this.year=year;
    }
    public int getYear(){
        return this.year;
    } 
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return this.price;
    } 
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public int getQuantity(){
        return this.quantity;
    } 
    

    int increaseQuantity(int quantity ){
        this.quantity=this.quantity+quantity;
        return this.quantity;
    }
    int decreaseQuantity(int quantity ){
        this.quantity=this.quantity-quantity;
        return this.quantity;
    }
    double getInventoryValue(){
        double value = this.quantity * this.price;
        return value;
    }
}

class Program3{
    public static void main(String[] args){
        Book b= new Book();
        b.setTitle("JAVA");
        b.setAuthor("Herbert Schildt");
        b.setPublisher("abcdef");
        b.setIsbn("1234");
        b.setYear(2018);
        b.setPrice(1000);
        b.setQuantity(400);

        String title =b.getTitle();
        String author =b.getAuthor();
        String publisher =b.getPublisher();
        String isbn =b.getIsbn();
        int year=b.getYear();
        double price=b.getPrice();
        int quantity=b.getQuantity();

        int s = b.increaseQuantity(500);
        int d = b.decreaseQuantity(500);
        double v = b.getInventoryValue();
        
        System.out.println("Book Name: "+title);
        System.out.println("Author: "+author);
        System.out.println("Quantity :"+quantity);
        System.out.println("Publisher :"+publisher);
        System.out.println("isbn :"+isbn);
        System.out.println("Year :"+year);
        System.out.println("Price :"+price);

        System.out.println("increasedQuantity: " + s + "  decreasedQuantity: " + d + " Total value: "+ v);
    }
}