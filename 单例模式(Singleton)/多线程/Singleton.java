//���̵߳���ģʽ
class Singleton {
    private static Singleton instance;
    //synchronized����ͬ���ή��Ч��,�������ж��Ƿ�Ϊ��
    //��Ϊ������Ҫ����,��߳���Ч��
    //��ȫ ������
  private Singleton(){}
    
    public static Singleton getInstance (){
        //��ȫ ����ʵ��
      if(instance ==null){
        synchronized(Singleton.class){
          if(instance ==null){
            instance = new Singleton();
          }
        }
      }
        
        return instance;
    }
}