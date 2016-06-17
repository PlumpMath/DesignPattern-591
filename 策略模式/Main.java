//���Խӿ�,���㹺���ܽ��
interface Strategy {
    int calPrice(int price,int num);
}
//����5�������²�����
class Nodiscount implements Strategy {
    @Override
    public int calPrice(int price, int num) {
        return price * num;
    }
}
//����6-10����9.5��
class Disount1 implements Strategy {
    @Override
    public int calPrice(int price, int num) {
        return (int)(price * num * 0.95);
    }
}
//��ȫ,����11-20����9���㷨ʵ��
class Disount2 implements Strategy {
    @Override
    public int calPrice(int price, int num) {
        return (int)(price * num * 0.9);
    }
}
//��ȫ,����20�����ϴ�8.5���㷨ʵ��
class Disount3 implements Strategy {
    @Override
    public int calPrice(int price, int num) {
        return (int)(price * num * 0.85);
    }
}
//������,���ݲ�ͬ���������㹺���ܽ��
class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int calPrice(int price, int num) {
       return this.strategy.calPrice(price,num);
    }
}

public class Main {

    //ÿ��������10000
    public static void main(String[] args) {
        Strategy strategy;
        //���㹺��3���ܽ��
        strategy = new Nodiscount();
        Context context = new Context(strategy);
        System.out.println("����3���ܽ��: " + context.calPrice(10000,3));
        //��ȫ ����12���ܽ��
        strategy= new Disount2();
        context= new Context(strategy);
        System.out.println("����12���ܽ��: " + context.calPrice(10000,12));
    }

}
