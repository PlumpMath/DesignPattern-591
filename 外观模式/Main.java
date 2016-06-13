class Frame {
    public void create() {
        System.out.println("��װ�Ǽ�");
    }
}

class Engine {
    public void create() {
        System.out.println("��װ����");
    }
}

class Wheel {
    public void create() {
        System.out.println("��װ����");
    }
}

class Controller {
    private Frame frame;
    private Engine engine;
    private Wheel wheel;

    public Controller(){
        frame = new Frame();
        engine = new Engine();
        wheel = new Wheel();
    }

    public void build(){
        frame.create();
        engine.create();
        wheel.create();
        System.out.println("������װ���");
    }
}
public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        //��ȫ,����Ա��������ť��ʼ��װ����
        controller.build();
    }

}
