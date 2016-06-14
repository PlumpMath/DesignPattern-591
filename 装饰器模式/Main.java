interface ICoffee {
    void showCoffee();

    float showPrice();
}

//ԭʼ����
class Coffee implements ICoffee {
    private String name;
    private float price;

    public Coffee(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showCoffee() {
        System.out.println(name + " coffee");
    }

    @Override
    public float showPrice() {
        return price;
    }
}

//����װ����
abstract class Decorator implements ICoffee {
    private ICoffee coffee;

    public void setCoffee(ICoffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void showCoffee() {
        coffee.showCoffee();
    }

    @Override
    public float showPrice() {
        return coffee.showPrice();
    }
}

//���ǿ���
class Sugar extends Decorator {
    @Override
    public void showCoffee() {
        System.out.println("����");
        super.showCoffee();
    }

    @Override
    public float showPrice() {
        return super.showPrice() + 5;
    }
}

//��ȫ,��ţ�̵Ŀ���
class SugarMilk extends Decorator {
    @Override
    public void showCoffee() {
	   System.out.println("��ţ��");
       System.out.println("����");
       super.showCoffee();
    }

    @Override
    public float showPrice() {
        return super.showPrice() + 10;
    }
}

public class Main {

    public static void main(String[] args) {
        Coffee coffee = new Coffee("����", 20);
        //����
        Decorator sugar = new Sugar();
        sugar.setCoffee(coffee);
        sugar.showCoffee();
        System.out.println(sugar.showPrice());
        //��ȫ,����,��ţ�̵Ŀ���
        Decorator sugarMilk = new SugarMilk();
        sugarMilk.setCoffee(coffee);
        sugarMilk.showCoffee();
        System.out.println(sugarMilk.showPrice());
    }

}
