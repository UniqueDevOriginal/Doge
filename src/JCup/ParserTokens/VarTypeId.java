package JCup.ParserTokens;


public class VarTypeId extends Var {
    TypeId child1;
    Id     child2;

  public VarTypeId(TypeId type, Id id) {
    child1 = type;
    child2 = id;
  }

@Override
public
void print(String prefix, boolean isTail) {
	
    String type = "Var";
	System.out.println(prefix + (isTail ?  "|-- " : "|-- ") + type);
    
	child1.print(prefix + (isTail ? "    " : "|   "), false);
	// System.out.println(prefix + "    " + (isTail ?  "|-- " : "|-- ") + "+");
    child2.print(prefix + (isTail ?"    " : "|   "), true);
    
}

}