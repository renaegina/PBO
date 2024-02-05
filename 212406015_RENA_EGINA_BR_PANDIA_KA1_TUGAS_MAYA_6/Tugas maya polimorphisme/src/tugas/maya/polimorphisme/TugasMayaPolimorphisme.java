/*
 * AUTHOR         : RENA EGINA BR PANDIA
 * TANGGAL        : 12 JUNI 2022
 * TUJUAN PROGRAM : MEMAHAMI POLIMOPRHISM
*/

package tugas.maya.polimorphisme;
class Doll{
    String name, collor;
    int price, size;
    char qcode;
    
    Doll(String name){
        this.name = name;
    }
    
    void named(String name){
        System.out.println("Name   : " + name);
    }
    
    void collored(String collor){
        System.out.println("Collor : " + collor);
    }
    
    void priced(int price){
        System.out.println("Price  : " + "Rp." + price);
    }
    
    void sized(int size){
        System.out.println("Size   : " + size + "cm");
    }
    
    void qcoded(char qcode){
        System.out.println("Qcode  : " + qcode);
    }
}

class Dogdoll extends Doll{
    Dogdoll(String name){
        super(name);
    }
    
    @Override
    void named(String name){
        System.out.println("Name   : " + name);
    }
    
    @Override
    void collored(String collor){
        System.out.println("Collor : " + collor);
    }
    
    @Override
    void priced(int price){
        System.out.println("Price  : " + "Rp." + price);
    }
    
    @Override
    void sized(int size){
        System.out.println("Size   : " + size + "cm");
    }
    
    @Override
    void qcoded(char qcode){
        System.out.println("Qcode  : " + qcode);
    }

    void madein(String madein){
        System.out.println("This dog doll is made in : " + madein);
    } 
}

class Pandadoll extends Dogdoll{
    Pandadoll(String name){
        super(name);
    }

    @Override
    void madein(String madein){
        System.out.println("This panda doll is made in : " + madein);
    }  
}

class Rabbitdoll extends Pandadoll{
    Rabbitdoll(String name){
        super(name);
    }
    @Override
    void madein(String madein){
        System.out.println("This rabbit doll is made in : " + madein);
    }
}

class Bobadoll extends Rabbitdoll{
    Bobadoll(String name){
        super(name);
    }
    @Override
    void madein(String madein){
        System.out.println("This boba doll is made in : " + madein);
    }
}


class Laptop{
    String brand;
    String ram, speed;
    
    Laptop(String brand){
        this.brand = brand;
    }
    
    void brand(String brand){
        System.out.println("Brand : " + brand);
    }
    
    void ram(String ram){
        System.out.println("RAM     : " + ram + "GB");
    }
    
    void speed(String speed){
        System.out.println("Speed   : " + speed + "GHz");
    } 
    
    void graphic(String graphic){
        System.out.println("Graphic : " + graphic);
    }
    
    void processor(String processor){
        System.out.println("Processor : " + processor);
    }
    
    void dstorage(String dualstorage){
        System.out.println("Dual storage : " + dualstorage);
    }
}

class Lenovo extends Laptop{
    Lenovo(String brand){
        super(name);
    }
    @Override
    void brand(String brand){
        System.out.println("Brand : " + brand);
    }
    
    @Override
    void ram(String ram){
        System.out.println("RAM     : " + ram + "GB");
    }
    
    @Override
    void speed(String speed){
        System.out.println("Speed   : " + speed + "GHz");
    }
    
    @Override
    void graphic(String graphic){
        System.out.println("Graphic : " + graphic);
    }

}

class Asus extends Lenovo{
    Asus(String brand){
        super(name);
    }
    
    @Override
    void processor(String processor){
        System.out.println("Processor : " + processor);
    }
}

class Acer extends Asus{
    Acer(String brand){
        super(name);
    }
    
    @Override
    void dstorage(String dualstorage){
        System.out.println("Dual storage : " + dualstorage);
    }
}

class Apple extends Acer{
    Apple(String brand){
        super(name);
    }
    
    @Override
    void processor(String processor){
        System.out.println("Processor : " + processor);
    }
}

