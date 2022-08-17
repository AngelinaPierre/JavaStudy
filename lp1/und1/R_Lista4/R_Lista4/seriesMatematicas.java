class seriesMatematicas
{
    private int x, y;
    
    public seriesMatematicas(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    
    public void imprimeResultado()
    {
        System.out.println(elevadoA());   
    }    
    
    private void setX(int x)
    {  
       this.x = x;
    } 
    
    private void setY(int y)
    {  
       this.y = y;
    } 
    
    private int getX()
    {  
       return x;
    } 
    
    private int getY()
    {  
       return y;
    } 
    
    public int elevadoA()
    {
        int i=1, r;
        r = x;
        while (i < this.y)
        {
            r = x * r;
            i++;
        }
        return r;
    }
 
    public float piQuadradoSobre8(int termos)
    {
        float denominador = 1, r=0;
        do
        {
            r = r + (1 / (denominador * denominador));
            denominador = denominador + 2;
            termos--;
        } while (termos > 0);
        return r;
    }
     
    public float calculaPi(int termos)
    {
        int i=1;
        float r=2, numerador = 2, denominador=1;
        while (i < termos)
        {   r = r * (numerador / denominador);
            System.out.println(numerador +"/"+ denominador +"="+r);
            i++;
            denominador=denominador + 2;
            r = r * (numerador / denominador);
            System.out.println(numerador +"/"+ denominador +"="+r);
            i++;
            numerador=numerador + 2;
        }
        return r;
    }    
}       











     