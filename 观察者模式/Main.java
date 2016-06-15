import java.util.ArrayList;

//��װ���ֱ������Ĺ���
interface Factory {
    //��ӻ��ֱ�����
    void attach(Alarm alarm);

    //�Ƴ����ֱ�����
    void detach(Alarm alarm);

    //֪ͨ������
    void nofityObserver();

    //��������
    void fire();
    //...
}

//��װ�˱������Ĺ���
class PorscheFactory implements Factory {

    ArrayList<Alarm> alarms = new ArrayList<>();

    @Override
    public void attach(Alarm alarm) {
        alarms.add(alarm);
    }

    @Override
    public void detach(Alarm alarm) {
        alarms.remove(alarm);
    }

    @Override
    public void nofityObserver() {
        for (Alarm alarm : alarms) {
            alarm.rang();
        }
    }

    @Override
    public void fire() {
       //��ȫ,������������,֪ͨ������
      nofityObserver();
    }
}

//������(����۲���)
interface Alarm {
    void rang();
}

//���ֱ�����(����۲���)
class FireAlarm implements Alarm {
    //���ֱ������۲쵽�������л�������
    @Override
    public void rang() {
        System.out.println("��������������,����");
    }
}

public class Main {

    public static void main(String[] args) {
        Factory f = new PorscheFactory();
        //���ֱ�����
        Alarm alarm = new FireAlarm();
        //��ȫ,������װ���ֱ�����
		f.attach(alarm);
      	f.fire();
        //��ȫ,����������
    }

}
