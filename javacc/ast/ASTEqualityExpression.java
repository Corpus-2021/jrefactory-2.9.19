/* Generated By:JJTree: Do not edit this line. ASTEqualityExpression.java */

public class ASTEqualityExpression extends SimpleNode {
  public ASTEqualityExpression(int id) {
    super(id);
  }

  public ASTEqualityExpression(JavaParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavaParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}