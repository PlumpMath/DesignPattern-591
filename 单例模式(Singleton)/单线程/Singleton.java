//���߳�ʵ�ֵ���ģʽ
class Singleton {
    private static Singleton instance;
    
    //��ȫ ������
  private Singleton(){
    
  }
    
    public static Singleton getInstance (){
        //��ȫ ����ʵ��
        if(instance ==null)instance = new Singleton();
        return instance;
    }
}

