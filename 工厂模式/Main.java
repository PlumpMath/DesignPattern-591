public class Main {

    public static void main(String[] args) {
        //��ʱ�ݹ���������ʱ��
        CarFactory pf = new PorscheFactory();
        pf.productCar();
        //��������������������
        CarFactory tf = new TractorFactory();
        tf.productCar();
        //��ȫ ���۹�����������
       CarFactory bf = new BensFactory();
       bf.productCar();
    }

}
