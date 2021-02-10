public class polynom implements IMath{
    double[] coeff;
    int n;
    public polynom(){n=-1;coeff=null;}
    public polynom(int n){this.n=n; coeff=new double[n+1];}
    public polynom(double[]k){
        coeff = new double[k.length];
        n=k.length-1;
        for (int i=0;i<=n;i++)
        {
            coeff[i]=k[i];
        }
    }
    public int getN(){return n;}
    public double getCoeff(int i) throws Exception{
        if(i<0||i>n) throw new Exception("Index out");
        return coeff[i];
    }
    public void setCoeff(int i,double val) throws Exception{
        if(i<0||i>n) throw new Exception("Index out");
        coeff[i]=val;
    }
    public void print(){
        for (int i=n; i>0;i--){
            System.out.print(coeff[i]+"*x^"+i+" + ");
        }
        System.out.println(coeff[0]);
    }
    @Override
    public IMath sum(IMath a) throws Exception{
        polynom a1 = (polynom)a;
        int n1 = n>a1.n ? n:a1.n;
        polynom res = new polynom(n1);
        int i=0;
        if (n>a1.n) {
            for (i = 0; i < a1.n; i++)
                res.coeff[i] = coeff[i] + a1.coeff[i];
            for (; i < n; i++)
                res.coeff[i] = coeff[i];
        }
        else
            for (i = 0; i < n; i++)
                res.coeff[i] = coeff[i] + a1.coeff[i];
        for (; i < a1.n; i++)
            res.coeff[i] = a1.coeff[i];
        return res;
    }

    @Override
    public IMath sub(IMath a) throws Exception{
        polynom a1 = (polynom)a;
        int n1 = n>a1.n ? n:a1.n;
        polynom res = new polynom(n1);
        int i=0;
        if (n>a1.n) {
            for (i = 0; i < a1.n; i++)
                res.coeff[i] = coeff[i] - a1.coeff[i];
            for (; i < n; i++)
                res.coeff[i] = coeff[i];
        }
        else
            for (i = 0; i < n; i++)
                res.coeff[i] = coeff[i] - a1.coeff[i];
        for (; i < a1.n; i++)
            res.coeff[i] = a1.coeff[i];
        return res;
    }
    @Override
    public IMath div(double k) throws Exception{
        polynom res = new polynom(n);
        if (k==0) throw new Exception("division by zero");
        for (int i=0; i < n; i++){
            res.coeff[i] = coeff[i] / k;
        }
        return res;
    }
    @Override
    public IMath mul(double k) throws Exception{
        polynom res = new polynom(n);
        for (int i=0; i < n; i++){
            res.coeff[i] = coeff[i] * k;
        }
        return res;
    }
    @Override
    public IMath mul(IMath a) throws Exception {
        polynom a1 = (polynom) a;
        polynom res = new polynom(getN() + a1.getN());
        for(int i = 0; i < getN() + 1; i++)
            for (int j = 0; j < a1.getN()+1; j++)
                res.setCoeff(i + j, res.getCoeff(i + j) + getCoeff(i) * a1.getCoeff(j));
        return res;
    }
}
/*реализовать интерфейс для полиномов
реализовать этот же интефрейс для матриц
функции main создать список интрерфейсовых обьектов из матрциы полиномов типа case 1-матрица.
 */