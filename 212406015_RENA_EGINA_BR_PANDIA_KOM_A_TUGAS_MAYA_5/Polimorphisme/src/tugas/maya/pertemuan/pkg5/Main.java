/*
 * AUTHOR         : RENA EGINA BR PANDIA
 * TANGGAL        : 19 MEI 2022
 * TUJUAN PROGRAM : MEMAHAMI INHERITANCE
*/

package tugas.maya.pertemuan.pkg5;

class doll{
    String name, collor;
    int price, size; 
    char qcode;
    
    void named(){
        System.out.println("Name   : " + name);
    }
    
    void collored(){
        System.out.println("Collor : " + collor);
    }
    
    void priced(){
        System.out.println("Price  : " + "Rp." + price);
    } 
    
    void sized(){
        System.out.println("Size   : " + size + "cm");
    }  
    
    void qcoded(){
        System.out.println("Qcode  : " + qcode);
    }
}


class dogdoll extends doll{ 
    String madein = "Korea";
    
    
    void madein(){
        System.out.println("This dog doll is made in : " + madein);
    }    
}

class pandadoll extends doll{
    String madein = "Indonesia";
    
    void madein(){
        System.out.println("This dog doll is made in : " + madein);
    }    
}

class rabbitdoll extends doll{
    String madein = "China";
    
    void madein(){
        System.out.println("This dog doll is made in : " + madein);
    }    
}

class bobadoll extends doll{
    String madein = "Indonesia";
    
    void madein(){
        System.out.println("This boba doll is made in : " + madein);
    }   
}

class laptop{
    String brand;
    int ram, speed;
       
    void brand(){
        System.out.println("Brand   : " + brand);
    }
    
    void ram(){
        System.out.println("RAM     : " + ram + "GB");
    }
    
    void speed(){
        System.out.println("Speed   : " + speed + "GHz");
    } 
}

class lenovo extends laptop{
    String graphic = "GT920M";
    
    void graphic(){
        System.out.println("Graphic : " + graphic);
    }
}

class asus extends laptop{
    String processor = "Intel Celeron N4200";
    
    void processor(){
        System.out.println("Processor : " + processor);
    }
}

class acer extends laptop{
    String dualstorage = "1TB HDD, 128GD SSD";
    
    void dstorage(){
        System.out.println("Dual storage : " + dualstorage);
    }
}

class apple extends laptop{
    String processor = "Intel Core i5";
    
    void processor(){
        System.out.println("Processor : " + processor);
    }
}


class koreanfood{
    String name, taste;
    int price;   
    
    void named(){
        System.out.println("Name    : " + name);
    }
    
    void tasted(){
        System.out.println("Taste   : " + taste);
    }
    
    void priced(){
        System.out.println("Price   : " + "Rp." + price);
    }   
}

class kimchi extends koreanfood{
    String mainingredient = "Chicory or raddish ";
    
    void mainingr(){
        System.out.println("The main ingredient for making kimchi are : " + mainingredient);
    }
}

class tteokbokki extends koreanfood{
    String mainingredient = "Rice flour";
    
    void mainingr(){
        System.out.println("The main ingredient for making tteokbokki is : " + mainingredient);
    }
}

class jjangmyeon extends koreanfood{
    String mainingredient = "Noodles";
    String tooping = "Vegetables and Meat";
    
    void mainingr(){
        System.out.println("The main ingredient for making jjangmyeon is : " + mainingredient);
    }
    
    void tooping(){
        System.out.println("Tooping : " + tooping);
    }
}

class bungeoppang extends koreanfood{
    String mainingredient = "Bread crumbs";
    String stuffing = "Chocolate, chees, or red beans";
    
    void mainingr(){
        System.out.println("The main ingredient for making bungeoppang is : " + mainingredient);
    }
    
