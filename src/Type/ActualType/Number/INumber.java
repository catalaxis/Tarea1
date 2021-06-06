package Type.ActualType.Number;
import Type.ActualType.Number.*;
import Type.ActualType.Number.ActualNumber.*;
import Type.IType;

public interface INumber{
    public double toFloat();
    public TypeFloat toTypeFloat();

    public int toInt(String Binary);
    public String intToBinary(int Inte);
    public String addBinary(String x, String y);

    //Operaciones
    //
    public INumber plus(INumber Number);
    public INumber plusBinary(TypeBinary Binary);
    public INumber plusInt(TypeInt Integer);
    public TypeFloat plusFloat(TypeFloat Float);
    //
    public INumber subs(INumber Number);
    public INumber subsBinary(TypeBinary Binary);
    public INumber subsInt(TypeInt Int);
    public TypeFloat subsFloat(TypeFloat Float);
    //
    public INumber mult(INumber Number);
    public INumber multBinary(TypeBinary Binary);
    public INumber multInt(TypeInt Integer);
    public TypeFloat multFloat(TypeFloat Float);
    //
    public INumber div(INumber Number);
    public INumber divBinary(TypeBinary Binary);
    public INumber divInt(TypeInt Integer);
    public TypeFloat divFloat(TypeFloat Float);
}
