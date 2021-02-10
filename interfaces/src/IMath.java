import java.awt.*;

public interface IMath {
    IMath sum(IMath a) throws Exception;
    IMath sub(IMath a) throws Exception;
    IMath div(double k) throws Exception;
    IMath mul(double k) throws Exception;
    IMath mul(IMath a) throws Exception;

}
