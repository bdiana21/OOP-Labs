public class ExceptieZiNelucratoare extends Throwable {
        public ExceptieZiNelucratoare(String msg) {
            super(msg);
            System.out.println(msg);
        }

}
