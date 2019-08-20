package thread;

public class ThreadDemo {

    static Thread thread = null;
    public static boolean runing = true;
    int i;

    public static void main(String[] args) throws InterruptedException {

        /**
         * 主线程中如果启动了子线程，计算机80%调用主线程，main方法80%得到cpu。
         */
        traditional();
        Thread.sleep(1000);
        runing = false;


    }


    public static void traditional() {
        thread = new Thread() {
            @Override
            public void run() {
                while (runing){
                    //i++;
                    //加入方法调用就回线程停止，因为jvm优化时候有方法调用就存在方法溢出，不会优化。
                    //aa();
                }
            }
        };
        thread.start();
    }

    public static void aa(){
        Integer i=1;
        i.toString();

    }
}
