//��ȫ ���������������Ĺ���
class SuperTractorFactory implements Provider{
  @Override
    public CarFactory creatCarFactory(){
    return new TractorFactory();
  }
}

