
import java.util.concurrent.atomic.LongAdder;

public class Accaunt {
    private LongAdder account = new LongAdder();

    public void transfer(long transh){
        account.add(transh);
    }

    public long getAccount(){
        return account.sum();
    }
}
