import java.util.concurrent.atomic.AtomicLong;

public class Accaunt {
    private AtomicLong account = new AtomicLong(0);

    public void transfer(long transh){
        account.addAndGet(transh);
    }

    public long getAccount(){
        return account.get();
    }
}
