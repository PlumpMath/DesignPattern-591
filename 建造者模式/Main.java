class Car {
    //frame
    String frame;
    //engine
    String engine;
    //wheel
    String wheel;
    //...
}

interface Builder {
    void buildFrame();

    void buildEngine();

    void buildWheel();

    Car buildCar();
}

//911������
class Builder911 implements Builder {
    Car car = new Car();

    @Override
    public void buildFrame() {
        System.out.println("����911�Ǽ�");
    }

    @Override
    public void buildEngine() {
        System.out.println("����911����");
    }

    @Override
    public void buildWheel() {
        System.out.println("����911����");
    }

    @Override
    public Car buildCar() {
        System.out.println("911����������װ���");
        return car;
    }
}

//Cayma������
class BuilderCayma implements Builder {
    Car car = new Car();

    @Override
    public void buildFrame() {
        System.out.println("����Cayma�Ǽ�");
    }

    @Override
    public void buildEngine() {
        System.out.println("����Cayma����");
    }

    @Override
    public void buildWheel() {
        System.out.println("����Cayma����");
    }

    @Override
    public Car buildCar() {
        System.out.println("Cayma����������װ���");
        return car;
    }
}

//ָ����
class Director {
    private Builder builder;

    //�������������
    public Director(Builder builder) {
        this.builder = builder;
    }

    public Car build() {
        builder.buildFrame();
        builder.buildEngine();
        builder.buildWheel();
        return builder.buildCar();
    }
}

public class Main {

    public static void main(String[] args) {
        //����һ̨911
        Builder builder = new Builder911();
        Director director = new Director(builder);
        Car car911 = director.build();
        //��ȫ,����Cayma
        Builder builder1 = new BuilderCayma();
        Director director1 = new Director(builder1);
        Car cayma = director1.build();
    }

}
