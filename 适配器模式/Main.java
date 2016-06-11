//MicroUSB�ӿ�,�ͻ������ڴ��Ľӿ�
interface MicroUSB {
    void process();
}

//USBTypec�ӿ�,��Ҫ������Ľӿ�
interface USBTypec {
    void process();
}

class Phone implements MicroUSB {
    @Override
    public void process() {
        System.out.println("ʹ��MicroUSB�ӿڽ��г��");
    }
}

class Car implements USBTypec {
    @Override
    public void process() {
        System.out.println("ʹ��USBTypec�ӿڽ��г��");
    }
}

//������,��USBTypec�ӿ�ת����MicroUSB
class USBTypecToMicroUSB implements MicroUSB {

    USBTypec usbTypec;

    public USBTypecToMicroUSB(USBTypec usbTypec) {
        this.usbTypec = usbTypec;
    }

    @Override
    public void process() {
        System.out.println("USBTypec�ӿ�ת����MicroUSB");
       usbTypec.process();
        
    }
}

public class Main {

    public static void main(String[] args) {
        USBTypec usbTypec = new Car();
        USBTypecToMicroUSB tTom = new USBTypecToMicroUSB(usbTypec);
        tTom.process();
    }

}
