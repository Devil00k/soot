package soot.jimple.paddle.bdddomains;

import jedd.*;
import soot.*;

public class atp extends Attribute {
    public final TYPE domain = (TYPE) TYPE.v();
    
    public Domain domain() { return domain; }
    
    public static Attribute v() { return instance; }
    
    private static Attribute instance = new atp();
    
    public atp() { super(); }
}