class koreanfood{
    String name, taste;
    int price;
    
    koreanfood(String name){
        this.name = name;
    }
    
    void named(){
        System.out.println("Name    : " + name);
    }
    
    void tasted(){
        System.out.println("Taste   : " + taste);
    }
    
    void priced(){
        System.out.println("Price   : " + "Rp." + price);
    }   
   
    void mainingr(String mainingredient){
        System.out.println("The main ingredient for making tteokbokki is : " + mainingredient);
    }
}

class kimchi extends koreanfood{
    kimchi(String name){
        super(name);
    }
    @Override
    void named(){
        System.out.println("Name    : " + name);
    }
    
    @Override
    void tasted(){
        System.out.println("Taste   : " + taste);
    }
    
    @Override
    void priced(){
        System.out.println("Price   : " + "Rp." + price);
    }
    
    @Override
    void mainingr(String mainingredient){
        System.out.println("The main ingredient for making kimchi are : " + mainingredient);
    }
}

class tteokbokki extends kimchi{
    tteokbokki(String name){
        super(name);
}

class jjangmyeon extends tteokbokki{
    jjangmyeon(String name){
        super(name);
}

    @Override
    void mainingr(String mainingredient ){
        System.out.println("The main ingredient for making jjangmyeon is : " + mainingredient);
    }
    
    void tooping(String tooping){
        System.out.println("Tooping : " + tooping);
    }
}

class bungeoppang extends jjangmyeon{
    bungeoppang(String name){
        super(name);
}

    @Override
    void mainingr(String mainingredient){
        System.out.println("The main ingredient for making bungeoppang is : " + mainingredient);
    }
    
    void stuff(String stuffing){
        System.out.println("Stuffing : " + stuffing);
    }
}

public class TugasMayaPolimorphisme {

    public static void main(String[] args) {    
        System.out.println("--------");
        System.out.println("MINISHOP");
        System.out.println("--------");
        Doll doll = new Doll("");
        doll.named("Dog");
        doll.collored("Brown");
        doll.priced(80000);
        doll.sized(30);
        doll.qcoded('B');
        System.out.println("");
        
        doll = new  Pandadoll("");
        doll.named("Panda");
        doll.collored("Black and White");
        doll.priced(120000);
        doll.sized(45);
        doll.qcoded('B');
        System.out.println("");
        
        doll = new Rabbitdoll("");
        doll.named("Rabbit");
        doll.collored("White");
        doll.priced(100000);
        doll.sized(25);
        doll.qcoded('X');
        System.out.println("");
        
        doll = new Bobadoll("");
        doll.named("Boba");
        doll.collored("Brown and White");
        doll.priced(150000);
        doll.sized(100);
        doll.qcoded('Z');
        System.out.println("");
        
       Laptop laptop = new Laptop("");
       laptop.brand("Lenovo Ideapad 320-14iSK");
       laptop.ram("4");
       laptop.speed("2");
       laptop.graphic("GT920M");
       System.out.println("");
       
       laptop.brand("Asus Transformer TP203NAH");
       laptop.ram("4");
       laptop.speed("3");
       laptop.processor("Intel Celeron N4200");
       System.out.println("");
       
       laptop.brand("Acer E5-475G");
       laptop.ram("4");
       laptop.speed("3");
       laptop.dstorage("1TB HDD, 128GD SSD");
       System.out.println("");
       
       laptop.brand("Apple MacBook Air MQD32");
       laptop.ram("8");
       laptop.speed("5");
       laptop.processor("Intel Core i5");
       
       koreanfood korean = new koreanfood("");
       korean.named("Kimchi Chinese Cabbage");
       korean.tasted("Spicy");
       korean.priced("50000");
       
       korean.named("Tteokbokkie");
       korean.tasted("Spicy");
       korean.priced("40000");
       
       korean.named("Jjangmyeon Black Papper");
       korean.tasted("Spicy");
       korean.priced("45000");
       
       korean.named("Bungeoppang");
       korean.tasted("Sweet");
       korean.priced("15000");
       
       
       
       
       
        
    }
    
}
