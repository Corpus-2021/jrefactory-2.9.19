/* Generated By:JJTree: Do not edit this line. ASTUnaryExpressionNotPlusMinus.java */

public class ASTUnaryExpressionNotPlusMinus extends SimpleNode {
  public ASTUnaryExpressionNotPlusMinus(int id) {
    super(id);
  }

  public ASTUnaryExpressionNotPlusMinus(JavaParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavaParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
