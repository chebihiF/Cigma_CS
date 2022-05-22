public class Customer {
    // Object Attributes
    // visibility type name ;
    private Long id ;
    private String name ;
    private String email ;
    private String phone_number;
    private int age ;

    // Class attributes
    private static int count = 0;

    //Methods
    // => constructor (pas de type, nom de la classe
    public Customer(){ // default
        id = 0L ;
        name = "mohamed";
        email = "mohamed@gmail.com";
        phone_number = "09293902";
        age = 25 ;
        count++;
    }
    public Customer(Long id, String name, String email, String phone_number, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
        this.age = age;
        count++;
    }
    public Customer(Long id, String name, String phone_number, int age) {
        this.id = id;
        this.name = name;
        this.phone_number = phone_number;
        this.age = age;
        this.email = name+"@gmail.com";
        count++;
    }

    // Getters & Setters

    public static int getCount(){
        return count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Email : "+email);
        System.out.println("Phone number : "+phone_number);
        System.out.println("Age : "+age);
    }

    // 1 => customer1 > customer2 | 2 => customer2 > customer1 | 0 => customer1 == customer2
    public static int compareCustomer(Customer c1, Customer c2){
        if(c1.age > c2.age) return 1 ;
        else if(c2.age > c1.age) return 2 ;
        else return 0 ;
    }

}