    void stuff(){
        System.out.println("Stuffing : " + stuffing);
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t----------");
        System.out.println("\t\t\t\t\t MINISHOP");
        System.out.println("\t\t\t\t\t----------");
        System.out.println("DOLL ");
        System.out.println("=====");
        
        dogdoll doll1 = new dogdoll();
        doll1.name = "Dog ";
        doll1.collor = "Brown";
        doll1.price = 80000;
        doll1.size = 30;
        doll1.qcode = 'B';
        doll1.named();
        doll1.collored();
        doll1.priced();
        doll1.sized();
        doll1.qcoded();
        doll1.madein();
        System.out.println("");
        
        pandadoll doll2 = new pandadoll();
        doll2.name = "Panda";
        doll2.collor = "Black and White";
        doll2.price = 120000;
        doll2.size = 45;
        doll2.qcode = 'A';
        doll2.named();
        doll2.collored();
        doll2.priced();
        doll2.sized();
        doll1.qcoded();
        doll2.madein();
        System.out.println("");
        
        rabbitdoll doll3 = new rabbitdoll();
        doll3.name = "Rabbit";
        doll3.collor = "White";
        doll3.price = 100000;
        doll3.size = 25;
        doll3.qcode = 'X';
        doll3.named();
        doll3.collored();
        doll3.priced();
        doll3.sized();
        doll3.qcoded();
        doll3.madein();      
        System.out.println("");
        
        bobadoll doll4 = new bobadoll();
        doll4.name = "Boba";
        doll4.collor = "Brown and white";
        doll4.price = 150000;
        doll4.size = 100;
        doll4.qcode = 'Z';
        doll4.named();
        doll4.collored();
        doll4.priced();
        doll4.sized();
        doll4.qcoded();
        doll4.madein();      
        System.out.println("");
        
        System.out.println("LAPTOP");
        System.out.println("======");
        lenovo laptop1 = new lenovo();
        laptop1.brand = "Lenovo Ideapad 320-14iSK";
        laptop1.ram = 4;
        laptop1.speed = 2;
        laptop1.brand();
        laptop1.ram();
        laptop1.speed();
        laptop1.graphic();
        System.out.println("");
        
        asus laptop2 = new asus();
        laptop2.brand = "Asus Transformer TP203NAH";
        laptop2.ram = 4;
        laptop2.speed = 3;
        laptop2.brand();
        laptop2.ram();
        laptop2.speed();
        laptop2.processor();
        System.out.println("");
        
        acer laptop3 = new acer();
        laptop3.brand = "Acer E5-475G";
        laptop3.ram = 4;
        laptop3.speed = 3;
        laptop3.brand();
        laptop3.ram();
        laptop3.speed();
        laptop3.dstorage();
        System.out.println("");
        
        apple laptop4 = new apple();
        laptop4.brand = "Apple MacBook Air MQD32";
        laptop4.ram = 8;
        laptop4.speed = 5;
        laptop4.brand();
        laptop4.ram();
        laptop4.speed();
        laptop4.processor();
        System.out.println("");
        
        System.out.println("KOREAN FOOD");
        System.out.println("===========");
        kimchi koreanfood1 = new kimchi();
        koreanfood1. name = "Kimchi Chinese Cabbage";
        koreanfood1.taste = "Spicy";
        koreanfood1.price = 50000;
        koreanfood1.named();
        koreanfood1.tasted();
        koreanfood1.priced();
        koreanfood1.mainingr();
        System.out.println("");
        
        tteokbokki koreanfood2 = new tteokbokki();
        koreanfood2.name = "Tteokbokki";
        koreanfood2.taste = "Spicy";
        koreanfood2.price = 40000;
        koreanfood2.named();
        koreanfood2.tasted();
        koreanfood2.priced();
        koreanfood2.mainingr();
        System.out.println("");
        
        jjangmyeon koreanfood3 = new jjangmyeon();
        koreanfood3.name = "Jjangmyeon Black Papper";
        koreanfood3.taste = "Spicy";
        koreanfood3.price = 45000;
        koreanfood3.named();
        koreanfood3.tasted();
        koreanfood3.priced();
        koreanfood3.tooping();
        koreanfood3.mainingr();
        System.out.println("");
        
        bungeoppang koreanfood4 = new bungeoppang();
        koreanfood4.name = "Bungeoppang ";
        koreanfood4.taste = "Sweet";
        koreanfood4.price = 15000;
        koreanfood4.named();
        koreanfood4.tasted();
        koreanfood4.priced();
        koreanfood4.stuff();
        koreanfood4.mainingr();
        System.out.println("");
    }    
}

