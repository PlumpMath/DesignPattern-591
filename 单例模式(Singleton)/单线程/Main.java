public class Main {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        //�ж�����ʵ��s1 s2�Ƿ�Ϊͬһ��ʵ��
        System.out.println(s1 == s2);
    }

}