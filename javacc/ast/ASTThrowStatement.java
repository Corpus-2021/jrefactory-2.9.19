/* Generated By:JJTree: Do not edit this line. ASTThrowStatement.java */

public class ASTThrowStatement extends SimpleNode {
  public ASTThrowStatement(int id) {
    super(id);
  }

  public ASTThrowStatement(JavaParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavaParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
