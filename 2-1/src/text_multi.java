
public class text_multi {
	

	public static void main(String[] args) {
		Runnable run1 = new Runnable() {
			@Override
			public void run() {
				try {
					System.out.println("sleep-begin:" + Thread.currentThread().getId());
					Thread.sleep(2000);
					System.out.println("sleep-finish:" + Thread.currentThread().getId());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread th = new Thread(run1);
		try {
			System.out.println("try------>begin"+Thread.currentThread().getId());
			th.start();
			System.out.println("try------>sleep finished"+Thread.currentThread().getId());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally"+Thread.currentThread().getId());
		}
	}

}
