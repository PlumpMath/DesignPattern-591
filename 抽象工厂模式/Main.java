public class Main {

    public static void main(String[] args) {
        //����һ��������ʱ�ݹ����Ĺ���
        Provider cf = new SuperPorscheFactory();
        //������ʱ�ݹ���
        CarFactory pf = cf.creatCarFactory();
        //��ʱ�ݹ���������ʱ������
        pf.productCar();
        //������ʾ��,����������
      Provider cf1 = new SuperTractorFactory();
      CarFactory tf = cf1.creatCarFactory();
      tf.productCar();
    }

}