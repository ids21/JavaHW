interface Func{
    double f1(double x) throws Exception;
    double df1(double x) throws Exception;


}
public class fun implements Func{
    double f;
    public fun(){f =0.0;}
    @Override
    public double f1(double x) throws Exception{
        f = Math.pow(x,2) - 3*x + 1;
        return f;
    }
    @Override
    public double df1(double x) throws Exception{
        f = 2*x + 1;
        return f;
    }
}
class gipFun extends fun implements Func{
    public gipFun() {
        super();
    }
    @Override
    public double f1(double x) throws Exception{
        if (x==1) throw new Exception("div by zero");
        this.f = (x+3)/(x-1);
        return this.f;
    }
    @Override
    public double df1(double x) throws Exception{
        this.f = 1/(x-1) - (x+3)/Math.pow((x-1),2);
        return this.f;
    }

}
@FunctionalInterface
interface setF<P extends Func>{
    double root(P p, double prev, double curr, double e) throws Exception;
};

