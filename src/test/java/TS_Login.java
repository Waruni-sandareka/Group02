import com.ucsc.groupb.functions.LIB_Common;
import com.ucsc.groupb.testbase.TestBase;
import org.testng.annotations.Test;

public class TS_Login extends TestBase {

    @Test
    public void tc_001(){
        LIB_Common.get().bc_Login("admin", "pointofsale");
    }
    @Test
    public void tc_002(){
        LIB_Common.get().bc_Login("admin", "pointofsale");
    }
    @Test
    public void tc_003(){
        LIB_Common.get().bc_Login("admin", "pointofsale");
    }
    @Test
    public void tc_004(){
        LIB_Common.get().bc_Login("admin", "pointofsale");
    }
    @Test
    public void tc_005(){
        LIB_Common.get().bc_Login("admin", "pointofsale");
    }

}
