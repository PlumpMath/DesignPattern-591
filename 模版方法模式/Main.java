//��������(����ģ�巽��)
abstract class AbstractCheck {
    abstract void startup();
    abstract void speeup();
    abstract void brake();
    abstract void stop();
    //��ֹ���า��ʹ��final����
    public final void check(){
        startup();
        speeup();
        brake();
        stop();
    }

}
//���911
class Porsche911 extends AbstractCheck {
    @Override
    void startup() {
        System.out.println("���911����");
    }

    @Override
    void speeup() {
        System.out.println("���911����");
    }

    @Override
    void brake() {
        System.out.println("���911ɲ��");
        //��ⷽ����׼
        System.out.println("911ɲ���ϸ�");
    }

    @Override
    void stop() {
        System.out.println("���911Ϩ��");
    }
}
//��ȫ,���Cayma��
class Cayma extends AbstractCheck {
    @Override
    void startup() {
        System.out.println("���Cayma����");
    }

    @Override
    void speeup() {
        System.out.println("���Cayma����");
    }

    @Override
    void brake() {
        System.out.println("���Caymaɲ��");
        //��ⷽ����׼
        System.out.println("Caymaɲ���ϸ�");
    }

    @Override
    void stop() {
        System.out.println("���CaymaϨ��");
    }
}
public class Main {

    public static void main(String[] args) {
        AbstractCheck ac = new Porsche911();
        //��ʼ���911
        ac.check();
        //��ȫ,���Cayma
      AbstractCheck ac1 = new Cayma();
      ac1.check();
    }

}
