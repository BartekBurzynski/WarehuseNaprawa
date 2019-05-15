import javax.sound.sampled.Line;

public class Device {
    String code;
    String name;
    String producer;
    double price;

    Device (String code,String name,String producer,double price){
        this.code = code;
        this.name = name;
        this.price = price;
        this.producer = producer;
    }
    Device (String code, String name, String producer){
        this.code = code;
        this.name = name;
        this.producer = producer;
    }

    String getInfo () {
        return this.code + this.name + this.producer + this.price;

    }
}
