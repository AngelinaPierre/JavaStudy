public class Aeroporto
{  private String codigo, nome;
   private boolean internacional;
   private Aeroporto parte[], chega[];
   private Aviao patio[];
   private int Tparte=0, Tchega=0, Tpatio=0;
   
   public Aeroporto(String codigo, String nome, boolean internacional)
   {  this.codigo = codigo;
      this.nome = nome;
      this.internacional = internacional;
      parte = new Aeroporto[40];
      chega = new Aeroporto[40];
      patio = new Aviao[40];
   }
   
   public void addParte(Aeroporto objAeroporto)
   {
       parte[Tparte] = objAeroporto;
       Tparte++;
   }    
   
   public void addChega(Aeroporto objAeroporto)
   {
       chega[Tchega] = objAeroporto;
       Tchega++;
   }
   
   public void addPatio(Aviao objAviao)
   {
       patio[Tpatio] = objAviao;
       Tpatio++;
   }
   
   public boolean getInternacional()
   {  return internacional;
   }
   
   public void setInternacional(char tipo)
   {  if ((tipo == 's') || (tipo == 'S'))
      {  internacional = true;
      }
      else
      {  internacional = false;
      }
   }
   
   public String getCodigo()
   {  return codigo;
   }    
   
   public boolean iguais(Aeroporto ObjAeroporto)
   {  if (getCodigo().equals(ObjAeroporto.getCodigo()))
      {  return true;
      }
      else
      {  return false;
      }
   }   
   
   public boolean pousado(int prefixo)
   {  int i=0;
      boolean achou=false;
      while ((i < Tpatio) && (achou == false))
      { 
        if (patio[i].getPrefixo() == prefixo)
        {  achou = true;
        }
        i++;
      }
      return achou;
    }   

    public boolean vooDireto(Aeroporto aeroporto)
    {  int i=0;
       boolean achou = false;
       while ((i < Tparte) && (achou == false))
       {  if (parte[i].getCodigo().equals(aeroporto.getCodigo()))
          {  achou = true;
          }
          i++;
       }
       return achou;
    }     
}

