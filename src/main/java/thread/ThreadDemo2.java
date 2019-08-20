package thread;

public class ThreadDemo2 {

    static Thread thread = null;
    public static boolean runing = true;
    int i;

    public static void main(String[] args) throws InterruptedException {

        /**
         * 主线程中如果启动了子线程，计算机80%调用主线程，main方法80%得到cpu。
         */
        traditional();
        Thread.sleep(2000);

        thread.interrupt();

        System.out.println("zhong duan?" + thread.isInterrupted());
        System.out.println("zhong duan?" + thread.interrupted());


        runing = false;




    }


    public static void traditional() {
        thread = new Thread() {
            @Override
            public void run() {

                thread.interrupt();

                System.out.println("run："+thread.isInterrupted());
                System.out.println("run："+thread.interrupted());

                while (runing){

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        //解阻塞
                        System.out.println("解阻塞。。。"+e);
                    }
                    System.out.println("========");
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
