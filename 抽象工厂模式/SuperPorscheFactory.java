//������ʱ�ݹ����Ĺ���
class SuperPorscheFactory implements Provider {
    @Override
    public CarFactory creatCarFactory() {
        return new PorscheFactory();
    }
}
