/* Generated By:JJTree: Do not edit this line. ASTTypeParameters.java */

public class ASTTypeParameters extends SimpleNode {
  public ASTTypeParameters(int id) {
    super(id);
  }

  public ASTTypeParameters(JavaParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavaParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
